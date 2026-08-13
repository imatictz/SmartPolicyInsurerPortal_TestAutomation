package MyHooks;

import io.cucumber.java.*;
import utility.*;

import java.net.UnknownHostException;
import java.util.concurrent.atomic.AtomicInteger;

public class Hookable {

    private static AtomicInteger counter = new AtomicInteger(0);

    private static String[] usernames = {
        ConfigReader.get("user1.username"),
        ConfigReader.get("user2.username")
    };

    private static String[] passwords = {
        ConfigReader.get("user1.password"),
        ConfigReader.get("user2.password")
    };

    // 🔹 START REPORT ONCE
    @BeforeAll
    public static void beforeAllScenarios() throws UnknownHostException {
        HTMLReportGenerator.TestSuiteStart(
            "C:\\ExecuteParrallel\\05Aug.html",
            "SmartPolicy"
        );
    }

    // 🔹 PER SCENARIO SETUP
    @Before(order = 0)
    public void beforeScenario(Scenario scenario) throws UnknownHostException, InterruptedException {

        HTMLReportGenerator.TestCaseStart(scenario.getName());

        System.out.println("---- Scenario Start : " + scenario.getName() + " ----");

        SeleniumOperations.browserLaunch();
        SeleniumOperations.openApplication();

        int index = counter.getAndIncrement() % usernames.length;

        SeleniumOperations.sendUserIdDynamic(
            new Object[]{"//*[@id='usercode']", usernames[index]}
        );

        SeleniumOperations.sendPasswordDynamic(
            new Object[]{"//*[@id='password']", passwords[index]}
        );

        SeleniumOperations.clickOnLogin(
            new Object[]{"//*[@id='btnLogin']"}
        );
        Thread.sleep(2000);
    }

    @Before(order = 1)
    public void selectLan() throws InterruptedException {
    	SeleniumOperations.selectLanguage();
    }
    

    // 🔹 PER SCENARIO TEARDOWN
    @After
    public void afterScenario(Scenario scenario) {

        HTMLReportGenerator.logScenarioResult(scenario);
        HTMLReportGenerator.TestCaseEnd();

        // 🔥 IMPORTANT: flush after each scenario
        HTMLReportGenerator.flush();

        //SeleniumOperations.browserClose();

        System.out.println("---- Scenario End : " + scenario.getName() + " ----");
    }

    // 🔹 CLOSE REPORT ONCE
    @AfterAll
    public static void afterAll() {
        HTMLReportGenerator.CloseReport();
    }
}

/*package MyHooks;

import io.cucumber.java.*;
import utility.*;

import java.net.UnknownHostException;
import java.util.concurrent.atomic.AtomicInteger;

public class Hookable {

    private static AtomicInteger counter = new AtomicInteger(0);

    private static String[] usernames = {
        ConfigReader.get("user1.username"),
        ConfigReader.get("user2.username")
    };
    private static String[] passwords = {
        ConfigReader.get("user1.password"),
        ConfigReader.get("user2.password")
    };

    @Before
    public void beforeScenario(Scenario scenario) throws UnknownHostException {

        // ✅ Start report once for all scenarios
        HTMLReportGenerator.TestSuiteStart("C:\\ExecuteParrallel\\FEB09.html", "SmartPolicy");

        // ✅ Start ExtentTest for this scenario
        HTMLReportGenerator.TestCaseStart(scenario.getName());

        System.out.println("---- Scenario Start : " + scenario.getName() + " ----");

        // 🔹 Launch new browser per scenario
        SeleniumOperations.browserLaunch();
        SeleniumOperations.openApplication();

        // 🔹 Assign user per scenario
        int index = counter.getAndIncrement() % usernames.length;
        String username = usernames[index];
        String password = passwords[index];

        System.out.println(
            "Thread=" + Thread.currentThread().getId() +
            " User=" + username
        );

        SeleniumOperations.sendUserIdDynamic(
            new Object[]{"//*[@id='usercode']", username}
        );

        SeleniumOperations.sendPasswordDynamic(
            new Object[]{"//*[@id='password']", password}
        );

        SeleniumOperations.clickOnLogin(
            new Object[]{"//*[@id='btnLogin']"}
        );
    }
    
    @Before(order=1)
    public void beforeScenario1(Scenario scenario) {

        if (scenario.getSourceTagNames().contains("@CLIENT")) {
            ScreenContext.setScreen("CLIENT");
        }
        else if (scenario.getSourceTagNames().contains("@MEDICAL")) {
            ScreenContext.setScreen("MEDICAL");
        }
        else if (scenario.getSourceTagNames().contains("@VEHICLE")) {
            ScreenContext.setScreen("VEHICLE");
        }

    }

    @After
    public void afterScenario(Scenario scenario) {

        // 🔹 Log scenario result
        HTMLReportGenerator.logScenarioResult(scenario);

        // 🔹 End scenario test
        HTMLReportGenerator.TestCaseEnd();

     // 🔴 CRITICAL FIX: Force TestNG failure
        if (scenario.isFailed()) {
            throw new AssertionError(
                "Scenario failed or aborted: " + scenario.getName()
            );
        }
        // 🔹 Close browser per scenario
        SeleniumOperations.browserClose();

        System.out.println("---- Scenario End : " + scenario.getName() + " ----");
    }

    // ✅ Hook to flush and close report at the very end
    @AfterAll
    public static void afterAllScenarios() {
        HTMLReportGenerator.CloseReport();
    }
}*/
