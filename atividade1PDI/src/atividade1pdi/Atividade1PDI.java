/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade1pdi;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class Atividade1PDI {

    /**
     * @param args the command line arguments
     */
    
    public static int lim;
    
    public static int[][] criaMatriz(Scanner i){
        
        String lixo = i.nextLine();
        //System.out.println(lixo);
        lixo = i.nextLine();
        //System.out.println(lixo);
        
        int linha = i.nextInt();
        int coluna = i.nextInt();
        
        
        int[][] Matriz = new int[linha + 1][coluna + 1];
        
        
        lim = i.nextInt();
        
        for(int x = 0; x<linha; x++){
            for(int y = 0; y<coluna; y++)
            {
                Matriz[x][y] = i.nextInt();
            }
            
        }
        System.out.println("Colunas: "+coluna+" Linhas: "+linha);
        return Matriz;
    }
    public static void salvarImagem(int[][] imagem, String nameFile){
        
        int coluna = imagem[0].length - 1;
        int linha = imagem.length - 1;
        
        try {
        FileWriter fw = new FileWriter(nameFile);
        fw.write("P2");
        fw.write("\n");
        fw.write(Integer.toString(linha));
        fw.write(" ");
        fw.write(Integer.toString(coluna));
        fw.write("\n");
        fw.write(Integer.toString(lim));
        fw.write("\n");
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                    fw.write(imagem[i][j] + " ");
            }
            //fw.write("\n");
        }
        fw.flush();
        } catch (IOException e) {}
    }
    public static void main(String[] args) {
        
        
        
        
        
    }
    
}
