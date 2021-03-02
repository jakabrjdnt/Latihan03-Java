
package oopdedechan;

public class Alamat {
    private String jalan, kota, kodepos;
    
    protected Alamat(){
        
    }
    
    protected void setJalan(String jalan){
        this.jalan = jalan;
    }
    protected void setKota(String kota){
        this.kota = kota;
    }
    protected void setKodepos(String kodepos){
        this.kodepos = kodepos;
    }
    
    protected String getJalan(){
        return jalan;
    }
    protected String getKota(){
        return kota;
    }
    protected String getKodepos(){
        return kodepos;
    }
}
