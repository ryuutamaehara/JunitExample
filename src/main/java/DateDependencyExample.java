import java.util.Date;

/**
 * システム時間に依存する処理を含むメソッド
 */
public class DateDependencyExample {

  Date date = new Date();

  public void doSomething() {
    this.date = new Date();
  }
}
