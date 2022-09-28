package part3LombokBuilder;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

@Getter
@ToString
@Builder
public class User {

	// Mandatory fields
	@NonNull
	private final String email;
	@NonNull
	private final String firstName;
	@NonNull
	private final String lastName;

	// Optional fields
	private String nickname;
	private Integer age;
	private Integer amountOfSiblings;
}
