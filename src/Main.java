public class Main {
    public static void main(String[] args) {
    Student student = new Student("Иван", "Борщев", "УИ1", 5);
        Student aspirant = new Aspirant("Петр", "Пупкин","НУ5",4,"Да");
        Student[] students = {student, aspirant};
        for (int i = 0; i < students.length; i++){
            System.out.println(students[i].getScholarship());
        }
    }
}
