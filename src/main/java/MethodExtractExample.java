import java.util.Date;

/**
 * システム時刻に依存する処理をgetDateメソッドに抽出
 */
public class MethodExtractExample {

  Date date = getDate();

  Date getDate() {
    return new Date();
  }

  public void doSomething() {
    this.date = getDate();
  }
}
