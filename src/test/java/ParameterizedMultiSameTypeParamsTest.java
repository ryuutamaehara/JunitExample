import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

/**
 * 複数の引数を定義したパラメータ化テスト（型が同じ場合）
 */
@RunWith(Theories.class)
public class ParameterizedMultiSameTypeParamsTest {

  @DataPoint
  public static int INT_PARAM_1 = 3;
  @DataPoint
  public static int INT_PARAM_2 = 4;

  @Theory
  public void テストメソッド(int x, int y) throws Exception {
    System.out.println("テストメソッド(" + x + "," + y + ")");
  }
}
