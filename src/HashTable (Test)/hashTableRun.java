package HashTable2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class hashTableRun {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\mahmo\\eclipse-workspace\\HashTableOdev\\src\\hashTable\\kayit_dosyasi.txt");
		BufferedReader br = new BufferedReader(new FileReader(file)); // Verilerin Okuması
		
		hashTable h1= new hashTable(502617); // Hash Tablosu oluşturması
		
		
		  String[] data = new String[500000]; 
		  String[][] dataDetails = new String[500000][3]; 
		  String dataReader;
		  int i=0;
		  
 		  while ((dataReader = br.readLine()) != null) { // dosyadaki verilerin okuma döngüsü
 			  data[i] = dataReader; // verilerin satırları tutması
 			  
 			  String[] values = dataReader.split(","); // satırdaki verilerin ayırması için 3 uzunluklu bir dizi oluşturması
 			  for(int j=0;j<3;j++) 
 				  dataDetails[i][j] = values[j]; // satırdaki verilrein 2 boyutlu bir dizide tutması
 			  
 			  i++;
 		  }
 		  
 		  for(i=0;i<data.length;i++) {
 			  h1.insert(dataDetails[i][1], Long.parseLong(dataDetails[i][0])); // verileri ad'a göre indiksleyip numaraları depolanması
		  }
	    
		  /*
 		h1.insert("ama", 1);
 		h1.insert("şma", 2);
		h1.insert("fma", 3);
  		h1.insert("kma", 4);
 		h1.insert("hma", 5);
 		h1.insert("uma", 6);
 		h1.insert("lma", 7);
 		h1.insert("eryery", 8);
 		h1.insert("tyekjshdc", 9);
 		h1.insert("5644651asdffa", 10);
		*/
 		
	//	h1.show();
		System.out.println(h1.search("luascojuei")); //  hduodqyzwe anahtarlı elemanı araması
  		System.out.println(h1.delete("luascojuei")); //  hduodqyzwe anahtarlı elemanı silmesi
		System.out.println(h2.delete("hduodqyzwe")); //  hduodqyzwe anahtarlı elemanı sildikten sonra bulunmayacaktır..
	}

}
