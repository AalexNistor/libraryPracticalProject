package sda.academy.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import sda.academy.config.DatabaseConfig;
import sda.academy.entity.Author;
import sda.academy.entity.Books;

public class BooksRepository {
    private SessionFactory sessionFactory = DatabaseConfig.getSessionFactory();

    public void saveBooks(Books books) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(books);
        transaction.commit();
    }
}
