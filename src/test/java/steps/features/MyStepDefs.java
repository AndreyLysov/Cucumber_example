package steps.features;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;

public class MyStepDefs {

    @Дано("^на счете пользователя имеется (\\d+) рублей$")
    public void наСчетеПользователяИмеетсяРублей(int arg1) throws Throwable {
        System.out.println("На счету: " + arg1 + " рублей.");
    }

    @Когда("^пользователь снимает со счета (\\d+) рублей$")
    public void пользовательСнимаетСоСчетаРублей(int arg1) throws Throwable {
        System.out.println("Пользователь хочет снять" + arg1 + " рублей");
    }

    @Тогда("^появляется предупреждение \"([^\"]*)\"$")
    public void появляетсяПредупреждение(String arg1) throws Throwable {
       //Your code
    }
}
