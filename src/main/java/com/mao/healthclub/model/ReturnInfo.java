package com.mao.healthclub.model;

public class ReturnInfo {
    private Integer code;
    private String msg;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "ReturnInfo{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
