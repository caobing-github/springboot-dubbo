package service;


import com.dubbo.entity.User;
import com.dubbo.service.UserService;

public class UserServiceImpl implements UserService {

    public User queryById(String id) {
        User u=new User().setId(id);
        return u;
    }
}
