package com.hust.repository.v1.user;

import com.hust.entity.v1.user.ERole;
import com.hust.entity.v1.user.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity,Integer> {
    Optional<RoleEntity> findByName(ERole name);
}
