package tests;

import manager.ApplicationManager;
import manager.dto.StudentDTO;
import manager.enums.Gender;
import org.testng.annotations.Test;
import pages.HomePage;

public class PracticeFormTests extends ApplicationManager {

    @Test
    public void practiceFormPositiveTest(){
        StudentDTO student = new StudentDTO();
        student.setName("Stive");
        student.setLastName("Silver");
        student.setEmail("silver123@gmail.com");
        student.setGender(Gender.MALE);


        new HomePage(getDriver()).clickBtnForms()
                                 .clickBtnPracticeForm()
                                 .fillStudentsForm(student);
    }
}
