package application;

import api.ApiCEP;
import entities.Endereco;

import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        ApiCEP apiCEP = new ApiCEP();

        System.out.print("Digite um CEP: ");
        Endereco endereco = new Endereco();
        endereco = apiCEP.bodyAPI(sc.nextLine());
        System.out.println(endereco);
        sc.close();
    }
}

//Revisão de código 01/07-------------------------------------------
//Endereco endereco = gson.gson().fromJson(json, Endereco.class);

//Revisão de código -----------------------------------
        /*FileWriter docJson = new FileWriter("endereco.json");
        docJson.write(json);*/