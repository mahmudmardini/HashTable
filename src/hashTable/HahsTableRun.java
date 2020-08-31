package HashTable;

import java.util.Scanner;

public class HahsTableRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
	        System.out.println("Hash Table\n");
	        System.out.println("Boyutu girin");
	       
	       HashTable ht = new HashTable(scan.nextInt());
	 
	        char ch;
	     
	     
	        do    
	        {
	            System.out.println("Hash Table islemleri\n");
	            System.out.println("1. Ekleme ");
	            System.out.println("2. Silme");
	            System.out.println("3. arama");            
	            int choice = scan.nextInt();  
	            
	            switch (choice)
	            {
	            case 1 : 
	                System.out.println(" key ve degeri giriniz");
	                ht.ekleme(scan.next(), scan.nextInt() ); 
	                break;                          
	            case 2 :                 
	                System.out.println("Silmek istediðiniz key");
	                ht.silme( scan.next() ); 
	                break;                        
	            case 3 : 
	                System.out.println("Aramak istediðiniz  key");
	                System.out.println("deger = "+ ht.arama( scan.next() )); 
	                break;                                   
	            default : 
	                System.out.println("Yanlýþ giriþ \n ");
	                break;   
	            }
	            
	            ht.hhashTableYazdir();  
	 
	            System.out.println("\nDEvam etmek istiyormusunuz (y or n) \n");
	            ch = scan.next().charAt(0);                        
	        } while (ch == 'Y'|| ch == 'y');  

	}

}
