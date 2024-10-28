package com.entity.view;

import com.entity.ShangpinzhongleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 商品种类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-09 17:28:21
 */
@TableName("shangpinzhonglei")
public class ShangpinzhongleiView  extends ShangpinzhongleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShangpinzhongleiView(){
	}
 
 	public ShangpinzhongleiView(ShangpinzhongleiEntity shangpinzhongleiEntity){
 	try {
			BeanUtils.copyProperties(this, shangpinzhongleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
