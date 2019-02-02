package jp.co.internous.action;

public class Capsule {
	public static void main(String[]args){
		//演習②
		Person taro=new Person("山田太郎",20);

		//演習④
		System.out.println(taro.getName());
		taro.setName("花子");
		System.out.println(taro.getName());

		//演習⑤
		System.out.println(taro.getAge());
		taro.setAge(30);
		System.out.println(taro.getAge());
	}
}