package com.acc.lkm.maven;

/**
 * Hello world!
 *
 */
import java.util.*;
public class SortLambda 
{
    public static void main( String[] args )
    {
        List<String> strings = new ArrayList();
        strings.add("Python");
        strings.add("Java");
        strings.add("ASP.NET");
        strings.add("Salesforce");
        strings.add("Generative AI");


    Comparator<String> comparator = (str1, str2) -> str1.compareToIgnoreCase(str2);
    strings.sort(comparator);

    System.out.println(strings);
}
}