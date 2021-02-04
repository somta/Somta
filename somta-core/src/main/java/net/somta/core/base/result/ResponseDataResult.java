package net.somta.core.base.result;


public class ResponseDataResult extends ResponseResult {

    private Object result;

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public static ResponseDataResult setResponseResult() {
    	return setResponseResult(null);
    }

    public static ResponseDataResult setResponseResult(Object data) {
        ResponseDataResult r = new ResponseDataResult();
        r.setSuccess(true);
        r.setCode(RES_SUCCESS_CODE);
        r.setMessage(RES_SUCCESS);
        r.setResult(data);
        return r;
    }

    public static ResponseDataResult setErrorResponseResult(String message) {
    	return setErrorResponseResult(message, null);
    }

    public static ResponseDataResult setErrorResponseResult(String message,Object data) {
        return setErrorResponseResult(null, message, data);
    }

    public static ResponseDataResult setErrorResponseResult(Integer code ,String message,Object data) {
        ResponseDataResult r = new ResponseDataResult();
        r.setSuccess(false);
        r.setCode(code);
        r.setMessage(message);
        r.setResult(data);
        return r;
    }

}
