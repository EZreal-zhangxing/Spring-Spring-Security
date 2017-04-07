package services;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import hibernate.Role;
import hibernate.User;

import org.springframework.security.config.http.UserDetailsServiceFactoryBean;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import Dao.userDaoimp;


public class userserviceDaoImp implements UserDetailsService{
	private userDaoimp udi;
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		System.out.println(username);
		System.out.println(udi.getSessionFactory());
		User u=udi.getUserByname(username);
		System.out.println(u.toString());
		List<Role> list=udi.getRoleByUser(u);
		List<GrantedAuthority> rolelist=new ArrayList<GrantedAuthority>();
		for (int i = 0; i < list.size(); i++) {
			Role rol=list.get(i);
			System.out.println(rol.getRoleCode());
			GrantedAuthorityImpl gi=new GrantedAuthorityImpl(rol.getRoleCode());
			rolelist.add(gi);
		}
		org.springframework.security.core.userdetails.User user=new org.springframework.security.core.userdetails.User(u.getUsername(), u.getPassword(),true, true, true, true, rolelist);
		return user;
	}
	public userDaoimp getUdi() {
		return udi;
	}
	public void setUdi(userDaoimp udi) {
		this.udi = udi;
	}
	
}
