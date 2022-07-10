package com.greatlearning.labsession6.studentmanagement.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.labsession6.studentmanagement.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	public User findByUsername(String username);
}
