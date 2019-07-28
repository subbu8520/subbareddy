package SeleniumMethod;

import java.util.Locale;

import com.github.javafaker.Faker;

public class FakeTestData {

	public static void main(String[] args) {
		System.out.println(fullName());
		 
	}

	public static String fullName() {
		Locale loc = new Locale("en", "IND");
		Faker faker = new Faker(loc);
		String full = faker.name().fullName();
		return full;
	}

}
