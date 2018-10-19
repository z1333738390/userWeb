package com.xy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

//import com.xy.dao.AbsBaiduStagesDetailsMapper;
//import com.xy.dao.AbsNgariLoanResultMapper;
import com.xy.dto.AbsBaiduStagesDetails;
import com.xy.dto.AbsNgariLoanResult;
import com.xy.service.TestService;

@Service("testService")
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
public class TestServiceImpl implements TestService {

	/*@Autowired
	private AbsBaiduStagesDetailsMapper absBaiduStagesDetailsMapper;
	@Autowired
	private AbsNgariLoanResultMapper absNgariLoanResultMapper;*/
	
	public void saveData(AbsNgariLoanResult parseObject) {
//		absNgariLoanResultMapper.insertSelective(parseObject);
//		for (AbsBaiduStagesDetails absBaiduStagesDetails : parseObject.getAbsBaiduStagesDetails()) {
//			absBaiduStagesDetailsMapper.insertSelective(absBaiduStagesDetails);
//		}
	}

}
