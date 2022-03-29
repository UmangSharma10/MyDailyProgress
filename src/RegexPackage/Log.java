package RegexPackage;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Log {
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String, String> hashMap = new HashMap<>();
        BufferedReader br = null;

        try {

            String sCurrentLine;

            br = new BufferedReader(new FileReader("/home/umang/Downloads/event-tracker-logs"));


            StringBuilder builder = new StringBuilder();
            while ((sCurrentLine = br.readLine()) != null){
                builder.append(sCurrentLine);
            }

            Pattern pattern = Pattern.compile("((\\\"id\\\"\\s:\\s\\d+)|(\\\"metric.name\\\"\\s+:\\s+\\W+\\w+\\s+\\w+\\W)|(\\\"status\\\"\\s:\\s\\W+\\w+\\W)|(\\\"error.code\\\"+\\s+:\\s\\W+[A-Z,0-9]+\\W)|(\\\"event.timestamp\\\"\\s:\\s+\\d+))");

            Pattern pattern1 = Pattern.compile("(\\\"id\\\"\\s:\\s\\d+)");
            Pattern pattern2 = Pattern.compile("(\\\"metric.name\\\"\\s+:\\s+\\W+\\w+\\s+\\w+\\W)");
            Pattern pattern3 = Pattern.compile("(\\\"status\\\"\\s:\\s\\W+\\w+\\W)");
            Pattern pattern4 = Pattern.compile("(\\\"error.code\\\"+\\s+:\\s\\W+[A-Z,0-9]+\\W)");
            Pattern pattern5 = Pattern.compile("(\\\"event.timestamp\\\"\\s:\\s+\\d+)");

            Matcher matcher = pattern
                    .matcher(builder);
            Matcher matcher1 = pattern1
                    .matcher(builder);
            Matcher matcher2 = pattern2
                    .matcher(builder);
            Matcher matcher3 = pattern3
                    .matcher(builder);
            Matcher matcher4 = pattern4
                    .matcher(builder);
            Matcher matcher5 = pattern5
                    .matcher(builder);
            List<String> l1 = new ArrayList<String>();

            final String[] lastElement = new String[1];
            while (matcher1.find()&&matcher2.find()&&matcher3.find()&&matcher4.find()&&matcher5.find()){
                //System.out.println(matcher1.group());
                hashMap.put("id", matcher1.group());
                //System.out.println(matcher2.group());
                hashMap.put("Metric.name", matcher2.group());
                //System.out.println(matcher3.group());
                hashMap.put("status", matcher3.group());
                //System.out.println(matcher4.group());
                hashMap.put("Error.code", matcher4.group());
                //System.out.println(matcher5.group());
                hashMap.put("event.timestamp", matcher5.group());
               // System.out.println("***********************************************************************************");
               // System.out.println(hashMap);



                hashMap.forEach((key, value) -> {
                    //System.out.println("Value" + value);
                    l1.add(value);
                    lastElement[0] = key;
                   // System.out.println(lastElement[0]);

                });


            }
            System.out.println(l1);
            System.out.println(lastElement);








        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }




    }


    }

