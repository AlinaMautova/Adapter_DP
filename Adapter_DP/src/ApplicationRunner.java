public class ApplicationRunner {
    public static void main(String[] args) {
        JavaApplication javaApplication = new ApplicationsAdapter();

        javaApplication.runApplication();
        javaApplication.saveChanges();
        javaApplication.stopApplication();
    }
}
