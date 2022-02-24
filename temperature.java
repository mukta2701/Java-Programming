//Write a Java program to change temperature from Celsius to Fahrenheit

class celsiustofahrenheit {
    public static void main(String[] args)
    {
        // initialising
        double celsius = 10.0, fahrenheit = 0.0;
        
        // formula for conversion
        fahrenheit = (celsius * 1.8) + 32;
        System.out.println(" Temperature in fahrenheit is:"+ fahrenheit);
    }
}