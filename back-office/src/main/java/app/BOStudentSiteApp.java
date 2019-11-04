package app;

import app.WebModule;
import core.framework.module.App;

/**
 * @author Danson
 */
public class BOStudentSiteApp extends App {
    @Override
    protected void initialize() {
        load(new WebModule());
    }
}
