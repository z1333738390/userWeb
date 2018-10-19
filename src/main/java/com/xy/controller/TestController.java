package com.xy.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.xy.dto.AbsBaiduStagesDetails;
import com.xy.dto.AbsNgariLoanResult;
import com.xy.repository.AbsNgariLoanResultRepository;
import com.xy.service.TestService;

@RestController
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@Autowired
	private AbsNgariLoanResultRepository absNgariLoanResultRepository;
	
	@RequestMapping(value = "saveData",method = RequestMethod.POST )
	@ResponseBody
	public String saveData(String event_type,String event_data,String version,String comment) {
		AbsNgariLoanResult parseObject = JSON.parseObject(event_data, AbsNgariLoanResult.class);
		parseObject.setEventType(event_type);
		parseObject.setVersion(Integer.valueOf(version));
		parseObject.setComment(comment);
		testService.saveData(parseObject);
		Map<String, String> map = new HashMap<String, String>();
		map.put("result", "2000");
		map.put("msg", "success");
		return JSON.toJSONString(map);
	}
	
	@Test
	public void testAA(){
		Map<String, String> map = new HashMap<String, String>();
		map.put("result", "2000");
		map.put("msg", "success");
		System.out.println(JSON.toJSONString(map));
	}
	
	@RequestMapping(value = "saveHibernateData",method = RequestMethod.POST )
	@ResponseBody
	public String saveHibernateData(String event_type,String event_data,String version,String comment) {
//		AbsNgariLoanResult parseObject = JSON.parseObject(event_data, AbsNgariLoanResult.class);
		AbsNgariLoanResult absNgariLoanResult = new AbsNgariLoanResult();
		absNgariLoanResult.setId("1");
	    absNgariLoanResult.setEventType("2");
	    absNgariLoanResult.setEventData("3");
	    absNgariLoanResult.setVersion(4);
	    absNgariLoanResult.setComment("5");
	    absNgariLoanResult.setOrderId("6");
	    absNgariLoanResult.setCurDate("7");
	    absNgariLoanResult.setTranTime("8");
	    absNgariLoanResult.setLeader("9");
	    absNgariLoanResult.setPartner("10");
	    absNgariLoanResult.setCustName("11");
	    absNgariLoanResult.setCertType("12");
	    absNgariLoanResult.setCertNo("13");
	    absNgariLoanResult.setLoanId("14");
	    absNgariLoanResult.setApplyDate(new Date());
	    absNgariLoanResult.setStartDate("16");
	    absNgariLoanResult.setFirstDueDate("17");
	    absNgariLoanResult.setDueDay(18);
	    absNgariLoanResult.setEndDate("19");
	    absNgariLoanResult.setSeqNo("20");
	    absNgariLoanResult.setEncashAmt(21);
	    absNgariLoanResult.setCurrency("22");
	    absNgariLoanResult.setRepayMode("23");
	    absNgariLoanResult.setRepayCycle("9");
	    absNgariLoanResult.setTotalTerms(25);
	    absNgariLoanResult.setGraceDay(26);
	    absNgariLoanResult.setScheduleId("27");
	    AbsBaiduStagesDetails absBaiduStagesDetails = new AbsBaiduStagesDetails();
	    absBaiduStagesDetails.setScheduleId("27");
	    absBaiduStagesDetails.setScheduleNo(29);
	    absBaiduStagesDetails.setStartDate("30");
	    absBaiduStagesDetails.setEndDate("31");
	    absBaiduStagesDetails.setAmounts("32");
	    List<AbsBaiduStagesDetails> absBaiduStagesDetailsList = new ArrayList<AbsBaiduStagesDetails>();
	    absBaiduStagesDetailsList.add(absBaiduStagesDetails);
	    AbsBaiduStagesDetails absBaiduStagesDetailss = new AbsBaiduStagesDetails();
	    absBaiduStagesDetailss.setScheduleId("27");
	    absBaiduStagesDetailss.setScheduleNo(34);
	    absBaiduStagesDetailss.setStartDate("35");
	    absBaiduStagesDetailss.setEndDate("36");
	    absBaiduStagesDetailss.setAmounts("37");
	    absBaiduStagesDetailsList.add(absBaiduStagesDetailss);
	    absNgariLoanResult.setAbsBaiduStagesDetails(absBaiduStagesDetailsList);
	    absNgariLoanResult.setComment("sdfasdfasdfsa");
	    String sql = "INSERT INTO abs_ngari_loan_result (id,event_type, event_data, version, comment, order_id, cur_date, tran_time, leader, partner, cust_name, cert_type, cert_no, loan_id, apply_date, start_date, first_due_date, due_day, end_date, seq_no, encash_amt, currency, repay_mode, repay_cycle, total_terms, grace_day, schedule_id) VALUES ('"+absNgariLoanResult.getId()+
	    		"', '"+absNgariLoanResult.getEventType()+"', '"+absNgariLoanResult.getEventData()+"', '"+absNgariLoanResult.getVersion()+"', '"+absNgariLoanResult.getComment()+"', '"+absNgariLoanResult.getOrderId()+"', '"+absNgariLoanResult.getCurDate()+"', '"+absNgariLoanResult.getTranTime()+"', '"+absNgariLoanResult.getLeader()+"', '"+absNgariLoanResult.getPartner()+"', '"+absNgariLoanResult.getCustName()+
	    		"', '"+absNgariLoanResult.getCertType()+"', '"+absNgariLoanResult.getCertNo()+"', '14', '15', '16', '17', '18', '19', '20', '21', '22', '23', '9', '25', '26', '27');";
		absNgariLoanResultRepository.save(absNgariLoanResult);
		Map<String, String> map = new HashMap<String, String>();
		map.put("result", "2000");
		map.put("msg", "success");
		return JSON.toJSONString(map);
	}
}
