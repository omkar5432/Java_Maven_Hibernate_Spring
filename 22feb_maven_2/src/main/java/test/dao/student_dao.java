package test.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import test.beans.beans;

public class student_dao {
	
	JdbcTemplate t1;

	public void setT1(JdbcTemplate t1) {
		this.t1 = t1;
	}
	
	public int register(beans b1)
	{
		String sql;
		sql="insert into student2(name,email)values('"+b1.getName()+"','"+b1.getEmail()+"')";
		return t1.update(sql);
	}

	public List<beans> getInfo() {
		return null;
		
	}

}
