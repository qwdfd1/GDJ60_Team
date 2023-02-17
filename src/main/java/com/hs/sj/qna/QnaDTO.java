package com.hs.sj.qna;

import java.sql.Date;

public class QnaDTO {
	private Long qnaNum;
	private String qnaTitle;
	private String qnaDetail;
	private String qnaWriter;
	private Date qnaDate;
	private Long qnaHit;
	
	public Long getQnaNum() {
		return qnaNum;
	}
	public void setQnaNum(Long qnaNum) {
		this.qnaNum = qnaNum;
	}
	public String getQnaTitle() {
		return qnaTitle;
	}
	public void setQnaTitle(String qnaTitle) {
		this.qnaTitle = qnaTitle;
	}
	public String getQnaDetail() {
		return qnaDetail;
	}
	public void setQnaDetail(String qnaDetail) {
		this.qnaDetail = qnaDetail;
	}
	public String getQnaWriter() {
		return qnaWriter;
	}
	public void setQnaWriter(String qnaWriter) {
		this.qnaWriter = qnaWriter;
	}
	public Date getQnaDate() {
		return qnaDate;
	}
	public void setQnaDate(Date qnaDate) {
		this.qnaDate = qnaDate;
	}
	public Long getQnaHit() {
		return qnaHit;
	}
	public void setQnaHit(Long qnaHit) {
		this.qnaHit = qnaHit;
	}
	
	
}
