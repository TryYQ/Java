package com.study.domin;

import java.util.ArrayList;

/**
 * ϵͳ������
 * @author ������
 *
 */
public class SystemClass {

	private ArrayList<JCB> jobs= new ArrayList<JCB>();
	private long nowTime = System.currentTimeMillis();			//ϵͳ��ǰִ��ʱ��
	private int jcbNum = 0;										//ϵͳ��������
	
	
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
