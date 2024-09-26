class University {
    class Department {
        void showDetails() {
            System.out.println("Inside Department of University.");
        }
    }

    public static void main(String[] args) {
        University university = new University();
        University.Department dept = university.new Department();
        dept.showDetails();
    }
}
