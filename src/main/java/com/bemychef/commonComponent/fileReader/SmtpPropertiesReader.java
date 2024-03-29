package com.bemychef.commonComponent.fileReader;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("smtp")
public class SmtpPropertiesReader {
private String host;
private String port;
private String username;
private String password;
public String getHost() {
	return host;
}
public void setHost(String host) {
	this.host = host;
}
public String getPort() {
	return port;
}
public void setPort(String port) {
	this.port = port;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


}
