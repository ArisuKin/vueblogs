package com.klins.oc.blog.vueblogs.common.lang;

import lombok.Data;

import java.io.Serializable;

/**
 * &#064;program vueblogs
 * &#064;packing com.klins.oc.blog.vueblogs.common.lang
 *
 * @author Klins
 * &#064;date 2022年06月18日 1:01
 * &#064;description 一个新的类或服务
 */
@Data
public class Result implements Serializable {
    private String code;    //状态码
    private String msg;     //信息
    private Object data;    //数据
    public static Result succ(Object data) {
        Result m = new Result();
        m.setCode("0");
        m.setData(data);
        m.setMsg("操作成功");
        return m;
    }
    public static Result succ(String mess, Object data) {
        Result m = new Result();
        m.setCode("0");
        m.setData(data);
        m.setMsg(mess);
        return m;
    }

//    数据异常
    public static Result fail(String mess) {
        Result m = new Result();
        m.setCode("-1");
        m.setData(null);
        m.setMsg(mess);
        return m;
    }
    public static Result fail(String mess, Object data) {
        Result m = new Result();
        m.setCode("-1");
        m.setData(data);
        m.setMsg(mess);
        return m;
    }
}
