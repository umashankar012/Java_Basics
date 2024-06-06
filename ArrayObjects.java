class Students{
    int roll_no;
    String name;
    int marks;

}
public class ArrayObjects {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.roll_no = 12;
        s1.name = "bob";
        s1.marks = 34;


        Students s2 = new Students();
        s2.roll_no = 14;
        s2.name = "gogo";
        s2.marks = 56;

        Students s3 = new Students();
        s3.roll_no = 16;
        s3.name = "jojo";
        s3.marks = 54;


        Students students[] = new Students[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0; i<students.length; i++) {
        }

    }
}
