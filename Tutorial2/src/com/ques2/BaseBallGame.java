package com.ques2;

public class BaseBallGame {
  public Team home,visitor;
  public int homeScore,visitorScore;
  public void homeTeamScored(int numberOfRuns){
      homeScore+=numberOfRuns;
  }
  public void visitorTeamScored(int numberOfRuns){
      visitorScore+=numberOfRuns;
  }
  public void gameOver(){
      if(homeScore>visitorScore){
          home.numberOfWins++;
          visitor.numberOfLosses++;
      }else{
          home.numberOfLosses++;
          visitor.numberOfWins++;
      }
  }

}
