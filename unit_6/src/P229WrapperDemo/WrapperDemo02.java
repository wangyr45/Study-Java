package P229WrapperDemo;

public class WrapperDemo02 {
	public static void main(String[] args) {
		float f = 30.3f;			//声明一个基本数据类型
		Float x = new Float(f);		//装箱：将基本数据类型变为包装类
		float y = x.floatValue();	//拆箱：将一个包装类变为基本数据类型
	}
}
