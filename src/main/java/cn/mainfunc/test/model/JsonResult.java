package cn.mainfunc.test.model;

/**
 * @Author: mf014
 * @Date: 2020/5/13 15:30
 * @Description
 */


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.sf.json.JSON;
import net.sf.json.JSONObject;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: mf014
 * @Date: 2020/5/12 14:58
 * @Description 返回结果封装类
 */
@Setter
@Getter
@ToString
public class JsonResult<T> implements Serializable {

    private int code;   //返回码 非0即失败
    private String msg; //消息提示
    private List data; //返回的数据

    public JsonResult() { }

    public JsonResult(int code, String msg, List data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public JsonResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 返回成功 0
     * 有返回数据
     * @param data
     * @return
     */
    public static JSONObject success(List data) {
        return JSONObject.fromObject(new JsonResult(0, "数据返回成功", data));
    }

    /**
     * 返回成功 0
     * 无返回数据
     * @return
     */
    public static JSONObject success() {

        return JSONObject.fromObject(new JsonResult(0, "数据返回成功")).discard("data");
    }


    /**
     *  数据返回失败
     * @param code
     * @param msg
     * @return
     */
    public static  JSONObject failed(int code, String msg) {

        return JSONObject.fromObject(new JsonResult(code, msg)).discard("data");
    }
}
