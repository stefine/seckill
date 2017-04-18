package org.seckill.dto;

import org.seckill.entity.Successkilled;

/**
 * Created by 533 on 2017/4/14.
 */
public class excutionResult {

    boolean flag;
    Successkilled successkilled;

    public excutionResult(boolean flag, Successkilled successkilled) {
        this.flag = flag;
        this.successkilled = successkilled;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Successkilled getSuccesskilled() {
        return successkilled;
    }

    public void setSuccesskilled(Successkilled successkilled) {
        this.successkilled = successkilled;
    }

    @Override
    public String toString() {
        return "excutionResult{" +
                "flag=" + flag +
                ", successkilled=" + successkilled +
                '}';
    }
}
