package com.zfliu.exception;

import java.io.IOException;

/**
 * Created by zfliu on 2021/3/5 15:42
 * Desc:
 */
public class MyException extends IOException {
    String message;

    String[] param;

    public MyException(String message) {
        this.message = message;
    }

    public MyException(String message, String... param) {
        this.param = param;
    }

}
