/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gaji;

/**
 *
 * @author TOSHIBA
 */
public class Cetak {
    Pegawai pegawai;
    int gaji;
    int tunjangan;
    int total;

   public Cetak(){

   }
   public Cetak(Pegawai pegawai){
       this.pegawai=pegawai;
   }
   public void hitung(){
       if (this.pegawai.getJabatan()=="staf"){
           tunjangan=(int)(gaji*0.1);
       }else{
           tunjangan=(int)(gaji*0.2);
       }
       total=gaji+tunjangan;
   }
   public void hasil(){
      
   }
}
