public class Fish extends Animal {

    private int sizeInFt;
    private boolean canEat;

    public Fish(){
        super();
    }
    public Fish(int age, String gender){
        super(age, gender, false);
    }

    public Fish(int age, String gender, int sizeInFt, boolean canEat){
        super(age, gender, false);
        this.sizeInFt = sizeInFt;
        this.canEat = canEat;
    }

    public void swim(){ // public alindi
        System.out.println("Fish swimming");
    }

    // override
    public void voice(){
        System.out.println("Fish voice");
    };

    // override
    public String toString(){

        return "[" + this.getClass().getSimpleName() + "]"
                + " "
                + "[" + super.isMammal() + "]";
    }

    // getter setter metodları

    public int getSizeInFt() {
        return sizeInFt;
    }

    public void setSizeInFt(int sizeInFt) {
        this.sizeInFt = sizeInFt;
    }

    public boolean isCanEat() {
        return canEat;
    }

    public void setCanEat(boolean canEat) {
        this.canEat = canEat;
    }
}
