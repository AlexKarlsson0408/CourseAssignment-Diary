import com.fasterxml.jackson.databind.ObjectMapper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class EntryDatabaseAndFunctions extends Entry {
    static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Entry> entries = new ArrayList<>();
    ObjectMapper mapper = new ObjectMapper();

    static void HomeScreen () {
        String choice = "0";
        System.out.println("Welcome to your diary!");
        System.out.println("Please choose an action:");
        System.out.println("1 - Add an entry");
        System.out.println("2 - Search for entries");
        System.out.println("3 - Exit Diary");
        choice = scanner.nextLine();
        switch (choice) {
            case "1":
                addEntry();
                break;
            case "2":
                showEntries();
                break;
            case "3":
                System.out.println("Press any key to quit the program...");
                break;
            default:
                System.out.println("Error. Press any key to choose another action.");
                break;
        }
    }

    static void addEntry() {
        System.out.println("Please enter the title for your entry -");
        String titleScanner = scanner.nextLine();

        System.out.println("Please enter the text for your entry  -");
        String textScanner = scanner.nextLine();

        DateFormat entryDate = new SimpleDateFormat("dd-MM-yyyy");
        Date formatDate = new Date();
        String date = entryDate.format(formatDate);

        System.out.println("-----Your Entry-----" + "\n");
        System.out.println("---Title--- " + "\n" + titleScanner + "\n" );
        System.out.println("---Text---" + "\n" + textScanner + "\n");
        System.out.println("---Date---" + "\n" + date);
    }

    static void showEntries() {
        for (Entry entry : entries) {
        }
    }
}
