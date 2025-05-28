/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matriskucultme;

//verilen matrisi iki kat küçültme
public class Matriskucultme {
public static int[][] ikikatkucult(int[][] Matris){
    int satirUzunlugu = Matris.length;
    int sutunUzunlugu = Matris[0].length;
    int yenisatirUzunlugu = satirUzunlugu/2;
    int yenisutunUzunlugu = sutunUzunlugu/2;
    int[][] yeniMatris =new int[yenisatirUzunlugu][yenisutunUzunlugu];
    for(int i=0; i<yenisatirUzunlugu;i++){
        for(int j=0;j<yenisutunUzunlugu;j++){
            int ortalama = (Matris[2*i][2*j]+Matris[2*i][2*j+1]+Matris[2*i+1][2*j]+Matris[2*i+1][2*j+1])/4;
            yeniMatris[i][j]=ortalama;
        }
    }
    return yeniMatris;
}

    public static void main(String[] args) {
        int[][]Matris={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
        };
    int[][] kucukMatris = ikikatkucult(Matris);
        for (int i = 0; i < kucukMatris.length; i++) {
    for (int j = 0; j < kucukMatris[0].length; j++) {
        System.out.print(kucukMatris[i][j] + " ");
    }
    System.out.println();
}

    }

}
