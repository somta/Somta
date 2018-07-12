package com.somta.core.base.result;

/**
 * 
 * @Description: 普通返回类
 *
 * @Date:        2018-07-04
 * @Author:      明天的地平线
 * @Version:     1.0.0
 */
public class ResponseDataResult extends ResponseResult {

    private Object result;

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    /**
     * 设置返回成功的数据
     * @return
     */
    public static ResponseDataResult setResponseResult() {
    	return setResponseResult(null);
    }
    
    /**
     * 设置返回成功的数据
     * @param data 返回对象
     * @return
     */
    public static ResponseDataResult setResponseResult(Object data) {
        ResponseDataResult r = new ResponseDataResult();
        r.setSuccess(true);
        r.setCode(RES_SUCCESS_CODE);
        r.setMessage(RES_SUCCESS);
        r.setResult(data);
        return r;
    }
    
    /**
     * 设置返回错误的数据
     * @param message 错误消息
     * @return
     */
    public static ResponseDataResult setErrorResponseResult(String message) {
    	return setErrorResponseResult(message, null);
    }
    
    /**
     * 设置返回错误的数据
     * @param message 错误消息
     * @param data 返回对象
     * @return
     */
    public static ResponseDataResult setErrorResponseResult(String message,Object data) {
        return setErrorResponseResult(null, message, data);
    }

    /**
     * 设置返回错误的数据
     * @param code 错误消息码
     * @param message 错误消息
     * @param data 返回对象
     * @return
     */
    public static ResponseDataResult setErrorResponseResult(Integer code ,String message,Object data) {
        ResponseDataResult r = new ResponseDataResult();
        r.setSuccess(false);
        r.setCode(code);
        r.setMessage(message);
        r.setResult(data);
        return r;
    }
    
}
