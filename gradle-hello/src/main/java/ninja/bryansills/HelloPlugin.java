package ninja.bryansills;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class HelloPlugin implements Plugin<Project> {
    public void apply(Project project) {
        project.task("helloTask");
    }
}