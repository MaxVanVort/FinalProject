import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.Scanner;
public class Project5
{
    public enum WeatherSystem{SUNNY, WINDY, CLOUDY, SNOWSTORM, BLIZZARD}
    private String date;
    private int tempurature;
    private WeatherSystem forecast;
    private String message;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the weather tracker for the month of December!"+"\n");
        System.out.println("What day of the month would you like the weather report for? Please submit a number between 1 and 31, such as '17' or '25'.");
        int UserDay=input.nextInt();
    }
    public Project5(String d, WeatherSystem s, int t, String m){
        this.date=d;
        this.tempurature=t;
        this.forecast=s;
        this.message=m;
    }
    public static void weatherForDecember(ArrayList<Project5> list)
    {
        
    }
}