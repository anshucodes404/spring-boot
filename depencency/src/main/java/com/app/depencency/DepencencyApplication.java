package com.app.depencency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DepencencyApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DepencencyApplication.class, args); // isme jo classes container me bana h usko context me store kr rhe hain

		Aliens alien = context.getBean(Aliens.class); // yaha pe us class ka object bana rhe hain jo container me bana h aur usko context se le rhe hain

		alien.build(); // finallly calling the method of that class
		

	}

}
