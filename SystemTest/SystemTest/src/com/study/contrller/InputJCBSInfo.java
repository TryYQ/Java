package com.study.contrller;

import java.util.ArrayList;
import java.util.Scanner;

import com.study.domin.JCB;
import com.study.domin.SystemClass;

/**
 * ��ȡ������Ϣ��
 * @author yumen	
 *
 */
public class InputJCBSInfo {

	public ArrayList<JCB> makeJCBInfo(SystemClass sys){
		
		ArrayList<JCB> jcbs = new ArrayList<JCB>();
		
		Scanner scanner = new Scanner(System.in);
		
		//���������
		System.out.println("�������������");
		int num =scanner.nextInt();
		int jcbnum =0 ;
		
		sys.setJcbNum(num);
		
		//���ݽ��������趨ÿ�����̵����ֺ�����ʱ�����Ϣ
		for(int t=0;t<num;t++){
			
			System.out.println("���������" + (t+1) +"�����֣�");
			String jobName = null;
			jobName = scanner.next();
			System.out.println("���������" + (t+1) + "������ʱ�䣺");
			int runTime = 0;
			runTime = scanner.nextInt();
			
			JCB jcb = new JCB();
			jcb.setNeedTime(runTime);
			
			if(jobName != null)
				jcb.setJobName(jobName);
			else jcb.setJobName("noName"+t);
			
			//����ӵ�job��ӵ�ģ��ϵͳ��
			jcbs.add(jcb);
		}
		return jcbs;
	}
	
}
