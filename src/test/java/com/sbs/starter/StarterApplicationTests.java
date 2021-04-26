package com.sbs.starter;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class StarterApplicationTests {

	@Test
	void contextLoads() {
		int a[] = {1, 2, 3};

		int b[][] = {
			{1, 2, 3}, {4, 5, 6}
		};

		int c[][][] = {
			{
				{1, 2, 3}, {4, 5, 6}
			}, {
				{7, 8, 9}, {10, 11, 12}
			},
			{
				{7, 8, 9}, {10, 11, 12}
			}
		};

		log.info("{} {} {}", a[0], a[1], a[2]);
		log.info("");
		log.info("{} {} {}", b[1][0], b[1][1], b[1][2]);
		log.info("{} {} {}", b[0][0], b[0][1], b[0][2]);
		log.info("");
		log.info("{} {} {}", c[0][0][0], c[0][0][1], c[0][0][2]);
	}

}
