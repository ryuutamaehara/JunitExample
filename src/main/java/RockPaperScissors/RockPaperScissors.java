package RockPaperScissors;

public class RockPaperScissors {

  public enum Hand {
    Rock, Paper, Scissors
  }

  public enum Result {
    WIN, LOSE, DRAW
  }

  public Result judge(Hand h1, Hand h2) {
    if (h1 == h2) {
      return Result.DRAW;
    }
    switch (h1) {
      case Rock:
        return h2 == Hand.Scissors ? Result.WIN : Result.LOSE;
      case Paper:
        return h2 == Hand.Rock ? Result.WIN : Result.LOSE;
      default:
        return h2 == Hand.Paper ? Result.WIN : Result.LOSE;
    }
  }
}
