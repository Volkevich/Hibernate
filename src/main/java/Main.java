import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();
        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession();) {
            session.beginTransaction();

            User user = User.builder()
                    .age(20)
                    .birthDay(LocalDate.of(1995,12,12))
                    .firstname("Ivanov")
                    .lastname("Ivan")
                    .username("Ivanov@gmail.com")
                    .build();

            session.persist(user);

            session.getTransaction().commit();
        }



    }
}