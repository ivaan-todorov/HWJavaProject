package HW_6;

public class Salary {

    int result;


    int getSum(int[] employeeArray) {

        for (int i = 0; i < employeeArray.length; i++) {
            this.result += employeeArray[i];
        }

        return this.result;
    }

    //чтобы найти минимальное значение референсного типа
    Person getMinSum(Person[] arr) {
        Person min = null;
        for (int i = 0; i < arr.length; i++) {
            if (min == null || min.age > arr[i].age) {
                min = arr[i] ;
            }
        }

        return min;
    }
}
