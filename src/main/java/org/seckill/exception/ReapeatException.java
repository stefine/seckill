package org.seckill.exception;

/**
 * Created by 533 on 2017/4/14.
 */
public class ReapeatException extends SeckillException {
    public ReapeatException(String message) {
        super(message);
    }

    public ReapeatException(String message, Throwable cause) {
        super(message, cause);
    }
}
