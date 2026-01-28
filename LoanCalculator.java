class LoanCalculator {


    void calculateEMI(int principal, int time, float rate) {
        int months = time * 12;
        double monthlyRate = rate / (12 * 100);

        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months))
                / (Math.pow(1 + monthlyRate, months) - 1);

        System.out.println("Home Loan EMI = " + emi);
    }


    void calculateEMI(double principal, int time, double rate) {
        int months = time * 12;
        double monthlyRate = rate / (12 * 100);

        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months))
                / (Math.pow(1 + monthlyRate, months) - 1);

        System.out.println("Vehicle Loan EMI = " + emi);
    }

    void calculateEMI(int principal, int time) {
        float rate = 10.0f;  // fixed interest rate
        int months = time * 12;
        double monthlyRate = rate / (12 * 100);

        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months))
                / (Math.pow(1 + monthlyRate, months) - 1);

        System.out.println("Personal Loan EMI (Fixed 10%) = " + emi);
    }

    public static void main(String[] args) {

        LoanCalculator lc = new LoanCalculator();

   
        lc.calculateEMI(500000, 10, 7.5f);   // principal, time(years), rate

    
        lc.calculateEMI(300000.0, 5, 9.0);   // principal, time(years), rate


        lc.calculateEMI(100000, 2);          // principal, time(years)
    }
}