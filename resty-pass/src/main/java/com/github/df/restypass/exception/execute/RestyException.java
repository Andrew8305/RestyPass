package com.github.df.restypass.exception.execute;

/**
 * Resty 基础异常类
 * <p>
 * Created by darrenfu on 17-7-22.
 */
@SuppressWarnings("unused")
public class RestyException extends RuntimeException {

    private static String RESTY_EXCEPTION_CODE = "RESTY_EXCEPTION";

    private String code;

    public RestyException(String msg) {
        super(msg);
        this.code = RESTY_EXCEPTION_CODE;
    }


    public RestyException(String code, String msg) {
        super(msg);
        this.code = code;
    }

    public RestyException(Throwable throwable) {
        super(throwable);
        this.code = RESTY_EXCEPTION_CODE;
    }
}
