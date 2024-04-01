package builder;

public class Student {
        private int age;
        private String fname ;
        private String lname;
        private String gender;
        private double psp;
        private double weight;

    public String getFname() {
        return fname;
    }

    private Student(StudentBuilder builder){
            this.age= builder.getAge();
            this.fname=builder.getFname();
            this.lname=builder.getLname();
            this.gender=builder.getGender();
            this.psp=builder.getPsp();
            this.weight=builder.getWeight();
        }

        public static StudentBuilder createBuilder(){
            return new StudentBuilder();
        }
        public static class StudentBuilder {
            private int age;
            private String fname ;
            private String lname;
            private String gender;
            private double psp;
            private double weight;

            public Student build(){
                return new Student(this);
            }

            public StudentBuilder setAge(int age){
                this.age=age;
                return this;
            }
            public StudentBuilder setFname(String fname){
                this.fname=fname;
                return this;
            }
            public StudentBuilder setLname(String lname){
                this.lname=lname;
                return this;
            }
            public StudentBuilder setgender(String gender){
                this.gender=gender;
                return this;
            }
            public StudentBuilder setPsp(double psp){
                this.psp=psp;
                return this;
            }
            public StudentBuilder setweight(double weight){
                this.weight=weight;
                return this;
            }
            public int getAge(){
                return age;
            }
            public String getFname(){
                return fname;
            }
            public String getLname(){
                return lname;
            }
            public String getGender(){
                return gender;
            }
            public double getPsp(){
                return psp;
            }
            public double getWeight(){
                return weight;
            }

        }

}
