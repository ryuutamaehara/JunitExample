import java.util.Random;

/**
 * 乱数生成のデフォルト実装
 */
public class RandomNumberGeneratorImpl implements RandomNumberGenerator {

  private final Random random = new Random();

  @Override
  public int nextInt() {
    return random.nextInt();
  }
}
