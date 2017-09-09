package ru.katechon.storage;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.katechon.domain.Users;

import java.util.List;

public class UsersStorage extends Storage {
    @Override
    public List values() {
        final Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        try {
            return session.createQuery("from Users").list();
        } finally {
            tx.commit();
            session.close();
        }
    }

    @Override
    public Users get(int id) {
        final Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        try {
            return (Users) session.get(Users.class, id);
        } finally {
            tx.commit();
            session.close();
        }
    }

    public Users findByLogin(String login){
        final Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        try {
            final Query query = session.createQuery("from Users as user where user.login=:login");
            query.setString("login", login);
            return (Users) query.iterate().next();
        } finally {
            tx.commit();
            session.close();
        }
    }

    @Override
    public int generateId() {
        return 0;
    }

    @Override
    public void close() {
        this.factory.close();
    }
}
