package logic_facade;

import java.util.HashMap;
import java.util.Map;

public class CacheManager {
    private Map<String, User> cache = new HashMap<>();

    public User getUserData(String userId) {
        if (cache.containsKey(userId)) {
            System.out.println("������ �������� �� ����.");
            return cache.get(userId);
        } else {
            System.out.println("������ ����������� � ����.");
            return null;
        }
    }

    public void cacheUserData(User user) {
        cache.put(user.getId(), user);
    }
}
