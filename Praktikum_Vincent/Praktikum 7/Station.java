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
public class Station extends Thread{
    private Thread t;
    private String nama;
    private Pesanan[]listPesanan;
    int tipe;
    
    public Station(String nama,Pesanan[] listPesanan,int tipe){
        this.nama=nama;
        this.listPesanan=listPesanan;
        this.tipe=tipe;
    }
    @Override
    public void start(){
        System.out.println(nama+"siap mengambil pesanan");
        if(t==null){
            t=new Thread(this,nama);
        }
        t.start();
    }

    /**
     *
     */
    @Override
    public void run(){
        Pesanan tmp = null;
        boolean kelar=false;
        int i=0;
        System.out.println(nama+"sedang mencari pesanan");
        while(!kelar){
            synchronized(listPesanan){
                for(Pesanan p:listPesanan){
                    if((p.getTipe()==this.tipe) && (!p.getStatus())){
                        tmp=p;
                        p.setStatus(true);
                        break;
                    }
                }
            }

            if(tmp!=null){
                System.out.println(nama+" mengambil pesanan "+tmp.getNama());
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException e){
                    System.out.println(nama+" gagal mengambil pesanan ");
                }
                try {
                    Thread.sleep(tmp.getDurasi()*1000);
                    System.out.println(nama+" telah menyelesaikan pesanan "+tmp.getNama());
                } 
                catch (InterruptedException e) {
                    System.out.println(nama+" gagal menyelesaikan makanan");
                }
            }
            else{
                kelar=true;
            }
        }
    }
}
