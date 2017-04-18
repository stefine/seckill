package org.seckill.service.Impl;

import org.seckill.dao.SeckillDao;
import org.seckill.dao.SuccesskilledDao;
import org.seckill.dto.excutionResult;
import org.seckill.dto.exposeResult;
import org.seckill.entity.Seckill;
import org.seckill.entity.Successkilled;
import org.seckill.exception.ReapeatException;
import org.seckill.exception.SeckillException;
import org.seckill.exception.SeckillRuntimeException;
import org.seckill.service.SeckillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class SeckillServiceImpl implements SeckillService {

    @Autowired
    private SeckillDao seckillDao;
    @Autowired
    private SuccesskilledDao successkilledDao;

    public List<Seckill> getSeckillList() {
        long startId = 1000L;
        int offset = 4;
        List<Seckill> seckillList = seckillDao.findSeckillByOffset(startId, offset);
        return seckillList;
    }

    @Transactional
    public excutionResult excuteSecKill(long skillId, long uerPhone) {
        try {
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                date = simpleDateFormat.parse("2017-2-1 12:03:56");
            int flag = successkilledDao.insertSuccessKill(skillId, uerPhone);
            if(flag <=0 ){
                throw new ReapeatException("您已經重複秒殺了！");
            }else {
                flag = seckillDao.reduceNumber(skillId, date);
                if (flag <=0){
                    throw new SeckillRuntimeException("庫存減少失敗！");
                }else {
                    Successkilled successSeckillByUser = successkilledDao.findSuccessSeckillByUser(uerPhone, skillId);
                    return new excutionResult(true, successSeckillByUser);
                }
            }
        } catch (SeckillRuntimeException e1){
            throw e1;
        }catch (ReapeatException e2){
            throw e2;
        }catch (Exception e){
            throw new SeckillException("seckill inner error:" + e.getMessage());
        }
    }

    public exposeResult exposeSecKill(long skillId) {
        Seckill seckillById = seckillDao.findSeckillById(skillId);
        if (seckillById ==null){
            return new exposeResult(false, skillId);
        }
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            date = simpleDateFormat.parse("2017-2-3 12:03:56");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (date.before(seckillById.getEndTime())  && date.after(seckillById.getStartTime())){
            return new exposeResult(true, skillId);
        }
        else {
            return new exposeResult(false, skillId);
        }
    }
}