public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Antonio Rossi", 2800000, 1, 10, 1989);
        staff[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
    
        // Panggil metode shell_sort untuk mengurutkan staff berdasarkan gaji
        Sortable.shell_sort(staff);
        
        // Cetak hasil setelah diurutkan
        for (Employee e : staff) {
            e.print();
        }
    }
}