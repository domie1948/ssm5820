package com.entity.view;

import com.entity.TaocangoumaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 套餐购买
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-22 10:01:21
 */
@TableName("taocangoumai")
public class TaocangoumaiView  extends TaocangoumaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TaocangoumaiView(){
	}
 
 	public TaocangoumaiView(TaocangoumaiEntity taocangoumaiEntity){
 	try {
			BeanUtils.copyProperties(this, taocangoumaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
