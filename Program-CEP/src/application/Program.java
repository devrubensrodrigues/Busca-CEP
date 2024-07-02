package application;

import api.ApiCEP;
import entities.Endereco;
import entities.GeradorDeArquivo;

import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        ApiCEP apiCEP = new ApiCEP();
        GeradorDeArquivo gerarArquivo = new GeradorDeArquivo();

        try {
            System.out.print("Digite um CEP: ");
            Endereco endereco = apiCEP.bodyAPI(sc.nextLine());

            System.out.println(endereco);

            gerarArquivo.gerarArquivo(endereco);
        } catch(RuntimeException e) {
            System.out.println(e);
            System.out.println("Finalizando a aplicação");
        }
        sc.close();
    }
}

//Revisão de código 01/07-------------------------------------------
//Endereco endereco = gson.gson().fromJson(json, Endereco.class);
