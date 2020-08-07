package com.xiaopy.mongdbdemo.repository;

import com.xiaopy.mongdbdemo.MongdbDemoApplication;
import com.xiaopy.mongdbdemo.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * @author xiaopeiyu
 * @since 2020/8/7
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MongdbDemoApplication.class)
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testInsert() {
        // 创建 UserDO 对象
        User user = new User();
        user.setUsername("yudaoyuanma");
        user.setPassword("buzhidao");
        user.setCreateTime(new Date());
        // 存储到 DB
        userRepository.insert(user);
    }

    @Test
    public void testUpdate(){
        Optional<User> user = userRepository.findById("5f2cf99486891b0a5746151f");
        if(!user.isPresent()){
            return;
        }
        User user1 = user.get();
        user1.setPassword("1");
        userRepository.save(user1);
    }

    @Test
    public void findByUsername() {
        List<User>userList = userRepository.findByUsername("yudaoyuanma");
        userList.forEach(System.out::println);
    }
}