//Qus2. Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails which provide there specific details like rateofinterest etc,print details of every banks.

public class Second {
    public static void main(String[] args) {
        // Creating objects of subclasses
        Bank sbi = new SBI();
        Bank boi = new BOI();
        Bank icici = new ICICI();

        // Printing details of each bank
        sbi.getDetails();
        boi.getDetails();
        icici.getDetails();
    }
}

// Parent class
class Bank {
    // Method to be overridden by subclasses
    public void getDetails() {
        System.out.println("Bank details are not available.");
    }
}

// SBI subclass
class SBI extends Bank {
    @Override
    public void getDetails() {
        System.out.println("Bank: SBI");
        System.out.println("Rate of Interest: 5.5%");
        System.out.println("Branch: Mumbai\n");
    }
}

// BOI subclass
class BOI extends Bank {
    @Override
    public void getDetails() {
        System.out.println("Bank: BOI");
        System.out.println("Rate of Interest: 6.0%");
        System.out.println("Branch: Delhi\n");
    }
}

// ICICI subclass
class ICICI extends Bank {
    @Override
    public void getDetails() {
        System.out.println("Bank: ICICI");
        System.out.println("Rate of Interest: 6.5%");
        System.out.println("Branch: Bangalore\n");
    }
}
