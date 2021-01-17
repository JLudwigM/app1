package app1;

public class app {

	public static void main(String[] args) {

		Logger logger = new SpacedLogger();

		logger.log("America");
		logger.error("America");

		Logger logger1 = new Asterisklogger();

		logger1.log("Sister Goldenhair Surprise");
		logger1.error("Sister Goldenhair Surprise");

	}

}
