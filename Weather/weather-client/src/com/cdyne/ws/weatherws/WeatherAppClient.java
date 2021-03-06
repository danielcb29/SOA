package com.cdyne.ws.weatherws;
import javax.swing.*;
public class WeatherAppClient {
		private static Weather service = new Weather();
		private static WeatherSoap port = service.getWeatherSoap();
		
		public static void main(String[] args){
			String zipcode = JOptionPane.showInputDialog("Zip Code In");
			System.out.println(zipcode);
			WeatherReturn wt = getCityWeatherByZIP(zipcode);
			System.out.println("TEMPERATURA");
			System.out.println(wt.getTemperature());
			
		}
		
		private static ArrayOfWeatherDescription getWeatherInformation(){
			return port.getWeatherInformation();
		}
		
		private static ForecastReturn getCityForecastByZIP(String zip){
			return port.getCityForecastByZIP(zip);
		}
		
		private static WeatherReturn getCityWeatherByZIP(String zip){
			return port.getCityWeatherByZIP(zip);
		}
}
