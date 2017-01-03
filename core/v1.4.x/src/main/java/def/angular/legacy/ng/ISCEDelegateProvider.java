package def.angular.legacy.ng;
@jsweet.lang.Interface
public abstract class ISCEDelegateProvider extends IServiceProvider {
    native public void resourceUrlBlacklist(Object[] blacklist);
    native public void resourceUrlWhitelist(Object[] whitelist);
    native public Object[] resourceUrlBlacklist();
    native public Object[] resourceUrlWhitelist();
}

