package day9;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class task1 {
	int a,b,c;
  @Test(dataProvider = "dp")
  public void Add(Integer a,Integer b) {
	  
	  c=a+b;
	  System.out.println(c);
  }
  @Test(dataProvider = "dp")
  public void Sub(Integer a,Integer b) {
	  
	  c=a-b;
	  System.out.println(c);
  }
  @Test(dataProvider = "dp")
  public void Multi(Integer a,Integer b) {
	  
	  c=a*b;
	  System.out.println(c);
  }
  @Test(dataProvider = "dp")
  public void div(Integer a,Integer b) {
	  
	  c=a/b;
	  System.out.println(c);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 10, 5 },
      new Object[] { 12, 6},
    };
  }
}
