package org.example;

public class SplitString {
    public static void main(String[] args) {
        String str = "Hello,World,Java";
        String[] parts = str.split(",");
        for (String part : parts) {
            System.out.println(part);
        }
    }

}
