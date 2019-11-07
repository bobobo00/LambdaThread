package thread;
/**
 * 1，lambda表达式中只能一个方法体
 * 2，简化线程（只使用一次）
 * 3，lambda推导必须存在类型。
 * 4，
 * @author dell
 *
 */

public class LambdaThread {
	//静态内部类
	static class Test implements Runnable{

		@Override
		public void run() {
			System.out.println("静态内部类");
			
		}
		
	}
	
	
	public static void main(String[] args) {
		new Thread(new Test()).start();
		//局部内部类
		class Test1 implements Runnable{

			@Override
			public void run() {
				System.out.println("局部内部类");
				
			}
			
		} 
		new Thread(new Test1()).start();
		//匿名内部类
		new Thread(new Runnable() {
			public void run() {
				System.out.println("匿名内部类");
				
			}
		}).start();
		
		//jdk8 简化lambda表达式
		
		new Thread(()->{
				System.out.println("lambda表达式");	
			}).start();
		//当方法体只有一条语句时可省略花括号，当方法的形参只有一个参数时才可省略括号，可省略形参类型。
		new Thread(()->System.out.println("无括号")).start();
		
	}

}
