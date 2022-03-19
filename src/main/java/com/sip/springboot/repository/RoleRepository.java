package com.sip.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sip.springboot.model.Role;

public interface RoleRepository extends JpaRepository<Role,Long>{

}
