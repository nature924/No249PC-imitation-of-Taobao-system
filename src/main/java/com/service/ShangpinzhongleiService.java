package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangpinzhongleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShangpinzhongleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangpinzhongleiView;


/**
 * 商品种类
 *
 * @author 
 * @email 
 * @date 2023-03-09 17:28:21
 */
public interface ShangpinzhongleiService extends IService<ShangpinzhongleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangpinzhongleiVO> selectListVO(Wrapper<ShangpinzhongleiEntity> wrapper);
   	
   	ShangpinzhongleiVO selectVO(@Param("ew") Wrapper<ShangpinzhongleiEntity> wrapper);
   	
   	List<ShangpinzhongleiView> selectListView(Wrapper<ShangpinzhongleiEntity> wrapper);
   	
   	ShangpinzhongleiView selectView(@Param("ew") Wrapper<ShangpinzhongleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangpinzhongleiEntity> wrapper);
   	

}

