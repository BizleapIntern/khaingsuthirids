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
import com.bizleap.ds.service.CompanyService;

public class CompanyServiceImplTest extends ServiceTest {

	static Logger logger=Logger.getLogger(CompanyServiceImplTest.class);
	
	@Ignore
	@Test
	public void testGetAllCompany() throws IOException,ServiceUnavailableException {
		logger.info("All Company List: "+companyService.getAllCompany());
		assertNotNull(companyService.getAllCompany());
		assertTrue(CollectionUtils.isNotEmpty(companyService.getAllCompany()));
		assertEquals(3,companyService.getAllCompany().size());
	}
	
	//@Ignore
	@Test
	public void testFindByCompanyBoIdSingle() throws IOException,ServiceUnavailableException {		
		assertNotNull(companyService.findByCompanyBoId("COMP01"));
		assertTrue(CollectionUtils.isNotEmpty(companyService.findByCompanyBoId("COMP01")));
		assertEquals("Apple",companyService.findByCompanyBoIdSingle("COMP01").getName());
	}
}
