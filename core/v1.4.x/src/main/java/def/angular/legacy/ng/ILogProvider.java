package def.angular.legacy.ng;
@jsweet.lang.Interface
public abstract class ILogProvider extends IServiceProvider {
    native public Boolean debugEnabled();
    native public ILogProvider debugEnabled(Boolean enabled);
}

