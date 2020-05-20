package com.springboot;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
		public ViewResolver myViewResolver(){
			return new MyViewResolver();
			
		}
		public static class MyViewResolver implements ViewResolver{

			@Override
			public View resolveViewName(String arg0, Locale arg1)
					throws Exception {
				// TODO Auto-generated method stub
				return null;
			}
			
		}
}
