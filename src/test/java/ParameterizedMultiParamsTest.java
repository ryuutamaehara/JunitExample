import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

/**
 * 複数の引数を定義したパラメータ化テスト（型が異なる）
 */
@RunWith(Theories.class)
public class ParameterizedMultiParamsTest {

  @DataPoint
  public static int INT_PARAM_1 = 3;
  @DataPoint
  public static int INT_PARAM_2 = 4;
  @DataPoint
  public static String STRING_PARAM_1 = "Hello";
  @DataPoint
  public static String STRING_PARAM_2 = "World";

  @Theory
  public void テストメソッド(int intParam, String stringParam) throws Exception {
    System.out.println("テストメソッド(" + intParam + "," + stringParam + ")");
  }
}
