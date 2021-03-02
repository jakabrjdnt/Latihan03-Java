
package oopdedechan;

public class MainProgramme {
    public static void main(String[] args) {
        
        printdata();
    }
    
    static void printdata(){
        Mahasiswa mahasiswa = new Mahasiswa();
        
        mahasiswa.setNama("Jaka Brajadenta");
        mahasiswa.setNIM("1608245");
        
        mahasiswa.alamat.setJalan("Jl. Jatinegara No. 230/125a");
        mahasiswa.alamat.setKota("Bandung");
        mahasiswa.alamat.setKodepos("40272");
        
        mahasiswa.matkulfis.setNama("Fisika Dasar");
        mahasiswa.matkulfis.setSKS(4);
        mahasiswa.matkulfis.dsfisika.setNama("Endi Suhendi");
        mahasiswa.matkulfis.dsfisika.setNIP("112233445566");
        
        mahasiswa.matkulkim.setNama("Kimia Umum");
        mahasiswa.matkulkim.setSKS(3);
        mahasiswa.matkulkim.dskimiaa.setNama("Dadi Rusdiana");
        mahasiswa.matkulkim.dskimiaa.setNIP("221144336655");
        
        mahasiswa.matkulmtk.setNama("Matematika Dasar");
        mahasiswa.matkulmtk.setSKS(2);
        mahasiswa.matkulmtk.dsmatems.setNama("Lilik Hasanah");
        mahasiswa.matkulmtk.dsmatems.setNIP("332211665544");
        
        System.out.println("== DATA MAHASISWA ==");
        System.out.println("Nama    : " + mahasiswa.getNama());
        System.out.println("NIM     : " + mahasiswa.getNIM());
        System.out.println("Alamat  : " + mahasiswa.alamat.getJalan() + ",");
        System.out.println("          " + mahasiswa.alamat.getKodepos() + " " +  mahasiswa.alamat.getKota());
        
        String fisika = mahasiswa.matkulfis.getNama();
        int sksfisika = mahasiswa.matkulfis.getSKS();
        String dosfis = mahasiswa.matkulfis.dsfisika.getNama();
        String dosnif = mahasiswa.matkulfis.dsfisika.getNIP();
        
        String kimiaa = mahasiswa.matkulkim.getNama();
        int skskimiaa = mahasiswa.matkulkim.getSKS();
        String doskim = mahasiswa.matkulkim.dskimiaa.getNama();
        String dosnik = mahasiswa.matkulkim.dskimiaa.getNIP();
        
        String matems = mahasiswa.matkulmtk.getNama();
        int sksmatems = mahasiswa.matkulmtk.getSKS();
        String dosmat = mahasiswa.matkulmtk.dsmatems.getNama();
        String dosnim = mahasiswa.matkulmtk.dsmatems.getNIP();
        
        System.out.println("Matkul dikontrak sebagai berikut: ");
        System.out.println("1. "+fisika+" ("+sksfisika+") - "+dosfis+" (NIP."+dosnif+")");
        System.out.println("1. "+kimiaa+" ("+skskimiaa+") - "+doskim+" (NIP."+dosnik+")");
        System.out.println("1. "+matems+" ("+sksmatems+") - "+dosmat+" (NIP."+dosnim+")");
    }
}
