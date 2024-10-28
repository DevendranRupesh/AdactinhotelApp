package org.Step_Definition;

import org.Base.Baseclass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pojo.Adactinpojo;

public class Step_definition extends Baseclass{
	
	
	Adactinpojo lp;
	@Given("user enter the userName as {string}")
	public void userEnterTheUserNameAs(String username) {
		lp = new Adactinpojo(driver);
       insert(lp.getUsername(),username);
	}
	
	@Given("user enter the Password as {string}")
	public void userEnterThePasswordAs(String Password) {
		insert(lp.getPassword(),Password);
	  }
	
	@When("user click the login button")
	public void userClickTheLoginButton() {
		Btnclick(lp.getLoginbtn());
		}
	
	
    @Then("user login should pass navigate to search hotel page")
	public void userLoginShouldPassNavigateToSearchHotelPage() {
		String text = lp.getsearchtext().getText();
		Assert.assertEquals(text, "Welcome to Adactin Group of Hotels");

	    
	}
    @Then("user should Select the location of the Hotel")
	public void userShouldSelectTheLocationOfTheHotel() {
        
    	getSelect(lp.getLocation());
		sc.selectByIndex(2);
		
	    }

	@Then("user Should select the Hotel")
	public void userShouldSelectTheHotel() {

		getSelect(lp.getHotel());
		sc.selectByIndex(2);
   }
	
	@Then("user should Select Room type Required to stay")
	public void userShouldSelectRoomTypeRequiredToStay() {

		getSelect(lp.getRoomtype());
		sc.selectByIndex(3);
	}
	
	@Then("user should select Number of Rooms Required")
	public void userShouldSelectNumberOfRoomsRequired() {

	     getSelect(lp.getRoomsreqd());
		  sc.selectByIndex(4);
	   }
    @Then("user select the check In Date")
	public void userSelectTheCheckInDate() {
    	
    	 insert(lp.getChkindate(),"13/9/24" );
		 }
	
	@Then("user select the check out Date")
	public void userSelectTheCheckOutDate() {
		
		 insert(lp.getChkoutdate(),"14/9/24");
		 
		}

	@Then("user select Number of Adults per Room")
	public void userSelectNumberOfAdultsPerRoom() {

			getSelect(lp.getAdultsforroom());
			sc.selectByIndex(2);
	    }
	
	@Then("user select Number of children per Room")
	public void userSelectNumberOfChildrenPerRoom() {

		getSelect(lp.getChildforroom());
		sc.selectByIndex(2);
	}
	
	@When("user clicks the Search button")
	public void userClicksTheSearchButton() throws InterruptedException {
		Thread.sleep(2000);
	
		Btnclick(lp.getSearchbutton());
		
	}
	
	@Then("user should navigate to Next page")
	public void userShouldNavigateToNextPage() {
		
		WebElement actuals = lp.getActuals();
	    String text = actuals.getText();
		Assert.assertEquals(text, "Search Hotel");
		
	 }
	@Then("user should navigate to SelectHotel page")
	public void userShouldNavigateToSelectHotelPage() {
		
		String currentUrl = driver.getCurrentUrl();
		Baseclass.log("page navigate to:"+currentUrl);
		
	}
	@Then("user should select the selecthotel radiobtn")
	public void userShouldSelectTheSelecthotelRadiobtn() throws InterruptedException {
	
		Btnclick(lp.getRadiobtn());
		
		Thread.sleep(1000); 
		
	}
	@When("user click the continue button")
	public void userClickTheContinueButton() throws InterruptedException {
		
		Btnclick(lp.getContinuebutton());
	    Thread.sleep(1000);
   }
	@Then("user should navigate to Book a Hotel page")
	public void userShouldNavigateToBookAHotelPage() {
		WebElement actual3 = lp.getActual3();
	    String text = actual3.getText();
		Assert.assertEquals(text, "Book A Hotel");   
	}
	
	@Then("user should enter the Firstname")
	public void userShouldEnterTheFirstname() {
		
		insert(lp.getFname(),("ragav"));
		}
	
	@Then("user enters the lastname")
	public void userEntersTheLastname() {
		
		insert(lp.getLname(),"dinesh");
		}
	
	@Then("user fills the Billing Address")
	public void userFillsTheBillingAddress() {
	
	   insert(lp.getAddress(),"plot no.6 devasagayam street");
		}
	
	@Then("user enters the Credit Card Number")
	public void userEntersTheCreditCardNumber() {
	
		insert(lp.getCreditcardno(),"1600000000000000");
	  }
	@Then("user Selects the Credit Card type")
	public void userSelectsTheCreditCardType() {
		

		getSelect(lp.getCc_type());
		sc.selectByValue("VISA");
	    
	}
	@Then("user selects the Expiry date")
	public void userSelectsTheExpiryDate() {

		getSelect(lp.getExpirydate());
		sc.selectByVisibleText("March");
	    
	}
	@Then("User Selects the Expiry Month")
	public void userSelectsTheExpiryMonth() {

	    getSelect(lp.getExpiryyear()); 
		sc.selectByVisibleText("2014");
	}
	
	@Then("user enters the CVV Number")
	public void userEntersTheCVVNumber() {
	
	   insert(lp.getCvvno(),"016");
		
	    
	}
	@When("user Clicks the Book Now button")
	public void userClicksTheBookNowButton() throws InterruptedException {
		Thread.sleep(1000);
		
		Btnclick(lp.getBooknow());
		
		
	}
	
	@Then("user Should navigate to Booking confirmation page")
	public void userShouldNavigateToBookingConfirmationPage() {
		WebElement confirm = lp.getConfirm();
		String text = confirm.getText();
		Assert.assertEquals(text, "Booking Confirmation");  
	
		}
	
	@Then("user should get oderid for Booking Confirmation")
	public void userShouldGetOderidForBookingConfirmation() {
		WebElement OrderNumber = lp.getOrderNumber();
		Baseclass.log("My order id received as :"+ OrderNumber.getAttribute("value")); 
		
	}
	@When("user should click the My Itinerary button")
	public void userShouldClickTheMyItineraryButton() throws InterruptedException {
		Thread.sleep(1000);
	
		Btnclick(lp.getBtn());
	    
	}
	@Then("user should navigate to Booked Itinerary page")
	public void userShouldNavigateToBookedItineraryPage() {
		WebElement itenarypage = lp.getItineryverify();
		String text = itenarypage.getText();
		Baseclass.log("Text Received as:"+text);
		
		//Assert.assertEquals(text, "Booked Itinerary");  	
	    
	}
	
	@Then("user Selects the oder id")
	public void userSelectsTheOderId() {
		
		Btnclick(lp.getCheckbox());
	    
	}
	
	@When("user clicks the cancel selected button")
	public void userClicksTheCancelSelectedButton() throws InterruptedException {
		Thread.sleep(1000);
		Btnclick(lp.getCancelbtn());
		
		alert=  driver.switchTo().alert();
		alert.accept();
	    
	}
	@When("user select the logout button to exit")
	public void userSelectTheLogoutButtonToExit() throws InterruptedException {
	  Thread.sleep(1000);
	
	 Btnclick(lp.getLogoutbtn());
	}
	  
	  @Then("user navigate to loggedout page to confirm")
	  public void userNavigateToLoggedoutPageToConfirm() throws InterruptedException {
	  Thread.sleep(1000);
	  WebElement logouttxt = lp.getLogouttxt();
	  String text1 = logouttxt.getText();
	  Assert.assertEquals(text1, "Click here to login again");


	   
	  
	  
	}
	  
}
	  
	  





	

	
	

	
	




	
	

	
	
	
	
	
	
    



	

	
	








