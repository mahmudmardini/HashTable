package HashTable2;

public class hashTable {
	private int tableSize, newTableSize, size=0;
	String[] key, newKey;
	Object[] table, newTable;
	
	
	public hashTable(int t){ // Constructor Fonksiyon
		tableSize = t;
		table = new Object[tableSize]; // tabloyu oluşturması
		key = new String[tableSize];  //  Anahtarları tutmak için bir dizi oluşturması..

	}
	
	
	public void insert(String k, Object d ) { // ekleme fonksiyonu
 		
		int j =0; 			
 			while(true) {
				
			if(table[h(k,j)] == null) {  
				
				table[h(k,j)] = d; // değer eklemek
				size++;				
				key[h(k,j)] = k;
				System.out.println(d + " EKLENDİ " + "Anahtarı: " + k);
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
		int j =0; 			 
		if(!isEmpty()) {		// tablo boş ise kodu çalıştırmaz.
		while(true) {
			if( key[h(k,j)] == k) { // girildiği anahtara göre indexlemesi
				
				return table[h(k,j)]; // anahtara göre bulunduğu değeri dönürülmesi
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
	
	
	private void reHash(String k) { /////*******************//////////////////**********//////////////////
		int asal = 23;
 		newTableSize = asal;
 		newTable = new Object[newTableSize];
 		newKey = new String[newTableSize];
  		
	}
	
	
	
	public void show() {
		
		for(int i =0; i< tableSize;i++) {
			System.out.println("index "+ i + ": " + table[i] + "                    Key = " + key[i]);
						
		}
	}
	
	
	
	 int h(String k) {
		 int hValue =0;
		for(int i=0; i< k.length();i++) {
			
			hValue += (int)k.charAt(i) * 13^i;
			
			}
		
		return hValue % tableSize;
	}

	 
	 
	 int h(String k, int i) {	
		 
		 int hValue =0;
		 
		 hValue = h(k) + 3*i + i*i; // 1. hash fonksiyon dan çıkan değer için (h(k) + C*i + i^2) işlemi..
		 
		return hValue % tableSize; 
		
	}
	 
	 
 	 int newHash(String k) {
 		 int hValue =0;
 		for(int i=0; i< k.length();i++) {
 			
 			hValue += (int)k.charAt(i) * 13^i;
 			
			}
		
 		return hValue % newTableSize;
 	}
 
 	 
 	 
 	 int newHash(String k, int i) {	
 		 
 		 int hValue =0;
 		 
 		 hValue = newHash(k) + 3*i + i*i;
 		 
 		return hValue % newTableSize;
 		
 	}
	 
	 
	  boolean isFull() {
		  return size == tableSize;
	  }
	  
	  boolean isEmpty() {
		  return size == 0;
	  }
	
}
