import java.util.*;
public class Main {

    public static void main(String[] args) {
        // protoyping driver

        // create rooms
        Room room1 = new Room("Command Deck", "You are on the Command Deck", "room1", null, null, null, null, null, null, null);
        Room room2 = new Room("Galley", "You are on the Galley, grab some food?", null, null, null, null, null, null, null, null);
        Room room3 = new Room("Crew Quarters", "You are on the Crew Deck, sleep?", null, null, null, null, null, null, null,null);
        Room room4 = new Room("Head", "You are at the head, take a shit?", null, null, null, null, null, null, null, null);
        Room room5 = new Room("Port Airlock ", "Ready for the Expanse of space?", null, null, null, null, null, null, null, null);
        Room room6 = new Room("Machine Shop", "You are in the Machine Shop, where is Amos?", null, null, null, null, null, null, null, null);
        Room room7 = new Room("Starboard Airlock", "You are in the Starboard Airlock, Ready for the Expanse?", null, null, null, null, null, null, null, null);
        Room room8 = new Room("The Core", "You are at the Core, you shouldn't be here unless you need some Rads", null, null, null, null, null, null, null, null);


        // create items and item array

        Item oxygenBottle = new Item("Oxygen Bottle", "got some air in there");
        Item helmet = new Item("Space Helmet", "its a helmet");

        ArrayList<Item> room1Store = new ArrayList<>();
        ArrayList<Item> room2Store = new ArrayList<>();
        ArrayList<Item> room3Store = new ArrayList<>();
        ArrayList<Item> room4Store = new ArrayList<>();
        ArrayList<Item> room5Store = new ArrayList<>();
        ArrayList<Item> room6Store = new ArrayList<>();
        ArrayList<Item> room7Store = new ArrayList<>();
        ArrayList<Item> room8Store = new ArrayList<>();


        // assign items to rooms


        room1Store.add(oxygenBottle);
        room1Store.add(helmet);
        room5Store.add(helmet);


        // set room storage container

        room1.setStorage(room1Store);
        room2.setStorage(room2Store);
        room3.setStorage(room3Store);
        room4.setStorage(room4Store);
        room5.setStorage(room5Store);
        room6.setStorage(room6Store);
        room7.setStorage(room7Store);
        room8.setStorage(room8Store);



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

        //starting room

        Room currentLocation = room1;

        System.out.println(currentLocation.roomTitle + ": " + currentLocation.roomDesc);
        System.out.println(getRoomItems(currentLocation));
        System.out.println(getRoomCords(currentLocation));


        String input = null;

        //main game loop (so far)

        while (input != "exit") {

            boolean isValid = false;

            while (isValid == false) {
                input = getUserDirection(currentLocation);
                isValid = RoomMoveHelper(currentLocation,input);
                if (isValid == false){
                    System.out.println("Invalid location, Try Again");
                }

            }

            currentLocation = RoomMove(currentLocation, input);

            System.out.println(currentLocation.roomTitle + ": " + currentLocation.roomDesc);
            System.out.println(getRoomItems(currentLocation));
            System.out.println(getRoomCords(currentLocation));
        }


    }

    //Possible super input method to parse commands (goto, drop, pickup)

    //User Direction input Method

    public static String getUserDirection(Room currentLocation){
        Scanner useInput = new Scanner(System.in);
        System.out.println(">> ");
        String input = useInput.nextLine();
        return input;
    }

    public static String getRoomItems(Room currentLocation){
        ArrayList<Item> items = currentLocation.storage;
        String printItems = "In the room you see: ";

        Iterator<Item> itemIterator = items.iterator();

       if (items.size() > 0) {
           do {
               printItems = printItems + itemIterator.next() + ", ";

           } while (itemIterator.hasNext());


           return printItems;

       }else {

           printItems = printItems + "Nothing";
           return printItems;
       }


    }


    //Room Movement Function

    public static Room RoomMove(Room currentLocation, String newLocation)   {

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
            }


        return currentLocation;

    }

    public static boolean RoomMoveHelper(Room currentLocation, String newLocation) {

        boolean isExit = false;

        if (newLocation.equals("up")) {
            if(currentLocation.upExit == null){
                isExit = false;
            }else{
                isExit = true;
            }

        } else if (newLocation.equals("down")) {
            if(currentLocation.downExit == null){
                isExit = false;
            }else{
                isExit = true;
            }

        } else if (newLocation.equals("left")) {
            if(currentLocation.leftExit == null){
                isExit = false;
            }else{
                isExit = true;
            }

        } else if (newLocation.equals("right")) {
            if(currentLocation.rightExit == null){
                isExit = false;
            }else{
                isExit = true;
            }

        } else if (newLocation.equals("forward")) {
            if(currentLocation.forExit == null){
                isExit = false;
            }else{
                isExit = true;
            }

        } else if (newLocation.equals("back")) {
            if(currentLocation.backExit == null){
                isExit = false;
            }else{
                isExit = true;
            }

        }

        return isExit;



    }



    public static String getRoomCords(Room currentLocation){
        String cords = "";

        if (currentLocation.upExit != null){
            cords = cords + currentLocation.upExit.getRoomTitle() + " is above you, ";
        } else{}

        if (currentLocation.downExit != null) {
            cords = cords + currentLocation.downExit.getRoomTitle() + " is below you, ";
        } else{}

        if (currentLocation.leftExit != null) {
            cords = cords + currentLocation.leftExit.getRoomTitle() + " is to your left, ";
        } else{}

        if (currentLocation.rightExit != null) {
            cords = cords + currentLocation.rightExit.getRoomTitle() + " is to your right, ";
        } else{}

        if (currentLocation.forExit != null) {
            cords = cords + currentLocation.forExit.getRoomTitle() + " is in front of you, ";
        } else{}

        if (currentLocation.backExit != null) {
            cords = cords + currentLocation.backExit.getRoomTitle() + " is behind you ";
        } else{}
        return cords;


    }

}






