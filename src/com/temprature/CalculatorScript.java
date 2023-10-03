package com.temprature;

import java.util.Scanner;

public class CalculatorScript {

	public static void main(String[] args) {

		       Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the temperature value: ");
		        double temperature = scanner.nextDouble();

		        System.out.print("Enter the original unit (C for Celsius, F for Fahrenheit, K for Kelvin): ");
		        char unit = scanner.next().toUpperCase().charAt(0);

		        switch (unit) {
		            case 'C':
		                System.out.printf("Fahrenheit: %.2f\n", celsiusToFahrenheit(temperature));
		                System.out.printf("Kelvin: %.2f\n", celsiusToKelvin(temperature));
		                break;
		            case 'F':
		                System.out.printf("Celsius: %.2f\n", fahrenheitToCelsius(temperature));
		                System.out.printf("Kelvin: %.2f\n", fahrenheitToKelvin(temperature));
		                break;
		            case 'K':
		                System.out.printf("Celsius: %.2f\n", kelvinToCelsius(temperature));
		                System.out.printf("Fahrenheit: %.2f\n", kelvinToFahrenheit(temperature));
		                break;
		            default:
		                System.out.println("Invalid unit.");
		                break;
		        }
		    }

		    public static double celsiusToFahrenheit(double celsius) {
		        return (celsius * 9/5) + 32;
		    }

		    public static double celsiusToKelvin(double celsius) {
		        return celsius + 273.15;
		    }

		    public static double fahrenheitToCelsius(double fahrenheit) {
		        return (fahrenheit - 32) * 5/9;
		    }

		    public static double fahrenheitToKelvin(double fahrenheit) {
		        return celsiusToKelvin(fahrenheitToCelsius(fahrenheit));
		    }

		    public static double kelvinToCelsius(double kelvin) {
		        return kelvin - 273.15;
		    }

		    public static double kelvinToFahrenheit(double kelvin) {
		        return celsiusToFahrenheit(kelvinToCelsius(kelvin));
		    }
		}
