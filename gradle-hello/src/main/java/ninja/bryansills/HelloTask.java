package ninja.bryansills;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class HelloTask extends DefaultTask {
    @TaskAction
    public void helloTask() {
        System.out.println("Hello world!");
    }
}