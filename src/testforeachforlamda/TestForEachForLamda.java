/*
 * Project ini dibuat sebagai contoh dan hanya untuk memudahkan para pembaca dan 
 * hanya sebagai bahan belajar. 
 * Dalam project ini penulis akan membantu para pembaca untuk mengenal ForEach pada Java 8
 * ForEach dibuat untuk lamda.
 */
package testforeachforlamda;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Akyong
 */
public class TestForEachForLamda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> namaMahasiswa = new ArrayList<>();
        namaMahasiswa.add("Akyong");
        namaMahasiswa.add("Bobby");
        namaMahasiswa.add("Jeni");
        namaMahasiswa.add("Johan");
        
        namaMahasiswa.forEach(itx->{System.out.println("Nama Mahasiswa -> "+itx);});

        //Using for
        for (int a = 0; a< namaMahasiswa.size(); a++) {
            System.out.println("Nama Mahasiswa -> "+ namaMahasiswa.get(a));
        }
        //Using ForEach
        namaMahasiswa.forEach(itx->{System.out.println("Nama Mahasiswa -> "+itx);});
    }
    
}
