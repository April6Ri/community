package life.majiang.community;

/**
 * @Annotation Java重写和隐藏的区别Test
 * @Author ZhaoTianZe on 2019/12/24 0024
 */
public class Test_hide  {
    public static void main(String[] args)  {
        Circle circle = new Circle();//本类引用指向本类对象
//        Shape shape =new Shape();
        Shape shape = new Circle();//父类引用指向子类对象(会有隐藏和覆盖)

        System.out.println(circle.name);
        circle.printType();
        circle.printName();
        //以上都是调用Circle类的方法和引用

        System.out.println(shape.name);//调用父类被隐藏的name属性
        shape.printType();//调用子类printType的方法
        shape.printName();//调用父类隐藏的printName方法
    }
}

class Shape {
    public String name = "shape";

    public Shape(){
        System.out.println("shape constructor");
    }

    public  void printType() {
        System.out.println("this is shape");
    }

    public static void printName() {
        System.out.println("shape");
    }
}

class Circle extends Shape {
    public String name = "circle"; //父类属性被隐藏

    public Circle() {
        System.out.println("circle constructor");
    }

    //对父类实例方法的覆盖
    public void printType() {
        System.out.println("this is circle");
    }

    //对父类静态方法的隐藏
    public static void printName() {
        System.out.println("circle");
    }
}

