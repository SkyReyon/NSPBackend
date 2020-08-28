package com.lti.nsp.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import com.lti.nsp.dao.GenericDaoImpl;
import com.lti.nsp.entity.InstituteRegistration;
import com.lti.nsp.entity.RegistrationDetails;
import com.lti.nsp.interfaces.GenericDao;


@RunWith(SpringRunner.class)
@DataJpaTest
@Rollback(false)
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class TestCases {

	@Autowired
	GenericDao genDao ;
	
	@Test
	public void addtest() {
	
	}
	
}
