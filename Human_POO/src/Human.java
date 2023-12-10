import java.util.Random;

public class Human {

    public Random rand = new Random();
    private String paleColor;
    private float height;
    private float weight;
    private boolean rightHanded;
    private int age;

    public void speak(){

        int x = rand.nextInt(5);

        switch (x) {

            case 0:
            System.out.println("I'm a human");
                break;

            case 1:
            System.out.println("Hello There!");
                break;

            case 2:
            System.out.println("I'm only human, after all");
                break;

            case 3:
            System.out.println("Hello, my name is");
                break;

            case 4:
            System.out.println("Hey! Are you human too?");
                break;
        }
    }

    public void walk(){

    }

    public void run(){

    }

    public void eat(){

    }

    public void doExercises(){

    }

    //Getters and Setters
    /**
     * @return String return the paleColor
     */
    public String getPaleColor() {
        return paleColor;
    }

    /**
     * @param paleColor the paleColor to set
     */
    public void setPaleColor(String paleColor) {
        this.paleColor = paleColor;
    }

    /**
     * @return float return the height
     */
    public float getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * @return float return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * @return boolean return the rightHanded
     */
    public boolean isRightHanded() {
        return rightHanded;
    }

    /**
     * @param rightHanded the rightHanded to set
     */
    public void setRightHanded(boolean rightHanded) {
        this.rightHanded = rightHanded;
    }

    /**
     * @return int return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
}