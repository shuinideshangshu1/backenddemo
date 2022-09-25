package com.my.controllerdemo.result;

public enum ResultEnum implements IResult {
    SUCCESS(20000, "接口调用成功"),
    COMMON_FAILED(40400, "接口调用失败");


    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
