package exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Person {
    String name;
    int age;
    // String lastname;
    // String number;
    // String bloodGroup;
    // int register;

    Person(String name,  int age) {
        this.name = name;
        this.age = age;

        // this.bloodGroup =  bloodGroup;
        // this.lastname = lastname;
        // this.number = number;
        // this.register = register;
    }
}

public class Circuit {
    public static void main(String[] args) {
        List<Person> listPerson = new ArrayList<Person>();

        while (true) {
            Scanner keyboard = new Scanner(System.in);


            System.out.print("Qual o nome do partipante: ");
            String name = keyboard.next();

            System.out.print("Qual a idade do participante: ");
            int age = keyboard.nextInt();

            listPerson.add(new Person(name, age));

            System.out.println("Adicionar mais participantes? (S/N)");
            String option = keyboard.next().toLowerCase();

            if (option.equals("n")) break;
        }

        System.out.println("A lista de partipantes é: ");
        System.out.println("======================");

        for(Person person: listPerson) {
            System.out.println("Nome: " + person.name);
            System.out.println("Idade: " + person.age);
            System.out.println("--------------");
        }
    }
}
