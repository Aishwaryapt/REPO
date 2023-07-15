package Collectionexample;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class wordmap {
	
	    public static void main(String[] args) {
	        Map<String, String> wordMeaningMap = new HashMap<>();
	        wordMeaningMap.put("apple", "fruit");
	        wordMeaningMap.put("computer", "an electronic device");
	        wordMeaningMap.put("pen","thing used to write");
	        wordMeaningMap.put("book","used to write and read");
	        

	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a word to search for its meaning: ");
	        String word = scanner.nextLine();

	        if (wordMeaningMap.containsKey(word)) {
	            String meaning = wordMeaningMap.get(word);
	            System.out.println("Meaning: " + meaning);
	        } else {
	            System.out.println("Word not found in the dictionary.");
	        }
	    }
	}



