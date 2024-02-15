package com.Projects_1;

import java.util.Scanner;

public class Tic_tac_toe {
    public static void main(String[] args) {
        char[][] box=new char[3][3];
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                box[i][j]=' ';
            }
        }
        Scanner s1=new Scanner(System.in);
        int n=1,r=0,c=0,draw=0;
        System.out.println("Player 1 will use 'X'");
        System.out.println("Player 2 will use 'O'");
        while(n<=9){
            if(n%2!=0 ){
                System.out.println("Enter for 1");
                r=s1.nextInt();
                c=s1.nextInt();
                if(box[r][c]==' ') {
                    box[r][c] = 'X';
                    n++;
                    for(int i=0;i<3;i++){
                        for(int j=0;j<3;j++){
                            System.out.print(box[i][j]+"|");
                        }
                        System.out.println();
                        for(int j=0;j<3;j++){
                            System.out.print("_");
                        }
                        System.out.println();
                    }
                }
                else{
                    System.out.println("Box already filled...Please choose any other box");
                }
                //abhi khatam hone ke thik baad hi tum check karoge conditions
                if(box[r][0]==box[r][1] && box[r][1]==box[r][2]){
                    System.out.println("Player 1 is the winner");
                    draw=1;
                    break;
                }
                if(box[0][c]==box[1][c] && box[1][c]==box[2][c]){
                    System.out.println("Player 1 is the winner");
                    draw=1;
                    break;
                }
                if(box[0][0]==box[1][1] && box[1][1]==box[2][2]){
                    System.out.println("Player 1 is the winner");
                    draw=1;
                    break;
                }
                if(box[2][0]==box[1][1] && box[1][1]==box[0][2] && box[1][1]!=' '){
                    System.out.println("Player 1 is the winner");
                    draw=1;
                    break;
                }
            }
            else{
                System.out.println("Enter for 2");
                r=s1.nextInt();
                c=s1.nextInt();
                if(box[r][c]==' ') {
                    box[r][c] = 'O';
                    n++;
                    for(int i=0;i<3;i++){
                        for(int j=0;j<3;j++){
                            System.out.print(box[i][j]+"|");
                        }
                        System.out.println();
                        for(int j=0;j<3;j++){
                            System.out.print("_");
                        }
                        System.out.println();
                    }
                }
                else{
                    System.out.println("Box already filled...Please choose any other box");
                }
                if(box[r][0]==box[r][1] && box[r][1]==box[r][2]){
                    System.out.println("Player 2 is the winner");
                    draw=1;
                    break;
                }
                if(box[0][c]==box[1][c] && box[1][c]==box[2][c]){
                    System.out.println("Player 2 is the winner");
                    draw=1;
                    break;
                }
                if(box[0][0]==box[1][1] && box[1][1]==box[2][2]){
                    System.out.println("Player 2 is the winner");
                    draw=1;
                    break;
                }
                if(box[2][0]==box[1][1] && box[1][1]==box[0][2] && box[1][1]!=' '){
                    System.out.println("Player 2 is the winner");
                    draw=1;
                    break;
                }
            }
        }
        if(draw==0)
        System.out.println("Draw!!!...Play Again");
    }
}
