import data.GeneratorListData;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        GeneratorListData data = context.getBean("dataInt",GeneratorListData.class);
        data.CompositeString(5,4,2,10);
        context.close();
    }
}
