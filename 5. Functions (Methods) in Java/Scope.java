package com.priyanshi.Methods;

public class Scope {

    public static void main(String[] args) {
        // SCOPE: where we can access our variables
        int a = 10;
        int b = 20;
        String name = "Priya";
        {
//            int a = 78; // already initialized outside the block in the same method, hence you cannot initialize again
            a = 100; // reassign the original ref variable to some other value
            System.out.println(a);
            int c = 99;
            name = "Prisha";
            System.out.println(name);
            // values initialized within a block, will remain (or be used) in that block only
        }
        System.out.println(a);
        System.out.println(name);
//        System.out.println(c); // cannot be used outside the block

        // SCOPING IN FOR LOOPS
        for (int i =  0; i < 4; i++) {
//            System.out.println(i);
            int num = 90;
            a = 10000; // Whatever values are already defined in the scope of the function of the for loop or the block can't be initialized again
            // 1. Anything that is initialized outside the block can be used inside the block but anything that is initialized inside the block cannot be used outside the block.
            // 2. Similarly, anything that is initialized outside the box cannot be again initialized inside a block but anything that is initialized inside a block can definitely be initialized again outside the block.
        }
        System.out.println(a);
    }
    static void random(int marks) {
        // Function scope
        int num = 50;
        System.out.println(num);
        System.out.println(marks);
    }

}
