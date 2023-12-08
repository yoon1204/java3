package ch11.properties.실습;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

class Ex01 {
	public static void main(String[] args) {
		
		if(args.length != 1) {
			System.out.println("USAGE: java PropertiesEx2 INPUTFILENAME");
			System.exit(0);
		}
		
		Properties properties = new Properties();
		
		String inputFile = args[0];
		
		try {
			properties.load(new FileInputStream(inputFile));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
