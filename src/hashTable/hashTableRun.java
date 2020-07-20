package hashTable;
import java.io.*;
import java.util.Scanner;
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
		  /*
		  
 		  while ((dataReader = br.readLine()) != null) { // dosyadaki verilerin okuma döngüsü
 			  data[i] = dataReader; // verilerin satırları tutması
 			  
 			  String[] values = dataReader.split(","); // satırdaki verilerin ayırması için 3 uzunluklu bir dizi oluşturması
 			  for(int j=0;j<3;j++) 
 				  dataDetails[i][j] = values[j]; // satırdaki verilrein 2 boyutlu bir dizide tutması
 			  
 			  i++;
 		  }
 		  
 		  // verileri ad'a göre indiksleyip numaralası depolanması
 		  
 		  for(i=0;i<data.length;i++) {
 			  if(dataDetails[i][1] != null){
 			  h1.insert( dataDetails[i][1] ,"Numara: " + dataDetails[i][0] + 
 					  ", Ad-Soyad: "  + dataDetails[i][1] + " " + dataDetails[i][2]);
 			  }
		  }*/
	    
 		  
 		 System.out.println(h1.search("xbchuteuqv")); //  hduodqyzwe anahtarlı elemanı araması
   		System.out.println(h1.delete("xbchuteuqv")); //  hduodqyzwe anahtarlı elemanı silmesi
   		System.out.println(h1.delete("xbchuteuqv")); //  hduodqyzwe anahtarlı elemanı sildikten sonra bulunmayacaktır..
   		
   		
 		// SEARCH ve DELETE fonksiyonları elle girdiğim verilerlelerle çalışıyorlardır ama text file'dan veri çektiğimde 
 		// Ekleme kodu ve indexleme işlemleri doğru bir şekilde çalışmalarına rağmen aradığım verileri bulamıyor
 		// nedeni de ödevi teslimimize çok az zaman kaldığı için ve bu hafta başka 4 dersten ödevlerimiz olduğu için bu problemi 
 		// çeözmeyi yetişemedim..
 		// ancak hash table kodları doğru bir şekilde çalıştıklarını görebilmeniz için aşağıdaki kodu çalıştırabilirsiniz..
  		  
		
  		
  		
  		
  	
  		hashTable h2= new hashTable(502617); // 2. hash tablosu oluşturması
  		
  	  //********* Verilerin eklenmesi **********
  	    
 		h2.insert("ama", 1);
 		h2.insert("şma", 2);
		h2.insert("fma", 3);
  		h2.insert("kma", 4);
 		h2.insert("hma", 5);
 		h2.insert("uma", 6);
 		h2.insert("lma", 7);
 		h2.insert("eryery", 8);
 		h2.insert("tyekjshdc", 9);
 		h2.insert("5644651asdffa", 10);
 		h2.insert("jdsfjsdfbş", 11);
 		h2.insert("akifhlı", 12);
		h2.insert("liksfhiıoa", 13);
  		h2.insert("DSGASDG", 14);
 		h2.insert("DSAGSRE", 15);
 		h2.insert("RTJWJR", 16);
 		h2.insert("REAEHB", 17);
 		h2.insert("REHAEAHB", 18);
 		h2.insert("TYKDTYM", 19);
 		h2.insert("EWb G4EW", 20);
 		h2.insert("fhmgardmfj", 20);
 		h2.insert("pzdofxdlfx", "4913155733,pzdofxdlfx,amcpacdyaf");
 		h2.insert("cfufzdvxml", "4865359596,cfufzdvxml,stjrlixinl");
 		h2.insert("flaeqzpcep", "9362151277,flaeqzpcep,hlowgrmmfu");
 		h2.insert("ujimvufoml", "2435452632,ujimvufoml,erlsipyrzg");
 		h2.insert("qvxvfqbfmj", "5343689442,qvxvfqbfmj,hkdhofanox");
 		h2.insert("ygcelapanf", "1276368188,ygcelapanf,pkwlfskgfy");
 		h2.insert("hduodqyzwe", "7836881542,fhmgardmfj,sylmcczghi");
 		h2.insert("apnmmaxtvs", "1951826353,hduodqyzwe,afgnsncoat");
 		h2.insert("lodcgvqhxj", "9978822724,lodcgvqhxj,zqahboodgn");
 		h2.insert("apkpouhruu", "2737265158,apkpouhruu,nvtppaypda");
 		h2.insert("vrzzrxcjik", "5828671443,vrzzrxcjik,ofxixgjsqu");
 		h2.insert("kbhvisnkqv", "4858549828,kbhvisnkqv,cfmrmucbvj");
 		h2.insert("rtaeqsxrxu", "5112713941,rtaeqsxrxu,wpzauxmzqy");
 		h2.insert("egmejwgsah", "3863897417,egmejwgsah,fxfwyamzuy");
 		
	
 		
 		System.out.println(h2.search("hduodqyzwe")); //  hduodqyzwe anahtarlı elemanı araması
  		System.out.println(h2.delete("hduodqyzwe")); //  hduodqyzwe anahtarlı elemanı silmesi
  		System.out.println(h2.delete("hduodqyzwe")); //  hduodqyzwe anahtarlı elemanı sildikten sonra bulunmayacaktır..
  		
  		
  		
	}

}
