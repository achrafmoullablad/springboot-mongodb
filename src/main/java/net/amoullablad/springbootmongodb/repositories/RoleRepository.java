package net.amoullablad.springbootmongodb.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import net.amoullablad.springbootmongodb.models.ERole;
import net.amoullablad.springbootmongodb.models.Role;

public interface RoleRepository extends MongoRepository<Role, String> {
	Optional<Role> findByName(ERole name);
}
