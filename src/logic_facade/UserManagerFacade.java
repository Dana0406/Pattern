package logic_facade;

public class UserManagerFacade {
    private ApiManager apiManager;
    private CacheManager cacheManager;

    public UserManagerFacade() {
        this.apiManager = new ApiManager();
        this.cacheManager = new CacheManager();
    }

    public User getUserData(String userId) {
        User cachedUser = cacheManager.getUserData(userId);

        if (cachedUser != null) {
            return cachedUser;
        } else {
            User apiUser = apiManager.getUserData(userId);
            if (apiUser != null) {
                cacheManager.cacheUserData(apiUser);
                return apiUser;
            }
            return null;
        }
    }
}
