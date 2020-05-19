import java.util.Date;

/**
 * DateFactoryクラスの利用
 */
public class DelegateObjectExample {

  DateFactory dateFactory = new DateFactoryImpl();
  Date date = new Date();

  public void doSomething() {
    this.date = dateFactory.getDate();
  }
}
