package com.somta.core.base.result;

/**
 * 
 * @Description: 列表返回类
 *
 * @Date:        2018-07-04
 * @Author:      明天的地平线
 * @Version:     1.0.0
 */
public class ResponsePaginationDataResult extends ResponseResult {

    private long total;//查询总数
    private Object result;//

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    /**
     * 返回成功消息
     * @param total
     * @param result
     * @return
     */
    public static ResponsePaginationDataResult setPaginationDataResult(long total, Object result) {
        ResponsePaginationDataResult r = new ResponsePaginationDataResult();
        r.setTotal(total);
        r.setSuccess(true);
        r.setCode(RES_SUCCESS_CODE);
        r.setMessage(RES_SUCCESS);
        r.setResult(result);
        return r;
    }
    
    /**
     * 设置返回错误的数据
     * @param message 错误消息
     * @return
     */
    public static ResponsePaginationDataResult setErrorResponseResult(String message) {
    	return setErrorResponseResult(message, null);
    }
    
    /**
     * 设置返回错误的数据
     * @param message 错误消息
     * @param data 返回对象
     * @return
     */
    public static ResponsePaginationDataResult setErrorResponseResult(String message,Object data) {
        return setErrorResponseResult(null, message, data);
    }

    /**
     * 设置返回错误的数据
     * @param code 错误消息码
     * @param message 错误消息
     * @param data 返回对象
     * @return
     */
    public static ResponsePaginationDataResult setErrorResponseResult(Integer code ,String message,Object data) {
        ResponsePaginationDataResult r = new ResponsePaginationDataResult();
        r.setTotal(0);
        r.setSuccess(false);
        r.setCode(code);
        r.setMessage(message);
        r.setResult(data);
        return r;
    }
    
    
}
