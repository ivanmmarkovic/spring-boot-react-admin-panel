package com.example.adminpanel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.adminpanel.domain.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{

}
