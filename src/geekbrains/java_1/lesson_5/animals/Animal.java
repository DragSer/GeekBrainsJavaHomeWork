package geekbrains.java_1.lesson_5.animals;

public abstract class Animal {

    final String name;

    Animal(String name){ this.name = name; }

    void moveOnGround(){ System.out.print(name + " бегает"); }
    public void moveOnGround(int speed){ System.out.print(name + " бегает"); }

    public void swim(){System.out.print(name);}
    public void swim(String swim){System.out.print(name);}

    void jump(){ System.out.print(name + " прыгает"); }
    public void jump(int jump){ System.out.print(name + " прыгает"); }
}