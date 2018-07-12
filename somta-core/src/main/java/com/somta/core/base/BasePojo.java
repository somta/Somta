package com.somta.core.base;

import java.util.Date;

/**
 * 
 * @Description: 公共实体类
 *
 * @Date:        2017-12-05
 * @Author:      明天的地平线
 * @Version:     1.0.0
 */

public class BasePojo {

	private Date createdAt;//   创建时间
	private String createdBy;//   创建人
	private Date updatedAt;//   更新时间
	private String updatedBy;//   更新人
	
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	
	
	
}
