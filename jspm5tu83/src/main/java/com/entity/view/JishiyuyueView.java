package com.entity.view;

import com.entity.JishiyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 技师预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-22 10:01:21
 */
@TableName("jishiyuyue")
public class JishiyuyueView  extends JishiyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JishiyuyueView(){
	}
 
 	public JishiyuyueView(JishiyuyueEntity jishiyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, jishiyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
