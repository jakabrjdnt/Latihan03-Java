
package oopdedechan;

public class Dosen {
    private String nama, nip;
    
    protected Dosen(){
        
    }
    
    protected void setNama (String nama){
        this.nama = nama;
    }
    protected void setNIP (String nip){
        this.nip = nip;
    }
    
    protected String getNama(){
        return nama;
    }
    protected String getNIP(){
        return nip;
    }
}
