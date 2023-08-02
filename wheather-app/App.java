import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.Scanner;

public class App {
    private static final String API_KEY = "b6907d289e10d714a6e88b30761fae22";
    private static final String API_BASE_URL = "https://samples.openweathermap.org/data/2.5/forecast/hourly?q=London,us&appid=" + API_KEY;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to the Weather Forecast App!");
        do {
            System.out.println("Choose an option:");
            System.out.println("1. Get weather");
            System.out.println("2. Get Wind Speed");
            System.out.println("3. Get Pressure");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    getWeather();
                    break;
                case 2:
                    getWindSpeed();
                    break;
                case 3:
                    getPressure();
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void getWeather() {
        try {
            JSONObject json = fetchWeatherData();
            if (json != null) {
                JSONArray hourlyForecasts = json.getJSONArray("list");
                System.out.print("Enter the date (yyyy-MM-dd HH:mm:ss format): ");
                Scanner scanner = new Scanner(System.in);
                String targetDate = scanner.nextLine();
                scanner.close();
                for (int i = 0; i < hourlyForecasts.length(); i++) {
                    JSONObject forecast = hourlyForecasts.getJSONObject(i);
                    String forecastDateTime = forecast.getString("dt_txt");
                    if (forecastDateTime.equals(targetDate)) {
                        double temperature = forecast.getJSONObject("main").getDouble("temp");
                        System.out.println("Temperature on " + targetDate + " is: " + temperature + "°C");
                        return;
                    }
                }
                System.out.println("No weather data available for the provided date.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void getWindSpeed() {
        try {
            JSONObject json = fetchWeatherData();
            if (json != null) {
                JSONArray hourlyForecasts = json.getJSONArray("list");
                System.out.print("Enter the date (yyyy-MM-dd HH:mm:ss format): ");
                Scanner scanner = new Scanner(System.in);
                String targetDate = scanner.nextLine();
                scanner.close();
                for (int i = 0; i < hourlyForecasts.length(); i++) {
                    JSONObject forecast = hourlyForecasts.getJSONObject(i);
                    String forecastDateTime = forecast.getString("dt_txt");
                    if (forecastDateTime.equals(targetDate)) {
                        double windSpeed = forecast.getJSONObject("wind").getDouble("speed");
                        System.out.println("Wind Speed on " + targetDate + " is: " + windSpeed + " m/s");
                        return;
                    }
                }
                System.out.println("No weather data available for the provided date.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void getPressure() {
        try {
            JSONObject json = fetchWeatherData();
            if (json != null) {
                JSONArray hourlyForecasts = json.getJSONArray("list");
                System.out.print("Enter the date (yyyy-MM-dd HH:mm:ss format): ");
                Scanner scanner = new Scanner(System.in);
                String targetDate = scanner.nextLine();
                scanner.close();
                for (int i = 0; i < hourlyForecasts.length(); i++) {
                    JSONObject forecast = hourlyForecasts.getJSONObject(i);
                    String forecastDateTime = forecast.getString("dt_txt");
                    if (forecastDateTime.equals(targetDate)) {
                        double pressure = forecast.getJSONObject("main").getDouble("pressure");
                        System.out.println("Pressure on " + targetDate + " is: " + pressure + " hPa");
                        return;
                    }
                }
                System.out.println("No weather data available for the provided date.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static JSONObject fetchWeatherData() {
        try {
            URL url = new URL(API_BASE_URL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();
                return new JSONObject(response.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}