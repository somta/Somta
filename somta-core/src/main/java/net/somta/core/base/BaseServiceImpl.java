package net.somta.core.base;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import net.somta.core.base.result.ResponseDataResult;

public abstract class BaseServiceImpl implements IBaseService{

	public abstract IBaseDao getDao();

	@Override
	public <T> ResponseDataResult add(T t)  throws Exception{
		if(getDao().add(t) > 0){
			return ResponseDataResult.setErrorResponseResult("新增失败");
		}
		return ResponseDataResult.setResponseResult();
	}

	@Override
	public ResponseDataResult deleteById(Object id) throws Exception{
		if(getDao().deleteById(id) > 0){
			return ResponseDataResult.setErrorResponseResult("删除失败");
		}
		return ResponseDataResult.setResponseResult();
	}

	@Override
	public <T> ResponseDataResult update(T t)  throws Exception{
		if(getDao().update(t) > 0){
			return ResponseDataResult.setErrorResponseResult("修改失败");
		}
		return ResponseDataResult.setResponseResult();
	}

	@Override
	public <T> T queryById(Object id) throws Exception{
		return getDao().queryById(id);
	}

	@Override
	public <T> PageInfo<T> queryByList(Integer pageNum,Integer pageSize,Object param) throws Exception {
		Page<T> page = PageHelper.startPage(pageNum, pageSize);
		getDao().queryByList(param);
        return page.toPageInfo();
	}

}