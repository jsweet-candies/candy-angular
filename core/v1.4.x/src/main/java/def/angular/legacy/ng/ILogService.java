package def.angular.legacy.ng;
@jsweet.lang.Interface
public abstract class ILogService extends def.js.Object {
    public ILogCall debug;
    public ILogCall error;
    public ILogCall info;
    public ILogCall log;
    public ILogCall warn;
    native public void debug(Object... args);
    native public void error(Object... args);
    native public void info(Object... args);
    native public void log(Object... args);
    native public void warn(Object... args);
}

