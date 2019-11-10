package com.jeffrey.design_pattern.observer;

public class VoiceObserver implements Observer {

	private Subject subject;

	public VoiceObserver(Subject subject) {
		this.subject = subject;
		subject.register(this);
	}

	@Override
	public void dosomething() {
		System.out.println("浣犲ソ锛屾垜鏀跺埌娑堟伅浜嗭紝寮�濮嬭鍔�");
	}
}
