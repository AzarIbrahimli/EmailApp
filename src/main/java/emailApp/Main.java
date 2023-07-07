package emailApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Collection collection = new Collection();
//        Email email = new Email("Azar","Ibrahimli","Azaz");
//        System.out.println(email);
//        System.out.println(email.alternativeEmail());
//        email.changePassword("FnwQuQVy");



//        Email email2 = new Email("Ilgar","Ibrahimli","Ahmed");
//        System.out.println(email);
//        System.out.println(email.alternativeEmail());
//        email.changePassword("FnwQuQVy");
//        collection.save(email);
//        System.out.println(collection.save(email2));;
//        System.out.println(collection.listEmail);
//        System.out.println(collection.delete(email));
//        System.out.println(collection.listEmail);









        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        String name = sc.next();
        System.out.println("Surname: ");
        String surname = sc.next();
        System.out.println("Department sales, development, accounting or none: ");
        String department = sc.next();
        System.out.println("Company: ");
        String company = sc.next();
        System.out.println(collection.save(new Email(name,surname,department,company)));
        collection.load();
        System.out.println("Finished");
    }
}
