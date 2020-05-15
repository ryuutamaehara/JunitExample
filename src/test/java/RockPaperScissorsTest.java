import static RockPaperScissors.RockPaperScissors.Hand.Paper;
import static RockPaperScissors.RockPaperScissors.Hand.Rock;
import static RockPaperScissors.RockPaperScissors.Hand.Scissors;
import static RockPaperScissors.RockPaperScissors.Result.LOSE;
import static RockPaperScissors.RockPaperScissors.Result.WIN;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import RockPaperScissors.RockPaperScissors;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.Theories;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class RockPaperScissorsTest {

  RockPaperScissors sut;

  @Before
  public void setUp() throws Exception {
    sut = new RockPaperScissors();
  }

  @Test
  public void RockAndScissorsIsWin() throws Exception {
    assertThat(sut.judge(Rock, Scissors), is(WIN));
  }

  @Test
  public void RockAndPaperIsLose() throws Exception {
    assertThat(sut.judge(Rock, Paper), is(LOSE));
  }
}
