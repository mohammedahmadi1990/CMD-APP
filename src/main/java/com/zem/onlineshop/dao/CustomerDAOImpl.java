package com.zem.onlineshop.dao;

import com.zem.onlineshop.entity.User;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    private EntityManager entityManager;

    @Autowired
    public CustomerDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<User> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<User> query = currentSession.createQuery("SELECT u FROM User AS u WHERE u.userType=?1", User.class);
        query.setParameter(1,"customer");
        List<User> users = query.getResultList();
        return users;
    }

    @Override
    @Transactional
    public User findById(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        User user = currentSession.get(User.class,id);
        return user;
    }

    @Override
    @Transactional
    public void save(User user) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(user);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<User> query = currentSession.createQuery("DELETE FROM User AS u WHERE u.id=?1", User.class);
        query.setParameter(1,"customer");
        query.executeUpdate();
    }
}
