package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussshangchengshangpinDao;
import com.entity.DiscussshangchengshangpinEntity;
import com.service.DiscussshangchengshangpinService;
import com.entity.vo.DiscussshangchengshangpinVO;
import com.entity.view.DiscussshangchengshangpinView;

@Service("discussshangchengshangpinService")
public class DiscussshangchengshangpinServiceImpl extends ServiceImpl<DiscussshangchengshangpinDao, DiscussshangchengshangpinEntity> implements DiscussshangchengshangpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshangchengshangpinEntity> page = this.selectPage(
                new Query<DiscussshangchengshangpinEntity>(params).getPage(),
                new EntityWrapper<DiscussshangchengshangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshangchengshangpinEntity> wrapper) {
		  Page<DiscussshangchengshangpinView> page =new Query<DiscussshangchengshangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshangchengshangpinVO> selectListVO(Wrapper<DiscussshangchengshangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshangchengshangpinVO selectVO(Wrapper<DiscussshangchengshangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshangchengshangpinView> selectListView(Wrapper<DiscussshangchengshangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshangchengshangpinView selectView(Wrapper<DiscussshangchengshangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
