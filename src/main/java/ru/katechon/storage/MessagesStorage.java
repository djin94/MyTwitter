package ru.katechon.storage;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.katechon.domain.Messages;

import java.util.List;

public class MessagesStorage extends Storage{
    @Override
    public List values() {
        final Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        try {
            return session.createQuery("from Messages").list();
        } finally {
            tx.commit();
            session.close();
        }
    }

    @Override
    public Messages get(int id) {
        final Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        try {
            return (Messages) session.get(Messages.class, id);
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
