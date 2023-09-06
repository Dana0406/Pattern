package logic_facade;

public class ApiManager {
    public User getUserData(String userId) {
        return new User(userId, "User from API");
    }
}
