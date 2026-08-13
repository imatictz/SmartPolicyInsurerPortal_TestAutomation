package utility;

import java.util.ArrayList;
import java.util.List;

public class SoftFailureContext {

    private static List<String> failures = new ArrayList<>();

    public static void add(String message) {
        failures.add(message);
    }

    public static boolean hasFailures() {
        return !failures.isEmpty();
    }

    public static void assertScenario() {
        if (!failures.isEmpty()) {
            throw new AssertionError(
                "Scenario failed due to validations:\n" +
                String.join("\n", failures)
            );
        }
    }

    public static void clear() {
        failures.clear();
    }
}

