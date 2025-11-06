package service;

import model.User;
import java.util.ArrayList;

public class UserService {
    private ArrayList<User> users = new ArrayList<>();
    private User currentUser;

    public void register(String email, String password) {
        users.add(new User(email, password));
    }

    public boolean login(String email, String password) {
        for (User user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                currentUser = user;
                return true;
            }
        }
        return false;
    }


    public void logout() {
        currentUser = null;
    }
    
    public boolean updateFullName(String newFullName) {
        if (currentUser == null) return false;
        
        if (newFullName != null && !newFullName.trim().isEmpty()) {
            currentUser.setFullname(newFullName.trim());
            return true;
        }
        return false;
    }

    public boolean updateAddress(String newAddress) {
        if (currentUser == null) return false;
        
        currentUser.setAddress(newAddress != null ? newAddress.trim() : "");
        return true;
    }

    public boolean updatePhoneNumber(String newPhoneNumber) {
        if (currentUser == null) return false;
        
        // Basic phone validation
        if (newPhoneNumber != null) {
            currentUser.setPhonenumber(newPhoneNumber.trim());
            return true;
        }
        return false;
    }

    public boolean updatePassword(String currentPassword, String newPassword) {
        if (currentUser == null) return false;
        
        // to Verify if it's not the same as current password
        if (!currentUser.getPassword().equals(currentPassword)) {
            return false; // Wrong current password
        }
        
        // validate new password (minimum 6 characters)
        if (newPassword != null && newPassword.length() >= 6) {
            currentUser.setPassword(newPassword);
            return true;
        }
        return false;
    }

}
