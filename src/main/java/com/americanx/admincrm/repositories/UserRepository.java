package com.americanx.admincrm.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.americanx.admincrm.entities.User;

public interface UserRepository extends JpaRepository<User, String>
{

}
