package part1NoBuilder;

public class User {
	private final String email;
	private final String firstName;
	private final String lastName;

	private String nickname;

	private Integer age; // beter geboortedatum bijhouden, maar age (integer) is educatiever voor het voorbeeld
	private Integer amountOfSiblings;

	public User(String email, String firstName, String lastName) {
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public User(String email, String firstName, String lastName, String nickname) {
		this(email, firstName, lastName);
		this.nickname = nickname;
	}

	public User(String email, String firstName, String lastName, Integer age) {
		this(email, firstName, lastName);
		this.age = age;
	}

	public User(String email, String firstName, String lastName, Integer age, Integer amountOfSiblings) {
		this(email, firstName, lastName, age);
		this.amountOfSiblings = amountOfSiblings;
	}

	public User(String email, String firstName, String lastName, String nickname, Integer amountOfSiblings) {
		this(email, firstName, lastName, nickname);
		this.amountOfSiblings = amountOfSiblings;
	}

	public User(String email, String firstName, String lastName, String nickname, Integer age, Integer amountOfSiblings) {
		this(email, firstName, lastName);
		this.nickname = nickname;
		this.age = age;
		this.amountOfSiblings = amountOfSiblings;
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
}
