package ru.katechon.storage;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.katechon.domain.Roles;

import java.util.List;

public class RolesStorage extends Storage{
    @Override
    public List values() {
        final Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        try {
            return session.createQuery("from Roles ").list();
        } finally {
            tx.commit();
            session.close();
        }
    }

    @Override
    public Roles get(int id) {
        final Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        try {
            return (Roles) session.get(Roles.class, id);
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
