import java.util.*;
public class Main {

    public static void main(String[] args) {
        // protoyping driver

        // create rooms
        Room room1 = new Room("Command Deck", "You are on the Command Deck", null, null, null, null, null, null, null);
        Room room2 = new Room("Galley", "You are on the Galley, grab some food?", null, null, null, null, null, null, null);
        Room room3 = new Room("Crew Quarters", "You are on the Crew Deck, sleep?", null, null, null, null, null, null, null);
        Room room4 = new Room("Head", "You are at the head, take a shit?", null, null, null, null, null, null, null);
        Room room5 = new Room("Port Airlock ", "Ready for the Expanse of space?", null, null, null, null, null, null, null);
        Room room6 = new Room("Machine Shop", "You are in the Machine Shop, where is Amos?", null, null, null, null, null, null, null);
        Room room7 = new Room("Starboard Airlock", "You are in the Starboard Airlock, Ready for the Expanse?", null, null, null, null, null, null, null);
        Room room8 = new Room("The Core", "You are at the Core, you shouldn't be here unless you need some Rads", null, null, null, null, null, null, null);

        //set room exits

        room1.setDownExit(room3);

        room2.setRightExit(room3);

        room3.setUpExit(room1);
        room3.setLeftExit(room2);
        room3.setRightExit(room4);
        room3.setDownExit(room6);

        room4.setLeftExit(room3);

        room5.setRightExit(room6);

        room6.setUpExit(room3);
        room6.setLeftExit(room5);
        room6.setRightExit(room7);
        room6.setDownExit(room8);

        room7.setLeftExit(room6);

        room8.setUpExit(room6);

        //main logic

        Room currentLocation = room1;
        System.out.println(currentLocation.roomTitle + ": " + currentLocation.roomDesc);

        // scanner stuff
        Scanner useInput = new Scanner(System.in);

        String input = null;

        while (input != "exit") {
            System.out.println("Where to go?");
            input = useInput.nextLine();
            currentLocation = RoomMove(currentLocation, input);
            System.out.println(currentLocation.roomTitle + ": " + currentLocation.roomDesc);
        }


    }

    //Room Movement Function

    public static Room RoomMove(Room currentLocation, String newLocation) {
        if (newLocation.equals("up")) {
            currentLocation = currentLocation.upExit;

        } else if (newLocation.equals("down")) {
            currentLocation = currentLocation.downExit;

        } else if (newLocation.equals("left")) {
            currentLocation = currentLocation.leftExit;

        } else if (newLocation.equals("right")) {
            currentLocation = currentLocation.rightExit;

        } else if (newLocation.equals("forward")) {
            currentLocation = currentLocation.forExit;

        } else if (newLocation.equals("back")) {
            currentLocation = currentLocation.backExit;

        } return currentLocation;

    }

}






