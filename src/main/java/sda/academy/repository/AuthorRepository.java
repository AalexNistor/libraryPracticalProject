package sda.academy.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
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

    public Author findAuthorByName(String name) {
        Session session = sessionFactory.openSession();

        String hql = "FROM Author WHERE name = :name";
        Query<Author> query = session.createQuery(hql, Author.class);
        query.setParameter("name", name);
        return query.uniqueResult();
    }


}
