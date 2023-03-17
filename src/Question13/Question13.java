package Question13;

import java.util.ArrayList;
import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner scann = new Scanner(System.in);
        list.add(47);
        list.add(37);
        list.add(81);
        list.add(21);
        list.add(66);
        list.add(57);

        yuzdeKac(list);
    }
    public static void yuzdeKac(ArrayList<Integer> array){
        int total=0;
        for(int i =0; i<array.size();i++){
            total += array.get(i);
        }
        for(int i =0; i<array.size();i++){
            double yuzde=((double)array.get(i)/total)*100;
            System.out.println(""+array.get(i)+"  %"+ String.format("%.1f",yuzde));
        }
        System.out.println(""+total+" %100.0");
    }

}
