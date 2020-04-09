/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum7;

/**
 *
 * @author Vincent/18217042
 */
public class Pesanan {
    private String nama;
    private int durasi;
    private int tipe;
    private boolean status;
    
    public Pesanan(String nama, int durasi, int tipe){
        this.nama=nama;
        this.durasi=durasi;
        this.tipe=tipe;
        this.status=false;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public int getDurasi(){
        return durasi;
    }
    public void setDurasi(int durasi){
        this.durasi=durasi;
    }
    public int getTipe(){
        return tipe;
    }
    public void setTipe(int tipe){
        this.tipe=tipe;
    }
    public boolean getStatus(){
        return status;
    }
    public void setStatus(boolean status){
        this.status=status;
    }
}
