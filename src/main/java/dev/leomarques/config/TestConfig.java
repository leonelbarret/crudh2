package dev.leomarques.config;

import dev.leomarques.entities.Category;
import dev.leomarques.entities.Order;
import dev.leomarques.entities.User;
import dev.leomarques.entities.enums.OrderStatus;
import dev.leomarques.repository.CategoryRepository;
import dev.leomarques.repository.OrderRepository;
import dev.leomarques.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository repo;

    @Autowired
    private OrderRepository orepo;

    @Autowired
    private CategoryRepository crepo;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");


        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"),OrderStatus.PAID, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"),OrderStatus.PAID, u1);

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        repo.saveAll(Arrays.asList(u1,u2));
        orepo.saveAll(Arrays.asList(o1,o2,o3));
        crepo.saveAll(Arrays.asList(cat1, cat2, cat3));


    }
}
