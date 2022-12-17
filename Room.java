/**
 * Represents a single room within the map
 * @author Ashley Qian
 */
public class Room {
    String description;
    int x;
    int y;

    /**
     * Constructor
     * @param x {1,0,-1}
     * @param y {1,0,-1}
     * @param description description of the room 
     */
    public Room(int x, int y, String description){
        this.description = description;
        this.x = x;
        this.y = y;
    }

    /**
     * Outputs room's description
     */
    public void enter(){
        System.out.println(this.description);
    }

    /**
     * Allows the room to change its description after the player's interaction
     * @param description description of the room
     */
    public void change(String description){
        this.description = description;
    }

}
