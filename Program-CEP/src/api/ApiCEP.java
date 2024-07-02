package api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entities.Endereco;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiCEP {
    // Revisão de código 01/07------------------------------------------------------------
    public Endereco bodyAPI(String cep) {
        String url = "https://viacep.com.br/ws/" + cep + "/json/";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            //Revisão de código 02/07----------------------------------
            Gson gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();

            return gson.fromJson(response.body(), Endereco.class);
            //-----------------------------------------------------
        } catch(Exception e) {
            throw new RuntimeException("Não consegui encontrar um endereco a partir desse CEP");
        }
    }
}
