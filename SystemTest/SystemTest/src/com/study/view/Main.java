package com.study.view;

import com.study.contrller.InputJCBSInfo;
import com.study.contrller.OutputJCBSInfo;
import com.study.domin.*;

public class Main {
	
	public static void main(String[] args){
		
		SystemClass systemClass = new SystemClass();
		InputJCBSInfo inputInfo = new InputJCBSInfo();
		OutputJCBSInfo outputInfo = new OutputJCBSInfo();
		
		//ͨ��inputInfo���ȡ������Ϣ���������ɵ�Jcbs����ϵͳ
		systemClass.setJobs(inputInfo.makeJCBInfo(systemClass));
		
		//���ϵͳ������Ϣ
		outputInfo.outputInfo(systemClass);
		
		
	}
}

