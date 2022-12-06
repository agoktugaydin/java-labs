public class Duck extends Animal {

    public String beakColor = "yellow";

    public Duck(){
        super();
    }
    public Duck(int age, String gender){
        super(age, gender, false);
    }
    public Duck(int age, String gender, String beakColor){
        super(age, gender, false);
        this.beakColor = beakColor;
    }

    public void swim(){
        System.out.println("Duck swimming");
    }

    public void quack(){
        System.out.println("Duck quacking");
    }

    // override
    public void voice(){
        System.out.println("Duck voice");
    };

    // override
    public String toString(){

        return "[" + this.getClass().getSimpleName() + "]"
                + " "
                + "[" + super.isMammal() + "]";
    }
}
