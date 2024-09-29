public class ManagerTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Antonio Rossi", 4000000, 1, 10, 1989);
        staff[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991); // Manajer
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
    
        // Urutkan berdasarkan gaji menggunakan shell_sort
        Sortable.shell_sort(staff);
        // Cetak hasilnya
        for (Employee e : staff) {
            e.print();
        }
    }
}