package net.somta.core.base.result;


public class ResponseResult {

	protected static final String RES_SUCCESS_CODE = "success";
	protected static final String RES_SUCCESS="执行成功";
	protected static final String RES_FAILED="执行失败";
	protected static final String RES_FAILED_CODE = "fail";

	/**
	 * 返回是否成功
	 */
	private boolean success;
	/**
	 * 返回码
	 */
	private String code;
	/**
	 * 返回消息
	 */
	private String message;

	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
