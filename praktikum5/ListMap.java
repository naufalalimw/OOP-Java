// ListMap.java
import java.util.List;
import java.util.ArrayList;

class ListMap<K, V> implements Map<K, V> {
    private ListElement first;
  
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
      private int length() {
        if (this.next == null){
          return 1;
        } else {
          return 1 + this.next.length();
        }
      }
  
      /**
       * HINTED METHOD (Boleh dihilangkan jika tidak digunakan)
       * Mengembalikan ListElement yang terletak pada ujung rantai ListElement
       * Mungkin diperlukan ketika menambahkan elemen yang belum terdapat pada map. :)
       */
      private ListElement getLast() {
        if (this.next == null){
          return this;
        } else {
          return this.next.getLast();
        }
      }
    }
  
    /**
     * Constructor ListMap
     * Set first = null
     */
    public ListMap() {
      first = null;
    }
  
    /**
     * Menambahkan (key, value) ke dalam ListMap jika key belum terdapat pada map.
     * Melakukan overwrite jika sudah terdapat elemen dengan key yang sama.
     */
    public void add(K key, V value) {
      if (size() == 0){
        ListElement nl = new ListElement(key, value);
        first = nl;
      } else {
        //int i = 0;
        ListElement trueFirst = first;
        while(first != null){
          //i++;
          //System.out.println(i);
          if(first.key.equals(key)){
            first.value = value;
          } else {
            first = first.next;
          }
        }
        if (first == null){
          trueFirst.getLast().next = new ListElement(key, value);
        }
  
        first = trueFirst;
      }
    }
  
    /**
     * Mengembalikan value yang tersimpan untuk key tertentu pada map
     * Mengembalikan null apabila map tidak mengandung key masukan.
     */
    public V get(K key) {
      ListElement tempL;
      ListElement firstStat = first;
      V tempV = null;
      if (firstStat == null){
        return null;
      }else if (first == null){
        return null;
      } else if (first.key.equals(key)){
         return first.value;
      } else {
        tempL = first;
        first = first.next;
        tempV = get(key);
        first = tempL;
        return tempV;
      }
    }
  
    /**
     * Menghitung jumlah elemen yang ada pada map
     */
    public int size() {
      if (first == null){
        return 0;
      } else {
        return first.length();
      }
    }
  }