import java.util.ArrayList;
import java.util.Scanner;

class WeatherRecord {

    private String date;
    private String city;
    private double temperature;
    private int humidity;
    private String condition;

    public WeatherRecord(String date, String city, double temperature, int humidity, String condition) {
        this.date = date;
        this.city = city;
        this.temperature = temperature;
        this.humidity = humidity;
        this.condition = condition;
    }

    public String getCity() {
        return city;
    }

    public void display() {
        System.out.println("--------------------------------");
        System.out.println("Date        : " + date);
        System.out.println("City        : " + city);
        System.out.println("Temperature : " + temperature + " °C");
        System.out.println("Humidity    : " + humidity + "%");
        System.out.println("Condition   : " + condition);
    }
}

public class WeatherObservationLog {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<WeatherRecord> records = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== Weather Observation Log =====");
            System.out.println("1. Add Weather Record");
            System.out.println("2. View All Records");
            System.out.println("3. Search by City");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Date (DD-MM-YYYY): ");
                    String date = sc.nextLine();

                    System.out.print("City: ");
                    String city = sc.nextLine();

                    System.out.print("Temperature (°C): ");
                    double temperature = sc.nextDouble();

                    System.out.print("Humidity (%): ");
                    int humidity = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Weather Condition: ");
                    String condition = sc.nextLine();

                    records.add(new WeatherRecord(date, city, temperature, humidity, condition));

                    System.out.println("Weather record added successfully.");
                    break;

                case 2:

                    if (records.isEmpty()) {
                        System.out.println("No weather records found.");
                    } else {
                        for (WeatherRecord record : records) {
                            record.display();
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter City Name: ");
                    String searchCity = sc.nextLine();

                    boolean found = false;

                    for (WeatherRecord record : records) {
                        if (record.getCity().equalsIgnoreCase(searchCity)) {
                            record.display();
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("No records found for this city.");
                    }

                    break;

                case 4:
                    System.out.println("Thank you for using Weather Observation Log.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
