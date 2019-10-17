/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan36.targetsaldotabungan;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF-01
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         targetTabungan tabung = new targetTabungan();
        tabung.saldo = 3500000;
        tabung.bunga = 8;
        int saldoTarget = 6000000;
        
        tabung.targetBulanan(tabung.saldo, saldoTarget);
    }
    
}
