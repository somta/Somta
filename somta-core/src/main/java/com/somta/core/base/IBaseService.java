package com.somta.core.base;

import com.github.pagehelper.PageInfo;
import com.somta.core.base.result.ResponseDataResult;

/**
 * 
 * @Description: 公共服务接口类
 *
 * @Date:        2018-07-04
 * @Author:      明天的地平线
 * @Version:     1.0.0
 */
public interface IBaseService{
	
	public abstract IBaseDao getDao();

	/**
	 * 新增
	 * @param <T>
	 */
	<T> ResponseDataResult add(T t)  throws Exception;
	
	/**
	 * 根据ID删除
	 */
	ResponseDataResult deleteById(Object id) throws Exception;
	
	/**
	 * 修改
	 */
	<T> ResponseDataResult update(T t)  throws Exception;
	
	/**
	 * 根据Id查询
	 * @param id
	 * @return
	 * @throws Exception
	 */
	<T> T queryById(Object id) throws Exception;
	
	
	/**
	 * 查询列表
	 * @param pageNum 当前页
	 * @param pageSize 每页条数
	 * @param param 查询参数
	 * @return
	 * @throws Exception
	 */
	<T> PageInfo<T> queryByList(Integer pageNum,Integer pageSize,Object param) throws Exception;
	
}
