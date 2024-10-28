package com.entity.view;

import com.entity.DiscussshangchengshangpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 商城商品评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-09 17:28:21
 */
@TableName("discussshangchengshangpin")
public class DiscussshangchengshangpinView  extends DiscussshangchengshangpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussshangchengshangpinView(){
	}
 
 	public DiscussshangchengshangpinView(DiscussshangchengshangpinEntity discussshangchengshangpinEntity){
 	try {
			BeanUtils.copyProperties(this, discussshangchengshangpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
