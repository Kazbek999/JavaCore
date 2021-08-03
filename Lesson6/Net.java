package LessonJS6;

import okhttp3.*;
import java.lang.*;
import java.io.IOException;


public class Net {
    public static final String API_KEY_PARAM = "apikey";
    public static final String API_KEY = "ZAtrOJSe6kpb1Q8sCtSwjcPvtoqYp0dB";
    public static final String CURRENT_TOWN_KEY = "295212";
    public static final String WEATHER_URL = "https://dataservice.accuweather.com/forecasts/v1/daily/5day/" + CURRENT_TOWN_KEY;

    public static void main(String[] args) throws IOException {
        HttpUrl.Builder urlBuilder = HttpUrl.parse(WEATHER_URL).newBuilder();
        urlBuilder.addQueryParameter(API_KEY_PARAM, API_KEY);

        HttpUrl httpUrl = urlBuilder.build();

        Request.Builder requestBuilder = new Request.Builder();

        Request request = requestBuilder
                .get()
                .url(httpUrl)
                .build();

        OkHttpClient client = new OkHttpClient();

        Call call = client.newCall(request);

        Response response = call.execute();

        System.out.println(response.body().string());
    }
}
