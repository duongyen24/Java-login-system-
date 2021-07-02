/* 
 create 4 screen(4class) that would appear 
 
 -idandpassword
 -login page
 -welcome page
 -main
 
 using hashmap to store id and pw? why?
  
 */


public class Main {

	public static void main(String[] args) {
		//create instance
		
		IDandPassword idandPasswords = new IDandPassword();
		
		
		//pass the method into argument
		LoginPage loginPage = new LoginPage(idandPasswords.getLogininfo());
	}

}
