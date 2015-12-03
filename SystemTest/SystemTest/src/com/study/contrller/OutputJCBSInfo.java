package com.study.contrller;

import java.util.ArrayList;

import com.study.domin.JCB;
import com.study.domin.Status;
import com.study.domin.SystemClass;

public class OutputJCBSInfo {

	public void outputInfo(SystemClass systemClass){
		int num = systemClass.getJcbNum();
		ArrayList<JCB> jcbs = systemClass.getJobs();

		//循环执行JCBS链中的所有的Job
		for(int t=0;t<num;t++){
			
			JCB jcb = new JCB();
			jcb=jcbs.get(t);
			
			//systemClass.setNowTime(System.currentTimeMillis());
			//获取系统当前执行时间
			long runTime = systemClass.getNowTime();
			//获取执行的job所需执行时间
			long needTime =systemClass.getNowTime()+jcb.getNeedTime();
			//设定执行的job的状态
			jcbs.get(t).setStatus(Status.RUN);
			//通过线程休眠来代替程序的执行过程
			while(runTime <= needTime){
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				//输出当前执行的job的信息
				System.out.println("当前作业采用的调度方法是先到先服务~");
				System.out.println("当前运行的作业是：" + jcb.getJobName() +"\n");
				System.out.println("运行作业所需时间：" + jcb.getNeedTime() + "\n");
				long lastTime = needTime -runTime;
				System.out.println("运行作业还需时间：" + lastTime +"\n");
				runTime++;
				
				//输出当前系统中的所有job的执行信息
				showOtherJob(jcbs);
			}
			//将当前执行完成的job的状态设置为已执行
			jcbs.get(t).setStatus(Status.FINISH);
			
		}
		System.out.println("系统执行结束！！！！");
	}
	
	//显示当前系统的所有job的执行情况和执行信息
	public static void showOtherJob(ArrayList<JCB> jcbs){

		for(JCB jcb :jcbs){
			System.out.println("------------------------------------当前作业系统的其他作业情况~");
			System.out.println("------------------------------------当前系统中存在的作业有：" + jcb.getJobName() +"\n");
				
			if(jcb.getStatus() == Status.RUN)
				System.out.println("************************************执行状态:"+jcb.getJobName()+" ： 正在执行"+"\n");
			else if(jcb.getStatus() == Status.WAIT)
				System.out.println("------------------------------------执行状态:"+jcb.getJobName()+" ： 等待执行"+"\n");
			else System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!执行状态:"+jcb.getJobName()+" ： 执行完成"+"\n");
		}	
			
	}
}
