package org.seckill.dto;

/**
 * Created by 533 on 2017/4/14.
 */
public class exposeResult {

    boolean flag;
    long seckillId;

    public exposeResult(boolean flag, long seckillId) {
        this.flag = flag;
        this.seckillId = seckillId;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    @Override
    public String toString() {
        return "exposeResult{" +
                "flag=" + flag +
                ", seckillId=" + seckillId +
                '}';
    }
}
