package org.seckill.exception;

/**
 * Created by 533 on 2017/4/14.
 */
public class SeckillRuntimeException extends SeckillException{
    public SeckillRuntimeException(String message) {
        super(message);
    }

    public SeckillRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}
