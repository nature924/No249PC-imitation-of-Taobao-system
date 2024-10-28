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


import com.dao.ShangchengshangpinDao;
import com.entity.ShangchengshangpinEntity;
import com.service.ShangchengshangpinService;
import com.entity.vo.ShangchengshangpinVO;
import com.entity.view.ShangchengshangpinView;

@Service("shangchengshangpinService")
public class ShangchengshangpinServiceImpl extends ServiceImpl<ShangchengshangpinDao, ShangchengshangpinEntity> implements ShangchengshangpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangchengshangpinEntity> page = this.selectPage(
                new Query<ShangchengshangpinEntity>(params).getPage(),
                new EntityWrapper<ShangchengshangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangchengshangpinEntity> wrapper) {
		  Page<ShangchengshangpinView> page =new Query<ShangchengshangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShangchengshangpinVO> selectListVO(Wrapper<ShangchengshangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShangchengshangpinVO selectVO(Wrapper<ShangchengshangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShangchengshangpinView> selectListView(Wrapper<ShangchengshangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangchengshangpinView selectView(Wrapper<ShangchengshangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
