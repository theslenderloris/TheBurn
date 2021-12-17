import javax.print.DocFlavor;

abstract public class Room {

    //object properties - Strings

    public String roomTitle;
    public String roomDesc;


    //exits
    public Ship upExit;
    public Ship downExit;
    public int leftExit;
    public int rightExit;
    public int forExit;
    public int backExit;


    //constructor
    public Room(String roomTitle, String roomDesc, Ship upExit, Ship downExit, int leftExit, int rightExit, int forExit, int backExit){
        this.roomTitle = roomTitle;
        this.roomDesc = roomDesc;
        this.upExit = upExit;
        this.downExit = downExit;
        this.leftExit = leftExit;
        this.rightExit = rightExit;
        this.forExit = forExit;
        this.backExit = backExit;
    }

    //getters

    public String getRoomTitle(){
        return roomTitle;
    }

    public String getRoomDesc(){
        return roomDesc;
    }

    public Ship getUpExit(){
        return upExit;
    }

    public Ship getDownExit(){
        return downExit;
    }

    public int getLeftExit(){
        return leftExit;
    }

    public int getRightExit(){
        return  rightExit;
    }

    public int getForExit(){
        return forExit;
    }

    public int getBackExit(){
        return backExit;
    }

}
