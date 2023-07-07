package emailApp;

import java.security.SecureRandom;
import java.util.Random;

public class Email {
    private String firstname;
    private String lastname;
    private String password;
    private String company;
    private String department;
    private int capacity;

    Random random = new Random();
    int randomNum = random.nextInt((999 - 100) + 1) + 100;

    public Email(String firstname, String lastname, String department, String company) {
        this.firstname = firstname;
        this.lastname = lastname;;
        this.department = department;
        this.company = company;
        generateRandomPassword();
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    private void generateRandomPassword(){
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < 8; i++){
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
        setPassword(sb.toString());
    }

    public void changePassword(String exPassword){
        if(exPassword==getPassword()){
            generateRandomPassword();}
        else{
            System.out.println("Password is not correct");
        }
    }

    private void setCapacityMethod(int c){
        setCapacity(c);
    }

    public String alternativeEmail(){
        if (department.equals("none")) {
            return firstname + '.' + lastname + '@' + company + ".com ";
        }
        else {
            return firstname + '.' + lastname + '@' + department + '.' + company + ".com";
        }
    }

    @Override
    public String toString() {
        if (department.equals("none")) {
            return firstname + '.' + lastname + '@' + company + ".com ";
        }
        else {
            return firstname + '.' + lastname + '@' + department + '.' + company + ".com ";
        }
    }
}
