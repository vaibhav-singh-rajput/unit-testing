package com.demo.service;

import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized;
//import org.junit.runners.Parameterized.Parameters;

import com.demo.domain.Order;

//import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

//import java.util.Arrays;
//import java.util.Collection;

//import org.mockito.runners.MockitoJUnitRunner;
import org.junit.After;
//import org.junit.AfterClass;
import org.junit.Before;
//import org.junit.BeforeClass;

//@RunWith(Parameterized.class)
public class EmailServiceTest {
	public EmailServiceTest() {
		// TODO Auto-generated constructor stub
	}

	EmailService emailService;

	@Before
	public void init() {
		emailService = new EmailService();
	}

	@Test
	public void testGetInstance() {
		try {
			EmailService myReturnedObject = EmailService.getInstance();
			// check if the object is != null
			assertNotNull(myReturnedObject);
			// check if the returned object is of class Expression.
			assertTrue(myReturnedObject instanceof EmailService);
		} catch (Exception e) {
			// TODO: handle exception
			// let the test fail, if your function throws an Exception.
			fail("got Exception, i want an EmailService");
			System.out.println(e);
		}
	}

	@Test
	public void testSendEmail_BooleanTrue() {
		assertTrue(emailService.sendEmail(new Order(), "Vaibhav"));
		// System.out.println("assertTrue");
	}

	@After
	public void tearDown() {
		emailService = null;
		// System.out.println(emailService);
	}
}