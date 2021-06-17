package com.captain.dbtut;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,String>{
	
}
