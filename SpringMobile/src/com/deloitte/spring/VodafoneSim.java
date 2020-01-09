package com.deloitte.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class VodafoneSim implements Sim {

	private float callCharge;
	private float speed;
	
	@Autowired
    private MessageSender ms;
	
	public void sendSms()
	{
		ms.sendSms();
		System.out.println("From vodafone......");
	}
	public void sendMms()
	{
		ms.sendMms();
		System.out.println("From vodafone......");
	}
//	public MessageSender getMs() {
//		return ms;
//	}
//	public void setMs(MessageSender ms) {
//		this.ms = ms;
//	}
	
	public float getCallCharge() {
		return callCharge;
	}

	public void setCallCharge(float callCharge) {
		this.callCharge = callCharge;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Browsing with vodafone....Speed "+speed+"mb/s");
	}

	@Override
	public void browse() {
		// TODO Auto-generated method stub
		System.out.println("Calling with vodafone....charges "+callCharge);

	}
	

}

