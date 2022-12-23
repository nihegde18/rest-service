package com.nikhil.app.rest.Controller;

import com.nikhil.app.rest.Model.Competition;
import com.nikhil.app.rest.Model.Competitor;
import com.nikhil.app.rest.repo.CompetitionRepo;
import com.nikhil.app.rest.repo.CompetitorRepo;
import com.nikhil.app.rest.repo.SessionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ApiControllers {

    @Autowired
    private CompetitorRepo userRepo;
    @GetMapping(value="/")
    public String getPage(){
        return "Welcome";
    }

    @GetMapping(value="/users")
    public List<com.nikhil.app.rest.Model.Competitor> getUsers(){
        return userRepo.findAll();
    }

    @GetMapping(value="/user/{userid}")
    public Optional<com.nikhil.app.rest.Model.Competitor> getUser(@PathVariable Long userid){
        Optional<com.nikhil.app.rest.Model.Competitor> toReturn = userRepo.findById(userid);
        return toReturn;
    }

    @PostMapping(value="/users")
    public com.nikhil.app.rest.Model.Competitor saveUser(@RequestBody com.nikhil.app.rest.Model.Competitor user){
        userRepo.save(user);
        return user;
    }

    @PutMapping(value="/user/{userid}")
    public com.nikhil.app.rest.Model.Competitor updateUser(@PathVariable Long userid , @RequestBody com.nikhil.app.rest.Model.Competitor user){
         userRepo.deleteById(userid);
         userRepo.save(user);



        return user;
    }
    @DeleteMapping(value = "/user/{userid}")
    public void deleteUser(@PathVariable long userid){

        userRepo.deleteById(userid);

    }


    @Autowired
    private SessionRepo sessionRepo;
    @GetMapping(value="/sessions")
    public List<com.nikhil.app.rest.Model.Session> getSessions(){
        return sessionRepo.findAll();
    }

    @GetMapping(value="/session/{id}")
    public Optional<com.nikhil.app.rest.Model.Session> getSession(@PathVariable Long id){
        Optional<com.nikhil.app.rest.Model.Session> toReturn = sessionRepo.findById(id);
        return toReturn;
    }

    @PostMapping(value="/sessions")
    public com.nikhil.app.rest.Model.Session saveSession(@RequestBody com.nikhil.app.rest.Model.Session session){
        sessionRepo.save(session);
        return session;
    }

    @PutMapping(value="/session/{id}")
    public com.nikhil.app.rest.Model.Session updateSession(@PathVariable Long id , @RequestBody com.nikhil.app.rest.Model.Session session){
        sessionRepo.deleteById(id);
        sessionRepo.save(session);



        return session;
    }
    @DeleteMapping(value = "/session/{id}")
    public void deleteSession(@PathVariable Long id){

        sessionRepo.deleteById(id);

    }


    @Autowired
    private CompetitionRepo
            competitionRepo;
    @GetMapping(value="/competitions")
    public List<Competition> getCompetitions(){
        return competitionRepo.findAll();
    }

    @GetMapping(value="/competition/{id}")
    public Optional<Competition> getCompetition(@PathVariable Long id){
        Optional<com.nikhil.app.rest.Model.Competition> toReturn = competitionRepo.findById(id);
        return toReturn;
    }
    @PostMapping(value="/competitions")
    public com.nikhil.app.rest.Model.Competition saveComp(@RequestBody com.nikhil.app.rest.Model.Competition comp){
        competitionRepo.save(comp);
        return comp;
    }

    @PutMapping(value="/competition/{id}")
    public com.nikhil.app.rest.Model.Competition updateComp(@PathVariable Long id , @RequestBody com.nikhil.app.rest.Model.Competition comp){
        competitionRepo.deleteById(id);
        competitionRepo.save(comp);



        return comp;
    }
    @DeleteMapping(value = "/competition/{id}")
    public void deleteComp(@PathVariable long id){

        competitionRepo.deleteById(id);

    }
}
