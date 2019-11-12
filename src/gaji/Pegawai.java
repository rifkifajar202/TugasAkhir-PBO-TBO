/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gaji;

/**
 *
 * @author TOSHIBA
 */
public class Pegawai {
    private String nip;
    private String nama;
    private int jk;
    private String jabatan;
    private String gaji;

    public Pegawai (String nip, String nama, int jk, String jabatan, String gaji){
        this.nip=nip;
        this.nama=nama;
        this.jk=jk;
        this.jabatan=jabatan;
        this.gaji=gaji;
    }
    public void setNip(String nip){
        this.nip=nip;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public void setJk(int jk){
        this.jk=jk;
    }
    public void setJabatan(String jabatan){
        this.jabatan=jabatan;
    }
    public void setGaji(String gaji){
        this.gaji=gaji;
    }
    public String getNip(){
        return nip;
    }
    public String getNams(){
        return nama;
    }
    public int getJk(){
        return jk;
    }
    public String getJabatan(){
        return jabatan;
    }
    public String getGaji(){
        return gaji;
    }
    
}
