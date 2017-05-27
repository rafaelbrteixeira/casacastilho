package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


public class HibernateUtil {

    public static final SessionFactory session = buildSession();

    private static SessionFactory buildSession() {
        try {
            SessionFactory factory;
            factory = new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();

            return factory;
        } catch (Throwable b) {
            System.out.println("Não deu \n" + b);
            throw new ExceptionInInitializerError();
        }
    }

    public static SessionFactory getSessionFactory() {
        return session;
    }
}
