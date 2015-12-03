package com.study.domin;

/**
 * JCB类，用于记录job的运行信息和运行情况
 * @author 周宇钦
 *
 */

public class JCB {
	
	private String jobName ="";
	private long submitTime = System.currentTimeMillis();
	private int needTime = 0;
	private Status status = Status.WAIT ;
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public long getSubmitTime() {
		return submitTime;
	}
	public void setSubmitTime(long submitTime) {
		this.submitTime = submitTime;
	}
	public int getNeedTime() {
		return needTime;
	}
	public void setNeedTime(int needTime) {
		this.needTime = needTime;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	

	
}
