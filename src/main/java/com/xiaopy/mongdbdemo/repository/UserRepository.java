package com.xiaopy.mongdbdemo.repository;

import com.xiaopy.mongdbdemo.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author xiaopeiyu
 * @since 2020/8/7
 */
public interface UserRepository extends MongoRepository<User, String> {

    List<User> findByUsername(String username);
}
