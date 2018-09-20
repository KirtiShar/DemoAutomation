package demoAutomation;

import java.io.IOException;

public class RunExeFile {

	public static void main(String[] args) throws IOException {
		Runtime.getRuntime().exec("C:\\Users\\anand.mohan.patel\\Documents\\bcd.exe");
		System.out.println("success");

	}

}
