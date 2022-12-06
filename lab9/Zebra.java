public class Zebra extends Animal {

    public boolean isWild;

    public Zebra(){
        super();
    }
    public Zebra(int age, String gender){
        super(age, gender, true);
    }

    public Zebra(int age, String gender, boolean isWild){
        super(age, gender, true);
        this.isWild = isWild;
    }

    public void run(){
        System.out.println("Zebra running");
    }

    // override
    public void voice(){
        System.out.println("Zebra voice");
    };

    // override
    public String toString(){

        return "[" + this.getClass().getSimpleName() + "]"
                + " "
                + "[" + super.isMammal() + "]";
    }


}
