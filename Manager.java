class Manager extends Employee {
    private String secretaryName;
        public Manager(String n, double s, int d, int m, int y) {
        super(n, s, d, m, y);
        secretaryName = "";
    }
    
    public void raiseSalary(double byPercent) {
        // Tambahkan bonus 0,5% untuk setiap tahun bekerja
        int currentYear = new 
        java.util.GregorianCalendar().get(java.util.Calendar.YEAR);
        double bonus = 0.5 * (currentYear - hireYear());
        super.raiseSalary(byPercent + bonus);
    }
    
    public String getSecretaryName() {
        return secretaryName;
    }
}