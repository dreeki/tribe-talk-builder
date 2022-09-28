package part5RealWorldExamples;

import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {
		Duration duration = Duration.builder().hours(1).minutes(10).build();

		TimeFrame timeFramePersistence = TimeFrame.builder().start(LocalTime.now()).end(LocalTime.now().plusHours(1)).build();
		TimeFrame timeFrameDomain = TimeFrame.builder().start(LocalTime.now()).duration(duration).build();

		User user = User.builder()
				.firstName("Andreas")
				.lastName("De Witte")
				.build();

		User userDifferentOrder = User.builder()
				.lastName("De Witte")
				.firstName("Andreas")
				.build();
	}
}
