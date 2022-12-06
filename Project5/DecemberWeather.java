public class DecemberWeather
{
    public enum WeatherSystem{SUNNY, WINDY, CLOUDY, SNOWSTORM, BLIZZARD}
    private String date;
    private int tempurature;
    private WeatherSystem forecast;
    public DecemberWeather(String d, int t, WeatherSystem s){
        this.date=d;
        this.tempurature=t;
        this.forecast=s;
    }
    public String getDate(){
        return this.date;
    }
    public int getTempurature(){
        return this.tempurature;
    }
    public WeatherSystem getForecast(){
        return this.forecast;
    }
    public void printInfo(){
        System.out.println("Here's the whether for" + this.date + ":");
        System.out.println("-------------------------------------------------------------");
        System.out.println("It will be " + this.tempurature + " and " + this.forecast + ".");
        System.out.println("-------------------------------------------------------------");
    }
}