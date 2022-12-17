/**
 * Represents the map
 * @author Ashley Qian
 */
public class Map {
    Room topLeft;
    Room top;
    Room topRight;
    Room left;
    Room middle;
    Room right;
    Room bottomLeft;
    Room bottom;
    Room bottomRight;

    Container drawer;
    Container refrigerator;
    
    /**
     * constructor
     * stores room and container description
     */
    public Map(){
        this.topLeft = new Room(-1, 1, "     There is a door that is locked. It seems like a three-digit password is required to open this door. ");
        this.top = new Room(0, 1, "     There is a drawer");
        this.topRight = new Room(1, 1,"     There is a refrigerator");
        this.left = new Room(-1, 0, "     There is a stove. You know that it's not a cooking game right?");
        this.middle = new Room(0, 0, "     Back to the original place");
        this.right = new Room(1,0,"     There is a cup of ice on the table. You saw something frozen in the ice.");
        this.bottomLeft = new Room(-1, -1, "     There are several unlit torches on the wall. Sounds medieval. ");
        this.bottom = new Room(0, -1, "     There is a comfy couch. You ducked down to check under the couch, but it was too dark.  ");
        this.bottomRight = new Room(1, -1, "     A little mouse is holding onto a paper ball. He looks hungry. ");

        this.drawer = new Container("     There is a box of matches in the drawer.", "     The drawer is now empty.");
        this.refrigerator = new Container("     There is a piece of cheese in the refrigerator. Why though?", "     The refrigerator is now empty. You should know that that piece of cheese might not be edible for human. ");
    }

    /**
     * Determines which room's description to print when the user enters a room
     * @param x {1,0,-1}
     * @param y {1,0,-1}
     */
    public void enter(int x, int y){
        switch(y){
            case(1):
                switch(x){
                    case(-1):
                        this.topLeft.enter();
                        break;
                    case(0):
                        this.top.enter();
                        break;
                    case(1):
                        this.topRight.enter();
                        break;
                }
            break;
            case(0):
                switch(x){
                    case(-1):
                        this.left.enter();
                        break;
                    case(0):
                        this.middle.enter();
                        break;
                    case(1):
                        this.right.enter();
                        break;
                }
            break;
            case(-1):
                switch(x){
                    case(-1):
                        this.bottomLeft.enter();
                        break;
                    case(0):
                        this.bottom.enter();
                        break;
                    case(1):
                        this.bottomRight.enter();
                        break;
                }
            break;
        }
    }
}
