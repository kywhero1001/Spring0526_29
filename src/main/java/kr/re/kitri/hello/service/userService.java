package kr.re.kitri.hello.service;

import kr.re.kitri.hello.dao.UserDao;
import kr.re.kitri.hello.model.User;
import org.springframework.stereotype.Service;

@Service
public class userService {
    public static User registUser(User user) {
        return UserDao.insertUser(user);
    }

    public User insertUser(User user){
        System.out.println("insert ok");
        return user;
    }
}
