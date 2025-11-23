package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import service.Sorting;
import utils.ExcelUtils;

public class SortingTest {

    @Test(dataProvider = "Sorting", dataProviderClass = ExcelUtils.class)
    public void testSorting(String rawData, String sortType, String expected) {
        String result = Sorting.sortData(rawData, sortType);
        Assert.assertEquals(result, expected);
    }
}
