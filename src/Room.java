public class Room {

    //object properties - Strings

    public String roomTitle;
    public String roomDesc;
    public String roomTag;


    //exits
    public Room upExit;
    public Room downExit;
    public Room leftExit;
    public Room rightExit;
    public Room forExit;
    public Room backExit;


    //constructor
    public Room(String roomTitle, String roomDesc, String roomTag, Room upExit, Room downExit, Room leftExit, Room rightExit, Room forExit, Room backExit){
        this.roomTitle = roomTitle;
        this.roomDesc = roomDesc;
        this.roomTag = roomTag;
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

    public String getRoomTag(){
        return roomTag;
    }

    public Room getUpExit(){
        return upExit;
    }

    public Room getDownExit(){
        return downExit;
    }

    public Room getLeftExit(){
        return leftExit;
    }

    public Room getRightExit(){
        return  rightExit;
    }

    public Room getForExit(){
        return forExit;
    }

    public Room getBackExit(){
        return backExit;
    }

    // setters

    public void setUpExit(Room upExit){
        this.upExit = upExit;
    }

    public void setDownExit(Room downExit){
        this.downExit = downExit;
    }

    public void setLeftExit(Room leftExit){
        this.leftExit = leftExit;
    }

    public void setRightExit(Room rightExit) {
        this.rightExit = rightExit;
    }

    public void setForExit(Room forExit){
        this.forExit = forExit;
    }

    public void setBackExit(Room backExit){
        this.backExit = backExit;
    }

}
