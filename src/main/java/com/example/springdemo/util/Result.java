package com.example.springdemo.util;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

//@AllArgsConstructor
@Data
@NoArgsConstructor
public class Result {
    private boolean success;
    private int code;
    private String msg;
//    private Object data;
    private Map<String,Object>data= new HashMap<>();

//    private Result(){};
    public static Result success(){
//        return new Result(true,200,"success",data);
        Result r = new Result();
        r.setSuccess(true);
        r.setCode(123);
        return  r;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private boolean success;
        private int code;
        private String msg;
        private Object data;
        public Builder success(boolean success) {
            this.success = success ;
            return this;
        }

        public Builder code(int code) {
            this.code = code ;
            return this ;
        }

        public Builder msg(String msg) {
            this.msg = msg ;
            return this;
        }

        public Result build() {
            return new Result(this);
        }

    }

    public Result(Builder builder) {
        this.success = builder.success;
        this.code = builder.code ;
        this.msg = builder.msg;
    }
}
