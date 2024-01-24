package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class AvivaStepdefinition {

    private WebDriver driver;

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Capture screenshot with a unique name based on the scenario name
//            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(screenshot, "image/png", "FailedScenarioScreenshot");

            String scenarioName = scenario.getName().replaceAll(" ", "_");
            ScreenshotUtils.captureScreenshot(driver, scenarioName);
        }
    }


    //WebDriver driver;

    @Given("Im on aviva login page")
    public void im_on_aviva_login_page() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\User\\Downloads\\SathyaData\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.get("https://avivadev-v2.salesdrive.app/login");
        Thread.sleep(100);
    }
    @Then("I Entered the EmployeeID")
    public void i_entered_the_employee_id() {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("29850");
    }
    @Then("I Entered the Password")
    public void i_entered_the_password() {
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Aviva@123");
    }
    @Then("I click on Login button")
    public void i_click_on_login_button() throws InterruptedException {
        driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
        Thread.sleep(1500);
    }
    @Then("Home Page of the Aviva application is successfully opened")
    public void home_page_of_the_aviva_application_is_successfully_opened() {
        System.out.println("Home Page of the Aviva application is successfully opened");
    }
    @Then("I clicked on the Plus Icon in the aviva home page to add a new lead")
    public void i_clicked_on_the_plus_icon_in_the_aviva_home_page_to_add_a_new_lead() {
        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/span[1]/*[1]")).click();
    }
    @Then("Clicked on Add a new lead button above of the Plus icon")
    public void clicked_on_add_a_new_lead_button_above_of_the_plus_icon() throws InterruptedException {
        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/button[1]")).click();
        Thread.sleep(1000);
    }
    @Then("I Entered Mobile No. in Status tab -->About the Customer")
    public void i_entered_mobile_no_in_status_tab_about_the_customer() {
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9666191927");
    }
    @Then("I Entered Email ID in Status tab -->About the Customer")
    public void i_entered_email_id_in_status_tab_about_the_customer() {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jogu.satyanarayana@iorta.in");
    }
    @Then("I Selected checkbox Proceed with e-KYC in Status tab -->About the Customer")
    public void i_selected_checkbox_proceed_with_e_kyc_in_status_tab_about_the_customer() throws InterruptedException {
        driver.findElement(By.id("checkBox")).click();
        Thread.sleep(1000);
    }
    @Then("I Selected checkbox Proceed without e-KYC in Status tab -->About the Customer")
    public void i_selected_checkbox_proceed_without_e_kyc_in_status_tab_about_the_customer() throws InterruptedException {
        driver.findElement(By.id("checkBoxWithoutKyc")).click();
        Thread.sleep(1000);
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollTo(0,300)", "");
        Thread.sleep(500);
    }
    @Then("I clicked on GetOTP")
    public void I_clicked_on_GetOTP () throws InterruptedException {
        driver.findElement(By.xpath("//span[text()='Get OTP']")).click();
        Thread.sleep(1000);
    }

    @Then("I Entered the Adhar number")
    public void I_Entered_the_Adhar_number() throws InterruptedException {
        driver.findElement(By.id("aadharNumber")).sendKeys("643022730486");
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollTo(0,500)", "");
        Thread.sleep(500);
    }
    @Then("I clicked on Verify button")
    public void I_clicked_on_Verify_button() {
        driver.findElement(By.xpath("//span[text()='VERIFY']")).click();
    }
    @Then("I wait for {int} sec to enter the otp")
    public void i_wait_for_sec_to_enter_the_otp(Integer int1) throws InterruptedException {
        Thread.sleep(30000);
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollTo(0,300)", "");
    }
    @Then("I selected the Title")
    public void I_selected_the_Title() {
        driver.findElement(By.id("titleName")).click();
        driver.findElement(By.xpath("//div[text()='Mr.']")).click();
    }
    @Then("Entered First name")
    public void Entered_First_name() {
        driver.findElement(By.id("firstname")).sendKeys("Satya");

    }
    @Then("Entered Last name")
    public void Entered_Last_name() throws InterruptedException {
        driver.findElement(By.id("lastname")).sendKeys("J");
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollTo(0,500)", "");
        Thread.sleep(500);

    }
    @Then("Selected DOB")
    public void Selected_DOB() throws InterruptedException {
        driver.findElement(By.id("dobLi")).sendKeys("01/10/1995");
        Thread.sleep(500);
        driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div/div[1]/div[2]/table/tbody/tr[1]/td[1]/div")).click();
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollTo(0,1000)", "");
        Thread.sleep(500);
    }

    @Then("I Clicked on the Submit button Status tab --> Status")
    public void i_clicked_on_the_submit_button_status_tab_status() throws InterruptedException {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);
    }

    @Then("Clicked on self or Reference item in Lead Cart - Aviva home page")
    public void clicked_on_self_reference_item_in_lead_cart_aviva_home_page() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[1]/span")).click();
        Thread.sleep(1000);

    }
    @Then("Click on Update button in Lead cart page")
    public void click_on_update_button_in_lead_cart_page() throws InterruptedException {
        driver.findElement(By.className("update-btn")).click();
        Thread.sleep(6000);
    }
    @Then("Clicked on lead details tab")
    public void clicked_on_lead_details_tab() {
        driver.findElement(By.xpath("//div[text()='Lead Details ']")).click();
    }
    @Then("Selected the title from the dropdown- Lead details tab- Personal details section")
    public void selected_the_title_from_the_dropdown_lead_details_tab_personal_details_section() throws InterruptedException {
        driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[1]")).click();
        driver.findElement(By.xpath("//div[text()='Mr.']")).click();
        Thread.sleep(500);
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollTo(0,500)", "");
        Thread.sleep(500);
    }
    @Then("Entered the Father name")
    public void Entered_the_Father_name() {
        driver.findElement(By.id("fatherName")).sendKeys("JOGU PULLAIAH");
    }
    @Then("Selected the Gender")
    public void Selected_the_Gender() {
        driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
        driver.findElement(By.xpath("//div[text()='Male']")).click();
    }

    @Then("Selected the Marital Status- Lead details tab- Personal details section")
    public void selected_the_marital_status_lead_details_tab_personal_details_section() throws InterruptedException {
        driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[3]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("(//div[text()='Married'])[2]")).click();
    }
    @Then("I Clicked on Proceed button in Lead details tab- Personal details section")
    public void i_clicked_on_proceed_button_in_lead_details_tab_personal_details_section() throws InterruptedException {
        driver.findElement(By.xpath("(//div[@class='child']//button)[2]")).click();
        Thread.sleep(1000);
    }

    @Then("Address line One")
    public void Address_line_One()  {
        driver.findElement(By.id("addline1")).sendKeys("Hyderabad");
    }
    @Then("Selected the State in Lead details tab- Contact details section")
    public void selected_the_state_in_lead_details_tab_contact_details_section() {
        driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
        driver.findElement(By.xpath("//div[text()='Andhra Pradesh']")).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        long lastHeight = (long) js.executeScript("return Math.max( document.body.scrollHeight, document.body.offsetHeight, document.documentElement.clientHeight, document.documentElement.scrollHeight, document.documentElement.offsetHeight );");

        while (true) {
            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

            try {
                Thread.sleep(1000);  // Adjust the sleep time as needed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            long newHeight = (long) js.executeScript("return Math.max( document.body.scrollHeight, document.body.offsetHeight, document.documentElement.clientHeight, document.documentElement.scrollHeight, document.documentElement.offsetHeight );");

            if (newHeight == lastHeight) {
                break;  // Reached the bottom
            }
            lastHeight = newHeight;
        }
    }
    @Then("Clicked on Proceed button in Lead details tab- Contact details section")
    public void clicked_on_proceed_button_in_lead_details_tab_contact_details_section() throws InterruptedException {
        driver.findElement(By.xpath("//span[text()='Previous']/following::span[text()='Proceed']")).click();
        Thread.sleep(1000);
    }
    @Then("Selected the Educational Qualification in Lead details tab- Professional details section")
    public void selected_the_educational_qualification_in_lead_details_tab_professional_details_section() throws InterruptedException {
        driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[1]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[3]")).click();
    }
    @Then("Selected the Profession Type in Lead details tab- Professional details section")
    public void selected_the_profession_type_in_lead_details_tab_professional_details_section() throws InterruptedException {
        driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[text()='Salaried']")).click();
    }
    @Then("Selected the Income Group in Lead details tab- Professional details section")
    public void selected_the_income_group_in_lead_details_tab_professional_details_section() throws InterruptedException {
        driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[3]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("(//div[text()='Between INR 2.5 Lakh and INR 5 Lakh'])[2]")).click();
    }
    @Then("Clicked on Proceed button in Lead details tab- Professional details section")
    public void clicked_on_proceed_button_in_lead_details_tab_professional_details_section() throws InterruptedException {
        driver.findElement(By.xpath("//span[text()='Proceed']")).click();
        Thread.sleep(1000);
    }
    @Then("Selected the Smoking Status in Lead details tab- Additional details section")
    public void selected_the_smoking_status_in_lead_details_tab_additional_details_section() {
        driver.findElement(By.xpath("(//div[@class='ant-select-selector']//span)[2]")).click();
        driver.findElement(By.xpath("(//div[text()='Non-Smoker'])[2]")).click();
    }
    @Then("Clicked on Proceed button in Lead details tab- Additional details section")
    public void clicked_on_proceed_button_in_lead_details_tab_additional_details_section() {
        driver.findElement(By.xpath("//span[text()='Proceed']")).click();
    }
    @Then("Selected the Age of Life Insured or Policy Holder in Need Analysis tab")
    public void selected_the_age_of_life_insured_policy_holder_in_need_analysis_tab() {
        driver.findElement(By.className("ant-select-selection-item")).click();
        driver.findElement(By.xpath("//div[@title='26-35 years']//div[1]")).click();
    }
    @Then("Selected the Occupation of Life Insured or Policy Holder in Need analysis tab")
    public void selected_the_occupation_of_life_insured_policy_holder_in_need_analysis_tab() {
        driver.findElement(By.id("Occupation")).click();
        driver.findElement(By.xpath("(//div[text()='Salaried'])[2]")).click();

    }
    @Then("Selected the Priority {int} in Need Analysis tab")
    public void selected_the_priority_in_need_analysis_tab(Integer int1) {
        driver.findElement(By.id("keygoals1")).click();
        driver.findElement(By.xpath("//div[@title='Life Cover']//div[1]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        long lastHeight = (long) js.executeScript("return Math.max( document.body.scrollHeight, document.body.offsetHeight, document.documentElement.clientHeight, document.documentElement.scrollHeight, document.documentElement.offsetHeight );");

        while (true) {
            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

            try {
                Thread.sleep(1000);  // Adjust the sleep time as needed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            long newHeight = (long) js.executeScript("return Math.max( document.body.scrollHeight, document.body.offsetHeight, document.documentElement.clientHeight, document.documentElement.scrollHeight, document.documentElement.offsetHeight );");

            if (newHeight == lastHeight) {
                break;  // Reached the bottom
            }
            lastHeight = newHeight;
        }
    }
    @Then("Selected the Risk Profile in Need analysis tab")
    public void selected_the_risk_profile_in_need_analysis_tab() {
        driver.findElement(By.id("riskProfile")).click();
        driver.findElement(By.xpath("//div[text()='Medium Risk: Balanced, Moderate Growth']")).click();
    }
    @Then("Clicked on Submit in Need analysis tab")
    public void clicked_on_submit_in_need_analysis_tab() throws InterruptedException {
        driver.findElement(By.xpath("//span[text()='Submit']")).click();
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollTo(0,700)", "");
        Thread.sleep(12000);
    }

    @Then("Select the product ASIP")
    public void Select_the_product_ASIP() throws InterruptedException {
        driver.findElement(By.xpath("//p[text()='Aviva SIP-Signature Investment Plan']")).click();
        Thread.sleep(12000);
    }
    @Then("Select the product ANWB")
    public void Select_the_product_ANWB() throws InterruptedException {
        driver.findElement(By.xpath("//p[text()='Aviva New Wealth Builder']")).click();
        Thread.sleep(10000);
    }

    @Then("CLick on BI button")
    public void CLick_on_BI_button() throws InterruptedException {
        driver.findElement(By.xpath("//span[text()='Benefit Illustration']")).click();
        Thread.sleep(9000);
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollTo(0,800)", "");
        Thread.sleep(1000);
    }

    @Then("Down to Bottom")
    public void Down_to_Bottom() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        long lastHeight = (long) js.executeScript("return Math.max( document.body.scrollHeight, document.body.offsetHeight, document.documentElement.clientHeight, document.documentElement.scrollHeight, document.documentElement.offsetHeight );");

        while (true) {
            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

            try {
                Thread.sleep(1000);  // Adjust the sleep time as needed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            long newHeight = (long) js.executeScript("return Math.max( document.body.scrollHeight, document.body.offsetHeight, document.documentElement.clientHeight, document.documentElement.scrollHeight, document.documentElement.offsetHeight );");

            if (newHeight == lastHeight) {
                break;  // Reached the bottom
            }
            lastHeight = newHeight;
        }
    }

    @Then("Selected the Policy term dropdown")
    public void Selected_the_Policy_term_dropdown() {
        driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[3]")).click();
        driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[1]")).click();
    }
    @Then("Selected the Plan type")
    public void Selected_the_Plan_type() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By elementLocator = By.xpath("(//span[@class='ant-select-selection-search'])[3]");
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementLocator));
        element.click();

        driver.findElement(By.xpath("//div[text()='Signature GenX']")).click();
    }

    @Then("Premium Payment Option")
    public void Premium_Payment_Option() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div[2]/div[2]/div/div[1]/form/div[4]/div[2]/div/div[2]/div/div/div/div/span[2]")).click();
        driver.findElement(By.xpath("(//div[text()='Regular Premium'])[2]")).click();
    }
    @Then("PolicyTerm")
    public void Policy_Term() {

        driver.findElement(By.xpath("(//label[text()='PolicyTerm']/following::input)[1]")).click();
        driver.findElement(By.xpath("(//div[text()='20'])[2]")).click();
    }
    @Then("Cover Level")
    public void Cover_Level() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By elementLocator = By.xpath("//*[@id=\"root\"]/div[1]/div/div/div[2]/div[2]/div/div[1]/form/div[4]/div[4]/div/div[2]/div/div/div/div/span[2]");
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementLocator));
        element.click();

        //driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div[2]/div[2]/div/div[1]/form/div[4]/div[4]/div/div[2]/div/div/div/div/span[1]")).click();
        driver.findElement(By.xpath("(//div[text()='10'])[2]")).click();
    }

    @Then("Selected Payment frequency")
    public void Selected_Payment_frequency() {
        driver.findElement(By.xpath("(//label[text()='Payment Frequency']/following::input)[1]")).click();
        driver.findElement(By.xpath("//div[@title='Annual']//div[1]")).click();
    }
    @Then("Annual Premium")
    public void Annual_Premium() {
        driver.findElement(By.xpath("(//label[text()='Annual Premium']/following::input)[1]")).sendKeys("60000");
    }

    @Then("Entered Balance Fund")
    public void Entered_Balance_Fund() {
        driver.findElement(By.xpath("(//label[text()='Sum Assured']/following::input)[2]")).sendKeys("100");
    }


    @Then("Entered Annualized premium")
    public void Entered_Annualized_premium() {
        driver.findElement(By.xpath("(//input[@class='ant-input'])[2]")).sendKeys("40000");
    }
    @Then("Clicked on BI Generate Button")
    public void Clicked_on_BI_Generate_Button() throws InterruptedException {
        driver.findElement(By.xpath("//span[text()='Generate Benefit Illustration']")).click();
        Thread.sleep(15000);
    }

    @Then("Click on the WIP button on home page")
    public void click_on_the_wip_button_on_home_page() {
        driver.findElement(By.xpath("(//div[@bordered='false']//span)[3]")).click();
    }
    @Then("CLicked on Resume on WIP")
    public void c_licked_on_resume_on_wip() throws InterruptedException {
        driver.findElement(By.xpath("(//button[@class='show_more_less'])[1]")).click();
        Thread.sleep(7500);
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollTo(300,0)", "");
        Thread.sleep(1000);
    }
    @Then("Click on Mandatory document upload button")
    public void Click_on_Mandatory_document_upload_button() throws InterruptedException {
        driver.findElement(By.xpath("(//div[@class='ant-tabs-tab-btn'])[2]")).click();
        Thread.sleep(4000);
    }
    @Then("Select Document Type")
    public void Select_Document_Type()  {
        driver.findElement(By.className("select-input")).click();
    }
    @Then("Selected the Doc as Recent photo")
    public void Selected_the_Doc_as_Recent_photo() {
        driver.findElement(By.xpath("//div[@title='Recent Photo']//div[1]")).click();
    }
    @Then("Selected the Doc as ID Address proof")
    public void Selected_the_Doc_as_ID_Address_proof() throws InterruptedException {
        driver.findElement(By.xpath("//div[@title='ID/Address proof']//div[1]")).click();
        Thread.sleep(3000);
    }
    @Then("Selected the Doc as ID Address proof two")
    public void Selected_the_Doc_as_ID_Address_proof_two() throws InterruptedException {
        driver.findElement(By.xpath("(//select[@class='select-input']//option)[2]")).click();
        Thread.sleep(500);
    }
    @Then("Selected the Doc as Bank AC Proof")
    public void Selected_the_Doc_as_Bank_AC_Proof() throws InterruptedException {
        driver.findElement(By.xpath("(//select[@id='Select Document Type']//option)[2]")).click();
        Thread.sleep(500);
    }
    @Then("Selected the Doc as Joint photo")
    public void Selected_the_Doc_as_Joint_photo() throws InterruptedException {
        driver.findElement(By.xpath("//option[text()='Joint Photo']")).click();
        Thread.sleep(500);
    }


    @Then("Upload the Document")
    public void Upload_the_Document() throws InterruptedException {
        WebElement browse = driver.findElement(By.xpath("//span[@class='ant-upload']//input[1]"));
        browse.sendKeys("C:\\Users\\User\\Desktop\\Sample.png");
        Thread.sleep(1000);
    }

    @Then("Click on OK button after uploading the document")
    public void Click_on_OK_button_after_uploading_the_document() throws InterruptedException {
        driver.findElement(By.xpath("(//div[@class='ant-modal-footer']//button)[2]")).click();
         Thread.sleep(3000);
    }

    @Then("Click on Photo Id Proof")
    public void click_on_photo_id_proof() throws InterruptedException {
        driver.findElement(By.xpath("//div[text()='Photo ID Proof']")).click();
        Thread.sleep(3000);
    }

    @Then("Click on Address Proof")
    public void click_on_address_proof() throws InterruptedException {
        driver.findElement(By.xpath("//div[text()='Address Proof']")).click();
        Thread.sleep(3000);
    }
    @Then("CLick on Owner bank AC Proof")
    public void CLick_on_Owner_bank_AC_Proof() throws InterruptedException {
        driver.findElement(By.xpath("//div[text()='Owner Bank A/c Proof']")).click();
        Thread.sleep(3000);
    }
    @Then("CLick on Joint photo")
    public void c_lick_on_joint_photo() throws InterruptedException {
        driver.findElement(By.xpath("//div[text()='Joint Photo - FOS and Customer']")).click();
        Thread.sleep(3000);
    }
    @Then("Click on Proceed button")
    public void click_on_Proceed_button() throws InterruptedException {
        driver.findElement(By.xpath("(//div[@class='ant-col']//button)[2]")).click();
        Thread.sleep(6000);
    }
    @Then("Click on Continue - E-Insurance Account Details")
    public void click_on_continue_e_insurance_account_details() {
        driver.findElement(By.xpath("//div[@class='mb-2 einsuranceFooterChild']//button[1]")).click();
    }
    @Then("Click on Next Button")
    public void click_on_next_button() throws InterruptedException {driver.findElement(By.xpath("(//button[@class='ant-btn ant-btn-default'])[2]")).click();
        Thread.sleep(3000);
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollTo(0,500)", "");
        Thread.sleep(5000);
    }
    @Then("Select age proof on About Customer")
    public void select_age_proof_on_about_customer() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='AgeProof']")).click();
        driver.findElement(By.xpath("//div[text()='Aadhar Card']")).click();
        Thread.sleep(500);
    }
    @Then("Select Educational Qualification")
    public void Select_Educational_Qualification() {
        driver.findElement(By.xpath("//input[@id='Educational']")).click();
        driver.findElement(By.xpath("//div[text()='SSE']")).click();
    }

    @Then("Select Occupation")
    public void Select_Occupation() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='Occupation']")).click();
        driver.findElement(By.xpath("//div[text()='Business Owners/ Self Employed']")).click();
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollTo(0,950)", "");
        Thread.sleep(1500);
    }
    @Then("Select the City one")
    public void select_the_city_one() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div[2]/div[3]/form/div/div[2]/div/div[28]/div/div[2]/div/div/div/div/span[2]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[text()='A.I.Area']")).click();
        Thread.sleep(500);
    }
    @Then("Enter Pincode one")
    public void enter_pincode_one() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By elementLocator = By.xpath("//input[@id='Pincode']");
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementLocator));
        element.sendKeys("500000");
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollTo(0,1200)", "");
        Thread.sleep(500);
    }

    @Then("Permanent Address same as Current Address")
    public void Permanent_Address_same_as_Current_Address() throws InterruptedException {
        driver.findElement(By.xpath("(//span[@class='ant-checkbox']//input)[1]")).click();
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollTo(0,2000)", "");
        Thread.sleep(500);
    }
    @Then("Enter Name of the Business")
    public void enter_name_of_the_business() {
        driver.findElement(By.xpath("//input[@id='Nameofthebusiness']")).sendKeys("Iorta");
    }
    @Then("Enter Business Address Line")
    public void Enter_Business_Address_Line() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='BusinessAddressLine1']")).sendKeys("Hyd");
        Thread.sleep(1000);
    }
    @Then("Select State")
    public void select_state() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By elementLocator = By.xpath("//input[@id='BusinessState']");
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementLocator));
        element.click();
        driver.findElement(By.xpath("//div[text()='Andhra Pradesh']")).click();
    }
    @Then("Select the City")
    public void select_the_city() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By elementLocator = By.xpath("//input[@id='BusinessCity']");
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementLocator));
        element.click();
        Thread.sleep(500);
        WebElement element1 = driver.findElement(By.xpath("/html/body/div[8]/div/div/div/div[2]/div[1]/div/div/div[4]/div"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element1).click().perform();

        //driver.findElement(By.xpath("//div[text()='80 Feet Road']")).click();
    }
    @Then("Enter Pincode")
    public void enter_pincode() {
        driver.findElement(By.xpath("//input[@id='BusinessPincode']")).sendKeys("500000");
    }
    @Then("Enter Tel")
    public void Enter_Tel() {
        driver.findElement(By.xpath("//input[@id='BusinessTelResi']")).sendKeys("0998656456767");
    }
    @Then("Enter Email Id")
    public void enter_email_id() {
        driver.findElement(By.xpath("//input[@id='BusinessEmailID']")).sendKeys("jogu.satyanarayana@iorta.in");
    }
    @Then("Enter Annual Income")
    public void enter_annual_income() {
        driver.findElement(By.xpath("//input[@id='yourInnualIncome']")).sendKeys("50000");
    }
    @Then("Select Income Tax PAN")
    public void select_income_tax_pan() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div[2]/div[3]/form/div/div[2]/div/div[62]/div/div[2]/div/div/div/div/span[2]")).click();
        driver.findElement(By.xpath("//div[text()='Form 60/61']")).click();
    }
    @Then("Entered Name as per Bank Account - Finacial Details tab")
    public void entered_name_as_per_bank_account_finacial_details_tab() {
        driver.findElement(By.xpath("(//div[@class='ant-form-item-control-input-content']//input)[1]")).sendKeys("Satya");
    }
    @Then("Entered Bank Account number")
    public void entered_bank_account_number() {
        driver.findElement(By.xpath("(//div[@class='ant-form-item-control-input-content']//input)[2]")).sendKeys("9786437944766");
    }
    @Then("Select Bank Name")
    public void select_bank_name() {
        driver.findElement(By.xpath("(//span[@class='ant-select-selection-search']//input)[1]")).click();
        driver.findElement(By.xpath("(//div[contains(@class,'ant-select-item ant-select-item-option')]//div)[1]")).click();
    }
    @Then("Select Bank Account Type")
    public void select_bank_account_type() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div[2]/div[3]/form/div/div[2]/div/div[4]/div/div[2]/div/div/div/div/span[1]")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By elementLocator = By.xpath("//div[text()='Savings Account']");
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementLocator));
        element.click();

//        driver.findElement(By.xpath("//div[text()='Savings Account']")).click();
    }
    @Then("Entered MICR Code")
    public void Entered_MICR_Code() {
        driver.findElement(By.xpath("(//input[contains(@class,'ant-input first-name')])[3]")).sendKeys("987645323");
    }
    @Then("Entered IFSC Code")
    public void Entered_IFSC_Code() {
        driver.findElement(By.xpath("//input[@id='IFSCCode']")).sendKeys("ADCB0DJEY5T");
    }
    @Then("Entered Customer Height in Health Details DGH section")
    public void Entered_Customer_Height_in_Health_Details_DGH_section() {
        driver.findElement(By.xpath("(//div[@class='ant-form-item-control-input-content']//input)[1]")).sendKeys("170");
    }
    @Then("Entered Customer Weight")
    public void entered_customer_weight() {
        driver.findElement(By.xpath("(//div[@class='ant-form-item-control-input-content']//input)[2]")).sendKeys("70");
    }
    @Then("Entered First Name in Nomination Details")
    public void entered_first_name_in_nomination_details() {
        driver.findElement(By.xpath("(//div[@class='ant-form-item-control-input-content']//input)[1]")).sendKeys("Anvesh");
    }
    @Then("Entered Last Name")
    public void entered_last_name() throws InterruptedException {
        driver.findElement(By.xpath("(//div[@class='ant-form-item-control-input-content']//input)[2]")).sendKeys("s");
        Thread.sleep(500);
    }
    @Then("Selected Relationship With Life To Be Insured")
    public void selected_relationship_with_life_to_be_insured() throws InterruptedException {
        driver.findElement(By.xpath("(//span[@class='ant-select-selection-search'])[1]")).click();
        driver.findElement(By.xpath("//div[text()='Brother']")).click();
        Thread.sleep(500);
    }
    @Then("Entered Reason")
    public void entered_reason() {
        driver.findElement(By.xpath("(//input[contains(@class,'ant-input first-name')])[3]")).sendKeys("Ok");
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollTo(0,200)", "");
    }
    @Then("Enterd Date Of Birth")
    public void enterd_date_of_birth() {
        driver.findElement(By.xpath("//div[@class='ant-picker-input']//input[1]")).sendKeys("03/01/1998");
        driver.findElement(By.xpath("(//div[text()='3'])[1]")).click();
    }
    @Then("Select Gender")
    public void select_gender() {
        driver.findElement(By.xpath("(//span[@class='ant-select-selection-search']//input)[2]")).click();
        driver.findElement(By.xpath("//div[text()='Male']")).click();
    }
    @Then("Select Address same as LI Check box")
    public void select_address_same_as_li_check_box() {
        driver.findElement(By.xpath("//span[@class='ant-checkbox']//input[1]")).click();
    }
    @Then("Wait for few sec and click Next")
    public void Wait_for_few_sec_and_click_Next() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(4000);
    }
    @Then("Selected the Doc as Income Proof")
    public void Selected_the_Doc_as_Income_Proof() throws InterruptedException {
        driver.findElement(By.xpath("//option[text()='Income proof']")).click();
        Thread.sleep(500);
    }

    @Then("Click on OTP Authentication Tab")
    public void click_on_otp_authentication_tab() throws InterruptedException {
        driver.findElement(By.xpath("//div[text()='OTP Authentication ']")).click();
        Thread.sleep(4000);
    }

    @Then("Select the Check bo and Click on get otp")
    public void select_the_check_bo_and_click_on_get_otp() throws InterruptedException {
        driver.findElement(By.xpath("//span[@class='ant-checkbox']//input[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='ant-card-body']//button[1]")).click();
    }
    @Then("Wait for {int} Sec for entering otp")
    public void wait_for_sec_for_entering_otp(Integer int1) {
        driver.findElement(By.xpath("")).click();
    }


}
