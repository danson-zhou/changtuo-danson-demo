package app.web.interceptor;

import core.framework.http.ContentType;
import core.framework.web.Interceptor;
import core.framework.web.Invocation;
import core.framework.web.Response;

/**
 * @author Danson
 */
public class TestInterceptor implements Interceptor {

    @Override
    public Response intercept(Invocation invocation) throws Exception {
        String user = invocation.context().request().queryParams().get("user");
        if (user == null) {
            return Response.text("must login in").contentType(ContentType.TEXT_HTML);
        }
        return invocation.proceed();
    }
}
