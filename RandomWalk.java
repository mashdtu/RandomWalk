import java.util.Scanner;

public class RandomWalk {
    public static void main(String[] args) {
        int n = 0, i = 0;
        int[] pos = {0, 0};

        Scanner console = new Scanner(System.in);
        System.out.print("Enter size of grid: ");

        try {
            n = Math.abs(Integer.parseInt(console.next()));
        } catch (Exception e) {
            System.out.print("Error: Grid size must be an integer");
            System.exit(0);
        }

        StdDraw.setXscale(-n-1, n+1);
        StdDraw.setYscale(-n-1, n+1);
        StdDraw.setPenRadius(0.25/(double)n);

        System.out.print("\n");

        while (Math.abs(pos[0]) <= n && Math.abs(pos[1]) <= n) {
            double r = Math.random();
            if (r > 0.75) {
                pos[0] += 1;
            }
            else if (r > 0.5) {
                pos[0] -= 1;
            }
            else if (r > 0.25) {
                pos[1] += 1;
            }
            else {
                pos[1] -= 1;
            }

            StdDraw.point((double) pos[0], (double) pos[1]);
            System.out.println("Position = (" + pos[0] + ", " + pos[1] + ")");

            i++;
        }
        System.out.print("\nTotal number of steps = " + i);
    }
}
