package weixin_dev;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class FirstUtil1 {

	@Test
	public void test() {
		Assert.assertTrue(true);
		System.out.println("Hello World");
		long i = 1;
		while (true) {
			if (i == 1000000000000000l) {
				break;
			}
			i++;
		}
	}

}
