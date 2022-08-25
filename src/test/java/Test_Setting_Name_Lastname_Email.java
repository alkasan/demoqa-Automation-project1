import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class  Test_Setting_Name_Lastname_Email extends BaseTest {
    //PracticeFormPage practiceFormPage = new PracticeFormPage(driver);

    @Test
    public void setName() {
        practiceFormPage.setName("Esra");
        Assertions.assertEquals("Esra",practiceFormPage.getName(), "Name value is not correct!");
        // mustafa  yazdır ama mehmet ismini bekle
    }

    @Test
    public void setLastName() {
        practiceFormPage.setLastName("Alkasan");
        Assertions.assertEquals("Alkasan",practiceFormPage.getLastName(), "Last name value is not correct!");
    }

    @Test
    public void setEmail() {
        practiceFormPage.setEmail("esra123@gmail.com");
        Assertions.assertEquals("esra123@gmail.com",practiceFormPage.getEmail(), "Email value is not correct!");
    }
}
