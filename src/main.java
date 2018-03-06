import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.*;
public class main {

	public static void main(String[] args) throws InterruptedException {

		//		WebDriver driver = new ChromeDriver();
		//		driver.get("http://www.google.com");
		//		driver.findElement(By.id("lst-ib")).sendKeys("ynet");
		//		driver.findElement(By.name("btnK")).click();
		//		driver.findElement(By.linkText("ynet - חדשות, כלכלה, ספורט, בריאות")).click();

		//		WebDriver driver= new ChromeDriver();
		//		driver.get("file:///C:/ClassWebTeast/ClassWebTeast.html");
		//		Select Web= new Select(driver.findElement(By.name("Mobile")));
		//		Scanner input = new Scanner(System.in);
		//		String option;
		//		String Answer;
		//		do {
		//			System.out.println("select option");
		//			option=input.next();
		//			Web.selectByValue(option);
		//			System.out.println("are you want to select another option yes or no");
		//			Answer=input.next();

		//	}while(Answer.equals("yes"));
		//		System.out.println("Thank you");

		//		WebDriver driver = new ChromeDriver();
		//		driver.get("http://www.google.com");
		//		driver.findElement(By.id("lst-ib")).sendKeys("שופרסל");
		//		driver.findElement(By.name("btnK")).click();
		//		driver.findElement(By.linkText("שופרסל עמוד הבית")).click();
		//		driver.findElement(By.linkText("הרשמה")).click();
		//		driver.findElement(By.id("ctl00_PlaceHolderMain_ucMain_txtFirstName_text")).sendKeys("רימון");
		//		driver.findElement(By.id("ctl00_PlaceHolderMain_ucMain_txtLastName_text")).sendKeys("פברקר");
		//		driver.findElement(By.id("ctl00_PlaceHolderMain_ucMain_txtID_text")).sendKeys("314438321");
		//		driver.findElement(By.id("ctl00_PlaceHolderMain_ucMain_ddlyear_Input")).sendKeys("1993");
		//		driver.findElement(By.id("ctl00_PlaceHolderMain_ucMain_ddlMonth_Input")).sendKeys("אוקטובר");
		//		driver.findElement(By.id("ctl00_PlaceHolderMain_ucMain_ddlDay_Input")).sendKeys("5");
		//		WebElement radio = driver.findElement(By.id("ctl00_PlaceHolderMain_ucMain_rbMale"));
		//		radio.click();
		//		driver.findElement(By.id("ctl00_PlaceHolderMain_ucMain_txtEmail_text")).sendKeys("rimonp3@gmail.com");
		//		driver.findElement(By.id("ctl00_PlaceHolderMain_ucMain_txtPassword_text")).sendKeys("123456789");
		//		driver.findElement(By.id("ctl00_PlaceHolderMain_ucMain_txtPasswordConfirm_text")).sendKeys("123456789");
		//		driver.findElement(By.id("ctl00_PlaceHolderMain_ucMain_ddlPhoneHome_Input")).sendKeys("054");
		//		driver.findElement(By.id("ctl00_PlaceHolderMain_ucMain_txtPhoneHome_text")).sendKeys("2143099");
		//		driver.findElement(By.id("ctl00_PlaceHolderMain_ucMain_litNext")).click();

		//		WebDriver driver = new ChromeDriver();
		//		driver.get("http://www.google.com");
		//		driver.findElement(By.id("lst-ib")).sendKeys("fullgaz");
		//		driver.findElement(By.name("btnK")).click();
		//		driver.findElement(By.linkText("פול גז - כל מה שגז. אופנועים, קטנועים ודו-גלגלי")).click();
		//		driver.findElement(By.linkText("פורום")).click();
		//		driver.findElement(By.linkText("הרשמה")).click();
		//		driver.findElement(By.id("regusername")).sendKeys("rimon");
		//		driver.findElement(By.id("password")).sendKeys("0542143099");
		//		driver.findElement(By.id("passwordconfirm")).sendKeys("0542143099");
		//		driver.findElement(By.id("email")).sendKeys("rimonp3@gmail.com");
		//		driver.findElement(By.id("emailconfirm")).sendKeys("rimonp3@gmai.com");
		//		driver.findElement(By.id("humanverify")).sendKeys("ירושלים");
		//		driver.findElement(By.id("cfield_8")).sendKeys("מכונית");
		//		driver.findElement(By.id("cfield_9")).sendKeys("1940");
		//		driver.findElement(By.id("bd_month")).sendKeys("אוקטובר");
		//		driver.findElement(By.id("bd_day")).sendKeys("5");
		//		driver.findElement(By.id("bd_year")).sendKeys("1993");
		//		driver.findElement(By.id("showbirthday")).sendKeys("הצגת גיל ותאריך לידה מלא");
		//		driver.findElement(By.id("referrerfield_ctrl")).sendKeys("חבר");
		//		Select Web= new Select(driver.findElement(By.id("sel_timezoneoffset")));
		//		Scanner input = new Scanner(System.in);
		//		String time;
		//		String Answer;
		//		do {
		//			System.out.println("select time zone");
		//			time=input.next();
		//			Web.selectByValue(time);
		//			System.out.println("are you want to select another time zone yes or no");
		//			Answer=input.next();
		//		}while(Answer.equals("yes"));
		//		Select Web1= new Select(driver.findElement(By.id("sel_dst")));
		//		String time1;
		//		String Answer1;
		//		do {
		//			System.out.println("Select the Daylight Saving Time option");
		//			time1=input.next();
		//			Web.selectByValue(time1);
		//			System.out.println("are you want to Select the Daylight Saving Time option yes or no");
		//			Answer1=input.next();
		//		}while(Answer1.equals("yes"));
		//		
		//		WebElement CheckA = driver.findElement(By.id("cb_adminemail"));
		//		CheckA.click();
		//		WebElement CheckB = driver.findElement(By.id("cb_showemail"));
		//		CheckB.click();
		//		WebElement CheckD = driver.findElement(By.id("cb_rules_agree"));
		//		CheckD.click();
		//		driver.findElement(By.className("button")).click();

		//		WebDriver st=new ChromeDriver();
		//		st.get ("https://www.google.co.il");
		//		WebElement textBox=st.findElement(By.id("lst-ib"));
		//		WebElement buttonCreate=st.findElement(By.name("btnK"));
		//		Actions builder = new Actions(st);
		//		Action myActions = builder.moveToElement(textBox).click().keyDown(textBox, Keys.SHIFT).sendKeys(textBox,"hello")
		//				.keyUp(textBox, Keys.SHIFT).moveToElement(buttonCreate).click().build();
		//		myActions.perform();

		//		WebDriver st=new ChromeDriver();
		//		st.get ("https://www.facebook.com/");
		//		WebElement email = st.findElement(By.id("email"));
		//		WebElement Password = st.findElement(By.id("pass"));
		//		WebElement LogIn = st.findElement(By.id("loginbutton"));
		//		Actions builder = new Actions(st);
		//		Action myActions = builder.moveToElement(email).click().sendKeys(email,"rimonp3@gmail.com")
		//				.moveToElement(Password).click().sendKeys(Password,"852258987").moveToElement(LogIn).click().build();
		//		myActions.perform();
		//		if(st.findElement(By.xpath("//*[@id=\"u_r_2\"]/input[2]")).isEnabled()==true)
		//		{
		//			System.out.println("good");
		//		}

		//		WebDriver mail=new ChromeDriver();
		//		mail.get("http://www.gmail.com");
		//		mail.findElement(By.id("identifierId")).sendKeys("rimonp3@gmail.com");
		//		mail.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		//		Thread.sleep(2000);
		//		mail.findElement(By.name("password")).sendKeys("852258987");
		//		mail.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
		//		Thread.sleep(5000);
		//		if(mail.findElement(By.xpath("//*[@id=\":5m\"]/div/div")).isEnabled()==true)
		//		{
		//			WebElement compose=mail.findElement(By.xpath("//*[@id=\":5m\"]/div/div"));
		//			Actions builder=new Actions(mail);
		//			Action myAction=builder.moveToElement(compose).click().build();
		//			myAction.perform();
		//		}
		//		Thread.sleep(2000);
		//		mail.findElement(By.name("to")).sendKeys("cartman288@gmail.com");
		//		Thread.sleep(5000);
		//		mail.findElement(By.xpath("//*[@id=\":an\"]")).sendKeys("Yoo MF");
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys("hi");
		//		mail.findElement(By.id(":a8")).click();	





		//	2	WebDriver mail=new ChromeDriver();
		//		mail.get("http://www.gmail.com");
		//		mail.findElement(By.id("identifierId")).sendKeys("rimonp3@gmail.com");
		//		mail.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		//		Thread.sleep(2000);
		//		mail.findElement(By.name("password")).sendKeys("852258987");
		//		mail.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
		//		Thread.sleep(5000);
		//		if(mail.findElement(By.xpath("//*[@id=\":5m\"]/div/div")).isEnabled()==true)
		//		{
		//			WebElement compose=mail.findElement(By.xpath("//*[@id=\":5m\"]/div/div"));
		//			Actions builder=new Actions(mail);
		//			Action myAction=builder.moveToElement(compose).click().build();
		//			myAction.perform();
		//		}
		//		Thread.sleep(2000);
		//		mail.findElement(By.name("to")).sendKeys("adibibi14@gmail.com");
		//		Thread.sleep(5000);
		//		mail.findElement(By.xpath("//*[@id=\":an\"]")).sendKeys("Yoo MF");
		//		
		//		
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys("WebDriver mail=new ChromeDriver();");
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys(Keys.ENTER);
		//		
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys("mail.get(\"http://www.gmail.com\");");
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys(Keys.ENTER);
		//		
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys("mail.findElement(By.id(\"identifierId\")).sendKeys(\"rimonp3@gmail.com\");");
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys(Keys.ENTER);
		//		
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys("mail.findElement(By.xpath(\"//*[@id=\\\"identifierNext\\\"]/content/span\")).click();");
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys(Keys.ENTER);
		//		
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys("Thread.sleep(2000);");
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys(Keys.ENTER);
		//
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys("mail.findElement(By.name(\"password\")).sendKeys(\"Your.Mom\");\"");
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys(Keys.ENTER);
		//		
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys("mail.findElement(By.xpath(\"//*[@id=\\\"passwordNext\\\"]/content/span\")).click();\"");
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys(Keys.ENTER);
		//		
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys("Thread.sleep(5000);");
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys(Keys.ENTER);
		//		
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys("if(mail.findElement(By.xpath(\"//*[@id=\\\":5m\\\"]/div/div\")).isEnabled()==true)");
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys(Keys.ENTER);
		//		
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys("{");
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys(Keys.ENTER);
		//		
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys("WebElement compose=mail.findElement(By.xpath(\"//*[@id=\\\":5m\\\"]/div/div\"));");
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys(Keys.ENTER);
		//		
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys("Action myAction=builder.moveToElement(compose).click().build();");
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys(Keys.ENTER);
		//		
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys("myAction.perform();");
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys(Keys.ENTER);
		//		
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys("}");
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys(Keys.ENTER);
		//		
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys("Thread.sleep(2000);");
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys(Keys.ENTER);
		//		
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys("mail.findElement(By.name(\"to\")).sendKeys(\"adibibi14@gmail.com\");");
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys(Keys.ENTER);
		//		Thread.sleep(2000);
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys("Thread.sleep(5000);");
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys(Keys.ENTER);
		//		Thread.sleep(2000);
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys("mail.findElement(By.xpath(\"//*[@id=\\\":an\\\"]\")).sendKeys(\"Yoo MF\")");
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys(Keys.ENTER);
		//		
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys("mail.findElement(By.xpath(\"//*[@id=\\\":bl\\\"]\")).sendKeys(\"WebDriver mail=new ChromeDriver();\");");
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys(Keys.ENTER);
		//		
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys("............");
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys(Keys.ENTER);
		//		
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys("mail.findElement(By.id(\":a8\")).click();");
		//		mail.findElement(By.xpath("//*[@id=\":bl\"]")).sendKeys(Keys.ENTER);
		//
		//		mail.findElement(By.id(":a8")).click();	


		//1//
//		Scanner input = new Scanner (System.in);
//		System.out.println("enter a number");
//		int n1,n2,sum;	
//		System.out.println();
//		n1=input.nextInt();
//		n2=input.nextInt();
//		try {
//			sum=n1/n2;
//			System.out.println(sum);
//		}
//		catch(ArithmeticException e) {
//			System.out.println(e.getMessage());
//		}
//		System.out.println("Error");


		//3//
//		int [] arr = new int [5];
//		Scanner input = new Scanner (System.in);
//		int i=0;
//		try {
//			do {
//				System.out.println("Enter a number");
//				arr[]input.nextInt();
//			}
//			while(arr[i++]>=0);
//		}
//		catch{ (ArryIndexOutOfBuondExcption)
//		}
		
		
	}
}



