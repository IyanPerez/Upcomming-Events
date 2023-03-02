package com.sala78.upcommingevents.models;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.annotation.Rollback;

import com.sala78.upcommingevents.repositories.RolesRepository;
import com.sala78.upcommingevents.repositories.UserRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(value = false)
public class UserTest {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RolesRepository rolesRepository;

    @Autowired
    EntityManager entityManager;

    @Test
    public void testUserHaveRoles() {
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        String password = encoder.encode("12345");

        User user = new User(null, "user", "12345");
        Role role = new Role(null, "ROLE_USER");
        List<Role> roles = new ArrayList<Role>();
        roles.add(role);
        user.setRoles(roles);
        user.setPassword(password);

        rolesRepository.save(role);
        userRepository.save(user);

        User userDB = entityManager.find(User.class, user.getId_user());

        assertThat("User", userDB.getId_user(), equalTo(1L));
        assertThat("User role", userDB.getRoles().size(), equalTo(1));
        assertThat("User role name", userDB.getRoles().get(0).getRole(), equalTo("ROLE_USER"));

    }

}
