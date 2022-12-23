package com.nikhil.app.rest.repo;

import com.nikhil.app.rest.Model.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepo extends JpaRepository<Session,Long> {
}
