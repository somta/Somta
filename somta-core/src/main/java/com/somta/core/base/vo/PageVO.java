package com.somta.core.base.vo;

/**
 * 
 * @Description: 分页查询类
 *
 * @Date:        2018-07-04
 * @Author:      明天的地平线
 * @Version:     1.0.0
 */
public class PageVO {

	/**
	 * 当前页码
	 */
	private int pageNum;
	/**
	 * 每页数量
	 */
	private int pageSize = 10;
	
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	
}
