package net.somta.core.base.result;


public class ResponsePaginationDataResult extends ResponseResult {

    private long total;
    private Object result;

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

    public static ResponsePaginationDataResult setPaginationDataResult(long total, Object result) {
        ResponsePaginationDataResult r = new ResponsePaginationDataResult();
        r.setTotal(total);
        r.setSuccess(true);
        r.setCode(RES_SUCCESS_CODE);
        r.setMessage(RES_SUCCESS);
        r.setResult(result);
        return r;
    }

    public static ResponsePaginationDataResult setErrorResponseResult(String message) {
    	return setErrorResponseResult(message, null);
    }

    public static ResponsePaginationDataResult setErrorResponseResult(String message,Object data) {
        return setErrorResponseResult(null, message, data);
    }

    public static ResponsePaginationDataResult setErrorResponseResult(String code ,String message,Object data) {
        ResponsePaginationDataResult r = new ResponsePaginationDataResult();
        r.setTotal(0);
        r.setSuccess(false);
        r.setCode(code);
        r.setMessage(message);
        r.setResult(data);
        return r;
    }


}
