import java.util.List;

public class Student {

        private int studentId;
        private String studentName;
        private String gender;
        private int year;
        private int classId;
        private boolean hasPaidFees ;
        private boolean isPresent ;


    //        private Staff staff;
        List<Staff> Staff;
         Classroom classroom;
         Canteen Canteen;
         Library library;
         Bus bus;
        Auditorium auditorium;


    public Student(int studentId, String studentName, String gender, int year, int classId) {
            this.studentId = studentId;
            this.studentName = studentName;
            this.gender = gender;
            this.year = year;
            this.classId = classId;
            this.classroom = null;
            this.Canteen = null;
            this.library = null;
        }

        public int getStudentId() {
            return studentId;
        }

        public void setStudentId(int studentId) {
            this.studentId = studentId;
        }

        public String getStudentName() {
            return studentName;
        }

        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getClassId() {
            return classId;
        }

        public void setClassId(int classId) {
            this.classId = classId;
        }
    public void setCafeteria(Canteen Canteen) {
        this.Canteen = Canteen;
    }

        public String StudentDetails() {
            return "Student ID: " + studentId + "\n" +
                    "Student Name: " + studentName + "\n" +
                    "Gender: " + gender + "\n" +
                    "Year: " + year + "\n" +
                    "Class ID: " + classId;
        }

        public void PayFees() {
            this.hasPaidFees = true;        }

        public boolean IsPresent() {
            return this.isPresent;
        }
    }


