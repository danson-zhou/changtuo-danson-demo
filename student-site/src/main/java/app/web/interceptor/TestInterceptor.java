package app.web.interceptor;

import core.framework.http.ContentType;
import core.framework.web.Interceptor;
import core.framework.web.Invocation;
import core.framework.web.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Danson
 */
public class TestInterceptor implements Interceptor {
    private final Logger logger = LoggerFactory.getLogger(TestInterceptor.class);

    @Override
    public Response intercept(Invocation invocation) throws Exception {
        String user = invocation.context().request().queryParams().get("user");
        if (user == null) {
            return Response.text("must login in").contentType(ContentType.TEXT_HTML);
        }
        return invocation.proceed();
    }
}
