/**
 * Represents a container
 * @author Ashley Qian
 */
public class Container {
    String originalDescription;
    String afterDescription;
    boolean open;

    /**
     * constructor
     * @param originalDescription description before the player interaction
     * @param afterDescription description after the player interaction
     */
    public Container(String originalDescription, String afterDescription){
        this.originalDescription = originalDescription;
        this.afterDescription = afterDescription;
        this.open = false;
    }

    /**
     * Allows the game to output the correct description based on the player's interaction with the container
     */
    public void print(){
        if(this.open){
            System.out.println(this.afterDescription);
        }else{
            System.out.println(this.originalDescription);
        }
    }
}
