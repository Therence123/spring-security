package com.tee.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 
	  
	    private String name;
	 
	    private String username;
	 
	    private String email;
	
	    private String password;
	    
	    private String reset_password_token;
	 
	    @ManyToMany(fetch = FetchType.EAGER)
	    @JoinTable(name = "user_roles", 
	      joinColumns = @JoinColumn(name = "user_id"), 
	      inverseJoinColumns = @JoinColumn(name = "role_id"))
	    
	    private Set<Role> roles = new HashSet<>();
	 
public User() {}
	      
	    
	        public User(String name, String username, String email, String password) {
			this.name = name;
			this.username = username;
			this.email = email;
			this.password = password;
		}



		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Set<Role> getRoles() {
			return roles;
		}

		public void setRoles(Set<Role> roles) {
			this.roles = roles;
		}


		public String getReset_password_token() {
			return reset_password_token;
		}


		public void setReset_password_token(String reset_password_token) {
			this.reset_password_token = reset_password_token;
		}
	    
	    
}
