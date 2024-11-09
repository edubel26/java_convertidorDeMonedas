import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConvertirAPI {

    public Conversor convertir(String nombreDeMoneda, String nombreDeMonedaACambiar, double enviaMonto){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/eb6a131b032e1b95c9025dee/pair/"+
                nombreDeMoneda+"/"+nombreDeMonedaACambiar+"/"+enviaMonto);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {

            HttpResponse<String> response = null;

            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Conversor.class);

        } catch (Exception e) {
            throw new RuntimeException("No encontre el tipo de cambio de moneda.");
        }
    }

}
