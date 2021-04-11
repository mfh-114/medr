package org.mfh114.medr.config;

import java.sql.Timestamp;

public class MedrConfigCurator<T> {

	private Class<T> clazz;
	private Timestamp timestamp;

	public Class<T> getClazz() {
		return clazz;
	}

	public void setClazz(Class<T> clazz) {
		this.clazz = clazz;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public T readConfiguration() {
		System.out.println("Read configuration");
		return null;
	}

	public void writeConfiguration(T t) {

	}
}
