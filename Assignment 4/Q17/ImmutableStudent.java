final class ImmutableStudent {
    private final String name;
    private final int id;

    public ImmutableStudent(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        ImmutableStudent student = new ImmutableStudent("John", 101);
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getId());
    }
}
