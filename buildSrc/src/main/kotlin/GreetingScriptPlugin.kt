// https://docs.gradle.org/current/userguide/custom_plugins.html

class GreetingScriptPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.task("hi") {
            doLast {
                println("Hi from the GreetingScriptPlugin")
            }
        }
    }
}


