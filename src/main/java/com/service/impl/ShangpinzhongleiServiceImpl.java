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


import com.dao.ShangpinzhongleiDao;
import com.entity.ShangpinzhongleiEntity;
import com.service.ShangpinzhongleiService;
import com.entity.vo.ShangpinzhongleiVO;
import com.entity.view.ShangpinzhongleiView;

@Service("shangpinzhongleiService")
public class ShangpinzhongleiServiceImpl extends ServiceImpl<ShangpinzhongleiDao, ShangpinzhongleiEntity> implements ShangpinzhongleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangpinzhongleiEntity> page = this.selectPage(
                new Query<ShangpinzhongleiEntity>(params).getPage(),
                new EntityWrapper<ShangpinzhongleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangpinzhongleiEntity> wrapper) {
		  Page<ShangpinzhongleiView> page =new Query<ShangpinzhongleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShangpinzhongleiVO> selectListVO(Wrapper<ShangpinzhongleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShangpinzhongleiVO selectVO(Wrapper<ShangpinzhongleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShangpinzhongleiView> selectListView(Wrapper<ShangpinzhongleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangpinzhongleiView selectView(Wrapper<ShangpinzhongleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
