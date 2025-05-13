package QuestionsPractice.Questions.Question78;

public class MainClass {
    public static void main(String[] args) {
        BankAccount BA = new BankAccount("12345", 1000, "Khubaib");
        System.out.println(BA.getBalance());
        System.out.println(BA.deposit());
        System.out.println(BA.withdrawal());
    }
}
