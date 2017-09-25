/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6;

/**
 *
 * @author Ardelya
 */
public class lat3 {
    public static void main (String [] args){
        int nilai [][] = new int [2][3];
        nilai [0][0] = 85;
        nilai [0][1] = 81;
        nilai [0][2] = 78;
        nilai [1][0] = 65;
        nilai [1][1] = 73;
        nilai [1][2] = 71;
        String mp[]={"RPL", "PBO"};
        double rata[] = new double[nilai.length];
        for (int i=0; i<nilai.length; i++){
            for (int j=0; j<nilai[0].length; j++){
                rata[i]+=nilai [i][j];
            }
        rata[i]/=nilai[0].length;
        }
        System.out.println("Nilai mata pelajaran\n");
        System.out.println("MK\tMinggu2\tMinggu3\tRata-rata");
        for (int i=0; i<nilai.length; i++){
            System.out.println(mp[i]+"\t");
        for (int j=0; j<nilai[0].length; j++){
        }
        System.out.println(rata[i]+"\n");}
    }
}
