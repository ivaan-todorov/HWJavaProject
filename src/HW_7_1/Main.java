package HW_7_1;

public class Main {

    public static void main(String[] args) {

        Worker worker = new Worker(1000, "Anna");
        Manager manager = new Manager(1000, "Ivan", 30);
        Director director = new Director(1000, "Sergey", 10);

        System.out.println(worker.getSalary());
        System.out.println(manager.getSalary());
        System.out.println(director.getSalary());



    }
}
