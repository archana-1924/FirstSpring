package com.deloitte.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

	@Value("${ms.smsCharge}")
	//@Value("2.5")
	private float smsCharge;
	//@Value("5.6")
	@Value("${ms.mmsCharge}")
	private float mmsCharge;
	
	public float getSmsCharge() {
		return smsCharge;
	}
	public void setSmsCharge(float smsCharge) {
		this.smsCharge = smsCharge;
	}
	public float getMmsCharge() {
		return mmsCharge;
	}
	public void setMmsCharge(float mmsCharge) {
		this.mmsCharge = mmsCharge;
	}
	
	public void sendSms()
	{
		System.out.println("SMS sent....Charged "+smsCharge);
	}
	public void sendMms()
	{
		System.out.println("MMS sent....Charged "+mmsCharge);
	}
	
}
