package repository;

import model.User;

/**
 * @author Sergey Bugaenko
 * {@code @date} 21.01.2025
 */

public class UserRepositoryImpl implements UserRepository {
    @Override
    public User addUser(String email, String password) {
        return null;
    }

    @Override
    public boolean isEmailExist(String email) {
        return false;
    }

    @Override
    public User getUserByEmail(String email) {
        return null;
    }

    @Override
    public boolean updatePassword(String email, String newPassword) {
        return false;
    }
}
