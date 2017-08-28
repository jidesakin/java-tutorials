class Operators {



    public static void main(String[] args) {
        Operators ops = new Operators();
        String name = "Jide";

        System.out.println("ops is an instance of Operators: " + (name instanceof String));
        int a = 10;
        int b = 20;
        System.out.println("a = " + a + " b = "+b);
        System.out.println("a equals b " + (a == b));
        System.out.println("a greater than b " + (a > b));
        System.out.println("a less than b " + (a < b));
        System.out.println("a not equal to b " + (a != b));
        System.out.println("a greater than or equal to b " + (a >= b));
        System.out.println("a less than or equal to b " + (a <= b));         
    }
}