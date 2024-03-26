package by.ankudovich.center;

import by.ankudovich.center.entity.User;
import by.ankudovich.center.service.UserService;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        User user = new User();

    }
        public static void addStudent(UserService userService) {
            User user = new User();
            user.setId(1L);
            user.setName("Ваня");
            user.setSurname("Ванькин");
            user.setAge(28);
            user.setPhoneNumber("8 800 555 535");
            user.setLocalDate(12-3-2033);
            userService.add(user);
        }
}