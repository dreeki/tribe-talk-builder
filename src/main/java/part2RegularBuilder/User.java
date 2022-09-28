package part2RegularBuilder;

public class User {
	// Mandatory fields
	private final String email;
	private final String firstName;
	private final String lastName;

	// Optional fields
	private final String nickname;
	private final Integer age;
	private final Integer amountOfSiblings;

	private User(RegularUserBuilder builder) {
		email = builder.email;
		firstName = builder.firstName;
		lastName = builder.lastName;
		nickname = builder.nickname;
		age = builder.age;
		amountOfSiblings = builder.amountOfSiblings;
	}

	public String getEmail() {
		return email;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getNickname() {
		return nickname;
	}

	public Integer getAge() {
		return age;
	}

	public Integer getAmountOfSiblings() {
		return amountOfSiblings;
	}

	@Override
	public String toString() {
		return "User{" +
				"email='" + email + '\'' +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", nickname='" + nickname + '\'' +
				", age=" + age +
				", amountOfSiblings=" + amountOfSiblings +
				'}';
	}

	public static RegularUserBuilder builder(String email, String firstName, String lastName) {
		return new RegularUserBuilder(email, firstName, lastName);
	}

	public static RegularUserBuilder builder() {
		return new RegularUserBuilder();
	}

	public static class RegularUserBuilder {
		private String email;
		private String firstName;
		private String lastName;

		private String nickname;
		private Integer age;
		private Integer amountOfSiblings;

		private RegularUserBuilder(String email, String firstName, String lastName) {
			this.email = email;
			this.firstName = firstName;
			this.lastName = lastName;
		}

		private RegularUserBuilder() {
		}

		public RegularUserBuilder email(String email) {
			this.email = email;
			return this;
		}

		public RegularUserBuilder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public RegularUserBuilder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public RegularUserBuilder nickname(String nickname) {
			this.nickname = nickname;
			return this;
		}

		public RegularUserBuilder age(int age) {
			this.age = age;
			return this;
		}

		public RegularUserBuilder amountOfSiblings(int amountOfSiblings) {
			this.amountOfSiblings = amountOfSiblings;
			return this;
		}

		public User build() {
			return new User(this);
		}
	}
}
