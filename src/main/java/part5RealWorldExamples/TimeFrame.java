package part5RealWorldExamples;

import java.time.LocalTime;

import static java.util.Objects.nonNull;

public class TimeFrame {
	private final LocalTime start;
	private final LocalTime end;

	private TimeFrame(TimeFrameBuilder builder) {
		start = builder.start;
		if(nonNull(builder.duration)){
			end = start.plusHours(builder.duration.getHours()).plusMinutes(builder.duration.getMinutes());
		}else {
			end = builder.end;
		}
	}

	@Override
	public String toString() {
		return "TimeFrame{" +
				"start=" + start +
				", end=" + end +
				'}';
	}

	public static Start builder() {
		return new TimeFrameBuilder();
	}

	public static class TimeFrameBuilder implements Start, End, Build {
		private LocalTime start;
		private LocalTime end;
		private Duration duration;

		private TimeFrameBuilder() {
		}

		@Override
		public TimeFrameBuilder start(LocalTime start) {
			this.start = start;
			return this;
		}

		@Override
		public TimeFrameBuilder end(LocalTime end) {
			this.end = end;
			return this;
		}

		@Override
		public TimeFrameBuilder duration(Duration duration) {
			this.duration = duration;
			return this;
		}

		@Override
		public TimeFrame build() {
			return new TimeFrame(this);
		}
	}

	interface Start {
		End start(LocalTime start);
	}

	interface End {
		Build end(LocalTime end);
		Build duration(Duration duration);
	}

	interface Build {
		TimeFrame build();
	}
}
