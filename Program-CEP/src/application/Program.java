package application;

import api.ApiCEP;
import entities.Endereco;
import entities.GSON;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        ApiCEP apiCEP = new ApiCEP();
        GSON gson = new GSON();

        System.out.print("Digite um CEP: ");
        String json = apiCEP.bodyAPI(sc.nextLine());
        Endereco endereco = gson.gson().fromJson(json, Endereco.class);

        System.out.println(endereco);

        /*FileWriter docJson = new FileWriter("endereco.json");
        docJson.write(json);*/




        //docJson.close();
        sc.close();
    }
}
