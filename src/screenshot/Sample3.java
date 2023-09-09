package screenshot;

import java.util.Date;

import org.apache.commons.lang3.RandomStringUtils;

import net.bytebuddy.utility.RandomString;

public class Sample3 {
	public static void main(String[] args) {
//String name
		String s1 = RandomString.make(2);
		System.out.println(s1);

		String s2 = RandomStringUtils.randomAlphabetic(2, 10);
		System.out.println(s2);
//timestamp
		Date d = new Date();
		String timestamp = d.toString().replace(' ', '_').replace(':', '_');
		System.out.println(timestamp);
	}
}
