public class Animal {
    public int age;
    public String gender;
    public boolean isMammal; //

    public Animal(){
    }

    public Animal(int age, String gender, boolean isMammal){
        this.age = age;
        this.gender = gender;
        this.isMammal = isMammal;
    }

    public void mate() {
        System.out.println("Animal mating");
    };

    public void voice(){
        System.out.println("Animal voice");
    };

    public final void sleep(){
        System.out.println("Animal sleep");
    };


    // getter setter metodları

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }
}
