package omt.finalprjpart1;

/**
 * TODO Explain what it does...
 * 
 * @author omt
 */
public class Robot {

    private int x;
    private int y;
    private char payload;
    private String name;
    private Grid grid;

    public Robot(String name) {
        this.name = name;
        x = 0;
        y = 0;
        payload = ' ';
    }

    /**
     * Picks up the item from the grid at location x & y
     * 
     * @param locationX 
     * @param locationY
     */
    boolean pickUp(int locationX, int locationY) {
        // TODO: Implement this
        return false;
    }

    // TODO Explain what it does...
    void dropOff(int lx, int ly) {
        // TODO: Implement this
    }

    // TODO Explain what it does...
    void moveRight() {
        // TODO: Implement this
    }

    // TODO Explain what it does...
    void moveLeft() {
        // TODO: Implement this
    }

    // TODO Explain what it does...
    void moveUp() {
        // TODO: Implement this
    }

    // TODO Explain what it does...
    void moveDown() {
        // TODO: Implement this
    }

    // TODO Explain what it does...
    boolean moveTo(int locationX, int locationY) {
        if (locationX > grid.nofCols || locationY > grid.nofRows) {
            return false;
        }
        x = locationX;
        y = locationY;

        return true;
    }

    // TODO Explain what it does...
    void placeItem(int locationX, int locationY, char item) {
        grid.setValueAt(locationX, locationY, item);
    }

    // TODO Explain what it does...
    public void useGrid(Grid grid) {
        this.grid = grid;
    }
    
    // TODO Explain what it does...
    void printLocation() {
        String formatStr = "Robot %s is at %d, %d\n";
        System.out.printf(formatStr, name, x, y);
    }

    public static void main(String[] args) {
        Robot r1 = new Robot("R1");
        Robot r2 = new Robot("R2");
        Grid grid = new Grid(25, 25);

        grid.setValueAt(10, 8, 'B');
        grid.setValueAt(22, 4, 'C');

        r1.useGrid(grid);
        r2.useGrid(grid);

        r1.moveTo(23, 24);
        r2.moveTo(15, 3);
        
        r1.printLocation();
        r2.printLocation();

        grid.print2D();
        
        // TODO: Implement the rest...
    }
}
