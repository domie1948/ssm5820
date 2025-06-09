package com.entity.view;

import com.entity.JishileixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 技师类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-22 10:01:21
 */
@TableName("jishileixing")
public class JishileixingView  extends JishileixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JishileixingView(){
	}
 
 	public JishileixingView(JishileixingEntity jishileixingEntity){
 	try {
			BeanUtils.copyProperties(this, jishileixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
