class Bank {
    int getRateOfInterest() {
        return 5;
    }
}
class SBI extends Bank {
    @Override
    int getRateOfInterest() {
        return 7;
    }
}
class ICICI extends Bank {
    @Override
    int getRateOfInterest() {
        return 8;
    }
}
public class TestBank {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new ICICI();
        System.out.println(b1.getRateOfInterest());
        System.out.println(b2.getRateOfInterest());
    }
}
