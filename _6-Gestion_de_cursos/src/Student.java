public class Student {
    private int id;
    private String name;
    private String email;
    private String DNI;

    public Student(int id, String name, String email, String DNI) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.DNI = DNI;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Student\n" +
                "\nid: " + id +
                "\nname: '" + name +
                "\nemail: '" + email+
                "\nDNI: " + DNI;
    }
}
