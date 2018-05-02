package examples.boot.myboard.service;

import examples.boot.myboard.domain.User;
import examples.boot.myboard.domain.UserConnection;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    User addUser(User user);
    User getUserByEmail(String email);

    public User getSocialUser(String type, String providerUserId);
    public UserConnection addUserConnection(UserConnection userConnection);
}
