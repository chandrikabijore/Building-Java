package com.chandrika;
import java.io.IOException;

public class Shutdown
{
    public static void main(String[] args)
    {
        Runtime run = Runtime.getRuntime();
        try
        {
            run.exec("shutdown /s");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
