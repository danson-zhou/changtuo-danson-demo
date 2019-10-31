package app;

import core.framework.module.App;
import core.framework.module.SystemModule;

/**
 * @author Danson
 */
public class StudentServiceApp extends App {
    @Override
    protected void initialize() {
        load(new SystemModule("sys.properties"));
        load(new StudentModule());
        load(new SchoolModule());
    }
}
