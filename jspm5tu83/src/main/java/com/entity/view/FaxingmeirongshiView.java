package com.entity.view;

import com.entity.FaxingmeirongshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 发型美容师
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-22 10:01:21
 */
@TableName("faxingmeirongshi")
public class FaxingmeirongshiView  extends FaxingmeirongshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FaxingmeirongshiView(){
	}
 
 	public FaxingmeirongshiView(FaxingmeirongshiEntity faxingmeirongshiEntity){
 	try {
			BeanUtils.copyProperties(this, faxingmeirongshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
