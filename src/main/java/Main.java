import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        EntryDatabaseAndFunctions.welcomeMessage();

        int choice = 0;

        while(choice != 9) {
            choice = EntryDatabaseAndFunctions.fetchInput();
            switch (choice) {
                case 1:
                    EntryDatabaseAndFunctions.createAndSaveEntryToJSON();
                    break;
                case 2:
                    EntryDatabaseAndFunctions.showEntries();
            }
        }
    }
}
