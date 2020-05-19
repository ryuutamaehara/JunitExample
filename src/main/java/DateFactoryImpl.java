import java.util.Date;

/**
 * DateFactoryクラスのデフォルト実装
 */
public class DateFactoryImpl implements DateFactory {

  @Override
  public Date getDate() {
    return new Date();
  }
}
