package def.angular.legacy.ng;
import def.js.Error;
public interface IExceptionHandlerService {
    public void apply(Error exception, String cause);
    public void apply(Error exception);
}

