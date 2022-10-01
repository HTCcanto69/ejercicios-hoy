/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioshoy;

//EJERCICIO: MATRIZ DE 10X1O INGRESADO POR TECLADO MULTIPLIQUE LA DIAGONAL PRIMARIA Y SECUNDARIA
public class ejercicio02 {

    public static void main(String[] args) {
        int [][] matriz = new int [10] [10];
        int totalDiaPri=0;
        
        
        
        
        
      
        int totalDiaSec=0;
               
    int entero =0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j]=++entero;
            }
        }
        imprimir (matriz);
        System.out.println("valores de la diagonal principal");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(i==j){
                    System.out.println(matriz[i][j]);
                    totalDiaPri += matriz[i][j];
                }
                
            }
        }
            int j=(matriz.length)-1;
            System.out.println("valores de la diagonal secundaria");
            for (int i = 0; i < matriz.length; i++) {
               totalDiaSec += matriz[i][j];
                System.out.println(matriz[i][j--]);     
            
            }
        System.out.println("total de la primera diagonal:  "+ totalDiaPri);
        System.out.println("total de la segunda diagonal:  "+ totalDiaSec);
        System.out.println("multiplicacion de la primera con la segunda diagonal:  "+totalDiaPri*totalDiaSec);
    }
        
    public static void imprimir(int [] []matriz ){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                
                System.out.print(matriz[i] [j] + "  ");
            }
            System.out.println(" ");
        }
    }
    
}