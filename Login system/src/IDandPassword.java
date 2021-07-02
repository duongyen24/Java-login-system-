import java.util.HashMap;

public class IDandPassword {
	
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPassword(){
		logininfo.put("yen","123");
		logininfo.put("yen1","1234");
		logininfo.put("yen2","1235");
		
	}
	
	//create method to call logininfo
	protected HashMap getLogininfo() {
		return logininfo;
	}
}
