package exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Person {
    int id;
    String name;
    int age;
    int price;

    Person(int id, String name,  int age, int price) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.price = price;
    }
}

public class Circuit {
    static Scanner keyboard = new Scanner(System.in);
    static String option;
    static int optionInt;
    static List<Person> listPerson = new ArrayList<Person>();

    public static void main(String[] args) {
        System.out.println("=========================");
        System.out.println("Bem vindo ao programa");
        System.out.println("=========================");

        int choise;

        while (true) {
            System.out.println("O que deseja realizar? ");
            System.out.println("0 - Adicionar participantes");
            System.out.println("1 - Remover participantes");
            System.out.println("2 - Mostrar participantes");
            System.out.println("3 - Sair");
            System.out.print("R: ");
            optionInt = keyboard.nextInt();

            if (optionInt < 0 || optionInt > 3) System.out.println("Por favor escolha uma opção válida!");
            else {
                if (optionInt == 0) addPerson();
                if (optionInt == 1) removePerson();
                if (optionInt == 2) showListPerson();
                if (optionInt == 3) break;
            }

        }
    }

    private static void removePerson() {
        showListPerson();
        if(listPerson.size() > 0) {
            while(true) {
                System.out.println("Deseja remover qual participante? (escolha pela id)");
                optionInt = keyboard.nextInt();
                boolean isExistsPerson = false;
                for (Person person: listPerson) {
                    if (person.id == optionInt) {
                        listPerson.remove(person);
                        isExistsPerson =  true;
                        System.out.println("Participante removido com sucesso");
                        break;
                    }
                }
                if (!isExistsPerson) System.out.println("Participante não existe");
                else break;
            }

        }
    }

    private static void showListPerson() {
        if(listPerson.size() > 0) {
            System.out.println("A lista de partipantes é: ");
            System.out.println("======================");

            for(Person person: listPerson) {
                System.out.println("id: " + person.id);
                System.out.println("Nome: " + person.name);
                System.out.println("Idade: " + person.age);
                System.out.println("Preço: " + person.price);
                System.out.println("--------------");
            }
        } else {
            System.out.println("Você ainda não tem nenhum participante!");
            System.out.println("========================================");
        };

    }

    private static int choiseCircuit(int age) {
        while(true) {
            System.out.println("----------------------");
            if (age < 18) {
                System.out.println("Circuito pequeno (P) - R$1.300");
                System.out.println("Circuito médio (M) - R$2.000");
            } else {
                System.out.println("Circuito pequeno (P) - R$ 1.500");
                System.out.println("Circuito médio (M) - R$ 2.300");
                System.out.println("Circuito avançado (A) - R$ 2.800");
            }
            System.out.println("--------------------------");

            System.out.println("Escolha o circuto (pela sigla): ");
            option = keyboard.next().toLowerCase();

            if (option.equals("p") || option.equals("m") || (age >= 18 && option.equals("a"))) break;

            System.out.println("Por favor insira apenas as siglas correspondentes");
        }

        switch (option) {
            case "p": {
                if (age < 18) return 1300;
                return 1500;
            }
            case "m": {
                if (age < 18) return 2000;
                return 2300;
            }
            default: return 2800;
        }
    }

    private static void addPerson() {
        System.out.println("=============================");
        while (true) {
            System.out.print("Qual o nome do partipante: ");
            String name = keyboard.next();

            System.out.print("Qual a idade do participante: ");
            int age = keyboard.nextInt();
            int price = choiseCircuit(age);

            listPerson.add(new Person(listPerson.size(), name, age, price));

            while(true) {
                System.out.println("Adicionar mais participantes? (S/N)");
                option = keyboard.next().toLowerCase();

                if (option.equals("n") || option.equals("s")) {
                    System.out.println("==================");
                    break;
                };

                System.out.println("Por favor insira apenas 'S' ou 'N'");
            }

            if (option.equals("n")) break;
        }
    }

}
