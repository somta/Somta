package com.somta.core.utils;

import java.util.Collection;
import java.util.Map;
import java.util.UUID;

/**
 * 
 * @Description: 公共通用工具类
 *
 * @Date:        2018-07-05
 * @Author:      明天的地平线
 * @Version:     1.0.0
 */
public class CommonUtil {

  /**
   * 判断对象或对象数组中每一个对象是否为空: 对象为null，字符序列长度为0，集合类、Map为empty
   *
   * @return true or false
   */
  @SuppressWarnings("rawtypes")
  public static boolean isNullOrEmpty(Object obj) {
	    if (obj == null) {
	      return true;
	    }
	
	    if (obj instanceof CharSequence) {
	      return ((CharSequence) obj).length() == 0;
	    }
	
	    if (obj instanceof Collection) {
	      return ((Collection) obj).isEmpty();
	    }
	
	    if (obj instanceof Map) {
	      return ((Map<?, ?>) obj).isEmpty();
	    }
	
	    if (obj instanceof Object[]) {
	      Object[] object = (Object[]) obj;
	      boolean empty = true;
	      for (Object anObject : object) {
	        if (!isNullOrEmpty(anObject)) {
	          empty = false;
	          break;
	        }
	      }
	      return empty;
	    }
	    return false;
  }

  /** 
   * 获得一个不带UUID 
   * @return String UUID 
   */ 
  public static String getUUID(){ 
  	return UUID.randomUUID().toString().replaceAll("\\-", ""); 
  }
  
}
