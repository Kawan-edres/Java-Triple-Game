import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class TripleGame {
    static int counterX = 0;
    static int counterO = 0;
    static int counterStop = 0;

    public static void printBoard(String board[][], int size) {

        for (int i = 0; i < board.length; i++) {
            switch (board.length) {
                case 3:
                    System.out.println("+---+---+---+");
                    break;
                case 4:
                    System.out.println("+---+---+---+---+");
                    break;
                case 5:
                    System.out.println("+---+---+---+---+---+");
                    break;
                case 6:
                    System.out.println("+---+---+---+---+---+---+");
                    break;
                case 7:
                    System.out.println("+---+---+---+---+---+---+---+");
                    break;
                case 8:
                    System.out.println("+---+---+---+---+---+---+---+---+");
                    break;
                case 9:
                    System.out.println("+---+---+---+---+---+---+---+---+---+");
                    break;

                default:
                    break;

            }

            for (int j = 0; j < board.length; j++) {
                System.out.printf("| %2s", board[i][j]);
                if (j == board.length - 1) {
                    System.out.print("|");
                }

            }
            System.out.println();

        }
        switch (board.length) {
            case 3:
                System.out.println("+---+---+---+");
                break;
            case 4:
                System.out.println("+---+---+---+---+");
                break;
            case 5:
                System.out.println("+---+---+---+---+---+");
                break;
            case 6:
                System.out.println("+---+---+---+---+---+---+");
                break;
            case 7:
                System.out.println("+---+---+---+---+---+---+---+");
                break;
            case 8:
                System.out.println("+---+---+---+---+---+---+---+---+");
                break;
            case 9:
                System.out.println("+---+---+---+---+---+---+---+---+---+");
                break;

            default:
                break;

        }

    }

    public static void dicesOfTheGame(String player1Name, String player2Name) {

        Scanner scan = new Scanner(System.in);

        System.out.println(player1Name + " To Roll The Dice Press enter key ");
        String diceRoll1 = scan.nextLine();

        int player1Dice = (int) (6 * Math.random() + 1);
        System.out.println("dice Player1= " + player1Dice);
        System.out.println();
        System.out.println(player1Name + " To Roll The Dice Press enter key ");
        String diceRoll2 = scan.nextLine();

        int player2Dice = (int) (6 * Math.random() + 1);
        System.out.println("dice Player2= " + player2Dice);

        System.out.println("\u0444============================\u0444");

        int counterDiceStop = 0;
        while (counterDiceStop <= 5) {
            counterDiceStop++;
            if (player1Dice == player2Dice) {
                System.out.println("They are Equal Roll The Dices Again Plaese");
                System.out.println(player1Name + " To Roll The Dice Press enter key ");
                diceRoll1 = scan.nextLine();

                player1Dice = (int) (6 * Math.random() + 1);
                System.out.println("dice Player1= " + player1Dice);
                System.out.println();
                System.out.println(player1Name + " To Roll The Dice Press enter key ");
                diceRoll2 = scan.nextLine();

                player2Dice = (int) (6 * Math.random() + 1);
                System.out.println("dice Player2= " + player2Dice);

            }
        }
        System.out.println("\u0444============================\u0444");
        if (player1Dice > player2Dice) {
            System.out.println(player1Name + " Goes First");
        } else {
            System.out.println(player2Name + " Goes First");

        }

    }

    public static void rowPointX(String board[][], String player1Name) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length - 2;) {
                String symbol = "xxx";
                String a = board[i][j];
                String b = board[i][j + 1];
                String c = board[i][j + 2];
                String d = a + b + c;

                if (d.equals(symbol)) {
                    counterX++;
                    System.out.println(player1Name + "point= " + counterX);
                    j += 3;
                } else {
                    j++;
                }
            }
        }
    }

    public static void allColumnPointX(String board[][], String player, String player1Name) {

        int ads = Integer.parseInt(player);
        int h = board.length;
        boolean as = true;
        int j = 0;
        if (ads > board.length) {
            while (as) {
                int r = ads - h;
                if (r < board.length) {
                    j = r;
                    as = false;
                } else {
                    ads = r;
                    as = true;
                }
            }
        } else {
            j = ads;
        }

        if (j == 0) {
            j += board.length;
        }

        for (int i = 0; i < board.length - 2;) {

            String symbol = "xxx";
            String a = board[i][j - 1];
            String b = board[i + 1][j - 1];
            String c = board[i + 2][j - 1];
            String d = a + b + c;
            if (d.equals(symbol)) {
                counterX++;
                System.out.println(player1Name + "point= " + counterX);
                i += 3;
            } else {
                i++;
            }

        }

    }

    public static void allRowPointO(String board[][], String player2Name) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length - 2;) {
                String symbol = "ooo";
                String a = board[i][j];
                String b = board[i][j + 1];
                String c = board[i][j + 2];
                String d = a + b + c;

                if (d.equals(symbol)) {
                    counterO++;
                    System.out.println(player2Name + "point= " + counterO);
                    j += 3;
                } else {
                    j++;
                }
            }
        }
    }

    public static void allColumnPointO(String board[][], String player, String player2Name) {

        int ads = Integer.parseInt(player);
        int h = board.length;
        boolean as = true;
        int j = 0;
        if (ads > board.length) {
            while (as) {
                int r = ads - h;
                if (r < board.length) {// 5
                    j = r;
                    as = false;
                } else {
                    ads = r;
                    as = true;
                }
            }
        } else {
            j = ads;
        }

        if (j == 0) {
            j += board.length;
        }

        for (int i = 0; i < board.length - 2;) {

            String symbol = "ooo";
            String a = board[i][j - 1];
            String b = board[i + 1][j - 1];
            String c = board[i + 2][j - 1];
            String d = a + b + c;
            if (d.equals(symbol)) {
                counterO++;
                System.out.println(player2Name + "point= " + counterO);
                i += 3;
            } else {
                i++;
            }

        }

    }

    public static void digonalPoint3X3(String[][] board, int size, String player1Name, String player2Name) {
        counterX = 0;
        counterO = 0;
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 1; j++) {

                if (board[0][0].contains("x") && board[1][1].contains("x") && board[2][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 1; j++) {
                if (board[0][2].contains("x") && board[1][1].contains("x") && board[2][0].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }

            }

        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[0][0].contains("o") && board[1][1].contains("o") && board[2][2].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }

            }

        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {

                if (board[0][2].contains("o") && board[1][1].contains("o") && board[2][0].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }

            }

        }

    }

    public static void digonalPoint4X4(String[][] board, int size, String player1Name, String player2Name) {
        counterX = 0;
        counterO = 0;

        for (int i = 0; i < 1; i++) {// 1,6,11 X
            for (int j = 0; j < 1; j++) {

                if (board[0][0].contains("x") && board[1][1].contains("x") && board[2][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }

            }
        }
        for (int i = 0; i < 1; i++) {// 3,6,9 X
            for (int j = 0; j < 1; j++) {

                if (board[0][2].contains("x") && board[1][1].contains("x") && board[2][0].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }

            }
        }

        for (int i = 0; i < 1; i++) {// 1,6,11 O
            for (int j = 0; j < 1; j++) {

                if (board[0][0].contains("o") && board[1][1].contains("o") && board[2][2].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 3,6,9 O
            for (int j = 0; j < 1; j++) {

                if (board[0][2].contains("o") && board[1][1].contains("o") && board[2][0].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 2,7,12 X
            for (int j = 0; j < 1; j++) {
                if (board[0][1].contains("x") && board[1][2].contains("x") && board[2][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 4,7,10 X
            for (int j = 0; j < 1; j++) {
                if (board[0][3].contains("x") && board[1][2].contains("x") && board[2][1].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 2,7,12 O
            for (int j = 0; j < 1; j++) {
                if (board[0][1].contains("o") && board[1][2].contains("o") && board[2][3].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 4,7,10 O
            for (int j = 0; j < 1; j++) {
                if (board[0][3].contains("o") && board[1][2].contains("o") && board[2][1].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 5,10,15 X
            for (int j = 0; j < 1; j++) {

                if (board[1][0].contains("x") && board[2][1].contains("x") && board[3][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 7,10,13 X
            for (int j = 0; j < 1; j++) {

                if (board[1][2].contains("x") && board[2][1].contains("x") && board[3][0].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 5,10,15 O
            for (int j = 0; j < 1; j++) {

                if (board[1][0].contains("o") && board[2][1].contains("o") && board[3][2].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 7,10,13 O
            for (int j = 0; j < 1; j++) {

                if (board[1][2].contains("o") && board[2][1].contains("o") && board[3][0].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 6,11,16 X
            for (int j = 0; j < 1; j++) {

                if (board[1][1].contains("x") && board[2][2].contains("x") && board[3][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 8,11,14 X
            for (int j = 0; j < 1; j++) {

                if (board[1][3].contains("x") && board[2][2].contains("x") && board[3][1].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 6,11,16 O
            for (int j = 0; j < 1; j++) {

                if (board[1][1].contains("o") && board[2][2].contains("o") && board[3][3].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 8,11,14 O
            for (int j = 0; j < 1; j++) {

                if (board[1][3].contains("o") && board[2][2].contains("o") && board[3][1].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }

    }

    public static void digonalPoint5X5(String[][] board, int size, String player1Name, String player2Name) {

        counterX = 0;
        counterO = 0;

        for (int i = 0; i < 1; i++) {// 1,7,13 X
            for (int j = 0; j < 1; j++) {

                if (board[0][0].contains("x") && board[1][1].contains("x") && board[2][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }

            }
        }
        for (int i = 0; i < 1; i++) {// 3,7,11 X
            for (int j = 0; j < 1; j++) {

                if (board[0][2].contains("x") && board[1][1].contains("x") && board[2][0].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }

            }
        }

        for (int i = 0; i < 1; i++) {// 1,7,13 O
            for (int j = 0; j < 1; j++) {

                if (board[0][0].contains("o") && board[1][1].contains("o") && board[2][2].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 3,7,11 O
            for (int j = 0; j < 1; j++) {

                if (board[0][2].contains("o") && board[1][1].contains("o") && board[2][0].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 2,8,14 X
            for (int j = 0; j < 1; j++) {
                if (board[0][1].contains("x") && board[1][2].contains("x") && board[2][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 4,8,12 X
            for (int j = 0; j < 1; j++) {
                if (board[0][3].contains("x") && board[1][2].contains("x") && board[2][1].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 2,8,14 O
            for (int j = 0; j < 1; j++) {
                if (board[0][1].contains("o") && board[1][2].contains("o") && board[2][3].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 4,8,12 O
            for (int j = 0; j < 1; j++) {
                if (board[0][3].contains("o") && board[1][2].contains("o") && board[2][1].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 3,9,15 X
            for (int j = 0; j < 1; j++) {
                if (board[0][2].contains("x") && board[1][3].contains("x") && board[2][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 5,9,13 X
            for (int j = 0; j < 1; j++) {
                if (board[0][4].contains("x") && board[1][3].contains("x") && board[2][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 3,9,15 O
            for (int j = 0; j < 1; j++) {
                if (board[0][2].contains("o") && board[1][3].contains("o") && board[2][4].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 5,9,13 O
            for (int j = 0; j < 1; j++) {
                if (board[0][4].contains("o") && board[1][3].contains("o") && board[2][2].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 6,12,18 X
            for (int j = 0; j < 1; j++) {

                if (board[1][0].contains("x") && board[2][1].contains("x") && board[3][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 8,12,16 X
            for (int j = 0; j < 1; j++) {

                if (board[1][2].contains("x") && board[2][1].contains("x") && board[3][0].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 6,12,18 O
            for (int j = 0; j < 1; j++) {

                if (board[1][0].contains("o") && board[2][1].contains("o") && board[3][2].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 8,12,16 O
            for (int j = 0; j < 1; j++) {

                if (board[1][2].contains("o") && board[2][1].contains("o") && board[3][0].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 7,13,19 X
            for (int j = 0; j < 1; j++) {

                if (board[1][1].contains("x") && board[2][2].contains("x") && board[3][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 9,13,17 X
            for (int j = 0; j < 1; j++) {

                if (board[1][3].contains("x") && board[2][2].contains("x") && board[3][1].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 7,13,19 O
            for (int j = 0; j < 1; j++) {

                if (board[1][1].contains("o") && board[2][2].contains("o") && board[3][3].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 9,13,17 O
            for (int j = 0; j < 1; j++) {

                if (board[1][3].contains("o") && board[2][2].contains("o") && board[3][1].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 8,14,20 X
            for (int j = 0; j < 1; j++) {

                if (board[1][2].contains("x") && board[2][3].contains("x") && board[3][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 10,14,18 X
            for (int j = 0; j < 1; j++) {

                if (board[1][4].contains("x") && board[2][3].contains("x") && board[3][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 8,14,20 O
            for (int j = 0; j < 1; j++) {

                if (board[1][2].contains("o") && board[2][3].contains("o") && board[3][4].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 10,14,18 O
            for (int j = 0; j < 1; j++) {

                if (board[1][4].contains("o") && board[2][3].contains("o") && board[3][2].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 11,17,23 X
            for (int j = 0; j < 1; j++) {

                if (board[2][0].contains("x") && board[3][1].contains("x") && board[4][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 13,17,21 X
            for (int j = 0; j < 1; j++) {

                if (board[2][2].contains("x") && board[3][1].contains("x") && board[4][0].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 11,17,23 O
            for (int j = 0; j < 1; j++) {

                if (board[2][0].contains("o") && board[3][1].contains("o") && board[4][2].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 13,17,21 O
            for (int j = 0; j < 1; j++) {

                if (board[2][2].contains("o") && board[3][1].contains("o") && board[4][0].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 12,18,24 X
            for (int j = 0; j < 1; j++) {

                if (board[2][1].contains("x") && board[3][2].contains("x") && board[4][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 14,18,22 X
            for (int j = 0; j < 1; j++) {

                if (board[2][3].contains("x") && board[3][2].contains("x") && board[4][1].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 12,18,24 O
            for (int j = 0; j < 1; j++) {

                if (board[2][1].contains("o") && board[3][2].contains("o") && board[4][3].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 14,18,22 O
            for (int j = 0; j < 1; j++) {

                if (board[2][3].contains("o") && board[3][2].contains("o") && board[4][1].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 13,19,25 X
            for (int j = 0; j < 1; j++) {

                if (board[2][2].contains("x") && board[3][3].contains("x") && board[4][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 15,19,23 X
            for (int j = 0; j < 1; j++) {

                if (board[2][4].contains("x") && board[3][3].contains("x") && board[4][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 13,19,25 O
            for (int j = 0; j < 1; j++) {

                if (board[2][2].contains("o") && board[3][3].contains("o") && board[4][4].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 15,19,23 O
            for (int j = 0; j < 1; j++) {

                if (board[2][4].contains("o") && board[3][3].contains("o") && board[4][2].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }

    }

    public static void digoanlPoint6X6(String[][] board, int size, String player1Name, String player2Name) {
        counterX = 0;
        counterO = 0;

        for (int i = 0; i < 1; i++) {// 1,8,15 X
            for (int j = 0; j < 1; j++) {

                if (board[0][0].contains("x") && board[1][1].contains("x") && board[2][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }

            }
        }
        for (int i = 0; i < 1; i++) {// 3,8,13 X
            for (int j = 0; j < 1; j++) {

                if (board[0][2].contains("x") && board[1][1].contains("x") && board[2][0].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }

            }
        }

        for (int i = 0; i < 1; i++) {// 1,8,15 O
            for (int j = 0; j < 1; j++) {

                if (board[0][0].contains("o") && board[1][1].contains("o") && board[2][2].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 3,8,13 O
            for (int j = 0; j < 1; j++) {

                if (board[0][2].contains("o") && board[1][1].contains("o") && board[2][0].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 2,9,16 X
            for (int j = 0; j < 1; j++) {
                if (board[0][1].contains("x") && board[1][2].contains("x") && board[2][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 4,9,14 X
            for (int j = 0; j < 1; j++) {
                if (board[0][3].contains("x") && board[1][2].contains("x") && board[2][1].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 2,9,16 O
            for (int j = 0; j < 1; j++) {
                if (board[0][1].contains("o") && board[1][2].contains("o") && board[2][3].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 4,9,14 O
            for (int j = 0; j < 1; j++) {
                if (board[0][3].contains("o") && board[1][2].contains("o") && board[2][1].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 3,10,17 X
            for (int j = 0; j < 1; j++) {
                if (board[0][2].contains("x") && board[1][3].contains("x") && board[2][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 5,10,15 X
            for (int j = 0; j < 1; j++) {
                if (board[0][4].contains("x") && board[1][3].contains("x") && board[2][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 3,10,17 O
            for (int j = 0; j < 1; j++) {
                if (board[0][2].contains("o") && board[1][3].contains("o") && board[2][4].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 5,10,15 O
            for (int j = 0; j < 1; j++) {
                if (board[0][4].contains("o") && board[1][3].contains("o") && board[2][2].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 4,11,18 X
            for (int j = 0; j < 1; j++) {
                if (board[0][3].contains("x") && board[1][4].contains("x") && board[2][5].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 6,11,16 X
            for (int j = 0; j < 1; j++) {
                if (board[0][5].contains("x") && board[1][4].contains("x") && board[2][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 4,11,18 O
            for (int j = 0; j < 1; j++) {
                if (board[0][3].contains("o") && board[1][4].contains("o") && board[2][5].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 6,11,16 O
            for (int j = 0; j < 1; j++) {
                if (board[0][5].contains("o") && board[1][4].contains("o") && board[2][3].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 7,14,21 X
            for (int j = 0; j < 1; j++) {

                if (board[1][0].contains("x") && board[2][1].contains("x") && board[3][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 9,14,19 X
            for (int j = 0; j < 1; j++) {

                if (board[1][2].contains("x") && board[2][1].contains("x") && board[3][0].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 7,14,21 O
            for (int j = 0; j < 1; j++) {

                if (board[1][0].contains("o") && board[2][1].contains("o") && board[3][2].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 9,14,19 O
            for (int j = 0; j < 1; j++) {

                if (board[1][2].contains("o") && board[2][1].contains("o") && board[3][0].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 8,15,21 X
            for (int j = 0; j < 1; j++) {

                if (board[1][1].contains("x") && board[2][2].contains("x") && board[3][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 10,15,20 X
            for (int j = 0; j < 1; j++) {

                if (board[1][3].contains("x") && board[2][2].contains("x") && board[3][1].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 8,15,21 O
            for (int j = 0; j < 1; j++) {

                if (board[1][1].contains("o") && board[2][2].contains("o") && board[3][3].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 10,15,20 O
            for (int j = 0; j < 1; j++) {

                if (board[1][3].contains("o") && board[2][2].contains("o") && board[3][1].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 9,16,23 X
            for (int j = 0; j < 1; j++) {

                if (board[1][2].contains("x") && board[2][3].contains("x") && board[3][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 11,16,21 X
            for (int j = 0; j < 1; j++) {

                if (board[1][4].contains("x") && board[2][3].contains("x") && board[3][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 9,16,23 O
            for (int j = 0; j < 1; j++) {

                if (board[1][2].contains("o") && board[2][3].contains("o") && board[3][4].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 11,16,21 O
            for (int j = 0; j < 1; j++) {

                if (board[1][4].contains("o") && board[2][3].contains("o") && board[3][2].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 10,17,24 X
            for (int j = 0; j < 1; j++) {

                if (board[1][3].contains("x") && board[2][4].contains("x") && board[3][5].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 12,17,22 X
            for (int j = 0; j < 1; j++) {

                if (board[1][5].contains("x") && board[2][4].contains("x") && board[3][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 10,17,24 O
            for (int j = 0; j < 1; j++) {

                if (board[1][3].contains("o") && board[2][4].contains("o") && board[3][5].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 12,17,22 O
            for (int j = 0; j < 1; j++) {

                if (board[1][5].contains("o") && board[2][4].contains("o") && board[3][3].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 13,20,27 X
            for (int j = 0; j < 1; j++) {

                if (board[2][0].contains("x") && board[3][1].contains("x") && board[4][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 15,20,25 X
            for (int j = 0; j < 1; j++) {

                if (board[2][2].contains("x") && board[3][1].contains("x") && board[4][0].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 13,20,27 O
            for (int j = 0; j < 1; j++) {

                if (board[2][0].contains("o") && board[3][1].contains("o") && board[4][2].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 15,20,25 O
            for (int j = 0; j < 1; j++) {

                if (board[2][2].contains("o") && board[3][1].contains("o") && board[4][0].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        } //
        for (int i = 0; i < 1; i++) {// 14,21,28 X
            for (int j = 0; j < 1; j++) {

                if (board[2][1].contains("x") && board[3][2].contains("x") && board[4][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 16,21,26 X
            for (int j = 0; j < 1; j++) {

                if (board[2][3].contains("x") && board[3][2].contains("x") && board[4][1].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 14,21,28 O
            for (int j = 0; j < 1; j++) {

                if (board[2][1].contains("o") && board[3][2].contains("o") && board[4][3].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 16,21,26 O
            for (int j = 0; j < 1; j++) {

                if (board[2][3].contains("o") && board[3][2].contains("o") && board[4][1].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 15,22,29 X
            for (int j = 0; j < 1; j++) {

                if (board[2][2].contains("x") && board[3][3].contains("x") && board[4][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 17,22,27 X
            for (int j = 0; j < 1; j++) {

                if (board[2][4].contains("x") && board[3][3].contains("x") && board[4][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 15,22,29 O
            for (int j = 0; j < 1; j++) {

                if (board[2][2].contains("o") && board[3][3].contains("o") && board[4][4].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 17,22,27 O
            for (int j = 0; j < 1; j++) {

                if (board[2][4].contains("o") && board[3][3].contains("o") && board[4][2].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 16,23,30 X
            for (int j = 0; j < 1; j++) {

                if (board[2][3].contains("x") && board[3][4].contains("x") && board[4][5].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 18,23,28 X
            for (int j = 0; j < 1; j++) {

                if (board[2][5].contains("x") && board[3][4].contains("x") && board[4][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 16,23,30 O
            for (int j = 0; j < 1; j++) {

                if (board[2][3].contains("o") && board[3][4].contains("o") && board[4][5].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 18,23,28 O
            for (int j = 0; j < 1; j++) {

                if (board[2][5].contains("o") && board[3][4].contains("o") && board[4][3].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 19,26,33 X
            for (int j = 0; j < 1; j++) {

                if (board[3][0].contains("x") && board[4][1].contains("x") && board[5][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 21,26,31 X
            for (int j = 0; j < 1; j++) {

                if (board[3][2].contains("x") && board[4][1].contains("x") && board[5][0].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 19,26,33 O
            for (int j = 0; j < 1; j++) {

                if (board[3][0].contains("o") && board[4][1].contains("o") && board[5][2].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 21,26,31 O
            for (int j = 0; j < 1; j++) {

                if (board[3][2].contains("o") && board[4][1].contains("o") && board[5][0].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 20,27,34 X
            for (int j = 0; j < 1; j++) {

                if (board[3][1].contains("x") && board[4][2].contains("x") && board[5][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 22,27,32 X
            for (int j = 0; j < 1; j++) {

                if (board[3][4].contains("x") && board[4][2].contains("x") && board[5][1].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 20,27,34 O
            for (int j = 0; j < 1; j++) {

                if (board[3][1].contains("o") && board[4][2].contains("o") && board[5][3].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 22,27,32 O
            for (int j = 0; j < 1; j++) {

                if (board[3][4].contains("o") && board[4][2].contains("o") && board[5][1].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 21,28,35 X
            for (int j = 0; j < 1; j++) {

                if (board[3][2].contains("x") && board[4][3].contains("x") && board[5][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 23,28,33 X
            for (int j = 0; j < 1; j++) {

                if (board[3][4].contains("x") && board[4][3].contains("x") && board[5][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 21,28,35 O
            for (int j = 0; j < 1; j++) {

                if (board[3][2].contains("o") && board[4][3].contains("o") && board[5][4].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 23,28,33 O
            for (int j = 0; j < 1; j++) {

                if (board[3][4].contains("o") && board[4][3].contains("o") && board[5][2].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 22,29,36 X
            for (int j = 0; j < 1; j++) {

                if (board[3][3].contains("x") && board[4][4].contains("x") && board[5][5].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 24,29,34 X
            for (int j = 0; j < 1; j++) {

                if (board[5][3].contains("x") && board[4][4].contains("x") && board[5][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 22,29,36 O
            for (int j = 0; j < 1; j++) {

                if (board[3][3].contains("x") && board[4][4].contains("x") && board[5][5].contains("x")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 24,29,34 O
            for (int j = 0; j < 1; j++) {

                if (board[5][3].contains("x") && board[4][4].contains("x") && board[5][3].contains("x")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }

    }

    public static void digonalPoint7X7(String[][] board, int size, String player1Name, String player2Name) {
        counterX = 0;
        counterO = 0;

        for (int i = 0; i < 1; i++) {// 1,9,17 X
            for (int j = 0; j < 1; j++) {

                if (board[0][0].contains("x") && board[1][1].contains("x") && board[2][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 3,9,15 X
            for (int j = 0; j < 1; j++) {

                if (board[0][2].contains("x") && board[1][1].contains("x") && board[2][0].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 1,9,17 O
            for (int j = 0; j < 1; j++) {

                if (board[0][0].contains("o") && board[1][1].contains("o") && board[2][2].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 3,9,15 O
            for (int j = 0; j < 1; j++) {

                if (board[0][2].contains("o") && board[1][1].contains("o") && board[2][0].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 2,10,18 X
            for (int j = 0; j < 1; j++) {
                if (board[0][1].contains("x") && board[1][2].contains("x") && board[2][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 4,10,16 X
            for (int j = 0; j < 1; j++) {
                if (board[0][3].contains("x") && board[1][2].contains("x") && board[2][1].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 2,10,18 O
            for (int j = 0; j < 1; j++) {
                if (board[0][1].contains("o") && board[1][2].contains("o") && board[2][3].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 4,10,16 O
            for (int j = 0; j < 1; j++) {
                if (board[0][3].contains("o") && board[1][2].contains("o") && board[2][1].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 3,11,19 X
            for (int j = 0; j < 1; j++) {
                if (board[0][2].contains("x") && board[1][3].contains("x") && board[2][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 5,11,17 X
            for (int j = 0; j < 1; j++) {
                if (board[0][4].contains("x") && board[1][3].contains("x") && board[2][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 3,11,19 O
            for (int j = 0; j < 1; j++) {
                if (board[0][2].contains("o") && board[1][3].contains("o") && board[2][4].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 5,11,17 O
            for (int j = 0; j < 1; j++) {
                if (board[0][4].contains("o") && board[1][3].contains("o") && board[2][2].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 4,12,20 X
            for (int j = 0; j < 1; j++) {
                if (board[0][3].contains("x") && board[1][4].contains("x") && board[2][5].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 6,12,18 X
            for (int j = 0; j < 1; j++) {
                if (board[0][5].contains("x") && board[1][4].contains("x") && board[2][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 4,12,20 O
            for (int j = 0; j < 1; j++) {
                if (board[0][3].contains("o") && board[1][4].contains("o") && board[2][5].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 6,12,18 O
            for (int j = 0; j < 1; j++) {
                if (board[0][5].contains("o") && board[1][4].contains("o") && board[2][3].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 5,13,21X
            for (int j = 0; j < 1; j++) {
                if (board[0][4].contains("x") && board[1][5].contains("x") && board[2][6].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 7,13,19 X
            for (int j = 0; j < 1; j++) {
                if (board[0][6].contains("x") && board[1][5].contains("x") && board[2][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 5,13,21 O
            for (int j = 0; j < 1; j++) {
                if (board[0][4].contains("o") && board[1][5].contains("o") && board[2][6].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 7,13,19 O
            for (int j = 0; j < 1; j++) {
                if (board[0][6].contains("o") && board[1][5].contains("o") && board[2][4].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 8,16,24 X
            for (int j = 0; j < 1; j++) {

                if (board[1][0].contains("x") && board[2][1].contains("x") && board[3][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 10,16,22 X
            for (int j = 0; j < 1; j++) {

                if (board[1][2].contains("x") && board[2][1].contains("x") && board[3][0].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 8,16,24 O
            for (int j = 0; j < 1; j++) {

                if (board[1][0].contains("o") && board[2][1].contains("o") && board[3][2].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 10,16,22 O
            for (int j = 0; j < 1; j++) {

                if (board[1][2].contains("o") && board[2][1].contains("o") && board[3][0].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 9,17,25 X
            for (int j = 0; j < 1; j++) {

                if (board[1][1].contains("x") && board[2][2].contains("x") && board[3][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 11,17,23 X
            for (int j = 0; j < 1; j++) {

                if (board[1][3].contains("x") && board[2][2].contains("x") && board[3][1].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 9,17,25 O
            for (int j = 0; j < 1; j++) {

                if (board[1][1].contains("o") && board[2][2].contains("o") && board[3][3].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 11,17,23 O
            for (int j = 0; j < 1; j++) {

                if (board[1][3].contains("o") && board[2][2].contains("o") && board[3][1].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 10,18,26 X
            for (int j = 0; j < 1; j++) {

                if (board[1][2].contains("x") && board[2][3].contains("x") && board[3][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 12,18,24 X
            for (int j = 0; j < 1; j++) {

                if (board[1][4].contains("x") && board[2][3].contains("x") && board[3][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 10,18,26 O
            for (int j = 0; j < 1; j++) {

                if (board[1][2].contains("o") && board[2][3].contains("o") && board[3][4].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 12,18,24 O
            for (int j = 0; j < 1; j++) {

                if (board[1][4].contains("o") && board[2][3].contains("o") && board[3][2].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 11,19,27 X
            for (int j = 0; j < 1; j++) {

                if (board[1][3].contains("x") && board[2][4].contains("x") && board[3][5].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 13,19,25 X
            for (int j = 0; j < 1; j++) {

                if (board[1][5].contains("x") && board[2][4].contains("x") && board[3][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 11,19,27 O
            for (int j = 0; j < 1; j++) {

                if (board[1][3].contains("o") && board[2][4].contains("o") && board[3][5].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 13,19,25 O
            for (int j = 0; j < 1; j++) {

                if (board[1][5].contains("o") && board[2][4].contains("o") && board[3][3].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 12,20,28 X
            for (int j = 0; j < 1; j++) {

                if (board[1][4].contains("x") && board[2][5].contains("x") && board[3][6].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 14,20,26 X
            for (int j = 0; j < 1; j++) {

                if (board[1][6].contains("x") && board[2][5].contains("x") && board[3][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 12,20,28 X
            for (int j = 0; j < 1; j++) {

                if (board[1][4].contains("x") && board[2][5].contains("x") && board[3][6].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 14,20,26 O
            for (int j = 0; j < 1; j++) {

                if (board[1][6].contains("x") && board[2][5].contains("x") && board[3][4].contains("x")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        // ***************************************************************************************************
        for (int i = 0; i < 1; i++) {// 15,,23,31 X
            for (int j = 0; j < 1; j++) {

                if (board[2][0].contains("x") && board[3][1].contains("x") && board[4][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 17,23,29 X
            for (int j = 0; j < 1; j++) {

                if (board[2][2].contains("x") && board[3][1].contains("x") && board[4][0].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 15,,23,31 O
            for (int j = 0; j < 1; j++) {

                if (board[2][0].contains("o") && board[3][1].contains("o") && board[4][2].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 17,23,29 O
            for (int j = 0; j < 1; j++) {

                if (board[2][2].contains("o") && board[3][1].contains("o") && board[4][0].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        } //
        for (int i = 0; i < 1; i++) {// 16,24,32 X
            for (int j = 0; j < 1; j++) {

                if (board[2][1].contains("x") && board[3][2].contains("x") && board[4][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 18,24,30 X
            for (int j = 0; j < 1; j++) {

                if (board[2][3].contains("x") && board[3][2].contains("x") && board[4][1].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 16,24,32 O
            for (int j = 0; j < 1; j++) {

                if (board[2][1].contains("o") && board[3][2].contains("o") && board[4][3].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 18,24,30 O
            for (int j = 0; j < 1; j++) {

                if (board[2][3].contains("o") && board[3][2].contains("o") && board[4][1].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 17,25,33 X
            for (int j = 0; j < 1; j++) {

                if (board[2][2].contains("x") && board[3][3].contains("x") && board[4][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 19,25,31 X
            for (int j = 0; j < 1; j++) {

                if (board[2][4].contains("x") && board[3][3].contains("x") && board[4][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 17,25,33 O
            for (int j = 0; j < 1; j++) {

                if (board[2][2].contains("o") && board[3][3].contains("o") && board[4][4].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 19,25,31 O
            for (int j = 0; j < 1; j++) {

                if (board[2][4].contains("o") && board[3][3].contains("o") && board[4][2].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 18,26,34 X
            for (int j = 0; j < 1; j++) {

                if (board[2][3].contains("x") && board[3][4].contains("x") && board[4][5].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 20,26,32 X
            for (int j = 0; j < 1; j++) {

                if (board[2][5].contains("x") && board[3][4].contains("x") && board[4][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 18,26,34 O
            for (int j = 0; j < 1; j++) {

                if (board[2][3].contains("o") && board[3][4].contains("o") && board[4][5].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 20,26,32 O
            for (int j = 0; j < 1; j++) {

                if (board[2][5].contains("o") && board[3][4].contains("o") && board[4][3].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 19,27,35 X
            for (int j = 0; j < 1; j++) {

                if (board[2][4].contains("x") && board[3][5].contains("x") && board[4][6].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 21,27,33 X
            for (int j = 0; j < 1; j++) {

                if (board[2][6].contains("x") && board[3][5].contains("x") && board[4][6].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 19,27,35 O
            for (int j = 0; j < 1; j++) {

                if (board[2][4].contains("o") && board[3][5].contains("o") && board[4][6].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 21,27,33 O
            for (int j = 0; j < 1; j++) {

                if (board[2][6].contains("o") && board[3][5].contains("o") && board[4][6].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 22,30,38 X
            for (int j = 0; j < 1; j++) {

                if (board[3][0].contains("x") && board[4][1].contains("x") && board[5][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 24,30,36 X
            for (int j = 0; j < 1; j++) {

                if (board[3][2].contains("x") && board[4][1].contains("x") && board[5][0].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 22,30,38 O
            for (int j = 0; j < 1; j++) {

                if (board[3][0].contains("o") && board[4][1].contains("o") && board[5][2].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 24,30,36 O
            for (int j = 0; j < 1; j++) {

                if (board[3][2].contains("o") && board[4][1].contains("o") && board[5][0].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 23,31,39 X
            for (int j = 0; j < 1; j++) {

                if (board[3][1].contains("x") && board[4][2].contains("x") && board[5][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 25,31,37 X
            for (int j = 0; j < 1; j++) {

                if (board[3][4].contains("x") && board[4][2].contains("x") && board[5][1].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 23,31,39 O
            for (int j = 0; j < 1; j++) {

                if (board[3][1].contains("o") && board[4][2].contains("o") && board[5][3].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 25,31,37 O
            for (int j = 0; j < 1; j++) {

                if (board[3][4].contains("o") && board[4][2].contains("o") && board[5][1].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 24,32,40 X
            for (int j = 0; j < 1; j++) {

                if (board[3][2].contains("x") && board[4][3].contains("x") && board[5][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 26,32,38 X
            for (int j = 0; j < 1; j++) {

                if (board[3][4].contains("x") && board[4][3].contains("x") && board[5][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 24,32,40 O
            for (int j = 0; j < 1; j++) {

                if (board[3][2].contains("o") && board[4][3].contains("o") && board[5][4].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 26,32,38 O
            for (int j = 0; j < 1; j++) {

                if (board[3][4].contains("o") && board[4][3].contains("o") && board[5][2].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 25,33,41 X
            for (int j = 0; j < 1; j++) {

                if (board[3][3].contains("x") && board[4][4].contains("x") && board[5][5].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 27,33,39 X
            for (int j = 0; j < 1; j++) {

                if (board[5][3].contains("x") && board[4][4].contains("x") && board[5][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 25,33,41 O
            for (int j = 0; j < 1; j++) {

                if (board[3][3].contains("x") && board[4][4].contains("x") && board[5][5].contains("x")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 27,33,39 O
            for (int j = 0; j < 1; j++) {

                if (board[5][3].contains("x") && board[4][4].contains("x") && board[5][3].contains("x")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 26,34,42 X
            for (int j = 0; j < 1; j++) {

                if (board[3][4].contains("x") && board[4][5].contains("x") && board[5][6].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 28,34,40 X
            for (int j = 0; j < 1; j++) {

                if (board[3][6].contains("x") && board[4][5].contains("x") && board[5][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 26,34,42 O
            for (int j = 0; j < 1; j++) {

                if (board[3][4].contains("o") && board[4][5].contains("o") && board[5][6].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 28,34,40 O
            for (int j = 0; j < 1; j++) {

                if (board[3][6].contains("o") && board[4][5].contains("o") && board[5][4].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 29,37,45 X
            for (int j = 0; j < 1; j++) {

                if (board[4][0].contains("x") && board[5][1].contains("x") && board[6][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 31,37,43 X
            for (int j = 0; j < 1; j++) {

                if (board[4][2].contains("x") && board[5][1].contains("x") && board[6][0].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 29,37,45 O
            for (int j = 0; j < 1; j++) {

                if (board[4][0].contains("o") && board[5][1].contains("o") && board[6][2].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 31,37,43 O
            for (int j = 0; j < 1; j++) {

                if (board[4][2].contains("o") && board[5][1].contains("o") && board[6][0].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 30,38,46 X
            for (int j = 0; j < 1; j++) {

                if (board[4][1].contains("x") && board[5][2].contains("x") && board[6][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 32,38,44 X
            for (int j = 0; j < 1; j++) {

                if (board[4][3].contains("x") && board[5][2].contains("x") && board[6][1].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 30,38,46 O
            for (int j = 0; j < 1; j++) {

                if (board[4][1].contains("o") && board[5][2].contains("o") && board[6][3].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 32,38,44 O
            for (int j = 0; j < 1; j++) {

                if (board[4][3].contains("o") && board[5][2].contains("o") && board[6][1].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 31,39,47 X
            for (int j = 0; j < 1; j++) {

                if (board[4][2].contains("x") && board[5][3].contains("x") && board[6][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 33,39,4 X
            for (int j = 0; j < 1; j++) {

                if (board[4][4].contains("x") && board[5][3].contains("x") && board[6][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 31,39,47 O
            for (int j = 0; j < 1; j++) {

                if (board[4][2].contains("o") && board[5][3].contains("o") && board[6][4].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 33,39,4 O
            for (int j = 0; j < 1; j++) {

                if (board[4][4].contains("o") && board[5][3].contains("o") && board[6][2].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 32,40,48 X
            for (int j = 0; j < 1; j++) {

                if (board[4][3].contains("x") && board[5][4].contains("x") && board[6][5].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 34,40,46 X
            for (int j = 0; j < 1; j++) {

                if (board[4][5].contains("x") && board[5][4].contains("x") && board[6][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 32,40,48 O
            for (int j = 0; j < 1; j++) {

                if (board[4][3].contains("o") && board[5][4].contains("o") && board[6][5].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 34,40,46 O
            for (int j = 0; j < 1; j++) {

                if (board[4][5].contains("o") && board[5][4].contains("o") && board[6][3].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 33,41,49 X
            for (int j = 0; j < 1; j++) {

                if (board[4][4].contains("x") && board[5][5].contains("x") && board[6][6].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 35,41,47 X
            for (int j = 0; j < 1; j++) {

                if (board[4][6].contains("x") && board[5][5].contains("x") && board[6][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 33,41,49 O
            for (int j = 0; j < 1; j++) {

                if (board[4][4].contains("o") && board[5][5].contains("o") && board[6][6].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 35,41,47 O
            for (int j = 0; j < 1; j++) {

                if (board[4][6].contains("o") && board[5][5].contains("o") && board[6][4].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }

    }

    public static void digonalPoint8X8(String[][] board, int size, String player1Name, String player2Name) {
        counterX = 0;
        counterO = 0;

        for (int i = 0; i < 1; i++) {// 1,10,19 X
            for (int j = 0; j < 1; j++) {

                if (board[0][0].contains("x") && board[1][1].contains("x") && board[2][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 3,10,17 X
            for (int j = 0; j < 1; j++) {

                if (board[0][2].contains("x") && board[1][1].contains("x") && board[2][0].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 1,10,19 O
            for (int j = 0; j < 1; j++) {

                if (board[0][0].contains("o") && board[1][1].contains("o") && board[2][2].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 3,10,17 O
            for (int j = 0; j < 1; j++) {

                if (board[0][2].contains("o") && board[1][1].contains("o") && board[2][0].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 2,11,20 X
            for (int j = 0; j < 1; j++) {
                if (board[0][1].contains("x") && board[1][2].contains("x") && board[2][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 4,11,18 X
            for (int j = 0; j < 1; j++) {
                if (board[0][3].contains("x") && board[1][2].contains("x") && board[2][1].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 2,11,20 O
            for (int j = 0; j < 1; j++) {
                if (board[0][1].contains("o") && board[1][2].contains("o") && board[2][3].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 4,11,18 O
            for (int j = 0; j < 1; j++) {
                if (board[0][3].contains("o") && board[1][2].contains("o") && board[2][1].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 3,12,21 X
            for (int j = 0; j < 1; j++) {
                if (board[0][2].contains("x") && board[1][3].contains("x") && board[2][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 5,12,19 X
            for (int j = 0; j < 1; j++) {
                if (board[0][4].contains("x") && board[1][3].contains("x") && board[2][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 3,12,21 O
            for (int j = 0; j < 1; j++) {
                if (board[0][2].contains("o") && board[1][3].contains("o") && board[2][4].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 5,12,19 O
            for (int j = 0; j < 1; j++) {
                if (board[0][4].contains("o") && board[1][3].contains("o") && board[2][2].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 4,13,22 X
            for (int j = 0; j < 1; j++) {
                if (board[0][3].contains("x") && board[1][4].contains("x") && board[2][5].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 6,13,20 X
            for (int j = 0; j < 1; j++) {
                if (board[0][5].contains("x") && board[1][4].contains("x") && board[2][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 4,13,22 O
            for (int j = 0; j < 1; j++) {
                if (board[0][3].contains("o") && board[1][4].contains("o") && board[2][5].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 6,13,20 O
            for (int j = 0; j < 1; j++) {
                if (board[0][5].contains("o") && board[1][4].contains("o") && board[2][3].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 5,14,23X
            for (int j = 0; j < 1; j++) {
                if (board[0][4].contains("x") && board[1][5].contains("x") && board[2][6].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 7,14,21 X
            for (int j = 0; j < 1; j++) {
                if (board[0][6].contains("x") && board[1][5].contains("x") && board[2][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 5,14,23 O
            for (int j = 0; j < 1; j++) {
                if (board[0][4].contains("o") && board[1][5].contains("o") && board[2][6].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 7,14,21 O
            for (int j = 0; j < 1; j++) {
                if (board[0][6].contains("o") && board[1][5].contains("o") && board[2][4].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 6,15,24X
            for (int j = 0; j < 1; j++) {
                if (board[0][5].contains("x") && board[1][6].contains("x") && board[2][7].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 7,14,21 X
            for (int j = 0; j < 1; j++) {
                if (board[0][7].contains("x") && board[1][6].contains("x") && board[2][5].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 6,15,24 O
            for (int j = 0; j < 1; j++) {
                if (board[0][5].contains("o") && board[1][6].contains("o") && board[2][7].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 7,14,21 O
            for (int j = 0; j < 1; j++) {
                if (board[0][7].contains("o") && board[1][6].contains("o") && board[2][5].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 9,18,27 X
            for (int j = 0; j < 1; j++) {

                if (board[1][0].contains("x") && board[2][1].contains("x") && board[3][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 10,16,22 X
            for (int j = 0; j < 1; j++) {

                if (board[1][2].contains("x") && board[2][1].contains("x") && board[3][0].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 9,18,27 O
            for (int j = 0; j < 1; j++) {

                if (board[1][0].contains("o") && board[2][1].contains("o") && board[3][2].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 10,16,22 O
            for (int j = 0; j < 1; j++) {

                if (board[1][2].contains("o") && board[2][1].contains("o") && board[3][0].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 10,19,28 X
            for (int j = 0; j < 1; j++) {

                if (board[1][1].contains("x") && board[2][2].contains("x") && board[3][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 12,19,26 X
            for (int j = 0; j < 1; j++) {

                if (board[1][3].contains("x") && board[2][2].contains("x") && board[3][1].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 10,19,28 O
            for (int j = 0; j < 1; j++) {

                if (board[1][1].contains("o") && board[2][2].contains("o") && board[3][3].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 12,19,26 O
            for (int j = 0; j < 1; j++) {

                if (board[1][3].contains("o") && board[2][2].contains("o") && board[3][1].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 11,20,29 X
            for (int j = 0; j < 1; j++) {

                if (board[1][2].contains("x") && board[2][3].contains("x") && board[3][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 13,20,27 X
            for (int j = 0; j < 1; j++) {

                if (board[1][4].contains("x") && board[2][3].contains("x") && board[3][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 11,20,29 O
            for (int j = 0; j < 1; j++) {

                if (board[1][2].contains("o") && board[2][3].contains("o") && board[3][4].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 13,20,27 O
            for (int j = 0; j < 1; j++) {

                if (board[1][4].contains("o") && board[2][3].contains("o") && board[3][2].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 12,21,30 X
            for (int j = 0; j < 1; j++) {

                if (board[1][3].contains("x") && board[2][4].contains("x") && board[3][5].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 14,21,28 X
            for (int j = 0; j < 1; j++) {

                if (board[1][5].contains("x") && board[2][4].contains("x") && board[3][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 12,21,30 O
            for (int j = 0; j < 1; j++) {

                if (board[1][3].contains("o") && board[2][4].contains("o") && board[3][5].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 14,21,28 O
            for (int j = 0; j < 1; j++) {

                if (board[1][5].contains("o") && board[2][4].contains("o") && board[3][3].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 13,22,31 X
            for (int j = 0; j < 1; j++) {

                if (board[1][4].contains("x") && board[2][5].contains("x") && board[3][6].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 15,22,29 X
            for (int j = 0; j < 1; j++) {

                if (board[1][6].contains("x") && board[2][5].contains("x") && board[3][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 13,22,31 X
            for (int j = 0; j < 1; j++) {

                if (board[1][4].contains("x") && board[2][5].contains("x") && board[3][6].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 15,22,29 O
            for (int j = 0; j < 1; j++) {

                if (board[1][6].contains("x") && board[2][5].contains("x") && board[3][4].contains("x")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 14,23,32 X
            for (int j = 0; j < 1; j++) {

                if (board[1][5].contains("x") && board[2][6].contains("x") && board[3][7].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 16,23,30 X
            for (int j = 0; j < 1; j++) {

                if (board[1][7].contains("x") && board[2][6].contains("x") && board[3][5].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 14,23,32 O
            for (int j = 0; j < 1; j++) {

                if (board[1][5].contains("o") && board[2][6].contains("o") && board[3][7].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 16,23,30 O
            for (int j = 0; j < 1; j++) {

                if (board[1][7].contains("o") && board[2][6].contains("o") && board[3][5].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 17,,26,35 X
            for (int j = 0; j < 1; j++) {

                if (board[2][0].contains("x") && board[3][1].contains("x") && board[4][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 19,26,33 X
            for (int j = 0; j < 1; j++) {

                if (board[2][2].contains("x") && board[3][1].contains("x") && board[4][0].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 17,,26,35 O
            for (int j = 0; j < 1; j++) {

                if (board[2][0].contains("o") && board[3][1].contains("o") && board[4][2].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 19,26,33 O
            for (int j = 0; j < 1; j++) {

                if (board[2][2].contains("o") && board[3][1].contains("o") && board[4][0].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        } //
        for (int i = 0; i < 1; i++) {// 18,27,36 X
            for (int j = 0; j < 1; j++) {

                if (board[2][1].contains("x") && board[3][2].contains("x") && board[4][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 20,27,34 X
            for (int j = 0; j < 1; j++) {

                if (board[2][3].contains("x") && board[3][2].contains("x") && board[4][1].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 18,27,36 O
            for (int j = 0; j < 1; j++) {

                if (board[2][1].contains("o") && board[3][2].contains("o") && board[4][3].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 20,27,34 O
            for (int j = 0; j < 1; j++) {

                if (board[2][3].contains("o") && board[3][2].contains("o") && board[4][1].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 19,28,37 X
            for (int j = 0; j < 1; j++) {

                if (board[2][2].contains("x") && board[3][3].contains("x") && board[4][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 21,28,35 X
            for (int j = 0; j < 1; j++) {

                if (board[2][4].contains("x") && board[3][3].contains("x") && board[4][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 19,28,37 O
            for (int j = 0; j < 1; j++) {

                if (board[2][2].contains("o") && board[3][3].contains("o") && board[4][4].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 21,28,35 O
            for (int j = 0; j < 1; j++) {

                if (board[2][4].contains("o") && board[3][3].contains("o") && board[4][2].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 20,29,38 X
            for (int j = 0; j < 1; j++) {

                if (board[2][3].contains("x") && board[3][4].contains("x") && board[4][5].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 22,29,36 X
            for (int j = 0; j < 1; j++) {

                if (board[2][5].contains("x") && board[3][4].contains("x") && board[4][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 20,29,38 O
            for (int j = 0; j < 1; j++) {

                if (board[2][3].contains("o") && board[3][4].contains("o") && board[4][5].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 22,29,36 O
            for (int j = 0; j < 1; j++) {

                if (board[2][5].contains("o") && board[3][4].contains("o") && board[4][3].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 21,30,39 X
            for (int j = 0; j < 1; j++) {

                if (board[2][4].contains("x") && board[3][5].contains("x") && board[4][6].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 23,30,37 X
            for (int j = 0; j < 1; j++) {

                if (board[2][6].contains("x") && board[3][5].contains("x") && board[4][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 21,30,39 O
            for (int j = 0; j < 1; j++) {

                if (board[2][4].contains("o") && board[3][5].contains("o") && board[4][6].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 23,30,37 O
            for (int j = 0; j < 1; j++) {

                if (board[2][6].contains("o") && board[3][5].contains("o") && board[4][4].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 22,31,40 X
            for (int j = 0; j < 1; j++) {

                if (board[2][5].contains("x") && board[3][6].contains("x") && board[4][7].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 24,31,38 X
            for (int j = 0; j < 1; j++) {

                if (board[2][7].contains("x") && board[3][6].contains("x") && board[4][5].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 22,31,40 O
            for (int j = 0; j < 1; j++) {

                if (board[2][5].contains("o") && board[3][6].contains("o") && board[4][7].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 24,31,38 O
            for (int j = 0; j < 1; j++) {

                if (board[2][7].contains("o") && board[3][6].contains("o") && board[4][5].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 25,34,43 X
            for (int j = 0; j < 1; j++) {

                if (board[3][0].contains("x") && board[4][1].contains("x") && board[5][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 27,34,41 X
            for (int j = 0; j < 1; j++) {

                if (board[3][2].contains("x") && board[4][1].contains("x") && board[5][0].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 25,34,43 O
            for (int j = 0; j < 1; j++) {

                if (board[3][0].contains("o") && board[4][1].contains("o") && board[5][2].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 27,34,41 O
            for (int j = 0; j < 1; j++) {

                if (board[3][2].contains("o") && board[4][1].contains("o") && board[5][0].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 26,35,44 X
            for (int j = 0; j < 1; j++) {

                if (board[3][1].contains("x") && board[4][2].contains("x") && board[5][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 28,35,42 X
            for (int j = 0; j < 1; j++) {

                if (board[3][4].contains("x") && board[4][2].contains("x") && board[5][1].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 26,35,44 O
            for (int j = 0; j < 1; j++) {

                if (board[3][1].contains("o") && board[4][2].contains("o") && board[5][3].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 28,35,42 O
            for (int j = 0; j < 1; j++) {

                if (board[3][4].contains("o") && board[4][2].contains("o") && board[5][1].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 27,36,45 X
            for (int j = 0; j < 1; j++) {

                if (board[3][2].contains("x") && board[4][3].contains("x") && board[5][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 29,36,43 X
            for (int j = 0; j < 1; j++) {

                if (board[3][4].contains("x") && board[4][3].contains("x") && board[5][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 27,36,45 O
            for (int j = 0; j < 1; j++) {

                if (board[3][2].contains("o") && board[4][3].contains("o") && board[5][4].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 29,36,43 O
            for (int j = 0; j < 1; j++) {

                if (board[3][4].contains("o") && board[4][3].contains("o") && board[5][2].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 28,37,46 X
            for (int j = 0; j < 1; j++) {

                if (board[3][3].contains("x") && board[4][4].contains("x") && board[5][5].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 30,37,44 X
            for (int j = 0; j < 1; j++) {

                if (board[5][3].contains("x") && board[4][4].contains("x") && board[5][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 28,37,46 O
            for (int j = 0; j < 1; j++) {

                if (board[3][3].contains("x") && board[4][4].contains("x") && board[5][5].contains("x")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 30,37,44 O
            for (int j = 0; j < 1; j++) {

                if (board[5][3].contains("x") && board[4][4].contains("x") && board[5][3].contains("x")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 29,38,47 X
            for (int j = 0; j < 1; j++) {

                if (board[3][4].contains("x") && board[4][5].contains("x") && board[5][6].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 31,38,45 X
            for (int j = 0; j < 1; j++) {

                if (board[3][6].contains("x") && board[4][5].contains("x") && board[5][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 29,38,47 O
            for (int j = 0; j < 1; j++) {

                if (board[3][4].contains("o") && board[4][5].contains("o") && board[5][6].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 31,38,45 O
            for (int j = 0; j < 1; j++) {

                if (board[3][6].contains("o") && board[4][5].contains("o") && board[5][4].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 30,39,48 X
            for (int j = 0; j < 1; j++) {

                if (board[3][5].contains("x") && board[4][6].contains("x") && board[5][7].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 32,39,46 X
            for (int j = 0; j < 1; j++) {

                if (board[3][7].contains("x") && board[4][6].contains("x") && board[5][5].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 30,39,48 O
            for (int j = 0; j < 1; j++) {

                if (board[3][5].contains("o") && board[4][6].contains("o") && board[5][7].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 32,39,46 O
            for (int j = 0; j < 1; j++) {

                if (board[3][7].contains("o") && board[4][6].contains("o") && board[5][5].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 33,42,51 X
            for (int j = 0; j < 1; j++) {

                if (board[4][0].contains("x") && board[5][1].contains("x") && board[6][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 35,42,49 X
            for (int j = 0; j < 1; j++) {

                if (board[4][2].contains("x") && board[5][1].contains("x") && board[6][0].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 33,42,51 O
            for (int j = 0; j < 1; j++) {

                if (board[4][0].contains("o") && board[5][1].contains("o") && board[6][2].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 35,42,49 O
            for (int j = 0; j < 1; j++) {

                if (board[4][2].contains("o") && board[5][1].contains("o") && board[6][0].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 34,43,52 X
            for (int j = 0; j < 1; j++) {

                if (board[4][1].contains("x") && board[5][2].contains("x") && board[6][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 36,43,50 X
            for (int j = 0; j < 1; j++) {

                if (board[4][3].contains("x") && board[5][2].contains("x") && board[6][1].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 34,43,52 O
            for (int j = 0; j < 1; j++) {

                if (board[4][1].contains("o") && board[5][2].contains("o") && board[6][3].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 36,43,50 O
            for (int j = 0; j < 1; j++) {

                if (board[4][3].contains("o") && board[5][2].contains("o") && board[6][1].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 35,44,53 X
            for (int j = 0; j < 1; j++) {

                if (board[4][2].contains("x") && board[5][3].contains("x") && board[6][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 37,44,41 X
            for (int j = 0; j < 1; j++) {

                if (board[4][4].contains("x") && board[5][3].contains("x") && board[6][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 35,44,53 O
            for (int j = 0; j < 1; j++) {

                if (board[4][2].contains("o") && board[5][3].contains("o") && board[6][4].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 37,44,41 O
            for (int j = 0; j < 1; j++) {

                if (board[4][4].contains("o") && board[5][3].contains("o") && board[6][2].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 36,45,54 X
            for (int j = 0; j < 1; j++) {

                if (board[4][3].contains("x") && board[5][4].contains("x") && board[6][5].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 38,45,52 X
            for (int j = 0; j < 1; j++) {

                if (board[4][5].contains("x") && board[5][4].contains("x") && board[6][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 36,45,54 O
            for (int j = 0; j < 1; j++) {

                if (board[4][3].contains("o") && board[5][4].contains("o") && board[6][5].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 38,45,52 O
            for (int j = 0; j < 1; j++) {

                if (board[4][5].contains("o") && board[5][4].contains("o") && board[6][3].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 37,46,55 X
            for (int j = 0; j < 1; j++) {

                if (board[4][4].contains("x") && board[5][5].contains("x") && board[6][6].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 39,46,53 X
            for (int j = 0; j < 1; j++) {

                if (board[4][6].contains("x") && board[5][5].contains("x") && board[6][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 37,46,55 O
            for (int j = 0; j < 1; j++) {

                if (board[4][4].contains("o") && board[5][5].contains("o") && board[6][6].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 39,46,53 O
            for (int j = 0; j < 1; j++) {

                if (board[4][6].contains("o") && board[5][5].contains("o") && board[6][4].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 38,47,56 X
            for (int j = 0; j < 1; j++) {

                if (board[4][5].contains("x") && board[5][6].contains("x") && board[6][7].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 40,47,54 X
            for (int j = 0; j < 1; j++) {

                if (board[4][7].contains("x") && board[5][6].contains("x") && board[6][5].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 38,47,56 O
            for (int j = 0; j < 1; j++) {

                if (board[4][5].contains("o") && board[5][6].contains("o") && board[6][7].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 40,47,54 O
            for (int j = 0; j < 1; j++) {

                if (board[4][7].contains("o") && board[5][6].contains("o") && board[6][5].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 41,50,59 X
            for (int j = 0; j < 1; j++) {

                if (board[5][0].contains("x") && board[6][1].contains("x") && board[7][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 40,47,54 X
            for (int j = 0; j < 1; j++) {

                if (board[5][2].contains("x") && board[6][1].contains("x") && board[7][0].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 41,50,59 O
            for (int j = 0; j < 1; j++) {

                if (board[5][0].contains("o") && board[6][1].contains("o") && board[7][2].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 40,47,54 O
            for (int j = 0; j < 1; j++) {

                if (board[5][2].contains("o") && board[6][1].contains("o") && board[7][0].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 42,51,60 X
            for (int j = 0; j < 1; j++) {

                if (board[5][1].contains("x") && board[6][2].contains("x") && board[7][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 44,51,58 X
            for (int j = 0; j < 1; j++) {

                if (board[5][3].contains("x") && board[6][2].contains("x") && board[7][1].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 42,51,60 O
            for (int j = 0; j < 1; j++) {

                if (board[5][1].contains("o") && board[6][2].contains("o") && board[7][3].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 44,51,58 O
            for (int j = 0; j < 1; j++) {

                if (board[5][3].contains("o") && board[6][2].contains("o") && board[7][1].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 43,52,61 X
            for (int j = 0; j < 1; j++) {

                if (board[5][2].contains("x") && board[6][3].contains("x") && board[7][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 45,52,59 X
            for (int j = 0; j < 1; j++) {

                if (board[5][4].contains("x") && board[6][3].contains("x") && board[7][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 43,52,61 O
            for (int j = 0; j < 1; j++) {

                if (board[5][2].contains("o") && board[6][3].contains("o") && board[7][4].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 45,52,59 O
            for (int j = 0; j < 1; j++) {

                if (board[5][4].contains("o") && board[6][3].contains("o") && board[7][2].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 44,53,62 X
            for (int j = 0; j < 1; j++) {

                if (board[5][3].contains("x") && board[6][4].contains("x") && board[7][5].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 46,53,60 X
            for (int j = 0; j < 1; j++) {

                if (board[5][5].contains("x") && board[6][4].contains("x") && board[7][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 44,53,62 O
            for (int j = 0; j < 1; j++) {

                if (board[5][3].contains("o") && board[6][4].contains("o") && board[7][5].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 46,53,60 O
            for (int j = 0; j < 1; j++) {

                if (board[5][5].contains("o") && board[6][4].contains("o") && board[7][3].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 45,54,63 X
            for (int j = 0; j < 1; j++) {

                if (board[5][4].contains("x") && board[6][5].contains("x") && board[7][6].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 47,54,61 X
            for (int j = 0; j < 1; j++) {

                if (board[5][6].contains("x") && board[6][5].contains("x") && board[7][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 45,54,63 O
            for (int j = 0; j < 1; j++) {

                if (board[5][4].contains("o") && board[6][5].contains("o") && board[7][6].contains("o")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 47,54,61 O
            for (int j = 0; j < 1; j++) {

                if (board[5][6].contains("o") && board[6][5].contains("o") && board[7][4].contains("o")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 46,55,64 X
            for (int j = 0; j < 1; j++) {

                if (board[5][5].contains("x") && board[6][6].contains("x") && board[7][7].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 48,55,62 X
            for (int j = 0; j < 1; j++) {

                if (board[5][7].contains("x") && board[6][6].contains("x") && board[7][5].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 46,55,64 O
            for (int j = 0; j < 1; j++) {

                if (board[5][5].contains("o") && board[6][6].contains("o") && board[7][7].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 48,55,62 O
            for (int j = 0; j < 1; j++) {

                if (board[5][7].contains("o") && board[6][6].contains("o") && board[7][5].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }

    }

    public static void digonalPoint9X9(String[][] board, int size, String player1Name, String player2Name) {
        counterX = 0;
        counterO = 0;

        for (int i = 0; i < 1; i++) {// 1,11,21 X
            for (int j = 0; j < 1; j++) {

                if (board[0][0].contains("x") && board[1][1].contains("x") && board[2][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 3,11,19 X
            for (int j = 0; j < 1; j++) {

                if (board[0][2].contains("x") && board[1][1].contains("x") && board[2][0].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 1,11,21 O
            for (int j = 0; j < 1; j++) {

                if (board[0][0].contains("o") && board[1][1].contains("o") && board[2][2].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 3,11,19 O
            for (int j = 0; j < 1; j++) {

                if (board[0][2].contains("o") && board[1][1].contains("o") && board[2][0].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 2,12,22 X
            for (int j = 0; j < 1; j++) {
                if (board[0][1].contains("x") && board[1][2].contains("x") && board[2][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 4,12,20 X
            for (int j = 0; j < 1; j++) {
                if (board[0][3].contains("x") && board[1][2].contains("x") && board[2][1].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 2,12,22 O
            for (int j = 0; j < 1; j++) {
                if (board[0][1].contains("o") && board[1][2].contains("o") && board[2][3].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 4,12,20 O
            for (int j = 0; j < 1; j++) {
                if (board[0][3].contains("o") && board[1][2].contains("o") && board[2][1].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 3,13,23 X
            for (int j = 0; j < 1; j++) {
                if (board[0][2].contains("x") && board[1][3].contains("x") && board[2][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 5,13,21 X
            for (int j = 0; j < 1; j++) {
                if (board[0][4].contains("x") && board[1][3].contains("x") && board[2][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 3,13,23 O
            for (int j = 0; j < 1; j++) {
                if (board[0][2].contains("o") && board[1][3].contains("o") && board[2][4].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 5,13,21 O
            for (int j = 0; j < 1; j++) {
                if (board[0][4].contains("o") && board[1][3].contains("o") && board[2][2].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 4,14,24 X
            for (int j = 0; j < 1; j++) {
                if (board[0][3].contains("x") && board[1][4].contains("x") && board[2][5].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 6,12,22 X
            for (int j = 0; j < 1; j++) {
                if (board[0][5].contains("x") && board[1][4].contains("x") && board[2][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 4,14,24 O
            for (int j = 0; j < 1; j++) {
                if (board[0][3].contains("o") && board[1][4].contains("o") && board[2][5].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 6,12,22 O
            for (int j = 0; j < 1; j++) {
                if (board[0][5].contains("o") && board[1][4].contains("o") && board[2][3].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 5,15,25 X
            for (int j = 0; j < 1; j++) {
                if (board[0][4].contains("x") && board[1][5].contains("x") && board[2][6].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 7,15,23 X
            for (int j = 0; j < 1; j++) {
                if (board[0][6].contains("x") && board[1][5].contains("x") && board[2][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 5,15,25 O
            for (int j = 0; j < 1; j++) {
                if (board[0][4].contains("o") && board[1][5].contains("o") && board[2][6].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 7,15,23 O
            for (int j = 0; j < 1; j++) {
                if (board[0][6].contains("o") && board[1][5].contains("o") && board[2][4].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 6,16,26 X
            for (int j = 0; j < 1; j++) {
                if (board[0][5].contains("x") && board[1][6].contains("x") && board[2][7].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 8,16,24 X
            for (int j = 0; j < 1; j++) {
                if (board[0][7].contains("x") && board[1][6].contains("x") && board[2][5].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 6,16,26 O
            for (int j = 0; j < 1; j++) {
                if (board[0][5].contains("o") && board[1][6].contains("o") && board[2][7].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 8,16,24 O
            for (int j = 0; j < 1; j++) {
                if (board[0][7].contains("o") && board[1][6].contains("o") && board[2][5].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 7,17,27 X
            for (int j = 0; j < 1; j++) {
                if (board[0][6].contains("x") && board[1][7].contains("x") && board[2][8].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 9,17,25 X
            for (int j = 0; j < 1; j++) {
                if (board[0][8].contains("x") && board[1][7].contains("x") && board[2][6].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 7,17,27 O
            for (int j = 0; j < 1; j++) {
                if (board[0][6].contains("o") && board[1][7].contains("o") && board[2][8].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 9,17,25 O
            for (int j = 0; j < 1; j++) {
                if (board[0][8].contains("o") && board[1][7].contains("o") && board[2][6].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 10,20,30 X
            for (int j = 0; j < 1; j++) {

                if (board[1][0].contains("x") && board[2][1].contains("x") && board[3][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 12,20,28 X
            for (int j = 0; j < 1; j++) {

                if (board[1][2].contains("x") && board[2][1].contains("x") && board[3][0].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 10,20,30 O
            for (int j = 0; j < 1; j++) {

                if (board[1][0].contains("o") && board[2][1].contains("o") && board[3][2].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 12,20,28 O
            for (int j = 0; j < 1; j++) {

                if (board[1][2].contains("o") && board[2][1].contains("o") && board[3][0].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 11,21,31 X
            for (int j = 0; j < 1; j++) {

                if (board[1][1].contains("x") && board[2][2].contains("x") && board[3][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 13,21,29 X
            for (int j = 0; j < 1; j++) {

                if (board[1][3].contains("x") && board[2][2].contains("x") && board[3][1].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 11,21,31 O
            for (int j = 0; j < 1; j++) {

                if (board[1][1].contains("o") && board[2][2].contains("o") && board[3][3].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 13,21,29 O
            for (int j = 0; j < 1; j++) {

                if (board[1][3].contains("o") && board[2][2].contains("o") && board[3][1].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 12,22,32 X
            for (int j = 0; j < 1; j++) {

                if (board[1][2].contains("x") && board[2][3].contains("x") && board[3][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 14,22,30 X
            for (int j = 0; j < 1; j++) {

                if (board[1][4].contains("x") && board[2][3].contains("x") && board[3][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 12,22,32 O
            for (int j = 0; j < 1; j++) {

                if (board[1][2].contains("o") && board[2][3].contains("o") && board[3][4].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 14,22,30 O
            for (int j = 0; j < 1; j++) {

                if (board[1][4].contains("o") && board[2][3].contains("o") && board[3][2].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 13,23,33 X
            for (int j = 0; j < 1; j++) {

                if (board[1][3].contains("x") && board[2][4].contains("x") && board[3][5].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 15,23,31 X
            for (int j = 0; j < 1; j++) {

                if (board[1][5].contains("x") && board[2][4].contains("x") && board[3][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 13,23,33 O
            for (int j = 0; j < 1; j++) {

                if (board[1][3].contains("o") && board[2][4].contains("o") && board[3][5].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 15,23,31 O
            for (int j = 0; j < 1; j++) {

                if (board[1][5].contains("o") && board[2][4].contains("o") && board[3][3].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 14,24,34 X
            for (int j = 0; j < 1; j++) {

                if (board[1][4].contains("x") && board[2][5].contains("x") && board[3][6].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 16,24,32 X
            for (int j = 0; j < 1; j++) {

                if (board[1][6].contains("x") && board[2][5].contains("x") && board[3][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 14,24,34 O
            for (int j = 0; j < 1; j++) {

                if (board[1][4].contains("o") && board[2][5].contains("o") && board[3][6].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 16,24,32 O
            for (int j = 0; j < 1; j++) {

                if (board[1][6].contains("o") && board[2][5].contains("o") && board[3][4].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 15,25,35 X
            for (int j = 0; j < 1; j++) {

                if (board[1][5].contains("x") && board[2][6].contains("x") && board[3][7].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 17,25,33 X
            for (int j = 0; j < 1; j++) {

                if (board[1][7].contains("x") && board[2][6].contains("x") && board[3][5].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 15,25,35 O
            for (int j = 0; j < 1; j++) {

                if (board[1][5].contains("o") && board[2][6].contains("o") && board[3][7].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 17,25,33 O
            for (int j = 0; j < 1; j++) {

                if (board[1][7].contains("o") && board[2][6].contains("o") && board[3][5].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 16,26,36 X
            for (int j = 0; j < 1; j++) {

                if (board[1][6].contains("x") && board[2][7].contains("x") && board[3][8].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 18,26,34 X
            for (int j = 0; j < 1; j++) {

                if (board[1][8].contains("x") && board[2][7].contains("x") && board[3][6].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 16,26,36 O
            for (int j = 0; j < 1; j++) {

                if (board[1][6].contains("o") && board[2][7].contains("o") && board[3][8].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 18,26,34 O
            for (int j = 0; j < 1; j++) {

                if (board[1][8].contains("o") && board[2][7].contains("o") && board[3][6].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 19,29,39 X
            for (int j = 0; j < 1; j++) {

                if (board[2][0].contains("x") && board[3][1].contains("x") && board[4][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 21,29,37 X
            for (int j = 0; j < 1; j++) {

                if (board[2][2].contains("x") && board[3][1].contains("x") && board[4][0].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 19,29,39 O
            for (int j = 0; j < 1; j++) {

                if (board[2][0].contains("o") && board[3][1].contains("o") && board[4][2].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 21,29,37 O
            for (int j = 0; j < 1; j++) {

                if (board[2][2].contains("o") && board[3][1].contains("o") && board[4][0].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        } //
        for (int i = 0; i < 1; i++) {// 20,30,40 X
            for (int j = 0; j < 1; j++) {

                if (board[2][1].contains("x") && board[3][2].contains("x") && board[4][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 22,30,38 X
            for (int j = 0; j < 1; j++) {

                if (board[2][3].contains("x") && board[3][2].contains("x") && board[4][1].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 20,30,40 O
            for (int j = 0; j < 1; j++) {

                if (board[2][1].contains("o") && board[3][2].contains("o") && board[4][3].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 22,30,38 O
            for (int j = 0; j < 1; j++) {

                if (board[2][3].contains("o") && board[3][2].contains("o") && board[4][1].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 21,31,41 X
            for (int j = 0; j < 1; j++) {

                if (board[2][2].contains("x") && board[3][3].contains("x") && board[4][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 23,31,39 X
            for (int j = 0; j < 1; j++) {

                if (board[2][4].contains("x") && board[3][3].contains("x") && board[4][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 21,31,41 O
            for (int j = 0; j < 1; j++) {

                if (board[2][2].contains("o") && board[3][3].contains("o") && board[4][4].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 23,31,39 O
            for (int j = 0; j < 1; j++) {

                if (board[2][4].contains("o") && board[3][3].contains("o") && board[4][2].contains("o")) {
                    counterO++;
                    System.out.println(player2Name + " point= " + counterO);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 22,32,42 X
            for (int j = 0; j < 1; j++) {

                if (board[2][3].contains("x") && board[3][4].contains("x") && board[4][5].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 24,32,40 X
            for (int j = 0; j < 1; j++) {

                if (board[2][5].contains("x") && board[3][4].contains("x") && board[4][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 22,32,42 O
            for (int j = 0; j < 1; j++) {

                if (board[2][3].contains("o") && board[3][4].contains("o") && board[4][5].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 24,32,40 O
            for (int j = 0; j < 1; j++) {

                if (board[2][5].contains("o") && board[3][4].contains("o") && board[4][3].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 23,33,43 X
            for (int j = 0; j < 1; j++) {

                if (board[2][4].contains("x") && board[3][5].contains("x") && board[4][6].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 25,33,41 X
            for (int j = 0; j < 1; j++) {

                if (board[2][6].contains("x") && board[3][5].contains("x") && board[4][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 23,33,43 O
            for (int j = 0; j < 1; j++) {

                if (board[2][4].contains("o") && board[3][5].contains("o") && board[4][6].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 25,33,41 O
            for (int j = 0; j < 1; j++) {

                if (board[2][6].contains("o") && board[3][5].contains("o") && board[4][4].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 24,34,44 X
            for (int j = 0; j < 1; j++) {

                if (board[2][5].contains("x") && board[3][6].contains("x") && board[4][7].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 26,34,42 X
            for (int j = 0; j < 1; j++) {

                if (board[2][7].contains("x") && board[3][6].contains("x") && board[4][5].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 24,34,44 O
            for (int j = 0; j < 1; j++) {

                if (board[2][5].contains("o") && board[3][6].contains("o") && board[4][7].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 26,34,42 O
            for (int j = 0; j < 1; j++) {

                if (board[2][7].contains("o") && board[3][6].contains("o") && board[4][5].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 25,35,45 X
            for (int j = 0; j < 1; j++) {

                if (board[2][6].contains("x") && board[3][7].contains("x") && board[4][8].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 27,35,43 X
            for (int j = 0; j < 1; j++) {

                if (board[2][8].contains("x") && board[3][7].contains("x") && board[4][6].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 25,35,45 O
            for (int j = 0; j < 1; j++) {

                if (board[2][6].contains("o") && board[3][7].contains("o") && board[4][8].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 27,35,43 O
            for (int j = 0; j < 1; j++) {

                if (board[2][8].contains("o") && board[3][7].contains("o") && board[4][6].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }

        for (int i = 0; i < 1; i++) {// 28,38,48 X
            for (int j = 0; j < 1; j++) {

                if (board[3][0].contains("x") && board[4][1].contains("x") && board[5][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 30,38,46 X
            for (int j = 0; j < 1; j++) {

                if (board[3][2].contains("x") && board[4][1].contains("x") && board[5][0].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 28,38,48 O
            for (int j = 0; j < 1; j++) {

                if (board[3][0].contains("o") && board[4][1].contains("o") && board[5][2].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 30,38,46 O
            for (int j = 0; j < 1; j++) {

                if (board[3][2].contains("o") && board[4][1].contains("o") && board[5][0].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 29,39,49 X
            for (int j = 0; j < 1; j++) {

                if (board[3][1].contains("x") && board[4][2].contains("x") && board[5][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 31,39,47 X
            for (int j = 0; j < 1; j++) {

                if (board[3][4].contains("x") && board[4][2].contains("x") && board[5][1].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 29,39,49 O
            for (int j = 0; j < 1; j++) {

                if (board[3][1].contains("o") && board[4][2].contains("o") && board[5][3].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 31,39,47 O
            for (int j = 0; j < 1; j++) {

                if (board[3][4].contains("o") && board[4][2].contains("o") && board[5][1].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 30,40,50 X
            for (int j = 0; j < 1; j++) {

                if (board[3][2].contains("x") && board[4][3].contains("x") && board[5][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 32,40,48 X
            for (int j = 0; j < 1; j++) {

                if (board[3][4].contains("x") && board[4][3].contains("x") && board[5][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 30,40,50 O
            for (int j = 0; j < 1; j++) {

                if (board[3][2].contains("o") && board[4][3].contains("o") && board[5][4].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 32,40,48 O
            for (int j = 0; j < 1; j++) {

                if (board[3][4].contains("o") && board[4][3].contains("o") && board[5][2].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 31,41,51 X
            for (int j = 0; j < 1; j++) {

                if (board[3][3].contains("x") && board[4][4].contains("x") && board[5][5].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 33,41,49 X
            for (int j = 0; j < 1; j++) {

                if (board[5][3].contains("x") && board[4][4].contains("x") && board[5][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 31,41,51 O
            for (int j = 0; j < 1; j++) {

                if (board[3][3].contains("x") && board[4][4].contains("x") && board[5][5].contains("x")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 33,41,49 O
            for (int j = 0; j < 1; j++) {

                if (board[5][3].contains("x") && board[4][4].contains("x") && board[5][3].contains("x")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 32,42,52 X
            for (int j = 0; j < 1; j++) {

                if (board[3][4].contains("x") && board[4][5].contains("x") && board[5][6].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 34,42,50 X
            for (int j = 0; j < 1; j++) {

                if (board[3][6].contains("x") && board[4][5].contains("x") && board[5][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 32,42,52 O
            for (int j = 0; j < 1; j++) {

                if (board[3][4].contains("o") && board[4][5].contains("o") && board[5][6].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 34,42,50 O
            for (int j = 0; j < 1; j++) {

                if (board[3][6].contains("o") && board[4][5].contains("o") && board[5][4].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 33,43,53 X
            for (int j = 0; j < 1; j++) {

                if (board[3][5].contains("x") && board[4][6].contains("x") && board[5][7].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 35,43,51 X
            for (int j = 0; j < 1; j++) {

                if (board[3][7].contains("x") && board[4][6].contains("x") && board[5][5].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 34,44,54 X
            for (int j = 0; j < 1; j++) {

                if (board[3][6].contains("x") && board[4][7].contains("x") && board[5][8].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 36,44,52 X
            for (int j = 0; j < 1; j++) {

                if (board[3][8].contains("x") && board[4][7].contains("x") && board[5][6].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 34,44,54 O
            for (int j = 0; j < 1; j++) {

                if (board[3][6].contains("o") && board[4][7].contains("o") && board[5][8].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 36,44,52 O
            for (int j = 0; j < 1; j++) {

                if (board[3][8].contains("o") && board[4][7].contains("o") && board[5][6].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 33,43,53 O
            for (int j = 0; j < 1; j++) {

                if (board[3][5].contains("o") && board[4][6].contains("o") && board[5][7].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 35,43,51 O
            for (int j = 0; j < 1; j++) {

                if (board[3][7].contains("o") && board[4][6].contains("o") && board[5][5].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 37,47,57 X
            for (int j = 0; j < 1; j++) {

                if (board[4][0].contains("x") && board[5][1].contains("x") && board[6][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 39,47,55 X
            for (int j = 0; j < 1; j++) {

                if (board[4][2].contains("x") && board[5][1].contains("x") && board[6][0].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 37,47,57 O
            for (int j = 0; j < 1; j++) {

                if (board[4][0].contains("o") && board[5][1].contains("o") && board[6][2].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 39,47,55 O
            for (int j = 0; j < 1; j++) {

                if (board[4][2].contains("o") && board[5][1].contains("o") && board[6][0].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 38,48,58 X
            for (int j = 0; j < 1; j++) {

                if (board[4][1].contains("x") && board[5][2].contains("x") && board[6][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 40,48,56 X
            for (int j = 0; j < 1; j++) {

                if (board[4][3].contains("x") && board[5][2].contains("x") && board[6][1].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 38,48,58 O
            for (int j = 0; j < 1; j++) {

                if (board[4][1].contains("o") && board[5][2].contains("o") && board[6][3].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 40,48,56 O
            for (int j = 0; j < 1; j++) {

                if (board[4][3].contains("o") && board[5][2].contains("o") && board[6][1].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 39,49,59 X
            for (int j = 0; j < 1; j++) {

                if (board[4][2].contains("x") && board[5][3].contains("x") && board[6][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 41,49,47 X
            for (int j = 0; j < 1; j++) {

                if (board[4][4].contains("x") && board[5][3].contains("x") && board[6][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 39,49,59 O
            for (int j = 0; j < 1; j++) {

                if (board[4][2].contains("o") && board[5][3].contains("o") && board[6][4].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 41,49,47 O
            for (int j = 0; j < 1; j++) {

                if (board[4][4].contains("o") && board[5][3].contains("o") && board[6][2].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 40,50,60 X
            for (int j = 0; j < 1; j++) {

                if (board[4][3].contains("x") && board[5][4].contains("x") && board[6][5].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 42,50,58 X
            for (int j = 0; j < 1; j++) {

                if (board[4][5].contains("x") && board[5][4].contains("x") && board[6][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 40,50,60 O
            for (int j = 0; j < 1; j++) {

                if (board[4][3].contains("o") && board[5][4].contains("o") && board[6][5].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 42,50,58 O
            for (int j = 0; j < 1; j++) {

                if (board[4][5].contains("o") && board[5][4].contains("o") && board[6][3].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 41,51,61 X
            for (int j = 0; j < 1; j++) {

                if (board[4][4].contains("x") && board[5][5].contains("x") && board[6][6].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 43,51,59 X
            for (int j = 0; j < 1; j++) {

                if (board[4][6].contains("x") && board[5][5].contains("x") && board[6][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 41,51,61 O
            for (int j = 0; j < 1; j++) {

                if (board[4][4].contains("o") && board[5][5].contains("o") && board[6][6].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 43,51,59 O
            for (int j = 0; j < 1; j++) {

                if (board[4][6].contains("o") && board[5][5].contains("o") && board[6][4].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 42,52,62 X
            for (int j = 0; j < 1; j++) {

                if (board[4][5].contains("x") && board[5][6].contains("x") && board[6][7].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 44,52,60 X
            for (int j = 0; j < 1; j++) {

                if (board[4][7].contains("x") && board[5][6].contains("x") && board[6][5].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 42,52,62 O
            for (int j = 0; j < 1; j++) {

                if (board[4][5].contains("o") && board[5][6].contains("o") && board[6][7].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 44,52,60 O
            for (int j = 0; j < 1; j++) {

                if (board[4][7].contains("o") && board[5][6].contains("o") && board[6][5].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 43,53,63 X
            for (int j = 0; j < 1; j++) {

                if (board[4][6].contains("x") && board[5][7].contains("x") && board[6][8].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 45,53,61 X
            for (int j = 0; j < 1; j++) {

                if (board[4][8].contains("x") && board[5][7].contains("x") && board[6][6].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 43,53,63 O
            for (int j = 0; j < 1; j++) {

                if (board[4][6].contains("o") && board[5][7].contains("o") && board[6][8].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 45,53,61 O
            for (int j = 0; j < 1; j++) {

                if (board[4][8].contains("o") && board[5][7].contains("o") && board[6][6].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 46,56,66 X
            for (int j = 0; j < 1; j++) {

                if (board[5][0].contains("x") && board[6][1].contains("x") && board[7][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 48,56,64 X
            for (int j = 0; j < 1; j++) {

                if (board[5][2].contains("x") && board[6][1].contains("x") && board[7][0].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 46,56,66 O
            for (int j = 0; j < 1; j++) {

                if (board[5][0].contains("o") && board[6][1].contains("o") && board[7][2].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 48,56,64 O
            for (int j = 0; j < 1; j++) {

                if (board[5][2].contains("o") && board[6][1].contains("o") && board[7][0].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 47,57,67 X
            for (int j = 0; j < 1; j++) {

                if (board[5][1].contains("x") && board[6][2].contains("x") && board[7][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 49,57,65 X
            for (int j = 0; j < 1; j++) {

                if (board[5][3].contains("x") && board[6][2].contains("x") && board[7][1].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 47,57,67 O
            for (int j = 0; j < 1; j++) {

                if (board[5][1].contains("o") && board[6][2].contains("o") && board[7][3].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 49,57,65 O
            for (int j = 0; j < 1; j++) {

                if (board[5][3].contains("o") && board[6][2].contains("o") && board[7][1].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 48,58,68 X
            for (int j = 0; j < 1; j++) {

                if (board[5][2].contains("x") && board[6][3].contains("x") && board[7][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 50,58,56 X
            for (int j = 0; j < 1; j++) {

                if (board[5][4].contains("x") && board[6][3].contains("x") && board[7][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 48,58,68 O
            for (int j = 0; j < 1; j++) {

                if (board[5][2].contains("o") && board[6][3].contains("o") && board[7][4].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 50,58,56 O
            for (int j = 0; j < 1; j++) {

                if (board[5][4].contains("o") && board[6][3].contains("o") && board[7][2].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 49,59,69 X
            for (int j = 0; j < 1; j++) {

                if (board[5][3].contains("x") && board[6][4].contains("x") && board[7][5].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 51,59,67 X
            for (int j = 0; j < 1; j++) {

                if (board[5][5].contains("x") && board[6][4].contains("x") && board[7][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 49,59,69 O
            for (int j = 0; j < 1; j++) {

                if (board[5][3].contains("o") && board[6][4].contains("o") && board[7][5].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 51,59,67 O
            for (int j = 0; j < 1; j++) {

                if (board[5][5].contains("o") && board[6][4].contains("o") && board[7][3].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 50,60,70 X
            for (int j = 0; j < 1; j++) {

                if (board[5][4].contains("x") && board[6][5].contains("x") && board[7][6].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 52,60,68 X
            for (int j = 0; j < 1; j++) {

                if (board[5][6].contains("x") && board[6][5].contains("x") && board[7][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 50,60,70 O
            for (int j = 0; j < 1; j++) {

                if (board[5][4].contains("o") && board[6][5].contains("o") && board[7][6].contains("o")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 52,60,68 O
            for (int j = 0; j < 1; j++) {

                if (board[5][6].contains("o") && board[6][5].contains("o") && board[7][4].contains("o")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 51,61,71 X
            for (int j = 0; j < 1; j++) {

                if (board[5][5].contains("x") && board[6][6].contains("x") && board[7][7].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 53,61,69 X
            for (int j = 0; j < 1; j++) {

                if (board[5][7].contains("x") && board[6][6].contains("x") && board[7][5].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 51,61,71 O
            for (int j = 0; j < 1; j++) {

                if (board[5][5].contains("o") && board[6][6].contains("o") && board[7][7].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 53,61,69 O
            for (int j = 0; j < 1; j++) {

                if (board[5][7].contains("o") && board[6][6].contains("o") && board[7][5].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 52,62,72 X
            for (int j = 0; j < 1; j++) {

                if (board[5][6].contains("x") && board[6][7].contains("x") && board[7][8].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 54,62,70 X
            for (int j = 0; j < 1; j++) {

                if (board[5][8].contains("x") && board[6][7].contains("x") && board[7][6].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 52,62,72 O
            for (int j = 0; j < 1; j++) {

                if (board[5][6].contains("o") && board[6][7].contains("o") && board[7][8].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 54,62,70 O
            for (int j = 0; j < 1; j++) {

                if (board[5][8].contains("o") && board[6][7].contains("o") && board[7][6].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 55,55,75 X
            for (int j = 0; j < 1; j++) {

                if (board[6][0].contains("x") && board[7][1].contains("x") && board[8][2].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 57,65,73 X
            for (int j = 0; j < 1; j++) {

                if (board[6][2].contains("x") && board[7][1].contains("x") && board[8][0].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 55,55,75 O
            for (int j = 0; j < 1; j++) {

                if (board[6][0].contains("o") && board[7][1].contains("o") && board[8][2].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 57,65,73 O
            for (int j = 0; j < 1; j++) {

                if (board[6][2].contains("o") && board[7][1].contains("o") && board[8][0].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 56,66,76 X
            for (int j = 0; j < 1; j++) {

                if (board[6][1].contains("x") && board[7][2].contains("x") && board[8][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 58,66,74 X
            for (int j = 0; j < 1; j++) {

                if (board[6][3].contains("x") && board[7][2].contains("x") && board[8][1].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 56,66,76 O
            for (int j = 0; j < 1; j++) {

                if (board[6][1].contains("o") && board[7][2].contains("o") && board[8][3].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 58,66,74 O
            for (int j = 0; j < 1; j++) {

                if (board[6][3].contains("o") && board[7][2].contains("o") && board[8][1].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 57,67,77 X
            for (int j = 0; j < 1; j++) {

                if (board[6][2].contains("x") && board[7][3].contains("x") && board[8][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 59,67,75 X
            for (int j = 0; j < 1; j++) {

                if (board[6][3].contains("x") && board[7][2].contains("x") && board[8][1].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 57,67,77 O
            for (int j = 0; j < 1; j++) {

                if (board[6][2].contains("o") && board[7][3].contains("o") && board[8][4].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 59,67,75 O
            for (int j = 0; j < 1; j++) {

                if (board[6][3].contains("o") && board[7][2].contains("o") && board[8][1].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 58,68,78 X
            for (int j = 0; j < 1; j++) {

                if (board[6][3].contains("x") && board[7][4].contains("x") && board[8][5].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 60,68,76 X
            for (int j = 0; j < 1; j++) {

                if (board[6][5].contains("x") && board[7][4].contains("x") && board[8][3].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 58,68,78 O
            for (int j = 0; j < 1; j++) {

                if (board[6][3].contains("o") && board[7][4].contains("o") && board[8][5].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 60,68,76 O
            for (int j = 0; j < 1; j++) {

                if (board[6][5].contains("o") && board[7][4].contains("o") && board[8][3].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 59,69,79 X
            for (int j = 0; j < 1; j++) {

                if (board[6][4].contains("x") && board[7][5].contains("x") && board[8][6].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 61,69,77 X
            for (int j = 0; j < 1; j++) {

                if (board[6][6].contains("x") && board[7][5].contains("x") && board[8][4].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 59,69,79 O
            for (int j = 0; j < 1; j++) {

                if (board[6][4].contains("o") && board[7][5].contains("o") && board[8][6].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 61,69,77 O
            for (int j = 0; j < 1; j++) {

                if (board[6][6].contains("o") && board[7][5].contains("o") && board[8][4].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 60,70,80 X
            for (int j = 0; j < 1; j++) {

                if (board[6][5].contains("x") && board[7][6].contains("x") && board[8][7].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 62,70,78 X
            for (int j = 0; j < 1; j++) {

                if (board[6][7].contains("x") && board[7][6].contains("x") && board[8][5].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 60,70,80 O
            for (int j = 0; j < 1; j++) {

                if (board[6][5].contains("o") && board[7][6].contains("o") && board[8][7].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 62,70,78 O
            for (int j = 0; j < 1; j++) {

                if (board[6][7].contains("o") && board[7][6].contains("o") && board[8][5].contains("o")) {
                    counterX++;
                    System.out.println(player2Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 61,71,81 X
            for (int j = 0; j < 1; j++) {

                if (board[6][6].contains("x") && board[7][7].contains("x") && board[8][8].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 63,71,79 X
            for (int j = 0; j < 1; j++) {

                if (board[6][8].contains("x") && board[7][7].contains("x") && board[8][6].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 61,71,81 O
            for (int j = 0; j < 1; j++) {

                if (board[6][6].contains("x") && board[7][7].contains("x") && board[8][8].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }
        for (int i = 0; i < 1; i++) {// 63,71,79 O
            for (int j = 0; j < 1; j++) {

                if (board[6][8].contains("x") && board[7][7].contains("x") && board[8][6].contains("x")) {
                    counterX++;
                    System.out.println(player1Name + " point= " + counterX);
                    break;

                }
            }
        }

    }

    public static void checkWinner(String player1Name, String player2Name) {

        if (counterX == counterO) {
            System.out.println("the game finishs in the tie");
        }

        if (counterX < counterO) {
            System.out.println(player2Name + " win the game");
        }
        if (counterX > counterO) {
            System.out.println(player1Name + " win the game");
        }
    }

    public static void main(String[] args) {
        Scanner names = new Scanner(System.in);
        String defultPlayer1 = "Player1";
        String defultPlayer2 = "Player2";

        String player1Name = JOptionPane.showInputDialog(null, "What is Player 1 Name:", "Welcome To The Triple Game",
                3);
        if (player1Name.equals("")) {
            player1Name = defultPlayer1;
        }
        String player2Name = JOptionPane.showInputDialog(null, "What is Player 2 Name:", "Welcome To The Triple Game",
                3);
        if (player2Name.equals("")) {
            player2Name = defultPlayer2;
        }
        System.out.println();
        System.out.println(player1Name + " VS " + player2Name);
        System.out.println();

        dicesOfTheGame(player1Name, player2Name);

        Scanner boardSize = new Scanner(System.in);
        System.out.println("Enter The Type of The BoardGame From 3 To 9");

        int size = boardSize.nextInt();
        if (size < 3 || size > 9) {
            System.out.println("Just you can choose 3 till 9");
            size = boardSize.nextInt();

        }

        int count = 1;
        String board[][] = new String[size][size];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = count++ + "";

            }
        }
        printBoard(board, size);
        boolean game = true;
        String player1 = " ";
        String player2 = " ";
        counterStop = 0;
        Scanner placeMent = new Scanner(System.in);
        while (game) {

            System.out.println("Enter Your Placement");
            player1 = placeMent.next();

            if (player1.equals(player2)) {
                System.out.println("Oops Try Another Square!!");

                player1 = placeMent.next();

            }

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    if (board[i][j].equals(player1)) {
                        board[i][j] = "x";
                        rowPointX(board, player1Name);
                        allColumnPointX(board, player1, player1Name);
                        switch (size) {
                            case 3:
                                digonalPoint3X3(board, size, player1Name, player2Name);
                                break;
                            case 4:
                                digonalPoint4X4(board, size, player1Name, player2Name);
                                break;
                            case 5:
                                digonalPoint5X5(board, size, player1Name, player2Name);
                                break;
                            case 6:
                                digoanlPoint6X6(board, size, player1Name, player2Name);
                                break;
                            case 7:
                                digonalPoint7X7(board, size, player1Name, player2Name);
                                break;
                            case 8:
                                digonalPoint8X8(board, size, player1Name, player2Name);
                                break;
                            case 9:
                                digonalPoint9X9(board, size, player1Name, player2Name);
                                break;

                            default:
                                break;

                        }
                    }
                }
            }

            printBoard(board, size);

            System.out.println("Enter Your Placement");
            player2 = placeMent.next();

            if (player2.equals(player1)) {
                System.out.println(" Oops Try Another Square!!");

                player2 = placeMent.next();

            }

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    if (board[i][j].equals(player2)) {
                        board[i][j] = "o";
                        allRowPointO(board, player2Name);
                        allColumnPointO(board, player2, player2Name);
                        switch (size) {
                            case 3:
                                digonalPoint3X3(board, size, player1Name, player2Name);
                                break;
                            case 4:
                                digonalPoint4X4(board, size, player1Name, player2Name);
                                break;
                            case 5:
                                digonalPoint5X5(board, size, player1Name, player2Name);
                                break;
                            case 6:
                                digoanlPoint6X6(board, size, player1Name, player2Name);
                                break;
                            case 7:
                                digonalPoint7X7(board, size, player1Name, player2Name);
                                break;
                            case 8:
                                digonalPoint8X8(board, size, player1Name, player2Name);
                                break;
                            case 9:
                                digonalPoint9X9(board, size, player1Name, player2Name);
                                break;

                            default:
                                break;

                        }

                    }

                }

            }

            printBoard(board, size);
            counterStop++;
            if (size == 3 && counterStop == 5) {
                System.out.println("the game finished");
                break;

            }

            if (size == 4 && counterStop == 8) {
                System.out.println("The Game Finished");
                break;

            }
            if (size == 5 && counterStop == 13) {
                System.out.println("The Game Finished");
                break;

            }
            if (size == 6 && counterStop == 18) {
                System.out.println("The Game Finished");
                break;

            }
            if (size == 7 && counterStop == 25) {
                System.out.println("The Game Finished");
                break;

            }
            if (size == 8 && counterStop == 32) {
                System.out.println("The Game Finished");
                break;

            }
            if (size == 9 && counterStop == 41) {
                System.out.println("The Game Finished");
                break;

            }

        }
        System.out.println("\u0444============================\u0444");

        checkWinner(player1Name, player2Name);
    }

}
