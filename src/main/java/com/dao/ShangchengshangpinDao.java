package com.dao;

import com.entity.ShangchengshangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangchengshangpinVO;
import com.entity.view.ShangchengshangpinView;


/**
 * 商城商品
 * 
 * @author 
 * @email 
 * @date 2023-03-09 17:28:21
 */
public interface ShangchengshangpinDao extends BaseMapper<ShangchengshangpinEntity> {
	
	List<ShangchengshangpinVO> selectListVO(@Param("ew") Wrapper<ShangchengshangpinEntity> wrapper);
	
	ShangchengshangpinVO selectVO(@Param("ew") Wrapper<ShangchengshangpinEntity> wrapper);
	
	List<ShangchengshangpinView> selectListView(@Param("ew") Wrapper<ShangchengshangpinEntity> wrapper);

	List<ShangchengshangpinView> selectListView(Pagination page,@Param("ew") Wrapper<ShangchengshangpinEntity> wrapper);
	
	ShangchengshangpinView selectView(@Param("ew") Wrapper<ShangchengshangpinEntity> wrapper);
	

}
