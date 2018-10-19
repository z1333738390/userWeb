package com.xy.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.http.client.ClientProtocolException;
import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.xy.dto.AbsBaiduStagesDetails;
import com.xy.dto.AbsNgariLoanResult;

public class WebTest {
	
	@Test
	public void test1() throws ClientProtocolException, IOException {
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
	    String jsonString = JSON.toJSONString(absNgariLoanResult);
	    System.out.println(jsonString);
//	    httpPost.addHeader(header);
//	    httpPost.
//	    client.execute(httpPost);
	}
	
	@Test
	public void zhuanhuan() {
		char a = '旭';
		char b = '羽';
		char c = '国';
		char d = '际';
		char[] qq = new char[]{a,b,c,d};
		StringBuffer str = new StringBuffer();
		for (char k : qq) {
			str.append((int)k +"-");
		}
		str.substring(str.length()-1);
		System.out.println(str);
	}

}
