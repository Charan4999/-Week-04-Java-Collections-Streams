package junit;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class TaskManager {
    public String Main() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Task Completed";
    }
}
class LongRunningTask {
    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    public void testLongRunningTaskTimeout() {
        TaskManager manager = new TaskManager();
        manager.Main();
    }
}

