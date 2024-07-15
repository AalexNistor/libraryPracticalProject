package sda.academy.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import sda.academy.config.DatabaseConfig;
import sda.academy.entity.Author;

public class AuthorRepository {
    private SessionFactory sessionFactory = DatabaseConfig.getSessionFactory();

    public void saveAuthor(Author author) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(author);
        transaction.commit();
    }
}
