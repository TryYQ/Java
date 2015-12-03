package com.study.view;

import com.study.contrller.InputJCBSInfo;
import com.study.contrller.OutputJCBSInfo;
import com.study.domin.*;

public class Main {
	
	public static void main(String[] args){
		
		SystemClass systemClass = new SystemClass();
		InputJCBSInfo inputInfo = new InputJCBSInfo();
		OutputJCBSInfo outputInfo = new OutputJCBSInfo();
		
		//通过inputInfo类获取输入信息，并将生成的Jcbs赋给系统
		systemClass.setJobs(inputInfo.makeJCBInfo(systemClass));
		
		//输出系统进程信息
		outputInfo.outputInfo(systemClass);
		
		
	}
}

