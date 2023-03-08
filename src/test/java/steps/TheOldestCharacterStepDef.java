package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utility.DB_Util;

public class TheOldestCharacterStepDef {
    String dbOldestCharacter;

    @When("execute query to find the oldest character")
    public void executeQueryToFindTheOldestCharacter() {
        DB_Util.runQuery("select concat(firstname, ' ',  lastname) as fullName from book\n" +
                "order by age desc ");
        dbOldestCharacter = DB_Util.getFirstRowFirstColumn();
    }

    @Then("verify {string} is the oldest character in the book")
    public void verifyIsTheOldestCharacterInTheBook(String expectedOldestCharacter) {
        Assert.assertEquals("Verification of the oldest character has failed", expectedOldestCharacter, dbOldestCharacter);
    }
}
