package com.somta.core.base;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.somta.core.base.result.ResponseDataResult;

/**
 * 
 * @Description: 公共服务层
 *
 * @Date:        2018-07-04
 * @Author:      明天的地平线
 * @Version:     1.0.0
 */
public abstract class BaseServiceImpl implements IBaseService{
	
	public abstract IBaseDao getDao();

	
	public <T> ResponseDataResult add(T t)  throws Exception{
		if(getDao().add(t) > 0){
			return ResponseDataResult.setErrorResponseResult("新增失败");
		}
		return ResponseDataResult.setResponseResult();
	}
	
	public ResponseDataResult deleteById(Object id) throws Exception{
		if(getDao().deleteById(id) > 0){
			return ResponseDataResult.setErrorResponseResult("删除失败");
		}
		return ResponseDataResult.setResponseResult();
	}
	
	public <T> ResponseDataResult update(T t)  throws Exception{
		if(getDao().update(t) > 0){
			return ResponseDataResult.setErrorResponseResult("修改失败");
		}
		return ResponseDataResult.setResponseResult();
	}
	
	public <T> T queryById(Object id) throws Exception{
		return getDao().queryById(id);
	}
	
	public <T> PageInfo<T> queryByList(Integer pageNum,Integer pageSize,Object param) throws Exception {
		Page<T> page = PageHelper.startPage(pageNum, pageSize);
		getDao().queryByList(param);
        return page.toPageInfo();
	}
	
}
