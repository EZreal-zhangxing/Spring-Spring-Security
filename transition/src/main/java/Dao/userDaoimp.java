package Dao;

import java.util.List;

import hibernate.Role;
import hibernate.User;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class userDaoimp extends HibernateDaoSupport{
	
	public User getUserByname(String username)
	{
		String sql="from User where username='"+username+"'";
		List<User> list=this.getHibernateTemplate().find(sql);
		return (list==null)?null:list.get(0);
	}
	public List<Role> getRoleByUser(User user)
	{
		String sql="from Role where userid="+user.getId();
		List<Role> list=this.getHibernateTemplate().find(sql);
		return list;
	}
}
