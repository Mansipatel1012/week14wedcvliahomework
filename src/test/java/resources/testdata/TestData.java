package resources.testdata;

import org.testng.annotations.DataProvider;


public class TestData {
    @DataProvider(name = "credentials")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"Tester", "Wembley, Greater London", "5 miles", "20000", "30000", "Per annum", "Permanent", "Permanent Tester jobs in Wembley"},
                {"Accountant", "Harrow, Greater London", "2 miles", "30000", "40000", "Per month", "Contract", "Contract Accountant jobs in Harrow"},
                {"Software Engineer", "Scarborough, North Yorkshire", "15 miles", "40000", "60000", "Per hour", "Contract", "Contract Software Engineer jobs in Scarborough"},
                {"Software Developer", "Harrow on the Hill, Greater London", "25 miles", "30000", "50000", "Per week", "Contract", "Contract Software Developer jobs in Harrow on the Hill"},
                {"Soft Services Manager", "Central London", "35 miles", "40000", "80000", "Per day", "Part Time", "Part Time Soft Services Manager jobs in Central London"},
                {"Developer", "Celbridge, Kildare", "35 miles", "40000", "80000", "Per day", "Temporary", "Temporary Developer jobs in Celbridge"},
                {"Engineering Manager", "Central Scotland", "50 miles", "40000", "80000", "Per day", "Contract", "Contract Engineering Manager jobs in Central Scotland"}
        };
        return data;
    }

}
