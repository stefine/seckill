import org.junit.Test;

import static org.junit.Assert.*;
import javax.annotation.Resource;

import org.junit.runner.RunWith;
import org.seckill.dao.SeckillDao;
import org.seckill.entity.Seckill;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml" })
public class SeckillDaoTest {
    //注入Dao实现类依赖

    @Resource
    private SeckillDao seckillDao;
    @Test
    public void reduceNumber() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse("2017-02-03 12:10:12");
//        System.out.println(date);
        Date killTime = new Date();
        long id = 1000L;
        int updateCount = seckillDao.reduceNumber(id, date);
        System.out.println("updateCount=" + updateCount);
    }

    @Test
    public void findSeckillById() throws Exception {
        long id = 1000L;
        Seckill seckill = seckillDao.findSeckillById(id);
        System.out.println(seckill);
    }

    @Test
    public void findSeckillByOffset() throws Exception {
        long startId = 1000L;
        int offset = 3;
        List<Seckill> list = seckillDao.findSeckillByOffset(startId, offset);
        for (Seckill seckill : list)
        {
            System.out.println(seckill);
        }
    }
}