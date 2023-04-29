package com.gl.student.Management.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.gl.student.Management.entity.Role;
import com.gl.student.Management.entity.User;

public class MyUserDetails implements UserDetails {

	   private User user;
	

	   public MyUserDetails(User user) {
		    this.user = user;
	}
@Column(name = "name")
private String name;

  @Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<Role> roles = user.getRoles();

		List<SimpleGrantedAuthority> auth = new ArrayList<>();
		for (Role role : roles) {
			boolean add = auth.add(new SimpleGrantedAuthority(((Object) role).getName()));
		  }
		   return auth;
	}

	@Override
	public String getPassword() {

		return user.getPassword();
	}

	@Override
	public String getUsername() {

		return user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}