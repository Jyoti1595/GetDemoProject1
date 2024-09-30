package screenshot.test;


import java.util.Date;

public class ADemo {
	
	public static void main(String[] args) {
		
		Date d = new Date();			
		
		String xyz = d.toString();
		
		String str = xyz.replace(":", ":");
		
		
		String path = "C:\\Users\\Vaibhav\\Desktop\\j\\image_" +str+ ".jpg";
		
		System.out.println(path);
		
		
		
	}

}

