package com.study.contrller;

import java.util.ArrayList;
import java.util.Scanner;

import com.study.domin.JCB;
import com.study.domin.SystemClass;

/**
 * 获取进程信息类
 * @author yumen	
 *
 */
public class InputJCBSInfo {

	public ArrayList<JCB> makeJCBInfo(SystemClass sys){
		
		ArrayList<JCB> jcbs = new ArrayList<JCB>();
		
		Scanner scanner = new Scanner(System.in);
		
		//输入进程数
		System.out.println("请输入进程数：");
		int num =scanner.nextInt();
		int jcbnum =0 ;
		
		sys.setJcbNum(num);
		
		//根据进程数来设定每个进程的名字和运行时间等信息
		for(int t=0;t<num;t++){
			
			System.out.println("请输入进程" + (t+1) +"的名字：");
			String jobName = null;
			jobName = scanner.next();
			System.out.println("请输入进程" + (t+1) + "的运行时间：");
			int runTime = 0;
			runTime = scanner.nextInt();
			
			JCB jcb = new JCB();
			jcb.setNeedTime(runTime);
			
			if(jobName != null)
				jcb.setJobName(jobName);
			else jcb.setJobName("noName"+t);
			
			//将添加的job添加到模拟系统中
			jcbs.add(jcb);
		}
		return jcbs;
	}
	
}
