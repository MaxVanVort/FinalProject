import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.*;
public class Project5
{
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<DecemberWeather> list=new ArrayList<>();
        weatherForDecember(list);
        System.out.println("Welcome to the December Holiday Weather Tracker!"+"\n");
        System.out.println("Which day in the December Holiday Season (Dec 15-31) would you like to know the weather of? Please input a number, such as 15 or 25, or 0 to quit.");
        int UserDay=input.nextInt();
        if (UserDay>31){
            try {
                System.out.println("Your date isn't recognized: please try again.");
                UserDay = input.nextInt();
            }catch(Exception E){
                System.out.println("Date unrecognized. Ending program.");
            }
        }
        if (UserDay<15){
            try {
                System.out.println("Your date isn't recognized: please try again.");
                UserDay = input.nextInt();
            }catch(Exception E){
                System.out.println("Date unrecognized. Ending program.");
            }
        }
        int i=0;
        while(UserDay != 0) {
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
        System.out.println("Enter another date or 0 to quit: ");
        UserDay = input.nextInt();
        if (UserDay>31){
            try {
                System.out.println("Your date isn't recognized: please try again.");
                UserDay = input.nextInt();
            }catch(Exception E){
                System.out.println("Date unrecognized. Ending program.");
                break;
            }
        }
            if (UserDay<15){
            try {
                System.out.println("Your date isn't recognized: please try again.");
                UserDay = input.nextInt();
            }catch(Exception E){
                System.out.println("Date unrecognized. Ending program.");
            }
        }
        }
    }
    public static void weatherForDecember(ArrayList<DecemberWeather> list)
    {
        DecemberWeather Dec15= new DecemberWeather("December 15th", 40, DecemberWeather.WeatherSystem.WINDY);
        list.add(Dec15);
        DecemberWeather Dec16=new DecemberWeather("December 16th", 39, DecemberWeather.WeatherSystem.SUNNY);
        list.add(Dec16);
        DecemberWeather Dec17=new DecemberWeather("December 17th", 38, DecemberWeather.WeatherSystem.WINDY);
        list.add(Dec17);
        DecemberWeather Dec18=new DecemberWeather("December 18th", 38, DecemberWeather.WeatherSystem.WINDY);
        list.add(Dec18);
        DecemberWeather Dec19=new DecemberWeather("December 19th", 37, DecemberWeather.WeatherSystem.CLOUDY);
        list.add(Dec19);
        DecemberWeather Dec20=new DecemberWeather("December 20th", 33, DecemberWeather.WeatherSystem.SUNNY);
        list.add(Dec20);
        DecemberWeather Dec21=new DecemberWeather("December 21st", 34, DecemberWeather.WeatherSystem.SUNNY);
        list.add(Dec21);
        DecemberWeather Dec22=new DecemberWeather("December 22nd", 32, DecemberWeather.WeatherSystem.WINDY);
        list.add(Dec22);
        DecemberWeather Dec23=new DecemberWeather("December 23rd", 31, DecemberWeather.WeatherSystem.CLOUDY);
        list.add(Dec23);
        DecemberWeather Dec24=new DecemberWeather("December 24th", 32, DecemberWeather.WeatherSystem.SNOWSTORM);
        list.add(Dec24);
        DecemberWeather Dec25=new DecemberWeather("December 25th", 31, DecemberWeather.WeatherSystem.SUNNY);
        list.add(Dec25);
        DecemberWeather Dec26=new DecemberWeather("December 26th", 32, DecemberWeather.WeatherSystem.WINDY);
        list.add(Dec26);
        DecemberWeather Dec27=new DecemberWeather("December 27th", 29, DecemberWeather.WeatherSystem.CLOUDY);
        list.add(Dec27);
        DecemberWeather Dec28=new DecemberWeather("December 28th", 30, DecemberWeather.WeatherSystem.CLOUDY);
        list.add(Dec28);
        DecemberWeather Dec29=new DecemberWeather("December 29th", 29, DecemberWeather.WeatherSystem.BLIZZARD);
        list.add(Dec29);
        DecemberWeather Dec30=new DecemberWeather("December 30th", 32, DecemberWeather.WeatherSystem.SUNNY);
        list.add(Dec30);
        DecemberWeather Dec31=new DecemberWeather("December 31st", 31, DecemberWeather.WeatherSystem.WINDY);
        list.add(Dec31);
    }
}