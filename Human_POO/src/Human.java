import java.util.Random;

public class Human {

    public Random rand = new Random();
    private String paleColor;
    private float height;
    private float weight;
    private boolean rightHanded;
    private int age;
    private boolean isWalking;
    private boolean isRunning;

    //Human methods
    
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
        System.out.println("Walking");
        this.setIsWalking(true);
    }

    public void run(){

    }

    public void eat(){

    }

    public void doExercises(){

    }

    public void showAttributes(){
        System.out.println("==== Human attributes ====");
        System.out.println("Height: "+this.getHeight());
        System.out.println("Weight: "+this.getWeight());
        System.out.println("Is right handed? "+this.isRightHanded());
        System.out.println("Age: "+this.getAge());
        System.out.println("Is walking? "+this.isWalking());
        System.out.println("Is running? "+this.isRunning());
    }

    //Getters and Setters

    public String getPaleColor() {
        return paleColor;
    }

    public void setPaleColor(String paleColor) {
        this.paleColor = paleColor;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isRightHanded() {
        return rightHanded;
    }

    public void setRightHanded(boolean rightHanded) {
        this.rightHanded = rightHanded;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isWalking(){
        return isWalking;
    }

    public void setIsWalking(boolean isWalking){
        this.isWalking = isWalking;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setIsRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }
}