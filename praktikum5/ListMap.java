// ListMap.java
import java.util.List;
import java.util.ArrayList;

class ListMap<K, V> implements Map<K, V> {
    private ListElement first;
    private List<Map<K,V>> mList;
  
    /**
     * Kelas ListElement yang diimplementasikan sebagai InnerClass
     * Anda diperkenankan menambahkan method apabila dirasa perlu
     */
    public class ListElement {
      private K key;
      private V value;
      private ListElement next;
  
      /**
       * Constructor ListElement
       * Set next = null
       */
      public ListElement(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
      }
  
      /**
       * HINTED METHOD (Boleh dihilangkan jika tidak digunakan)
       * Menghitung panjang rantai ListElement yang ada (terhitung dari elemen *ini*)
       * Mungkin diperlukan untuk menghitung size()
       */
    //   private int length() {
    //     // Your code goes here :)
    //   }
  
      /**
       * HINTED METHOD (Boleh dihilangkan jika tidak digunakan)
       * Mengembalikan ListElement yang terletak pada ujung rantai ListElement
       * Mungkin diperlukan ketika menambahkan elemen yang belum terdapat pada map. :)
       */
    //   private ListElement getLast() {
    //     // Your code goes here :)
    //   }
    }
  
    /**
     * Constructor ListMap
     * Set first = null
     */
    public ListMap() {
      mList = new ArrayList<Map<K,V>>();
      first = new ListElement(null, null);
    }
  
    /**
     * Menambahkan (key, value) ke dalam ListMap jika key belum terdapat pada map.
     * Melakukan overwrite jika sudah terdapat elemen dengan key yang sama.
     */
    public void add(K key, V value) {
      ListElement tambah = new ListElement(key, value);
      mList.add((Map<K,V>)tambah);
    }
  
    /**
     * Mengembalikan value yang tersimpan untuk key tertentu pada map
     * Mengembalikan null apabila map tidak mengandung key masukan.
     */
    public V get(K key) {
      V val = null;
      for (int i = 0; i < mList.size(); i++) {
        ListElement l = (ListElement) mList.get(i);
          if (key.equals(l.key)) {
              val = l.value;
          }
      }
      return val;
    }
  
    /**
     * Menghitung jumlah elemen yang ada pada map
     */
    public int size() {
      return mList.size(); }
  }