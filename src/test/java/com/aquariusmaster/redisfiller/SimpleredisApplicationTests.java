package com.aquariusmaster.redisfiller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {RedisfillerApplication.class, ApplicationConfig.class})
public class SimpleredisApplicationTests {


	@Test
	public void contextLoads() {
	}


}
