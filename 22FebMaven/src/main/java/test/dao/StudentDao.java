package test.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import test.beans.Student;
public class StudentDao {
	
	JdbcTemplate t1;
	
	
	public void setT1(JdbcTemplate t1) {
		this.t1 = t1;
	}


	public int register(Student s1)
	{
		String sql;
		sql="insert into student (name,email)values('"+s1.getName()+"','"+s1.getEmail()+"')";
		return t1.update(sql);
	}
	
	public List<Student> getInfo()
	{
		return t1.query("select * from student", new RowMapper<Student>() {

			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student s = new Student();
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setEmail(rs.getString(3));
				return s;
			}
			
		});
	}


	public int deleted(int id) {
		String sql;
		sql="delete from student where id="+id;
		return t1.update(sql);
		
	}


	public Student editd(int id) {
		String sql;
		sql="select * from student where id=?";
		return t1.queryForObject(sql, new Object[] {id}, new BeanPropertyRowMapper<Student>(Student.class));
	}


	public int updated(Student s1) {
		String sql;
		sql="update student set name='"+s1.getName()+"', email='"+s1.getEmail()+"' where id="+s1.getId()+"";
		return t1.update(sql);
		
	}


	public Student login_check(String name, String email) {
		String sql;
		sql="select * from student where name=? and email=?";
		try
		{
		Student ss= t1.queryForObject(sql, new Object[] {name,email}, new RowMapper<Student>() {

			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student tt = new Student();
				tt.setId(rs.getInt(1));
				tt.setName(rs.getString(2));
				tt.setEmail(rs.getString(3));
				return tt;
			}
			
		});
		
		return ss;
		}
		
		catch(Exception e) 
		{
			return null;
		}
		
	}


	

}
