package sda.academy.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import sda.academy.config.DatabaseConfig;
import sda.academy.entity.Customer;

public class CustomerRepository {

    private SessionFactory sessionFactory = DatabaseConfig.getSessionFactory();

    public void saveCustomer(Customer customer) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(customer);
        transaction.commit();
    }
}
