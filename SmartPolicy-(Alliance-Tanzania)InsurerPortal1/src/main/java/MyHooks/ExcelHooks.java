package MyHooks;

import java.io.File;

import io.cucumber.java.BeforeAll;

public class ExcelHooks {

    @BeforeAll
    public static void beforeAll() {

        File file = new File("target/All_Report_Links.xlsx");

        if (file.exists()) {
            file.delete();
            System.out.println("🗑 Old Excel file deleted.");
        }

        System.out.println("📊 Fresh Excel file will be created during execution.");
    }
}
