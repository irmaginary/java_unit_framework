package tests;

import pages.FileUploadPage;
import pages.FileUploadpage;
import pages.UploadedFilePage;
import utils.SettingsTestData;
import org.testng.annotations.Test;

public class FileUploadTest extends BaseTest {
    private FileUploadPage fileUploadPage = new FileUploadPage();
    private UploadedFilePage uploadedFilePage = new UploadedFilePage();
    private final String FILE_NAME = SettingsTestData.getFileData().getUploadFile();
    private final String FILE_PATH = SettingsTestData.TEST_DATA_PATH + FILE_NAME;

    @Test
    public void fileUploadTest() {

        // todo: add test
    }
}
