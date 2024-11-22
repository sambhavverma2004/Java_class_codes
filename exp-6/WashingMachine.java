public class WashingMachine {
    private int noOfClothes;

    // Method to switch on the washing machine
    public void switchOn() {
        System.out.println("Washing machine is now ON.");
    }

    // Method to accept clothes
    public int acceptClothes(int clothes) {
        this.noOfClothes = clothes;
        System.out.println(clothes + " clothes have been added.");
        return this.noOfClothes;
    }

    // Method to accept detergent
    public void acceptDetergent() {
        System.out.println("Detergent has been added.");
    }

    // Method to switch off the washing machine
    public void switchOff() {
        System.out.println("Washing machine is now OFF.");
    }

    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        wm.switchOn();
        wm.acceptClothes(5);
        wm.acceptDetergent();
        wm.switchOff();
    }
}
