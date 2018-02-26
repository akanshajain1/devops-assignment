package com.devops.assignment.assignment;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component

@ConfigurationProperties(prefix="jenkins")
public class ApplicationProperties {

	private String textbox;

	public String getTextbox() {
		return textbox;
	}

	public void setTextbox(String textbox) {
		this.textbox = textbox;
	}

	
}
