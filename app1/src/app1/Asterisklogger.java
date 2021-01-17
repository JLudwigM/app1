package app1;

public class Asterisklogger implements Logger{

	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		
	System.out.println("***" + log + "***");
		
	}

	@Override
	public void error(String error) { 
		
		int n = error.length();
		
		for(int i = 0; i < n + 2; i++) {
				System.out.println("*");
		}
		System.out.println("*" + "ERROR"  + error + "*");
		
		System.out.println("*");
		}
	}


