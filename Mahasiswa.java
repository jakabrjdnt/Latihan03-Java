
package oopdedechan;

public class Mahasiswa {
    private String nim, nama;
    
    Alamat alamat = new Alamat();
    Matkul matkulfis = new Matkul();
    Matkul matkulkim = new Matkul();
    Matkul matkulmtk = new Matkul();
    
    protected Mahasiswa(){
        
    }
    
    protected void setNIM(String nim){
        this.nim = nim;
    }
    protected void setNama(String nama){
        this.nama = nama;
    }
    
    protected String getNIM(){
        return nim;
    }
    protected String getNama(){
        return nama;
    }
}
