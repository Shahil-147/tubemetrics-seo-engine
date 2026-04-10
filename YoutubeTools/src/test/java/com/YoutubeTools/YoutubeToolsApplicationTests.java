package com.YoutubeTools;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = "youtube.api.key=dummy-key-for-tests")
class YoutubeToolsApplicationTests {

	@Test
	void contextLoads() {
	}

}
