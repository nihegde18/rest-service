package com.nikhil.app.rest.repo;

import com.nikhil.app.rest.Model.Competition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompetitionRepo extends JpaRepository<Competition,Long> {

}
