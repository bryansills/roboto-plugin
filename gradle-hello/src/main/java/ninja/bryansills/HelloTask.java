package ninja.bryansills;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.TaskAction;

public class HelloTask extends DefaultTask {
    @Input
    public String who = "mate";

    @TaskAction
    public void helloTask() {
        System.out.println("Hello " + who + "!");
    }
}