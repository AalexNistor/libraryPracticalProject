package sda.academy.config;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import sda.academy.entity.Author;
import sda.academy.entity.Books;
import sda.academy.entity.Customer;

public class DatabaseConfig {

    private static final SessionFactory SESSION_FACTORY = buildSessionFactory();

    private DatabaseConfig() {

    }

    private static SessionFactory buildSessionFactory() {
        Configuration configuration = new Configuration()
                .addAnnotatedClass(Author.class)
                .addAnnotatedClass(Books.class)
                .addAnnotatedClass(Customer.class);
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties()).build();
        return configuration.buildSessionFactory(serviceRegistry);
    }

    public static SessionFactory getSessionFactory() {
        return SESSION_FACTORY;
    }
}

