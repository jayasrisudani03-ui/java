class Student {
    final int rollNo;
    String name;
    double marks;

    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
		
    }

    final String calculateGrade() {
        if (marks >= 90)
            return "O";
        else if (marks >= 80)
            return "A+";
        else if (marks >= 70)
            return "A";
        else if (marks >= 60)
            return "B+";
        else if (marks >= 50)
            return "B";
        else
            return "F";
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}
class SmartStudent extends Student {

    SmartStudent(int rollNo, String name, double marks) {
        super(rollNo, name, marks);
    }
	
}

class Main {
    public static void main(String[] args) {

        Student s = new Student(101, "Jayasri", 85);
		
        s.display();
		

    }
	
}