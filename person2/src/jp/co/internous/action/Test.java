package jp.co.internous.action;

public class Test {
	//演習①
	public static void main(String[]ages){
		Person taro=new Person();
		//演習③
		taro.name="taro";
		taro.age=18;
		System.out.println(taro.name);
		System.out.println(taro.age);

		Person jiro=new Person("jiro",20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);

		//演習⑤
		Person saburo=new Person("saburo");
		System.out.println(saburo.name);
		System.out.println(saburo.age);

		Person namaenashi=new Person(25);
		System.out.println(namaenashi.name);
		System.out.println(namaenashi.age);

		Person hanako=new Person(17,"hanako");
		System.out.println(hanako.name);
		System.out.println(hanako.age);
	}
}