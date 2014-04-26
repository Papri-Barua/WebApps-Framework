package myTest;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilityPack.Utilities;

/**
 * Created by Mou on 4/23/2014.
 */
/**
 * Edited by Prithul on 4/25/2014.
 */
public class EditProfile extends Utilities {

    @Test
    public void editUserProfile() throws Exception {

        //Enter login id
        typeByID("session_key-login","ratan512@aol.com");
        //Enter password
        typeByID("session_password-login","bangladesh");
        //Click on sign in button.
        clickById("signin");

        //Mouse over the Profile menu
        mouseHover("Profile");
        //Go to Edit profile
        //clickByLinkText("Edit Profile");
        driver.navigate().to("www.linkedin.com/profile/edit?trk=nav_responsive_sub_nav_edit_profile");

        //Click on Edit Summary
        clickByCss("a.edit-entire-section.edit-show-entire-section");
        //Add text to the summary field.
        waitUntilVisible(By.id("expertise_comments-editExpertiseForm"));
        typeByID("expertise_comments-editExpertiseForm","Nothing Goes. Here Yess Summary updated");
        //Save summary section
        //clickByXpath("/html/body/div[12]/div/div[2]/div/div[3]/div/div/div/div[2]/div[2]/div/form/p/input");
        clickByTagName("submit");

        //Add position is the company
        clickByCss("edit-add");
        //Enter Company name 'JP Morgan'
        typeByID("companyName-positionCompany-position-editPositionForm", "JP MOrgan");
        //Enter title
        typeByID("companyDisplayName-positionCompany-position-editPositionForm", "Business Analyst");

        //Enter location
        typeByID("positionLocationName-position-editPositionForm", "NYC Area");
        //Enter duration of the work 1999 to 2010
        new Select(driver.findElement(By.id("month-startDate-position-editPositionForm"))).selectByVisibleText("September");
        typeByID("year-startDate-position-editPositionForm","1999");
        new Select(driver.findElement(By.id("month-monthYear-endDate-position-editPositionForm"))).selectByVisibleText("August");
        typeByID("year-monthYear-endDate-position-editPositionForm","2010");
        typeByID("summary-position-editPositionForm","Planning, Monitoring and Controlling");
        clickById("submit");

        //Add eduction, click on add education link
        clickByXpath("/html/body/div[15]/div/div[2]/div/div[3]/div/div[4]/div/h3/span/a");
        //Enter school name BARUCH
        typeByID("schoolText-schoolchoice-editEducationForm","BARUCH");
        //Enter duration of the school
        new Select(driver.findElement(By.id("startYear-startEndYear-editEducationForm"))).selectByVisibleText("2000");
        new Select(driver.findElement(By.id("endYear-startEndYear-editEducationForm"))).selectByVisibleText("2010");
        //Enter Degree name BBA
        typeByID("schoolDegree-editEducationForm","BBA");
        //Enter department name Business School
        typeByID("schoolFieldOfStudy-editEducationForm","Business School");
        //Enter Grade A+
        typeByID("schoolGrade-editEducationForm","A+");
        //Enter activities in the school.
        typeByID("schoolActivities-editEducationForm","Good job");
        //Add achivements
        typeByID("schoolNotes-editEducationForm","Did good result");
        //Click on Save
        clickById("submit");

        System.out.println("Profile is udpated.. ");
    }
}
