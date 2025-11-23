package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import service.Search;
import utils.ExcelUtils;

public class SearchTest {

    @Test(dataProvider = "Search", dataProviderClass = ExcelUtils.class)
    public void testSearch(String keyword, String expected) {
        String result = Search.search(keyword);
        Assert.assertEquals(result, expected);
    }
}
