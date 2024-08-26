package com.rajibul.crudDemo.DAO;

import com.rajibul.crudDemo.entity.Student;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentDAOIMP implements StudentDAO{

    //define field for entity manager
    private EntityManager entityManager;


    //inject entity manager using constructor injection
    @Autowired
    public StudentDAOIMP(EntityManager entityManager) {
        this.entityManager = entityManager;
    }



    //implements save method
    @Override
    @Transactional
    public void save(Student theStudent){
        entityManager.persist(theStudent);
    }

}











