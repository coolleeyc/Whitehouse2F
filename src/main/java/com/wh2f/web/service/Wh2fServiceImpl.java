package com.wh2f.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wh2f.web.dto.ItemInfoDTO;
import com.wh2f.web.mapper.Wh2fMapper;

@Service("com.wh2f.web.service.Wh2fServiceImpl")
public class Wh2fServiceImpl implements Wh2fService {
	
	@Autowired
	private Wh2fMapper wh2fmapper;
	
	@Override
	public ItemInfoDTO selectProductService(int item_code) {
		return wh2fmapper.selectProduct(item_code);
	}
	
}
