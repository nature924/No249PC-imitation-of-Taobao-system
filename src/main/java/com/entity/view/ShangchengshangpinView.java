package com.entity.view;

import com.entity.ShangchengshangpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 商城商品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-09 17:28:21
 */
@TableName("shangchengshangpin")
public class ShangchengshangpinView  extends ShangchengshangpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShangchengshangpinView(){
	}
 
 	public ShangchengshangpinView(ShangchengshangpinEntity shangchengshangpinEntity){
 	try {
			BeanUtils.copyProperties(this, shangchengshangpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
