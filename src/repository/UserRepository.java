package repository;

import model.User;

/**
 * @author Sergey Bugaenko
 * {@code @date} 19.12.2024
 */

public interface UserRepository {

    // CRUD

    User addUser(String email, String password);


    boolean isEmailExist(String email);

    // GET
    User getUserByEmail(String email);

    // Update
    boolean updatePassword(String email, String newPassword);

}
