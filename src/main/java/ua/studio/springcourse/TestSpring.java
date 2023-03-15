package ua.studio.springcourse; // визначає пакет, до якого належить клас.

import org.springframework.context.support.ClassPathXmlApplicationContext;
// - імпортує клас ClassPathXmlApplicationContext з пакету Spring Framework.

/**
 * @author Andre Murano
 */
public class TestSpring {
    // - визначає клас з назвою TestSpring.

    public static void main(String[] args) {
        //- визначає точку входу в додаток.

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        ); // - створює об'єкт ClassPathXmlApplicationContext,
        // який використовує конфігураційний файл "applicationContext.xml" для створення бінів (об'єктів).

        TestBean testBean = context.getBean("testBean", TestBean.class);
        //- отримує об'єкт TestBean з контексту Spring.getBean()
        // метод приймає два параметри - ідентифікатор біна (в даному випадку "testBean") та клас,
        // який ми очікуємо отримати (в даному випадку TestBean.class).

        System.out.println(testBean.getName());
        // - викликає метод getName() на об'єкті TestBean та виводить результат у консоль.

        context.close();
        // - закриває контекст Spring.
    }
}
