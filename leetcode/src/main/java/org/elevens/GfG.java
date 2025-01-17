package org.elevens;

public class GfG {
    public static void countCurrency(int amount)
    {
        int[] notes = new int[]{ 1, 2, 5 };
        int[] noteCounter = new int[3];

        // count notes using Greedy approach
        for (int i = 0; i < 3; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount % notes[i];
            }
        }

        // Print notes
        System.out.println("Currency Count ->");
        for (int i = 0; i < 3; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : "
                        + noteCounter[i]);
            }
        }
    }

    // driver function
    public static void main(String argc[]){
        int amount = 10;
        countCurrency(amount);
    }
}
