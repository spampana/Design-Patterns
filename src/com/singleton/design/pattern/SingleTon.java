package com.singleton.design.pattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

class SingleTon {
	public static SingleTon singleTon = null;
	public Properties properties = null;



	private SingleTon() {

	}

	public static synchronized SingleTon getSingleTonObject() {
		if (singleTon == null) {
			singleTon = new SingleTon();
			Properties properties1 = new Properties();
			try {
				properties1.load(new FileInputStream("D:/propertiesFile.properties"));
				singleTon.setProperties(properties1);
			} catch (FileNotFoundException ex) {
				ex.printStackTrace();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
			return singleTon;
		}
		return singleTon;
	}

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

}
/*
http://www.drdobbs.com/jvm/readwrite-properties-files-in-java/231000005
http://www.javaworld.com/article/2077352/java-se/smartly-load-your-properties.html
http://realtimejavaexamples.blogspot.com/p/collection-framework.html
*/