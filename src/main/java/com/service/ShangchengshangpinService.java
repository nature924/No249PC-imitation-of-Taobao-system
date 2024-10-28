package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangchengshangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShangchengshangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangchengshangpinView;


/**
 * 商城商品
 *
 * @author 
 * @email 
 * @date 2023-03-09 17:28:21
 */
public interface ShangchengshangpinService extends IService<ShangchengshangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangchengshangpinVO> selectListVO(Wrapper<ShangchengshangpinEntity> wrapper);
   	
   	ShangchengshangpinVO selectVO(@Param("ew") Wrapper<ShangchengshangpinEntity> wrapper);
   	
   	List<ShangchengshangpinView> selectListView(Wrapper<ShangchengshangpinEntity> wrapper);
   	
   	ShangchengshangpinView selectView(@Param("ew") Wrapper<ShangchengshangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangchengshangpinEntity> wrapper);
   	

}

