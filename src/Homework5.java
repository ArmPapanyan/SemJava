public class Homework5 {
    public static void main(String[] args){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Петров ", "234 654 734 ");
        phoneBook.add("Сидоров ", "678 345 902 ");
        phoneBook.add("Петров ", " 567 211 766");
        phoneBook.add("Иванов ", "788 605 344 ");
        phoneBook.add("Иванов ", "908 321 997 ");
        phoneBook.add("Петров ", "826 395 654 ");
        System.out.println(phoneBook.getAll());
        System.out.println(phoneBook.getbyPhoneNumber("Петров"));
        System.out.println(phoneBook.getbyName(" "));
    }
}