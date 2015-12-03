package com.study.domin;

import java.util.ArrayList;

/**
 * 系统运行类
 * @author 周宇钦
 *
 */
public class SystemClass {

	private ArrayList<JCB> jobs= new ArrayList<JCB>();
	private long nowTime = System.currentTimeMillis();			//系统当前执行时间
	private int jcbNum = 0;										//系统进程数量
	
	
	public int getJcbNum() {
		return jcbNum;
	}

	public void setJcbNum(int jcbNum) {
		this.jcbNum = jcbNum;
	}

	public long getNowTime() {
		return nowTime;
	}

	public void setNowTime(long nowTime) {
		this.nowTime = nowTime;
	}
	public ArrayList<JCB> getJobs() {
		return jobs;
	}

	public void setJobs(ArrayList<JCB> jobs) {
		this.jobs = jobs;
	}
	
}
