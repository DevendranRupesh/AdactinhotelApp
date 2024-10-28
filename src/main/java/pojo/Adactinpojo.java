package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactinpojo  {
	
	//@findby--> for FindElement
	//@findbys --> for findElements
	
	 WebDriver driver;
	
	 public Adactinpojo(WebDriver driver) {//constructor
	 this.driver= driver();
	 PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	 WebElement userName ;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(id="login")
	 WebElement loginbtn;
	
	@FindBy(xpath="//td[text()='Welcome to Adactin Group of Hotels']")
	 WebElement searchtext;
	
	@FindBy(id="location")
	 WebElement location;
	
	@FindBy(id="hotels")
     WebElement hotel ;	
	
	@FindBy(id="room_type")
	 WebElement roomtype;
	
	@FindBy(id="room_nos")
	 WebElement Roomsreqd ;
	
	@FindBy(id="datepick_in")
	 WebElement  chkindate;
	
	@FindBy(id="datepick_out")
	 WebElement chkoutdate;
	
	@FindBy(id="adult_room")
	 WebElement Adultsforroom ;
	
	@FindBy(id="child_room")
	 WebElement childforroom;
	
	@FindBy(id="Submit")
	 WebElement searchbutton;
	
	@FindBy(xpath="//td[text()='Select Hotel ']")
	 WebElement  actuals;
	
	@FindBy(id="radiobutton_0")
	 WebElement radiobtn;
	
	@FindBy(id="continue")
	 WebElement Continuebutton;
	
	@FindBy(xpath="//td[text()='Book A Hotel ']")
	 WebElement actual3;
	
	@FindBy(id="first_name")
	 WebElement fname;
	
	@FindBy(id="last_name")
	 WebElement lname ;
	
	@FindBy(id="address")
	 WebElement address;
	
	@FindBy(id="cc_num")
	 WebElement creditcardno;
	
	@FindBy(id="cc_type")
	 WebElement cc_type;
	
	@FindBy(id="cc_exp_month")
	 WebElement  expirydate;
	
	@FindBy(id="cc_exp_year")
	 WebElement expiryyear;
	
	@FindBy(id="cc_cvv")
	 WebElement cvvno;
	
	@FindBy(id="book_now")
	 WebElement  booknow;
	
	@FindBy(xpath="//td[text()='Booking Confirmation ']")
	 WebElement confirm;
	
	@FindBy(xpath="//input[@id='order_no']")
	 WebElement OrderNumber;
	
	@FindBy(id="my_itinerary")
	 WebElement itinerarybtn;
	
	@FindBy(xpath="//td[text()='Booked Itinerary']")
	WebElement Itineryverify;
	
	@FindBy(xpath="//input[@id='username_show']")
	WebElement checkbox;
	
	@FindBy(xpath="//input[@name='cancelall']")
	WebElement cancelbtn ;
	
	@FindBy(id="logout")
	WebElement logoutbtn;
	
	@FindBy(xpath="//a[text()='Click here to login again']")
	WebElement logouttxt;

	
	public WebElement getLogouttxt() {
		return logouttxt;
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}

	public WebElement getItinerarybtn() {
		return itinerarybtn;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getCancelbtn() {
		return cancelbtn;
	}

	public WebDriver driver() {
		return driver;
	}

	public WebElement getUsername() {
		return userName;
	}

	public WebElement getPassword() {
		return Password;
	}
    public WebElement getLoginbtn() {
		return loginbtn;
	}
    public WebElement getsearchtext() {
		return searchtext;
	}

    public WebElement getLocation() {
		return location;
	}
    public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

    public WebElement getRoomsreqd() {
		return Roomsreqd;
	}

	public WebElement getChkindate() {
		return chkindate;
	}

	public WebElement getChkoutdate() {
		return chkoutdate;
	}



	public WebElement getAdultsforroom() {
		return Adultsforroom;
	}

	

	public WebElement getChildforroom() {
		return childforroom;
	}

	

	public WebElement getSearchbutton() {
		return searchbutton;
	}

	

	public WebElement getActuals() {
		return actuals;
	}

	

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	

	public WebElement getContinuebutton() {
		return Continuebutton;
	}

	

	public WebElement getActual3() {
		return actual3;
	}

	

	public WebElement getFname() {
		return fname;
	}

	

	public WebElement getLname() {
		return lname;
	}

	

	public WebElement getAddress() {
		return address;
	}



	public WebElement getCreditcardno() {
		return creditcardno;
	}

	

	public WebElement getCc_type() {
		return cc_type;
	}

	

	public WebElement getExpirydate() {
		return expirydate;
	}

	
	public WebElement getExpiryyear() {
		return expiryyear;
	}

    public WebElement getCvvno() {
		return cvvno;
	}

	

	public WebElement getBooknow() {
		return booknow;
	}

	

	public WebElement getConfirm() {
		return confirm;
	}

	

	public WebElement getOrderNumber() {
		return OrderNumber;
	}

	

	public WebElement getBtn() {
		return itinerarybtn;
	}
	
	public WebElement getItineryverify() {
		return Itineryverify;
	}

	
	}
	

		

	
		
		

	
	

	

	


