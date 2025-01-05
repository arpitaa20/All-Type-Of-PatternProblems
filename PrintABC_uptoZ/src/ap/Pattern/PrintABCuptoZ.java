package ap.Pattern;

import java.util.Scanner;

public class PrintABCuptoZ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size 5: ");
        int n = sc.nextInt();

        System.out.println();
        printA(n);
        printB(n);
        printC(n);
        printD(n);
        printE(n);
        printF(n);
        printG(n);
        printH(n);
        printI(n);
        printJ(n);
        printK(n);
        printL(n);
        printM(n);
        printN(n);
        printO(n);
        printP(n);
        printQ(n);
        printR(n);
        printS(n);
        printT(n);
        printU(n);
        printV(n);
        printW(n);
        printX(n);
        printY(n);
        printZ(n);

        sc.close();
    }

    public static void printA(int n) {
        System.out.println("Print A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * 2 - 1; j++) {
                if (j == n - 1 - i || j == n - 1 + i || (i == n / 2 && j >= n - 1 - i && j <= n - 1 + i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printB(int n) {
        System.out.println("Print B:");
        for (int i = 0; i < n; i++) {
            System.out.print("*");
            for (int j = 0; j < n / 2; j++) {
                if (i == 0 || i == n / 2 || i == n - 1 || j == n / 2 - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printC(int n) {
        System.out.println("Print C:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j > 0 || i == n - 1 && j > 0 || j == 0 && i > 0 && i < n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printD(int n) {
        System.out.println("Print D:");
        for (int i = 0; i < n; i++) {
            System.out.print("*");
            for (int j = 0; j < n - 1; j++) {
                if (i == 0 || i == n - 1 || j == n - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printE(int n) {
        System.out.println("Print E:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == n / 2 || i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printF(int n) {
        System.out.println("Print F:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == n / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printG(int n) {
        System.out.println("Print G:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j > 0) || (i == n - 1 && j > 0) || (j == 0 && i > 0 && i < n - 1) || (j == n - 1 && i >= n / 2) || (i == n / 2 && j >= n / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printH(int n) {
        System.out.println("Print H:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == n / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printI(int n) {
        System.out.println("Print I:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == n / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printJ(int n) {
        System.out.println("Print J:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || (j == n / 2 && i < n - 1) || (i == n - 1 && j < n / 2) || (j == 0 && i == n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printK(int n) {
        System.out.println("Print K:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i + j == n / 2 || i - j == n / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printL(int n) {
        System.out.println("Print L:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printM(int n) {
        System.out.println("Print M:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * 2; j++) {
                if (j == 0 || j == n * 2 - 1 || (j == i && i >= n / 2) || (j == n * 2 - i - 1 && i >= n / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printN(int n) {
        System.out.println("Print N:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printO(int n) {
        System.out.println("Print O:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 || i == n - 1) && j > 0 && j < n - 1 || (j == 0 || j == n - 1) && i > 0 && i < n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printP(int n) {
        System.out.println("Print P:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == n / 2 || (j == n - 1 && i < n / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printQ(int n) {
        System.out.println("Print Q:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 || i == n - 1) && j > 0 && j < n - 1 || (j == 0 || j == n - 1) && i > 0 && i < n - 1 || (i == j && i > n / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printR(int n) {
        System.out.println("Print R:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == n / 2 || (j == n - 1 && i < n / 2) || (i - j == n / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printS(int n) {
        System.out.println("Print S:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n / 2 || i == n - 1 || (j == 0 && i < n / 2) || (j == n - 1 && i > n / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printT(int n) {
        System.out.println("Print T:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == n / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printU(int n) {
        System.out.println("Print U:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((j == 0 || j == n - 1) && i < n - 1 || (i == n - 1 && j > 0 && j < n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printV(int n) {
        System.out.println("Print V:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * 2; j++) {
                if (j == i || j == n * 2 - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printW(int n) {
        System.out.println("Print W:");
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n * 2; j++) {
            	if (j == 0 || j == n * 2 - 1 || 
                        (j == i && i >= n / 2) || 
                        (j == n * 2 - i - 1 && i >= n/2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printX(int n) {
        System.out.println("Print X:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printY(int n) {
        System.out.println("Print Y:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == j && i < n / 2) || (i + j == n - 1 && i < n / 2) || (j == n / 2 && i >= n / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printZ(int n) {
        System.out.println("Print Z:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || i + j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
