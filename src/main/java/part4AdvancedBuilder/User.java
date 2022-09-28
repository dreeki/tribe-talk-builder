package part4AdvancedBuilder;

public class User {
	// Mandatory fields
	private final String email;
	private final String firstName;
	private final String lastName;

	// Optional fields
	private final String nickname;
	private final Integer age;
	private final Integer amountOfSiblings;

	private User(AdvancedUserBuilder builder) {
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

	public static AdvancedUserBuilder builder() {
		return new AdvancedUserBuilder();
	}

	//TODO: live coding -> vertrekken van regular builder pattern, ombouwen naar AdvancedBuilder
	public static class AdvancedUserBuilder /*implements Email, FirstName, LastName, Build*/ {
		private String email;
		private String firstName;
		private String lastName;

		private String nickname;
		private Integer age;
		private Integer amountOfSiblings;

		private AdvancedUserBuilder() {
		}

		public AdvancedUserBuilder email(String email) {
			this.email = email;
			return this;
		}

		public AdvancedUserBuilder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public AdvancedUserBuilder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public AdvancedUserBuilder nickname(String nickname) {
			this.nickname = nickname;
			return this;
		}

		public AdvancedUserBuilder age(int age) {
			this.age = age;
			return this;
		}

		public AdvancedUserBuilder amountOfSiblings(int amountOfSiblings) {
			this.amountOfSiblings = amountOfSiblings;
			return this;
		}

		public User build() {
			return new User(this);
		}
	}

	public interface Email {

	}

	public interface FirstName {

	}

	public interface LastName {

	}

	public interface Build {

	}
}
