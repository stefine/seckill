package org.seckill.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Seckill;

public interface SeckillDao {

    /**
     * 减少库存
     * @param seckillId
     * @param killTime
     * @return
     */
    int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);

    /**
     * 根据商品id，查询商品明细
     * @param seckillId
     * @return
     */
    Seckill findSeckillById(long seckillId);

    /**
     * 展示商品
     * @param startId
     * @param offset
     * @return
     */
    List<Seckill> findSeckillByOffset(@Param("startId") long startId, @Param("offset") int offset);
}
