import org.junit.*;
import static org.junit.Assert.*;

public class LeetspeakTest {

  @Test
  public void leetspeak_returnsAStringAsIsWhenNoLeetspeakIsPresent_wordDoesntChange() {
    AppName yourApp = new AppName();
    assertEquals("happy", yourApp.leetspeak("happy"));
  }

  @Test
  public void leetspeak_replacesEveryEInAStringWithA3_wordChanges() {
    AppName yourApp = new AppName();
    assertEquals("3l3phant", yourApp.leetspeak("elephant"));
  }

  @Test
  public void leetspeak_replacesEveryOInAStringWithA0_wordChanges() {
    AppName yourApp = new AppName();
    assertEquals("b00 b00", yourApp.leetspeak("boo boo"));
  }

  @Test
  public void leetspeak_replacesEveryIInAStringWithA1_wordChanges() {
    AppName yourApp = new AppName();
    assertEquals("1 lik3 1k3", yourApp.leetspeak("I like Ike"));
  }

  @Test
  public void leetspeak_replacesEverySInAStringWithAZ_wordChanges() {
    AppName yourApp = new AppName();
    assertEquals("roz3z are r3d", yourApp.leetspeak("roses are red"));
  }

  @Test
  public void leetspeak_doesNotReplaceSWhenFirstLetter_wordChanges() {
    AppName yourApp = new AppName();
    assertEquals("Suz13 Sunzh1n3", yourApp.leetspeak("Susie Sunshine"));
  }

  @test
  public void leetspeak_makesCorrectReplacementsRegardlessOfCase_ignoresUppercase() {
    AppName yourApp = new AppName();
    assertEquals( "1 scr3am y0u scr3am w3 all scr3am f0r razpb3rry ic3 cr3am!", yourApp.leetspeak("I scream you scream we all scream for raspberry ice cream!"));
  }

}
