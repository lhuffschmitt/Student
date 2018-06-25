public class StudentTest {

    public static void main (String[] args)
    {
        Student etudiant1 = new Student("Pierre Gries", 76.2);
        Student etudiant2 = new Student("Claire Gries", 96.2);

        System.out.printf("%s la note est: %s%n", etudiant1.getName(), etudiant1.getLetterGrade() );
        System.out.printf("%s la note est: %s%n", etudiant2.getName(), etudiant2.getLetterGrade() );

    }
}
