package com.karelie.ktapplication.httpmanager;

public class HttpResult<T> {
    public int code;
    public String message;
    public T payload;
    public boolean status;

    public boolean isSuccess() {
        return code == 200;
    }
}
