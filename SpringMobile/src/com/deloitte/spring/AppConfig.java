package com.deloitte.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.deloitte.spring")
@PropertySource("app.properties")
public class AppConfig {

//	@Bean("ms")
//	public MessageSender getMsBean()
//	{
//		MessageSender ms= new MessageSender();
//		ms.setSmsCharge(5.2f);
//		ms.setMmsCharge(2.5f);
//		return ms;
//	}
	
	@Bean("airtel")
	public Airtel getAirtelSimBean()
	{
		Airtel sim= new Airtel();
		sim.setCallCharge(1.5f);
		sim.setSpeed(10f);
		//sim.setMs(getMsBean());
		return sim;
	}
	@Bean("vodafone")
	public VodafoneSim getVodafoneSimBean()
	{
		VodafoneSim sim= new VodafoneSim();
		sim.setCallCharge(0.85f);
		sim.setSpeed(15f);
		//sim.setMs(getMsBean());
		return sim;
	}
}
