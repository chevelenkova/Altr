package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utility.DB_Util;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class VerifyInfo {
    @Given("establish the database connection")
    public void establishTheDatabaseConnection() {
        DB_Util.createConnection();
    }

    @When("Execute query to get all IDS from users")
    public void executeQueryToGetAllIDSFromUsers() {
        DB_Util.runQuery("select characterId from book");
    }

    @Then("verify all users has unique ID")
    public void verifyAllUsersHasUniqueID() {
        int ActualRowCount = DB_Util.getRowCount();
        List<String> listOfIds = DB_Util.getColumnDataAsList(1);
        Set<String> uniqID = new HashSet<>(listOfIds);
        Assert.assertEquals("Assertion failed, not all id uniq", uniqID.size(), ActualRowCount);

    }

    @When("Execute query to get all columns")
    public void executeQueryToGetAllColumns() {
        DB_Util.runQuery("select * from book");
    }

    @Then("verify the below columns are listed in result")
    public void verifyTheBelowColumnsAreListedInResult(List<String> expectedResult) {
        List<String> actualResult = DB_Util.getAllColumnNamesAsList();
        Assert.assertEquals("Test failed", expectedResult, actualResult);
    }
}
