package ua.com.owu.dao.impl;

import lombok.Setter;
import org.springframework.stereotype.Repository;
import ua.com.owu.dao.UserDAO;
import ua.com.owu.entity.User;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.xml.stream.FactoryConfigurationError;

//@Setter

@Repository
public class UserDAOimpl implements UserDAO {

    @PersistenceContext
    EntityManager entityManager;
    public void save(User user) {
        entityManager.persist(user);

    }
}
