package org.potwings.time;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.potwings.common.config.CommonConfig;
import org.potwings.time.config.TimeConfig;
import org.potwings.time.mapper.TimeMapper;
import org.potwings.time.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CommonConfig.class, TimeConfig.class})
@Log4j
public class TimeTests {

	@Autowired
	TimeMapper mapper;
	
	@Autowired
	TimeService service;
	
	@Test
	public void timeTest() {
		log.info(mapper.getTime());
	}
	
	@Test
	public void serviceTest() {
		
		log.info(service.getTime());
	}
	
}
