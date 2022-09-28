package part5RealWorldExamples;

import java.util.Objects;

public class Duration {
	private final int hours;
	private final int minutes;

	private Duration(DurationBuilder builder) {
		hours = builder.hours;
		minutes = builder.minutes;
	}

	public int getHours() {
		return hours;
	}

	public int getMinutes() {
		return minutes;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Duration duration = (Duration) o;
		return hours == duration.hours && minutes == duration.minutes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(hours, minutes);
	}

	@Override
	public String toString() {
		return "Duration{" +
				"hours=" + hours +
				", minutes=" + minutes +
				'}';
	}

	// TODO: make hours required and minutes optional in builder
	public static class DurationBuilder {
		private int hours;
		private int minutes;

		private DurationBuilder() {
		}

		public DurationBuilder hours(int hours) {
			this.hours = hours;
			return this;
		}

		public DurationBuilder minutes(int minutes) {
			this.minutes = minutes;
			return this;
		}

		public Duration build() {
			return new Duration(this);
		}
	}
}
