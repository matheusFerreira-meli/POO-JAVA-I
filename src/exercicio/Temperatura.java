package exercicio;

public class Temperatura {
    public static void main(String[] args) {
        String[] cities = new String[10];
        cities[0] = "Londres";
        cities[1] = "Madrid";
        cities[2] = "Nova York";
        cities[3] = "Buenos Aires";
        cities[4] = "Asunción";
        cities[5] = "São Paulo";
        cities[6] = "Lima";
        cities[7] = "Santiago de Chile";
        cities[8] = "Lisboa";
        cities[9] = "Tokio";

        int[][] temperatures = new int[10][2];
        temperatures[0][0] = -2;
        temperatures[0][1] = 33;
        temperatures[1][0] = -3;
        temperatures[1][1] = 32;
        temperatures[2][0] = -8;
        temperatures[2][1] = 27;
        temperatures[3][0] = 4;
        temperatures[3][1] = 37;
        temperatures[4][0] = 6;
        temperatures[4][1] = 42;
        temperatures[5][0] = 5;
        temperatures[5][1] = 43;
        temperatures[6][0] = 0;
        temperatures[6][1] = 39;
        temperatures[7][0] = -7;
        temperatures[7][1] = 26;
        temperatures[8][0] = -1;
        temperatures[8][1] = 31;
        temperatures[9][0] = -10;
        temperatures[9][1] = 35;

        int lowestTemp = temperatures[0][0];
        int highestTemp = temperatures[0][1];
        String cityHighestTemp = "";
        String cityLowestTemp = "";


        for (int i = 0; i < cities.length; i++) {
            System.out.print(cities[i] + " - ");

            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    if (temperatures[i][j] < lowestTemp) {
                        lowestTemp = temperatures[i][j];
                        cityLowestTemp = cities[i];
                    }
                    System.out.print("min: ");
                } else {
                    if (temperatures[i][j] > highestTemp) {
                        highestTemp = temperatures[i][j];
                        cityHighestTemp = cities[i];
                    }
                    System.out.print("max: ");
                }
                System.out.print(temperatures[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("------------------------------");
        System.out.println("A cidade com maior temperatura é " + cityHighestTemp + " com a temperatura de " + highestTemp);
        System.out.println("A cidade com menor temperatura é " + cityLowestTemp + " com a temperatura de " + lowestTemp);
    }
}
