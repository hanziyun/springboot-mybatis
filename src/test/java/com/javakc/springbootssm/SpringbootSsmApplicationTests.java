package com.javakc.springbootssm;

import com.javakc.springbootssm.user.entity.User;
import com.javakc.springbootssm.user.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class SpringbootSsmApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
        User user = new User();
        user.setName("韩寒");
        user.setGender(1);
        user.setAge(23);
        user.setBirthday(new Date());
        user.setAddress("北京海淀");
        user.setPhone("13123132");

        userService.save(user);
    }

}
