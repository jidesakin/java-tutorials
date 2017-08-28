class Loop {

    public static void main(String[] args) {

        String[] names = { "Jide", "Ayo", "Moyo", "Fisayo" };

        System.out.println("Using Enhanced For Loop");

        for (String name : names) {
            System.out.println( name.concat("s") );
        }

        System.out.println("Ordinary For Loop");

        for (int i =  0; i < names.length; i++) {
            System.out.println( names[i].concat("s") );
        }


    }
}