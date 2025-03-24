import br.com.alura.models.BankAccount;
import br.com.alura.models.Person;
import br.com.alura.models.Product;
import br.com.alura.models.Student;

public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        Person myPerson = new Person();
        Product myProduct = new Product();
        Student myStudent = new Student();

        myAccount.setOwner("Thomas");
        myAccount.setAccountNumber(123);
        myAccount.setBalance(1200.50);

        myAccount.displayInfo();

        myPerson.setName("Renato");
        myPerson.setAge(17);

        myPerson.isAdult();
        myPerson.displayInfo();

        myProduct.setName("Monitor portátil");
        myProduct.setPrice(800);

        myProduct.displayInfo();
        System.out.println(myProduct.discount(10));

        myStudent.setName("Cristina");
        myStudent.studentGrades(10);
        myStudent.studentGrades(7);
        myStudent.studentGrades(8);
        myStudent.studentAverage();
        myStudent.displayInfo();


    }
}
