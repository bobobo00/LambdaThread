package thread;
/**
 * 1��lambda���ʽ��ֻ��һ��������
 * 2�����̣߳�ֻʹ��һ�Σ�
 * 3��lambda�Ƶ�����������͡�
 * 4��
 * @author dell
 *
 */

public class LambdaThread {
	//��̬�ڲ���
	static class Test implements Runnable{

		@Override
		public void run() {
			System.out.println("��̬�ڲ���");
			
		}
		
	}
	
	
	public static void main(String[] args) {
		new Thread(new Test()).start();
		//�ֲ��ڲ���
		class Test1 implements Runnable{

			@Override
			public void run() {
				System.out.println("�ֲ��ڲ���");
				
			}
			
		} 
		new Thread(new Test1()).start();
		//�����ڲ���
		new Thread(new Runnable() {
			public void run() {
				System.out.println("�����ڲ���");
				
			}
		}).start();
		
		//jdk8 ��lambda���ʽ
		
		new Thread(()->{
				System.out.println("lambda���ʽ");	
			}).start();
		//��������ֻ��һ�����ʱ��ʡ�Ի����ţ����������β�ֻ��һ������ʱ�ſ�ʡ�����ţ���ʡ���β����͡�
		new Thread(()->System.out.println("������")).start();
		
	}

}
