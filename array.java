public class array {
    public static void main(String[] args) {
        /* 
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        <---- Change array element ----->
        cars[0] = "Opel";
        System.out.println(cars[0]);

        <---- Array length ---->
        System.out.println(cars.length);

        <---- For loop ---->
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        <---- For-each loop ---->
        for (String string : cars) {
            System.out.println(string);
        }
        */

        int[][] n = { {1, 2, 3, 4}, {5, 6, 7} };
            for (int i = 0; i < n.length; ++i) {
                for(int j = 0; j < n[i].length; ++j) {
                    System.out.println(n[i][j]);
                }
            }

    }
}
