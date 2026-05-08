package org.example.Lesson5;
import java.time.Year;
import java.util.Random;

public class Homework_Lesson5 {

    public static void main(String[] args) {
        String accessCode = generateAccessCode();
        System.out.println(isValidCode(accessCode, 8));
        logEvent("Server protection activated");
        logEvent("Intrusion attempt detected", true);
        System.out.println(generateAgentId("AGENT", 42));
        System.out.println(generateAgentId("AGENT", 77));
        System.out.println(generateAgentId("AGENT", 13));
    }

    public static String generateAccessCode(){
        return (Year.now().getValue()+"-"+(int) Math.pow(3, 7));
    }

    private static boolean isValidCode(String code, int minLength){
        return (code!=null && code.length()>=minLength && code.contains("-"));
    }

    public static void logEvent(String message){
        System.out.println("[INFO] "+ message);
    }

    public static void logEvent(String message, boolean isCritical){
        if (isCritical) {
            System.out.println("[CRITICAL] " + message);
        } else {
            logEvent(message);
        }
    }

    public static String generateAgentId(String prefix, int seed){
        Random random = new Random(seed);
        return prefix + "-" +  Math.abs(random.nextInt(9000) + 1000);
    }
}
