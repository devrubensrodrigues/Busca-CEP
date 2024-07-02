package entities;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo {

    public void gerarArquivo(Endereco endereco) {

        try {
            //Revisão de código 02/07 --------------------------------
            FileWriter fr = new FileWriter(endereco.getCep() + ".json");
            Gson gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            fr.write(gson.toJson(endereco));
            fr.close();
        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
