package app;

import core.framework.module.App;
import core.framework.module.SystemModule;

/**
 * @author Danson
 */
public class StudentSiteApp extends App {
    @Override
    protected void initialize() {
        load(new SystemModule("sys.properties"));
        load(new WebModule());
    }
}
