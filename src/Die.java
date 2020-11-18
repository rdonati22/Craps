public class Die {
    private int value;

    public void roll() {
        value = (int) (Math.random() * 6 + 1);
    }

    public int getNumDots(){
        return value;
    }

    public static void main(String[] args) {

        // TODO Auto-generated method stub
        Die die = new Die();
        die.roll();
        System.out.println(die.getNumDots());

    }

}