import java.util.Scanner; 
import java.io.*;  
class filesafity   
{   
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz"; 	
	public static String res1="",res2="";
    public static String encryptData(String msg, int key)   
    {   
       
        msg = msg.toLowerCase();   
        String encryptStr = "";  
        for (int i = 0; i < msg.length(); i++)   
        {   
             
            int char_index = ALPHABET.indexOf(msg.charAt(i));   
            int encryptPos = (key + char_index) % 26;   
            char encryptChar = ALPHABET.charAt(encryptPos);     
            encryptStr += encryptChar;   
		}
         try{
		
			FileWriter fw =new FileWriter("raj.txt");
		
			fw.write(encryptStr);
			fw.close();
		}
		catch(IOException e){
		e.printStackTrace();
		}
          
      
	
	return encryptStr;
	}

    public static String decryptData(String msg, int key)   
    {   
       
        msg = msg.toLowerCase();   
        String decryptStr = "";   
        for (int i = 0; i < msg.length(); i++)   
        {   
            int char_index = ALPHABET.indexOf(msg.charAt(i));    
            int decryptPos = (char_index - key) % 26;     
            if (decryptPos < 0){   
                decryptPos = ALPHABET.length() + decryptPos;   
            }   
            char decryptChar = ALPHABET.charAt(decryptPos);   
            decryptStr += decryptChar;   
         
        
    }  100
	return decryptStr;
		
	}
    public static void main(String[] args)   
    {     
		
        Scanner sc = new Scanner(System.in);   
        System.out.println("Enter a string for encryption using Caesar Cipher: ");   
        String msg = sc.nextLine();   
          
        System.out.println("Enter the value by which each character in the plaintext message gets shifted: ");   
        int key = Integer.valueOf(sc.nextLine());   
         System.out.println("do you want encrypt press :1...decryp press :2");
		 int num=sc.nextInt();
		 if(num==1){
        System.out.println("Encrypted Data ::"+encryptData(msg, key)); 
		 }
		else if( num ==2){
        System.out.println("Decrypted Data:: "+decryptData(encryptData(msg, key), key));   
		}
		else{
			System.out.println("Entere wrong operation");
		}			 
        sc.close();   
    }   
}
