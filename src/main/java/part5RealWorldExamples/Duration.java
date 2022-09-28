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

	public static Hours builder() {
		return new DurationBuilder();
	}

	public static class DurationBuilder implements Hours, MinutesBuild, Build {
		private int hours;
		private int minutes;

		private DurationBuilder() {
		}

		@Override
		public DurationBuilder hours(int hours) {
			this.hours = hours;
			return this;
		}

		@Override
		public DurationBuilder minutes(int minutes) {
			this.minutes = minutes;
			return this;
		}

		@Override
		public Duration build() {
			return new Duration(this);
		}
	}

	interface Hours {
		MinutesBuild hours(int hours);
	}

	interface MinutesBuild {
		Build minutes(int minutes);
		Duration build();
	}

	interface Build {
		Duration build();
	}
}
