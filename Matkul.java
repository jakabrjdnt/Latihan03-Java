
package oopdedechan;

public class Matkul {
    private String nama;
    private int sks;
    
    Dosen dsfisika = new Dosen();
    Dosen dskimiaa = new Dosen();
    Dosen dsmatems = new Dosen();
    
    protected Matkul(){
        
    }
    
    protected void setNama(String nama){
        this.nama = nama;
    }
    protected void setSKS(int sks){
        this.sks = sks;
    }
    protected String getNama(){
        return nama;
    }
    protected int getSKS(){
        return sks;
    }
}
