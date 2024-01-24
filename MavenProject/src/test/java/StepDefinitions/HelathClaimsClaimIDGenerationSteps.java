package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class HelathClaimsClaimIDGenerationSteps {
    WebDriver driver;
    

    @Given("I launch the Chrome browser")
    public void i_launch_the_chrome_browser() {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\User\\Downloads\\SathyaData\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

    }
    @When("I Open the Health claims Login page")
    public void i_open_the_health_claims_login_page(){
        driver.get("https://wecare-uat.tataaig.com/login");

    }
    @And("I Click on the Login with NTID & Password")
    public void i_click_on_the_login_with_ntid_password() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[1]/div/div[2]/div/div[3]")).click();
    }
    @And("I have entered a valid username in the NITD field")
    public void i_have_entered_a_valid_username_in_the_nitd_field() {
        driver.findElement(By.id("input-40")).sendKeys("Masterone");
    }
    @And("I have entered a valid Password in the Password field")
    public void i_have_entered_a_valid_password_in_the_password_field() {
        driver.findElement(By.id("input-43")).sendKeys("Iorta@2021");
    }
    @And("I Wait for 10 Sec to enter the Captcha")
    public void I_Wait_for_10_Sec_to_enter_the_Captcha() throws InterruptedException {
        Thread.sleep(10000);
    }
    @And("I click on the login button")
    public void i_click_on_the_login_button() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[3]/button")).click();
        Thread.sleep(4000);
    }
    @And("I click on Close on popup")
    public void I_click_on_Close_on_popup() throws InterruptedException {
        driver.findElement(By.xpath("//span[contains(text(),'Close')]")).click();
        Thread.sleep(1000);
    }
    @Then("Successfully opened the Home page of the Health claims application")
    public void successfully_opened_the_home_page_of_the_health_claims_application() {
        System.out.println("Health claims Home page successfully opened");
    }
    @And("I click on Claims logo")
    public void I_click_on_Claims_logo() throws InterruptedException {
        driver.findElement(By.xpath("//*[contains(@width,'366px')]")).click();
        Thread.sleep(2000);
    }

    @When("I click on the Inward Soft-copy Button from side menu")
    public void i_click_on_the_inward_soft_copy_button_from_side_menu() {
        driver.findElement(By.xpath("//body/div[@id='app']/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/div[9]/div[1]/div[1]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Inward (Softcopy)')]")).click();
    }
    @When("I Entered Email Id in the Email id field")
    public void i_entered_email_id_in_the_email_id_field() {
        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[1]")).sendKeys("jogu.satyanarayana@iorta.in");
    }
    @When("I Entered Date field")
    public void i_entered_date_field() {
        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[2]")).sendKeys("10-01-2023");
    }
    @When("I Entered the Time")
    public void i_entered_the_time() {
        driver.findElement(By.xpath("(//div[@class='v-text-field__slot']//input)[3]")).sendKeys("13:05");
    }
    @When("I Entered the No.of documents in the No.of documents field")
    public void i_entered_the_no_of_documents_in_the_no_of_documents_field() {
        driver.findElement(By.xpath("(//span[text()='watch_later']/following::input)[2]")).sendKeys("1");
    }
    @When("I selected the Claim type")
    public void i_selected_the_claim_type() {
        driver.findElement(By.xpath("(//div[@class='v-select__selections'])[2]")).click();
        driver.findElement(By.xpath("//div[text()='Reimbursement']")).click();
    }
    @When("I selected the Claim sub-type")
    public void i_selected_the_claim_sub_type() {
        driver.findElement(By.xpath("(//div[@class='v-select__selections'])[3]")).click();
        driver.findElement(By.xpath("//div[text()='New']")).click();

    }
    @When("I clicked on Add document button")
    public void i_clicked_on_add_document_button() {
        driver.findElement(By.xpath("//span[text()='Add Document ']")).click();
    }
    @When("I selected the Document type")
    public void i_selected_the_document_type() {
        driver.findElement(By.xpath("(//div[@class='v-select__selections'])[2]")).click();
        driver.findElement(By.xpath("//div[text()='Member Health Card']")).click();

    }
    @When("I selected Photocopy Yes or No")
    public void i_selected_photocopy_yes_or_no() throws InterruptedException {
        driver.findElement(By.xpath("(//div[@class='v-select__selections'])[3]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[text()='Yes']")).click();
    }
    @When("Document date I selected")
    public void document_date_i_selected() throws InterruptedException {
        driver.findElement(By.xpath("//th[text()='Document No.']/following-sibling::th/following::input[@role='button']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[@class='v-date-picker-table v-date-picker-table--date theme--light']//button//div[text()='1']")).click();

    }
    @When("I selected the Document and Upload the document")
    public void i_selected_the_document_and_upload_the_document() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"table-reviewCharges-1\"]/tbody/tr/td[5]/button/span")).click();
        WebElement browse = driver.findElement(By.xpath("//*[@id=\"fileUpload\"]"));
        browse.sendKeys("D:\\Screenshots\\Screenshots1\\5.png");
        Thread.sleep(1000);

    }
    @When("I Clicked on upload button")
    public void i_clicked_on_upload_button() {
        driver.findElement(By.xpath("(//input[@type='file']/following::span[@class='v-btn__content'])[2]")).click();
        WebDriverWait wait2 =new WebDriverWait(driver, Duration.ofSeconds(20));
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='app']/div[1]/main[1]/div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/div[6]/div[1]/button[2]")));

    }
    @When("I clicked on submit button")
    public void i_clicked_on_submit_button() {
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/main[1]/div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/div[6]/div[1]/button[2]")).click();
        WebElement element03 = driver.findElement(By.xpath("//div[@class='v-snack__content']//div[1]"));
        WebDriverWait wait03 = new WebDriverWait(driver, Duration.ofSeconds(18));
        wait03.until(ExpectedConditions.visibilityOf(element03));
        wait03.until(ExpectedConditions.elementToBeClickable(element03));

        // Try to click the web element
        try {
            element03.click();
        } catch (Exception e) {
            // Print error message
            System.out.println("Unable to click the web element: " + e.getMessage());
        }

    }
    @Then("Inward ID Successfully generated")
    public void inward_id_should_be_generated_successfully() {
        WebElement sourceElement = driver.findElement(By.xpath("//div[@class='v-snack__content']//div[1]"));
        String sourceText = sourceElement.getText();

        // Extract only the numbers from the text
        StringBuilder numbersOnly = new StringBuilder();
        for (int i = 0; i < sourceText.length(); i++) {
            char c = sourceText.charAt(i);
            if (Character.isDigit(c)) {
                numbersOnly.append(c);
            }
        }
    }

    @When("I Clicked on the Supervisor Data entry Q button From side menu")
    public void i_clicked_on_the_supervisor_data_entry_q_button_from_side_menu() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/main/div/div/div[1]/div[1]/nav/div[1]/div[71]/div/div/div")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Supervisor Data Entery Queue')]")).click();
    }
    @When("I entered the Inward id in the search text box")
    public void i_entered_the_inward_id_in_the_search_text_box() throws InterruptedException {


    }
    @When("I Clicked on search button")
    public void i_clicked_on_search_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I Assigned to User and click on action button")
    public void i_assigned_to_user_and_click_on_action_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Clicked on Claim user home page from the side menu")
    public void clicked_on_claim_user_home_page_from_the_side_menu() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I Searched with Inward id")
    public void i_searched_with_inward_id() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Clicked on Next button for the result work item")
    public void clicked_on_next_button_for_the_result_work_item() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I Searched with MemID in Details of insured person hospitalized tab")
    public void i_searched_with_mem_id_in_details_of_insured_person_hospitalized_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I Selected Retail Radio button")
    public void i_selected_retail_radio_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I Selected MemID Radio button")
    public void i_selected_mem_id_radio_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I entered the MemID in the MemID text box")
    public void i_entered_the_mem_id_in_the_mem_id_text_box() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I searched with the same MemID")
    public void i_searched_with_the_same_mem_id() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Selected one work item from the search result")
    public void selected_one_work_item_from_the_search_result() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I Clicked on OK")
    public void i_clicked_on_ok() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I Selected Date in Details of insured person hospitalized tab")
    public void i_selected_date_in_details_of_insured_person_hospitalized_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I Selected Time in Details of insured person hospitalized tab")
    public void i_selected_time_in_details_of_insured_person_hospitalized_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I Entered Claimed amount in Details of insured person hospitalized tab")
    public void i_entered_claimed_amount_in_details_of_insured_person_hospitalized_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I Selected Benefit claimed in Details of insured person hospitalized tab")
    public void i_selected_benefit_claimed_in_details_of_insured_person_hospitalized_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Clicked Save in Details of insured person hospitalized tab")
    public void clicked_save_in_details_of_insured_person_hospitalized_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Potential duplicate - clicked on Yes")
    public void potential_duplicate_clicked_on_yes() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Clicked on Next button in Insurance history details tab")
    public void clicked_on_next_button_in_insurance_history_details_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I clicked Search button in Provider details tab")
    public void i_clicked_search_button_in_provider_details_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Entered Entity name in Provider details tab")
    public void entered_entity_name_in_provider_details_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Clicked Search button in Provider search screen- Provider details tab")
    public void clicked_search_button_in_provider_search_screen_provider_details_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Selected one item from the search result - Provider search - provider details tab")
    public void selected_one_item_from_the_search_result_provider_search_provider_details_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Clicked on Save button in provider search screen- Provider details tab")
    public void clicked_on_save_button_in_provider_search_screen_provider_details_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Selected checkbox in treating doctor popup- provider details tab")
    public void selected_checkbox_in_treating_doctor_popup_provider_details_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Clicked Save button in treating doctor popup provider details tab")
    public void clicked_save_button_in_treating_doctor_popup_provider_details_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Clicked on Next button in Provider details screen")
    public void clicked_on_next_button_in_provider_details_screen() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Entered In-Patient Registration number inHospitalization details")
    public void entered_in_patient_registration_number_in_hospitalization_details() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Selected Room category in Hospitalization details")
    public void selected_room_category_in_hospitalization_details() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Selected Hospitalization due to in Hospitalization details")
    public void selected_hospitalization_due_to_in_hospitalization_details() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Selected Type of admission in Hospitalization details")
    public void selected_type_of_admission_in_hospitalization_details() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Selected Date of discharge in Hospitalization details")
    public void selected_date_of_discharge_in_hospitalization_details() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Selected Time in Hospitalization details")
    public void selected_time_in_hospitalization_details() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Entered System of medicine in Hospitalization details tab")
    public void entered_system_of_medicine_in_hospitalization_details_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Selected Status at discharge in Hospitalization details tab")
    public void selected_status_at_discharge_in_hospitalization_details_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Selected Date of injury in Hospitalization details tab")
    public void selected_date_of_injury_in_hospitalization_details_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Entered Injury details in Hospitalization details tab")
    public void entered_injury_details_in_hospitalization_details_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Selected Cause in Hospitalization details tab")
    public void selected_cause_in_hospitalization_details_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Clicked Next button in Hospitalization details tab")
    public void clicked_next_button_in_hospitalization_details_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Entered PAN Number in Bank details screen")
    public void entered_pan_number_in_bank_details_screen() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Entered Account number in Bank details screen")
    public void entered_account_number_in_bank_details_screen() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Entered IFSC in Bank details screen")
    public void entered_ifsc_in_bank_details_screen() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Clicked on Next button in Bank details screen")
    public void clicked_on_next_button_in_bank_details_screen() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Entered Invoice Number in Invoice addition screen")
    public void entered_invoice_number_in_invoice_addition_screen() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Select Date in Invoice addition")
    public void select_date_in_invoice_addition() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Entered pincode Enter inInvoice addition screen")
    public void entered_pincode_enter_in_invoice_addition_screen() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Select Party is hospital in Invoice addition screen")
    public void select_party_is_hospital_in_invoice_addition_screen() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Clicked on Add invoice button in Invoice addition screen")
    public void clicked_on_add_invoice_button_in_invoice_addition_screen() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Clicked on Add Services button in Invoice addition screen - Single room")
    public void clicked_on_add_services_button_in_invoice_addition_screen_single_room() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Click on Item Description in Invoice addition screen")
    public void click_on_item_description_in_invoice_addition_screen() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Enter Room type in search box -Item Description popup in Invoice addition screen")
    public void enter_room_type_in_search_box_item_description_popup_in_invoice_addition_screen() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Click on Search button in Item Description popup -Invoice addition screen")
    public void click_on_search_button_in_item_description_popup_invoice_addition_screen() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Select radio button in Invoice addition screen")
    public void select_radio_button_in_invoice_addition_screen() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Click on Submit button in Invoice addition screen")
    public void click_on_submit_button_in_invoice_addition_screen() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Entered Units in Invoice addition screen")
    public void entered_units_in_invoice_addition_screen() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Entered Gross amount in Invoice addition screen")
    public void entered_gross_amount_in_invoice_addition_screen() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Save Services in Invoice addition screen")
    public void save_services_in_invoice_addition_screen() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Click on Billing tab")
    public void click_on_billing_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Click on Global calculate button in Billing screen")
    public void click_on_global_calculate_button_in_billing_screen() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Click on Save button in Billing screen")
    public void click_on_save_button_in_billing_screen() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Click on Return button in popup-Billing screen")
    public void click_on_return_button_in_popup_billing_screen() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Click on Submit button in Billing screen")
    public void click_on_submit_button_in_billing_screen() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Claim ID is successfully generated")
    public void claim_id_is_successfully_generated() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
