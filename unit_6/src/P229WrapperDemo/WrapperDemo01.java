package P229WrapperDemo;
/*
 * 包装类
 * 装箱与拆箱
 * 
 * */
public class WrapperDemo01 {
	public static void main(String[] args) {
		int x = 30;					//声明一个基本数据类型
		Integer i = new Integer(x);	//装箱：将基本数据类型变为包装类
		int temp = i.intValue();	//拆箱：将一个包装类变为基本数据类型
	}
}
