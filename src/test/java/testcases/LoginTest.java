package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import service.Login;
import utils.ExcelUtils;

public class LoginTest {

    @Test(dataProvider = "Login", dataProviderClass = ExcelUtils.class)
    public void testLogin(String username, String password, String expected) {
        String result = Login.login(username, password);
        Assert.assertEquals(result, expected);
    }
}
