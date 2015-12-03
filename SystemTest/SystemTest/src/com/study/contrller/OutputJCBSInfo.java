package com.study.contrller;

import java.util.ArrayList;

import com.study.domin.JCB;
import com.study.domin.Status;
import com.study.domin.SystemClass;

public class OutputJCBSInfo {

	public void outputInfo(SystemClass systemClass){
		int num = systemClass.getJcbNum();
		ArrayList<JCB> jcbs = systemClass.getJobs();

		//ѭ��ִ��JCBS���е����е�Job
		for(int t=0;t<num;t++){
			
			JCB jcb = new JCB();
			jcb=jcbs.get(t);
			
			//systemClass.setNowTime(System.currentTimeMillis());
			//��ȡϵͳ��ǰִ��ʱ��
			long runTime = systemClass.getNowTime();
			//��ȡִ�е�job����ִ��ʱ��
			long needTime =systemClass.getNowTime()+jcb.getNeedTime();
			//�趨ִ�е�job��״̬
			jcbs.get(t).setStatus(Status.RUN);
			//ͨ���߳���������������ִ�й���
			while(runTime <= needTime){
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				//�����ǰִ�е�job����Ϣ
				System.out.println("��ǰ��ҵ���õĵ��ȷ������ȵ��ȷ���~");
				System.out.println("��ǰ���е���ҵ�ǣ�" + jcb.getJobName() +"\n");
				System.out.println("������ҵ����ʱ�䣺" + jcb.getNeedTime() + "\n");
				long lastTime = needTime -runTime;
				System.out.println("������ҵ����ʱ�䣺" + lastTime +"\n");
				runTime++;
				
				//�����ǰϵͳ�е�����job��ִ����Ϣ
				showOtherJob(jcbs);
			}
			//����ǰִ����ɵ�job��״̬����Ϊ��ִ��
			jcbs.get(t).setStatus(Status.FINISH);
			
		}
		System.out.println("ϵͳִ�н�����������");
	}
	
	//��ʾ��ǰϵͳ������job��ִ�������ִ����Ϣ
	public static void showOtherJob(ArrayList<JCB> jcbs){

		for(JCB jcb :jcbs){
			System.out.println("------------------------------------��ǰ��ҵϵͳ��������ҵ���~");
			System.out.println("------------------------------------��ǰϵͳ�д��ڵ���ҵ�У�" + jcb.getJobName() +"\n");
				
			if(jcb.getStatus() == Status.RUN)
				System.out.println("************************************ִ��״̬:"+jcb.getJobName()+" �� ����ִ��"+"\n");
			else if(jcb.getStatus() == Status.WAIT)
				System.out.println("------------------------------------ִ��״̬:"+jcb.getJobName()+" �� �ȴ�ִ��"+"\n");
			else System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!ִ��״̬:"+jcb.getJobName()+" �� ִ�����"+"\n");
		}	
			
	}
}
