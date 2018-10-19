package com.xy.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="abs_ngari_loan_result")
public class AbsNgariLoanResult {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
    private String id;

    private String eventType;

    private String eventData;

    private Integer version;

    private String comment;

    private String orderId;

    private String curDate;

    private String tranTime;

    private String leader;

    private String partner;

    private String custName;

    private String certType;

    private String certNo;

    private String loanId;

    private Date applyDate;

    private String startDate;

    private String firstDueDate;

    private Integer dueDay;

    private String endDate;

    private String seqNo;

    private Integer encashAmt;

    private String currency;

    private String repayMode;

    private String repayCycle;

    private Integer totalTerms;

    private Integer graceDay;

    private String scheduleId;
    
    @Transient
    private List<AbsBaiduStagesDetails> AbsBaiduStagesDetails;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType == null ? null : eventType.trim();
    }

    public String getEventData() {
        return eventData;
    }

    public void setEventData(String eventData) {
        this.eventData = eventData == null ? null : eventData.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getCurDate() {
        return curDate;
    }

    public void setCurDate(String curDate) {
        this.curDate = curDate == null ? null : curDate.trim();
    }

    public String getTranTime() {
        return tranTime;
    }

    public void setTranTime(String tranTime) {
        this.tranTime = tranTime == null ? null : tranTime.trim();
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader == null ? null : leader.trim();
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner == null ? null : partner.trim();
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType == null ? null : certType.trim();
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo == null ? null : certNo.trim();
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId == null ? null : loanId.trim();
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate == null ? null : startDate.trim();
    }

    public String getFirstDueDate() {
        return firstDueDate;
    }

    public void setFirstDueDate(String firstDueDate) {
        this.firstDueDate = firstDueDate == null ? null : firstDueDate.trim();
    }

    public Integer getDueDay() {
        return dueDay;
    }

    public void setDueDay(Integer dueDay) {
        this.dueDay = dueDay;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate == null ? null : endDate.trim();
    }

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo == null ? null : seqNo.trim();
    }

    public Integer getEncashAmt() {
        return encashAmt;
    }

    public void setEncashAmt(Integer encashAmt) {
        this.encashAmt = encashAmt;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public String getRepayMode() {
        return repayMode;
    }

    public void setRepayMode(String repayMode) {
        this.repayMode = repayMode == null ? null : repayMode.trim();
    }

    public String getRepayCycle() {
        return repayCycle;
    }

    public void setRepayCycle(String repayCycle) {
        this.repayCycle = repayCycle == null ? null : repayCycle.trim();
    }

    public Integer getTotalTerms() {
        return totalTerms;
    }

    public void setTotalTerms(Integer totalTerms) {
        this.totalTerms = totalTerms;
    }

    public Integer getGraceDay() {
        return graceDay;
    }

    public void setGraceDay(Integer graceDay) {
        this.graceDay = graceDay;
    }

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId == null ? null : scheduleId.trim();
    }

	public List<AbsBaiduStagesDetails> getAbsBaiduStagesDetails() {
		return AbsBaiduStagesDetails;
	}

	public void setAbsBaiduStagesDetails(
			List<AbsBaiduStagesDetails> absBaiduStagesDetails) {
		AbsBaiduStagesDetails = absBaiduStagesDetails;
	}
    
}