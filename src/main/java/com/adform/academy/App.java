package com.adform.academy;


public class App 
{
    public static void main( String[] args )
    {
        DataReader reader = new DataReader();
        System.out.println(reader.readFromKafka());
    }
}
