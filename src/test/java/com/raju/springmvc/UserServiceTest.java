package com.raju.springmvc;

import com.raju.springmvc.model.User;
import com.raju.springmvc.repository.RoleRepository;
import com.raju.springmvc.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest {


    @Mock
    private UserRepository userRepository;
    @Mock
    private RoleRepository mockRoleRepository;


    @Test
    public void setup(){


        User u = User.builder().userName("raju")
                .active(true)
                .email("iaju@gmail.com")
                .lastName("ismail")
                .name("raja")
                .password("pp")
                .build()
                ;


//                userRepository.save(u);


        Mockito.when(userRepository.save(u))
                .thenReturn(u);
        Mockito.when(userRepository.findByEmail(u.getEmail()))
                .thenReturn(u);

    }
}
