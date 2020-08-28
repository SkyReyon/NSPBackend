package com.lti.nsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.nsp.entity.RegistrationDetails;
import com.lti.nsp.interfaces.GenericDao;

@Repository
public class GenericDaoImpl implements GenericDao{

	@PersistenceContext
	protected EntityManager entityManager;

	@Transactional
	public Object add(Object obj) {
		 return entityManager.merge(obj);
	}
}
