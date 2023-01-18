package web.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    public List<User> listAll() {
        return userDao.listAll();
    }

    public void delete(Long id) {
        userDao.delete(id);
    }

    public void save(User user) {
        userDao.save(user);
    }

    public void update(Long id, User updatedUser) {

        userDao.update(id, updatedUser);
    }

    public User show(Long id) {
        return userDao.show(id);
    }

}