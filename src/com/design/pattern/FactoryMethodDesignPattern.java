package com.design.pattern;

public class FactoryMethodDesignPattern {

	public static void main(String[] args) {

		Notification notification1 = new EmailNotification().getNotification();
		Notification notification2 = new SmsNotification().getNotification();
		Notification notification3 = new PushNotification().getNotification();
	}

}

interface Notification {
	public Notification getNotification();
}

class SmsNotification implements Notification {
	@Override
	public Notification getNotification() {
		System.out.println("SmsNotification");
		return new SmsNotification();
	}
}

class EmailNotification implements Notification {
	@Override
	public Notification getNotification() {
		System.out.println("EmailNotification");
		return new EmailNotification();
	}
}

class PushNotification implements Notification {
	@Override
	public Notification getNotification() {
		System.out.println("PushNotification");
		return new PushNotification();
	}
}