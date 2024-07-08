package creationalDesignPatterns.singleton;

public class AppForTestingSingleton {

	public static void main(String[] args) {
		SingletonEager singletonEager1 = SingletonEager.getInstance();
		SingletonEager singletonEager2 = SingletonEager.getInstance();
		SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
		SingletonLazy singletonLazy2 = SingletonLazy.getInstance();
		Object object1 = new Object();
		Object object2 = new Object();
		System.out.println(singletonEager1.hashCode());
		System.out.println(singletonEager1.toString());
		System.out.println(singletonEager2.hashCode());
		System.out.println(singletonEager2.toString());
		System.out.println(object1.hashCode());
		System.out.println(object1.toString());
		System.out.println(object2.hashCode());
		System.out.println(object2.toString());
		System.out.println(singletonLazy1.hashCode());
		System.out.println(singletonLazy1.toString());
		System.out.println(singletonLazy2.hashCode());
		System.out.println(singletonLazy2.toString());
	}

}
