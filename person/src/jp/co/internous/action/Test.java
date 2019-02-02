package jp.co.internous.action;

public class Test {
	public static void main(String[]args){
		//演習①
		Person taro=new Person();
		taro.name="山田太郎";
		taro.age=20;

		//演習④
		taro.phoneNumber="000-0000-0000";
		taro.address="東京";

		//演習①
		System.out.println(taro.name);
		System.out.println(taro.age);

		//演習④
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);

		//演習⑥
		taro.talk();
		taro.walk();
		taro.run();

		//演習② 木村次郎
		Person jiro=new Person();
		jiro.name="木村次郎";
		jiro.age=18;

		//演習④
		jiro.phoneNumber="111-1111-1111";
		jiro.address="静岡";

		//演習② 木村次郎
		System.out.println(jiro.name);
		System.out.println(jiro.age);

		//演習④
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);

		//演習⑥
		jiro.talk();
		jiro.walk();
		jiro.run();

		//演習② 鈴木花子
		Person hanako=new Person();
		hanako.name="鈴木花子";
		hanako.age=16;

		//演習④
		hanako.phoneNumber="222-2222-2222";
		hanako.address="北海道";

		//演習② 鈴木花子
		System.out.println(hanako.name);
		System.out.println(hanako.age);

		//演習④
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);

		//演習⑥
		hanako.talk();
		hanako.walk();
		hanako.run();

		//演習⑧ アイボー
		Robot aibo=new Robot();
		aibo.name="アイボー";

		System.out.println(aibo.name);
		aibo.talk();
		aibo.walk();
		aibo.run();

		//演習⑧ アシモ
		Robot ashimo=new Robot();
		ashimo.name="アシモ";

		System.out.println(ashimo.name);
		ashimo.talk();
		ashimo.walk();
		ashimo.run();

		//演習⑧ ペッパー
		Robot pepper=new Robot();
		pepper.name="ペッパー";

		System.out.println(pepper.name);
		pepper.talk();
		pepper.walk();
		pepper.run();
	}
}