package edu.drm.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.drm.app.dao.model.User;

public interface UserRepository extends JpaRepository<User,Long>{
}
