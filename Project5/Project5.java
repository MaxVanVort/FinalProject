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
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Project5> list=new ArrayList<Project5>();
        System.out.println("Welcome to the December Holiday Weather Tracker!"+"\n");
        System.out.println("Which day in the December Holidy Season (Dec 15-31) would you like to know the weather of? Please input a number, such as 15 or 25.");
        int UserDay=input.nextInt();
        if (UserDay==15){
            list.get(0).printInfo();
        }else if (UserDay==16){
            list.get(1).printInfo();
        }else if (UserDay==17){
            list.get(2).printInfo();
        }else if (UserDay==18){
            list.get(3).printInfo();
        }else if (UserDay==19){
            list.get(4).printInfo();
        }else if (UserDay==20){
            list.get(5).printInfo();
        }else if (UserDay==21){
            list.get(6).printInfo();
        }else if (UserDay==22){
            list.get(7).printInfo();
        }else if (UserDay==23){
            list.get(8).printInfo();
        }else if (UserDay==24){
            list.get(9).printInfo();
        }else if (UserDay==25){
            list.get(10).printInfo();
        }else if (UserDay==26){
            list.get(11).printInfo();
        }else if (UserDay==27){
            list.get(12).printInfo();
        }else if (UserDay==28){
            list.get(13).printInfo();
        }else if (UserDay==29){
            list.get(14).printInfo();
        }else if (UserDay==30){
            list.get(15).printInfo();
        }else if (UserDay==31){
            list.get(16).printInfo();
        }
    }
    public Project5(String d, int t, WeatherSystem s){
        this.date=d;
        this.tempurature=t;
        this.forecast=s;
    }
    public static void weatherForDecember(ArrayList<Project5> list)
    {
        Project5 Dec15= new Project5("December 15th", 40, Project5.WeatherSystem.WINDY);
        list.add(Dec15);
        Project5 Dec16=new Project5("December 16th", 39, Project5.WeatherSystem.SUNNY);
        list.add(Dec16);
        Project5 Dec17=new Project5("December 17th", 38, Project5.WeatherSystem.WINDY);
        list.add(Dec17);
        Project5 Dec18=new Project5("December 18th", 38, Project5.WeatherSystem.WINDY);
        list.add(Dec18);
        Project5 Dec19=new Project5("December 19th", 37, Project5.WeatherSystem.CLOUDY);
        list.add(Dec19);
        Project5 Dec20=new Project5("December 20th", 33, Project5.WeatherSystem.SUNNY);
        list.add(Dec20);
        Project5 Dec21=new Project5("December 21st", 34, Project5.WeatherSystem.SUNNY);
        list.add(Dec21);
        Project5 Dec22=new Project5("December 22nd", 32, Project5.WeatherSystem.WINDY);
        list.add(Dec22);
        Project5 Dec23=new Project5("December 23rd", 31, Project5.WeatherSystem.CLOUDY);
        list.add(Dec23);
        Project5 Dec24=new Project5("December 24th", 32, Project5.WeatherSystem.SNOWSTORM);
        list.add(Dec24);
        Project5 Dec25=new Project5("December 25th", 31, Project5.WeatherSystem.SUNNY);
        list.add(Dec25);
        Project5 Dec26=new Project5("December 26th", 32, Project5.WeatherSystem.WINDY);
        list.add(Dec26);
        Project5 Dec27=new Project5("December 27th", 29, Project5.WeatherSystem.CLOUDY);
        list.add(Dec27);
        Project5 Dec28=new Project5("December 28th", 30, Project5.WeatherSystem.CLOUDY);
        list.add(Dec28);
        Project5 Dec29=new Project5("December 29th", 29, Project5.WeatherSystem.BLIZZARD);
        list.add(Dec29);
        Project5 Dec30=new Project5("December 30th", 32, Project5.WeatherSystem.SUNNY);
        list.add(Dec30);
        Project5 Dec31=new Project5("December 31st", 31, Project5.WeatherSystem.WINDY);
        list.add(Dec31);
    }
    public void printInfo(){
        System.out.println(this.date);
        System.out.println(this.tempurature);
        System.out.println(this.forecast);
    }
}