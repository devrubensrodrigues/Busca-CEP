package application;

import api.ApiCEP;

import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        ApiCEP apiCEP = new ApiCEP();

        System.out.print("Digite um CEP: ");
        System.out.println(apiCEP.bodyAPI(sc.nextLine()));

        sc.close();
    }
}
