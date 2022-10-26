import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EntryDatabaseAndFunctions extends Entry {
    private static final Scanner scanner = new Scanner(System.in);

    private static final ObjectMapper mapper = new ObjectMapper();
    private static final Path pathToJSONFile = Paths.get("src/main/resources/EntryList.json");
    private static List<Entry> entriesFromJSON;

    static {
        try {
            entriesFromJSON = List.of(mapper.readValue(pathToJSONFile.toFile(), Entry[].class));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void homeScreen() {
        System.out.println("Please choose an action:");
        System.out.println("1. Add an entry");
        System.out.println("2. Search for entries");
        System.out.println("9. Exit Diary");
    }

    private static Entry addEntry() {
        System.out.println("Please enter the title for your entry -");
        String title = scanner.nextLine();

        System.out.println("Please enter the text for your entry  -");
        String text = scanner.nextLine();

        String date = LocalDate.now().toString();

        System.out.println("----------------------" + "\n");
        System.out.println("------Your Entry------" + "\n");
        System.out.println("---Title--- " + "\n" + title + "\n");
        System.out.println("---Text---" + "\n" + text + "\n");
        System.out.println("---Date---" + "\n" + date + "\n");
        System.out.println("----------------------" + "\n");


        return new Entry(title, text, date);
    }

    public static void createAndSaveEntryToJSON() throws IOException {
        entriesFromJSON = List.of(mapper.readValue(pathToJSONFile.toFile(), Entry[].class));
        List<Entry> entries = new ArrayList<>(entriesFromJSON);
        entries.add(addEntry());
        mapper.writeValue(pathToJSONFile.toFile(), entries);
    }

    public static int fetchInput() {
        homeScreen();
        return Integer.parseInt(scanner.nextLine());
    }

    public static void showEntries() throws IOException {
        List<Entry> entriesFromJSONUpdated = List.of(mapper.readValue(pathToJSONFile.toFile(), Entry[].class));
        System.out.println("-----Your Entries-----" + "\n");
        try {
            for (Entry entry : entriesFromJSONUpdated) {
                entryTemplate(entry);
        }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Something went wrong! Please try another action.");
        }
    }

    private static void entryTemplate(Entry entry) {
        System.out.println("----------------------");
        System.out.println("---Title---" + "\n" + entry.getTitle() + "\n");
        System.out.println("---Text---" + "\n" + entry.getText() + "\n");
        System.out.println("---Date---" + "\n" + entry.getDate() + "\n");
        System.out.println("----------------------" + "\n");
    }

    static void welcomeMessage() {
        System.out.println("Welcome to your digital diary!");
    }
}
