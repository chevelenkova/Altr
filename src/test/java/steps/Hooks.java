package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utility.DB_Util;


public class Hooks {

    @Before()
    public void setupDB() {
        DB_Util.createConnection();
    }

    @After()
    public void destroyDB() {
        DB_Util.destroy();
    }

}
