package com.design.pattern;

public class Singleton {

	public static void main(String[] args) {

		User user1 = User.getInstance();
		System.out.println("user1 : " + user1);

		User user2 = User.getInstance();
		System.out.println("user2 : " + user2);

		Person person1 = new Person();
		System.out.println("person1 : " + person1);

		Person person2 = new Person();
		System.out.println("person1 : " + person2);
	}

}

// Sigleton class
class User {
	private static User obj;

	// private constructor to force use of
	// getInstance() to create Singleton object
	private User() {
	}

	public static User getInstance() {
		if (obj == null)
			obj = new User();
		return obj;
	}
}

// Normal Class
class Person {
	Person() {

	}
}