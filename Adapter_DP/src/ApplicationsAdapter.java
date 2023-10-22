public class ApplicationsAdapter extends newJavaApplication implements JavaApplication{

    @Override
    public void runApplication() {
        runApp();
    }

    @Override
    public void saveChanges() {
        saveApp();
    }

    @Override
    public void stopApplication() {
        stopApp();
    }
}
