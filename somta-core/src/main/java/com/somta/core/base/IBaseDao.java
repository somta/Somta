package com.somta.core.base;

import java.util.List;

/**
 * 
 * @Description: 公共Dao层类
 *
 * @Date:        2018-07-04
 * @Author:      明天的地平线
 * @Version:     1.0.0
 */
public interface IBaseDao {

	<T> int add(T t);
	
	int deleteById(Object id);
	
	<T> int update(T t);
	
	<T> T queryById(Object id);
	
	<T> List<T> queryByList(Object object);
	
}
