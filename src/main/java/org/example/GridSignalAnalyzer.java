package org.example;

public class GridSignalAnalyzer {
    public static void main(String[] args) {
        char[][] scrambledGrid = {
                {'C', 'H', 'A', 'R', 'L', 'I', 'E'},
                {'A', 'L', 'P', 'H', 'A'},
                {'T', 'A', 'N', 'G', 'O', '7'},
                {'B', 'R', 'A', 'V', 'O'}
        };
        System.out.println("\n--- PHASE 2: STANDARD FOR-LOOP MANEUVER ---");
        analyzeWithForLoop(scrambledGrid); //phase2
        System.out.println("\n--- PHASE 3: ADVANCED FOR-EACH SWEEP ---");
        analyzeWithForEachLoop(scrambledGrid); //phase3
        System.out.println("\n--- PHASE 4: HYBRID LOOP APPROACH ---");
        analyzeWithHybridLoop(scrambledGrid); //phase4

    }

    private static void analyzeWithForLoop(char[][] scrambleGrid){
        for(int i=0; i< scrambleGrid.length;i++){
            for(int j=0; j<scrambleGrid[i].length;j++){
                System.out.print(scrambleGrid[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void analyzeWithForEachLoop(char[][] scrambleGrid){
        for(char[] row: scrambleGrid){
            System.out.println("Processing with Row with Hash: " + row);
            for(char val : row){
                System.out.println("-> " + val);
            }
            System.out.println();
        }
    }

    private static void analyzeWithHybridLoop(char[][] scrambleGrid){
        for(char[] row: scrambleGrid){
            for(int i=0; i<row.length;i++){
                System.out.print(row[i] + " ");
            }
            System.out.println();
        }
    }
}