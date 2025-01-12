package com.bookshare.dataloader.data.configuration;

import java.io.File;

import org.springframework.boot.autoconfigure.cassandra.CqlSessionBuilderCustomizer;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "datastax.astra")
//
public class DataAstraPropertiesConfiguration {
	
	private File secureConnectBundle;

	public File getSecureConnectBundle() {
		return secureConnectBundle;
	}

	public void setSecureConnectBundle(File secureConnectBundle) {
		this.secureConnectBundle = secureConnectBundle;
	}
	
	
}
