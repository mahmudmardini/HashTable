package hashTable;

public class hashTable {

	private int tableSize, newTableSize, size=0;
	String[] key, newKey;
	Object[] table, newTable;
	
	
	public hashTable(int t){ // Constructor Fonksiyon
		tableSize = t;
		table = new Object[tableSize]; // tabloyu oluşturması
		key = new String[tableSize];  //  Anahtarları tutmak için bir dizi oluşturması..

	}
	
	
	public void insert(String k, Object d) { // ekleme fonksiyonu
 		
//		if(size > tableSize * 0.6)
//			reHash(k);  // kodu doğru bir şekilde çalıştıramadığım için durdurdum..
		
		int j =0; 			
 			while(true) {
				
			if(table[h(k,j)] == null) {  
				
				table[h(k,j)] = d; // değer eklemek
				size++;				
				key[h(k,j)] = k;
				System.out.println(d + "    EKLENDİ  " + "Anahtarı: " + k);
				break;
				}
			j++;
			
			if (h(k,j) == h(k,0)) { // aynı index'e geliğinde ekleme işlemi durdurur..
				System.out.println(k + " Anahtarlı değeri eklenemedi!");
				break;
				}
			}
		
	}
	
	
	public Object search(String k) {
		int j = 0; 			 
		if(!isEmpty()) {		// tablo boş ise kodu çalıştırmaz.
		while(true) {
			if( key[h(k,j)] == k) { // girildiği anahtara göre indexlemesi
				
				return table[h(k,j)] + " Elemanı Bulundu.."; // anahtara göre bulunduğu değeri dönürülmesi
				}
			j++;

			if (h(k,j) == h(k,0)) {   // aynı index'e geliğinde ekleme işlemi durdurur..
				return "Değer Bulunmadı";
				
				}
			}
		}else {
			return "Tablo Boştur..";
		}
	}
	
	
	public Object delete(String k) {
		int j =0; 	
		Object data;
		
		if(!isEmpty()) {		// tablo boş ise kodu çalıştırmaz.
		while(true) {
			
			if( key[h(k,j)] == k) { // girildiği anahtara göre indexlemesi
				data = table[h(k,j)]; // anahtara göre bulunduğu değeri tutması
				table[h(k,j)]=null;    // anahtara göre bulunduğu değeri silmesi
				key[h(k,j)] = null;		// değerin anahtarı silmesi
				return "\""+data + "\" Elemanı Silindi..";
				}
			j++;

			if (h(k,j) == h(k,0)) {  // aynı index'e geliğinde ekleme işlemi durdurur..
				return "Değer Bulunmadı";
				}
			}
		}else {
			return "Tablo Boştur..";
		}
		
	}
		
	
	 int h(String k) {
		 int hValue =0;
		for(int i=0; i< k.length();i++) { 
			
			hValue += (int)k.charAt(i) * 13^i; // girildiği anahtarın her harfin acsiideki değeri toplayıp C üzeri i ile çarpması
			
			}
		
		return hValue % tableSize; // değerin modu alınması
	}

	 
	 
	 int h(String k, int i) {	
		 
		 int hValue =0;
		 
		 hValue = h(k) + 3*i + i*i; // 1. hash fonksiyon dan çıkan değer için (h(k) + C*i + i^2) işlemi..
		 
		return hValue % tableSize; // SON HASH DEĞERİ DÖNDÜRÜLMESİ.
		
	}
	 
	 boolean isEmpty() {
		  return size == 0;
	  }
	
	 
	
	/////*******************//////////////////*************************//////////////////
	 
	 
	 					// kodu doğru bir şekilde çalıştıramadığım için durdurdum..
	  /*
	  
	 private void reHash(String k) { // Rehash fonksiyonu  
		 	int asalSayi = tableSize * 2; // Tablo boyutu iki katı arttırması  
		 	for(int i=2; i<asalSayi;i++) { 
		 		if(asalSayi % i == 0) {   // asal sayı olup olmadığını kontrol etlmesi
		 			asalSayi+=1;		  // asal değilse 1 arttırıp tekrar kontrol etmesi
		 			i=2;
		 			}
		 		}
		 	
		 	
	 		newTableSize = asalSayi;
	 		newTable = new Object[newTableSize]; // yeni tablo oluşturması
	 		newKey = new String[newTableSize];	// yeni anahtar dizisi oluşturması
	 		
	 		for(int i=0; i<newTableSize; i++) {
	 		
	 		int j =0; 			
 			while(true) {
				
			if(newTable[h(k,j)] == null) {  
				
				newTable[newHash(k,j)] = table[h(k,j)];	// önceki tablodaki değerleri yeni tabloya aktarılması..
				newKey[newHash(k,j)] = key[h(k,j)];		// önceki tablodaki anahtarları yeni tabloya aktarılması..
				break;
				}
			j++;
	 		
 			}
	 		}
	 		
		}	
	 
 	 
 	 int newHash(String k, int i) {			// yeni hash fonksiyonu oluşturması
 		 
 		 int hValue =0;
 		 
 		 hValue = h(k) + 3*i + i*i;
 		 
 		return hValue % newTableSize;
 		
 	}
 	
 	
	*/
	 
	 
}
