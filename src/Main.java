import java.util.Currency;

public class Main {

    public static void main(String[] args) {
	// protoyping driver


        Ship[] playership = new Ship[2];


        Ship ship1 = new Ship("Command Deck", "Were the magic happens, control the ship here", 99, ship2, 99, 99, 99, 99);

        Ship ship2 = new Ship("Crew Quarters Deck", "Were the people sleep", ship1, null,99,99,99,99);



        String currentLocation = playership[0].getRoomTitle();
        String currentDesc = playership[0].getRoomDesc();

        System.out.println(currentLocation + ": " + currentDesc);

        String lastLocation = currentLocation;
        String lastDesc = currentDesc;

        int userinputtest = 1 ;

        currentLocation = playership[userinputtest].getRoomTitle();
        currentDesc = playership[userinputtest].getRoomDesc();

        System.out.println(currentLocation + ": " + currentDesc);



    }
}
