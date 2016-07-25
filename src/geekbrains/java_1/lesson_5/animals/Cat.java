package geekbrains.java_1.lesson_5.animals;

public class Cat extends Animal {
//    protected String name;
    protected int speed = 50;
    protected int jump = 2;
    protected String swim = "N";

    public Cat(String name){ super(name); }

    public void moveOnGround(int speed){
        if (speed != this.speed){
            System.out.println("1 вопрос - ошибка!");
            super.moveOnGround();
            System.out.print(" со скоростью "+this.speed+" км/ч");
        } else {
            System.out.print("1 вопрос - верно!");
        }
    }

    @Override
    public void swim(String swim){
        if (swim.equals(this.swim)){
            System.out.print("2 вопрос - верно!");
        } else {
            System.out.print("2 вопрос - ошибка!\n"+name+" не плавает");
        }
    }

    @Override
    public void jump(int jump){
        if (jump != this.jump){
            System.out.println("3 вопрос - ошибка!");
            super.jump();
            System.out.print(" на высоту "+this.jump+" м");
        } else {
            System.out.print("3 вопрос - верно!");
        }
    }
}
