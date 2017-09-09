package ru.katechon.storage;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.katechon.domain.PrivateMessages;

import java.util.List;

public class PrivateMessagesStorage extends Storage{
    @Override
    public List values() {
        final Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        try {
            return session.createQuery("from PrivateMessages ").list();
        } finally {
            tx.commit();
            session.close();
        }
    }

    @Override
    public PrivateMessages get(int id) {
        final Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        try {
            return (PrivateMessages) session.get(PrivateMessages.class, id);
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
