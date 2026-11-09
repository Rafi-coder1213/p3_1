public class Main {
    public static void main(String[] args) {
        int poziomy = 7;

        // 1. TRÓJKĄT PO LEWEJ STRONIE
        for (int i = 1; i <= poziomy; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

        System.out.println();

        // 2. TRÓJKĄT PO PRAWEJ STRONIE
        for (int i = 1; i <= poziomy; i++) {
            for (int j = 1; j <= poziomy - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }

        System.out.println();

        // 3. TRÓJKĄT PO LEWEJ STRONIE (DO GÓRY NOGAMI)
        for (int i = poziomy; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

        System.out.println();

        // 4. TRÓJKĄT PO PRAWEJ STRONIE (DO GÓRY NOGAMI)
        for (int i = 0; i < poziomy; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < poziomy - i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
