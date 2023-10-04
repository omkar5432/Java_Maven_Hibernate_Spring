package com.test.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.model.Staff;

@Repository
@Transactional
public class StaffDao {
	
	@Autowired
	SessionFactory sf;

	public void register(Staff s1) 
	{
		
		sf.getCurrentSession().save(s1);
		
	}
	
	

}
