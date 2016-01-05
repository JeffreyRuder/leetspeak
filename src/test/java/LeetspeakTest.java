import org.junit.*;
import static org.junit.Assert.*;

public class LeetspeakTest {

  @Test
  public void leetspeak_returnsAStringAsIsWhenNoLeetspeakIsPresent_wordDoesntChange() {
    Leetspeak Leetspeak = new Leetspeak();
    assertEquals("happy", Leetspeak.leetspeak("happy"));
  }

  @Test
  public void leetspeak_replacesEveryEInAStringWithA3_wordChanges() {
    Leetspeak Leetspeak = new Leetspeak();
    assertEquals("3l3phant", Leetspeak.leetspeak("elephant"));
  }

  @Test
  public void leetspeak_replacesEveryOInAStringWithA0_wordChanges() {
    Leetspeak Leetspeak = new Leetspeak();
    assertEquals("b00 b00", Leetspeak.leetspeak("boo boo"));
  }

  @Test
  public void leetspeak_replacesEveryIInAStringWithA1_wordChanges() {
    Leetspeak Leetspeak = new Leetspeak();
    assertEquals("1 lik3 1k3", Leetspeak.leetspeak("I like Ike"));
  }

  @Test
  public void leetspeak_replacesEverySInAStringWithAZ_wordChanges() {
    Leetspeak Leetspeak = new Leetspeak();
    assertEquals("r0z3z ar3 r3d", Leetspeak.leetspeak("roses are red"));
  }

  @Test
  public void leetspeak_doesNotReplaceSWhenFirstLetter_wordChanges() {
    Leetspeak Leetspeak = new Leetspeak();
    assertEquals("Suzi3 Sunzhin3", Leetspeak.leetspeak("Susie Sunshine"));
  }

  @Test
  public void leetspeak_makesCorrectReplacementsRegardlessOfCase_ignoresUppercase() {
    Leetspeak Leetspeak = new Leetspeak();
    assertEquals( "1 scr3am y0u scr3am w3 all scr3am f0r razpb3rry ic3 cr3am!", Leetspeak.leetspeak("I scream you scream we all scream for raspberry ice cream!"));
  }

}
