package application;

import api.ApiCEP;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        ApiCEP apiCEP = new ApiCEP();

        System.out.print("Digite um CEP: ");
        String json = apiCEP.bodyAPI(sc.nextLine());
        //System.out.println(json);

        FileWriter docJson = new FileWriter("endereco.json");
        docJson.write(json);

        docJson.close();
        sc.close();
    }
}
