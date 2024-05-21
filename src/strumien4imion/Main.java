package strumien4imion;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args)
    {
        String[] osoby = {"Jakub", "Kamil", "Zenek", "Bożena"};

        String imiona = Arrays.stream(osoby).collect(Collectors.joining(", "));

        System.out.println(imiona);
    }
}
