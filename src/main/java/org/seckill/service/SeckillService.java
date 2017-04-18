package org.seckill.service;

import com.sun.org.apache.xpath.internal.operations.String;
import org.seckill.dto.excutionResult;
import org.seckill.dto.exposeResult;
import org.seckill.entity.Seckill;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public interface SeckillService {

    /**
     * 秒杀商品展示
     * @return 返回数组
     */
    List<Seckill> getSeckillList();

    /**
     * 执行秒杀
     * @param skillId
     * @param uerPhone
     * @return 返回秒杀结果（封装为executionResult）
     */
    excutionResult excuteSecKill(long skillId, long uerPhone);
    /**
     * 暴露秒杀接口
     * @param skillId
     * @return 返回秒杀地址
     */
    exposeResult exposeSecKill(long skillId);
}
