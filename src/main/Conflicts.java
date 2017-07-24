package main;

public class Conflicts {
    public static void conflict1() {
        System.out.println("Line 1");
        System.out.println();
        System.out.println("Lorem ipsum dolor sit amet");
        System.out.println("Quisque faucibus felis nec nunc malesuada porta nec ut sem");
        System.out.println("Nullam sed lectus sit amet augue posuere finibus");
        System.out.println("Interdum et malesuada fames ac ante ipsum primis in faucibus");
        System.out.println("Ut ultrices tristique imperdiet");
        System.out.println("Nullam in orci at nibh vestibulum tempus");
    }

    public static void conflict() {
        for(int i=0;i<10;i++){
            System.out.println("Line " + i);
            System.out.println("Lorem ipsum dolor sit amet");
        }
    }

    public static void conflict2() {
        System.out.println("Line 2");
        System.out.println();
        System.out.println("Lorem ipsum dolor sit amet");
        System.out.println("Quisque faucibus felis nec nunc malesuada porta nec ut sem");
        System.out.println("Nullam sed lectus sit amet augue posuere finibus");
        System.out.println("Interdum et malesuada fames ac ante ipsum primis in faucibus");
        System.out.println("Ut ultrices tristique imperdiet");
    }

    public static void conflict3() {
        System.out.println();
    }

    }
