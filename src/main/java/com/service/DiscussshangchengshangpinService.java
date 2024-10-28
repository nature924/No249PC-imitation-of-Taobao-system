package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshangchengshangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshangchengshangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshangchengshangpinView;


/**
 * 商城商品评论表
 *
 * @author 
 * @email 
 * @date 2023-03-09 17:28:21
 */
public interface DiscussshangchengshangpinService extends IService<DiscussshangchengshangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshangchengshangpinVO> selectListVO(Wrapper<DiscussshangchengshangpinEntity> wrapper);
   	
   	DiscussshangchengshangpinVO selectVO(@Param("ew") Wrapper<DiscussshangchengshangpinEntity> wrapper);
   	
   	List<DiscussshangchengshangpinView> selectListView(Wrapper<DiscussshangchengshangpinEntity> wrapper);
   	
   	DiscussshangchengshangpinView selectView(@Param("ew") Wrapper<DiscussshangchengshangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshangchengshangpinEntity> wrapper);
   	

}

