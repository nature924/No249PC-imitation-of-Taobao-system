package com.dao;

import com.entity.DiscussshangchengshangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshangchengshangpinVO;
import com.entity.view.DiscussshangchengshangpinView;


/**
 * 商城商品评论表
 * 
 * @author 
 * @email 
 * @date 2023-03-09 17:28:21
 */
public interface DiscussshangchengshangpinDao extends BaseMapper<DiscussshangchengshangpinEntity> {
	
	List<DiscussshangchengshangpinVO> selectListVO(@Param("ew") Wrapper<DiscussshangchengshangpinEntity> wrapper);
	
	DiscussshangchengshangpinVO selectVO(@Param("ew") Wrapper<DiscussshangchengshangpinEntity> wrapper);
	
	List<DiscussshangchengshangpinView> selectListView(@Param("ew") Wrapper<DiscussshangchengshangpinEntity> wrapper);

	List<DiscussshangchengshangpinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshangchengshangpinEntity> wrapper);
	
	DiscussshangchengshangpinView selectView(@Param("ew") Wrapper<DiscussshangchengshangpinEntity> wrapper);
	

}
