package HashTable;

public class HashTable {

	private int tabloBoyut;
    private int size; 
    private Node[] table;
 
    
    public HashTable(int ts) 
    {
        size = 0;
        tabloBoyut = ts;
        table = new Node[tabloBoyut];
        for (int i = 0; i < tabloBoyut; i++)
            table[i] = null;
    } 
  
    public int arama(String key) 
    {
        int hash = (myhash(key) % tabloBoyut);
        if (table[hash] == null)
            return -1;
        else 
        {
            Node entry = table[hash];
            while (entry != null && !entry.key.equals(key))
                entry = entry.next;
            if (entry == null)
                return -1;
            else
                return entry.deger;
        }
    }

    public void ekleme(String key, int deger) 
    {
    	
        int hash = (myhash( key ) % tabloBoyut);
        if (table[hash] == null)
            table[hash] = new Node(key, deger);
        else 
        {
            Node entry = table[hash];
            while (entry.next != null && !entry.key.equals(key))
                entry = entry.next;
            if (entry.key.equals(key))
                entry.deger = deger;
            else
                entry.next = new Node(key, deger);
        }
        size++;
    }
 
    public void silme(String key) 
    {
        int hash = (myhash( key ) % tabloBoyut);
        if (table[hash] != null) 
        {
            Node prevEntry = null;
            Node entry = table[hash];
            while (entry.next != null && !entry.key.equals(key)) 
            {
                prevEntry = entry;
                entry = entry.next;
            }
            if (entry.key.equals(key)) 
            {
                if (prevEntry == null)
                    table[hash] = entry.next;
                else
                    prevEntry.next = entry.next;
                size--;
            }
        }
    }
    private int myhash(String x )
    {
        int hashVal = x.hashCode();
        System.out.println(hashVal);
        hashVal %= tabloBoyut;
        if (hashVal < 0)
            hashVal += tabloBoyut;
        return hashVal;
    }


    public void hhashTableYazdir()
    {
        for (int i = 0; i < tabloBoyut; i++)
        {
            System.out.print("\nBucket "+ (i) +" : ");
            Node entry = table[i];
            while (entry != null)
            {
                System.out.print(entry.deger +" ");
                entry = entry.next;
            }            
        }
    }

}
