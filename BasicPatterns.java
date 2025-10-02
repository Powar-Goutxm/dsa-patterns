/**
 * DSA Pattern Problems Collection
 * Common pattern printing problems frequently asked in interviews
 * 
 * @author Goutam Powar
 * @version 1.0
 */
public class BasicPatterns {

    /**
     * Pattern: Right-aligned triangle (decreasing)
     * *****
     * ****
     * ***
     * **
     * *
     * Time Complexity: O(n²)
     * Space Complexity: O(1)
     */
    static void right_pattern_reverse(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Pattern: Right-aligned triangle (increasing)
     * *
     * **
     * ***
     * ****
     * *****
     * Time Complexity: O(n²)
     * Space Complexity: O(1)
     */
    static void right_pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Pattern: Number triangle (decreasing)
     * 12345
     * 1234
     * 123
     * 12
     * 1
     * Time Complexity: O(n²)
     * Space Complexity: O(1)
     */
    static void rev_num_trig(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /**
     * Pattern: Left-aligned triangle
     *     *
     *    **
     *   ***
     *  ****
     * *****
     * Time Complexity: O(n²)
     * Space Complexity: O(1)
     */
    static void left_trig_pattern(int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= n - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Pattern: Full pyramid/triangle
     *     *
     *    ***
     *   *****
     *  *******
     * *********
     * Time Complexity: O(n²)
     * Space Complexity: O(1)
     */
    static void full_pyramid_pattern(int n) {
        for (int i = 0; i < n; i++) {
            // Leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Pattern: Inverted full pyramid/triangle
     * *********
     *  *******
     *   *****
     *    ***
     *     *
     * Time Complexity: O(n²)
     * Space Complexity: O(1)
     */
    static void full_pyramid_rev(int n) {
        for (int i = n; i >= 0; i--) {
            // Leading spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int k = 2 * i + 1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Pattern: Hollow rectangle
     * *******
     * *     *
     * *     *
     * *     *
     * *******
     * Time Complexity: O(n²)
     * Space Complexity: O(1)
     */
    static void hollow_rect(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Pattern: Diamond shape
     *     *
     *    ***
     *   *****
     *  *******
     * *********
     *  *******
     *   *****
     *    ***
     *     *
     * Time Complexity: O(n²)
     * Space Complexity: O(1)
     */
    static void diamond_pattern(int n) {
        // Upper half of diamond
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower half of diamond
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 2 * i + 1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Pattern 1: Right-aligned triangle(decreasing) ===");
        right_pattern_reverse(5);
        
        System.out.println("\n=== Pattern 2: Right-aligned triangle(increasing) ===");
        right_pattern(5);
        
        System.out.println("\n=== Pattern 3: Number Triangle(inverted) ===");
        rev_num_trig(5);
        
        System.out.println("\n=== Pattern 4: Left Triangle ===");
        left_trig_pattern(5);
        
        System.out.println("\n=== Pattern 5: Full Pyramid ===");
        full_pyramid_pattern(5);
        
        System.out.println("\n=== Pattern 6: Inverted Pyramid ===");
        full_pyramid_rev(5);
        
        System.out.println("\n=== Pattern 7: Hollow Rectangle ===");
        hollow_rect(7);
        
        System.out.println("\n=== Pattern 8: Diamond ===");
        diamond_pattern(5);
    }
}