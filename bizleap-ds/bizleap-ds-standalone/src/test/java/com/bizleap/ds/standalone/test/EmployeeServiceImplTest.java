package com.bizleap.ds.standalone.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.bizleap.commons.domain.exception.ServiceUnavailableException;
import com.bizleap.ds.service.EmployeeService;

public class EmployeeServiceImplTest extends ServiceTest {
	
	static Logger logger=Logger.getLogger(EmployeeServiceImplTest.class);
	
	@Ignore
	@Test
	public void testGetAllEmployee() throws IOException,ServiceUnavailableException {		
		assertNotNull(employeeService.getAllEmployee());
		assertTrue(CollectionUtils.isNotEmpty(employeeService.getAllEmployee()));
		assertEquals(8,employeeService.getAllEmployee().size());
	}
	
	@Ignore
	@Test
	public void testFindByEmployeeBoIdSingle() throws IOException,ServiceUnavailableException {		
		assertNotNull(employeeService.findByEmployeeBoId("PER01"));
		assertTrue(CollectionUtils.isNotEmpty(employeeService.findByEmployeeBoId("PER01")));
		assertEquals("PER01",employeeService.findByEmployeeBoIdSingle("PER01").getBoId());
	}
}
