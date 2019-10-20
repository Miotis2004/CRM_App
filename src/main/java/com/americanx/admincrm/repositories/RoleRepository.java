package com.americanx.admincrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.americanx.admincrm.entities.Role;

public interface RoleRepository extends JpaRepository<Role, String>
{

}
