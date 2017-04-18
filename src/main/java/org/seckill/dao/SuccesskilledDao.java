package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Successkilled;

public interface SuccesskilledDao
{
    /**
     * 插入秒杀明细
     * @param seckillId
     * @param userPhone
     * @return
     */
    int insertSuccessKill(@Param("seckillId")long seckillId, @Param("userPhone")long userPhone);

    /**
     * 查找指定用户的秒杀明细
     * @param userPhone
     * @return
     */
    Successkilled findSuccessSeckillByUser(@Param("userPhone") long userPhone,@Param("seckillId") long seckillId);
}
