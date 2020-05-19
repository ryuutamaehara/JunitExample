import java.util.List;

/**
 * 乱数生成オブジェクトをフィールドに持つクラス
 */
public class Randoms {

  RandomNumberGenerator randomNumberGenerator = new RandomNumberGeneratorImpl();

  public <T> T choice(List<T> options) {
    if (options.size() == 0) {
      return null;
    }
    int idx = randomNumberGenerator.nextInt() % options.size();
    return options.get(idx);
  }
}
