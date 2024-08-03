// import java.util.*;

// class Demo {
//     public static void main(String args[]) {
//         System.out.println("Start main");
//         int a = 3;
//         int[] ar = new int[3];

//         try {
//             ar[a] = 100;
//         } catch (IndexOutOfBoundsException ex) {
//             System.out.println(ex.getMessage());
//             a = 2;
//         }
//         System.out.println("End main");
//     }
// }

// import java.util.*;

// class Demo {
//     public static void main(String args[]) {
//         System.out.println("Start main");
//         String s1 = "Niroth";
//         try {
//             char ch = s1.charAt(6);
//         } catch (StringIndexOutOfBoundsException e) {
//             System.out.println(e.getMessage());
//             char ch = s1.charAt(5);
//         }
//         System.out.println("End main");
//     }
// }

// import java.util.*;

// class A {
//     public void m() {
//         //
//     }
// }

// class B extends A {
// }

// class Demo {
//     public static void main(String args[]) {
//         System.out.println("Start main");
//         A a1 = null;
//         try {
//             a1.m();
//         } catch (NullPointerException e) {
//             System.out.println(e.getMessage());

//         }
//         System.out.println("End main");
//     }
// }

import java.util.*;

class A {
    public void m() {
        //
    }
}

class B extends A {
}

class Demo {
    public static void main(String args[]) {
        System.out.println("Start main");
        A a1 = new A();
        try {
            B b1 = (B) a1;

        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("End main");
    }
}
