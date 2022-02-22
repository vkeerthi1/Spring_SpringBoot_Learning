package Spring;

public class Body {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Human human = context.getBean("human",Human.class);
        human.StartPumping();
    }
}
