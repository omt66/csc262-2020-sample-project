package omt.finalprjpart1;

/**
 * Grid class that represents a 2D grid.
 * 
 * @author omt
 */
public class Grid {
    private char[][] grid;
    int nofRows = 10; // Default number of rows
    int nofCols = 10; // Default number of columns

    public Grid() {
        init();
    }

    public Grid(int nofRows, int nofCols) {
        this.nofRows = nofRows;
        this.nofCols = nofCols;
        init();
    }

    private void init() {
        grid = new char[nofCols][nofRows];
        for (int y = 0; y < nofRows; y++) {
            for (int x = 0; x < nofCols; x++) {
                grid[x][y] = '.';
            }
        }
    }

    public void setValueAt(int x, int y, char val) {
        grid[x][y] = val;
    }

    public void print2D() {
        System.out.println("--------------------------------------------------");
        for (int y = 0; y < nofRows; y++) {
            for (int x = 0; x < nofCols; x++) {
                char ch = grid[x][y];
                System.out.print(ch + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------");
    }

    public static void main(String[] args) {
        Grid g = new Grid(25, 25);
        
        g.setValueAt(10, 8, 'B');
        g.setValueAt(22, 4, 'C');
        g.print2D();
    }
}
