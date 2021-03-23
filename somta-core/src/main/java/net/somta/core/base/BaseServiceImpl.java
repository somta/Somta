package net.somta.core.base;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import net.somta.core.base.result.ResponseDataResult;
import net.somta.core.base.result.ResponsePaginationDataResult;
import net.somta.core.exception.BizException;

import java.util.List;

public abstract class BaseServiceImpl implements IBaseService{

	public abstract IBaseDao getDao();

	public <T> ResponseDataResult add(T t)  throws Exception{
		if(getDao().add(t) > 0){
			throw new  BizException("add.error","新增数据失败");
		}
		return ResponseDataResult.setResponseResult();
	}

	public ResponseDataResult deleteById(Object id) throws Exception{
		if(getDao().deleteById(id) > 0){
			throw new  BizException("delete.error","根据ID删除数据失败");
		}
		return ResponseDataResult.setResponseResult();
	}

	public <T> ResponseDataResult update(T t)  throws Exception{
		if(getDao().update(t) > 0){
			throw new  BizException("update.error","修改数据失败");
		}
		return ResponseDataResult.setResponseResult();
	}

	public <T> T queryById(Object id) throws Exception{
		return getDao().queryById(id);
	}

	public <T> ResponsePaginationDataResult queryByList(Integer pageNum, Integer pageSize, Object param) throws Exception {
        /*Integer count = getDao().queryListCount(param);
        if(count > 0){
            List list = getDao().queryByList(param);
            return ResponsePaginationDataResult.setPaginationDataResult(10L,list);
        }*/
		List list = getDao().queryByList(param);
        return ResponsePaginationDataResult.setPaginationDataResult(10L,null);
	}

}
