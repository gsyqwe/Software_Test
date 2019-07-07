package net.mooctest;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import org.junit.Before;
import org.junit.Test;

public class JipaTest {
	
	ByteArrayInputStream in=null;
	ByteArrayOutputStream out = null;
	InputStream input=null;
	
	@Before
	public void setup(){
		input=System.in;
		out=new ByteArrayOutputStream();
	}

  @Test(timeout = 4000)
  public void test() {
	  int int0 = Jipa.getValue("");
  }
  
  @Test(timeout = 4000)
  public void testa00()  throws Throwable  {
      String string0 = Jipa.removeComment("0");
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void testa01()  throws Throwable  {
      boolean boolean0 = Jipa.isNumeric("0");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void testa04()  throws Throwable  {
      // Undeclared exception!
      try { 
        Jipa.loadInstructions((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void testa05()  throws Throwable  {
      int int0 = Jipa.getValue("");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void testa06()  throws Throwable  {
      Jipa.resetInstructions();
  }

  @Test(timeout = 4000)
  public void tesat07()  throws Throwable  {
      Jipa.opcodes jipa_opcodes0 = Jipa.opcodes.toOpcode("");
      assertEquals(Jipa.opcodes.novalue, jipa_opcodes0);
  }

  @Test(timeout = 4000)
  public void tesdt08()  throws Throwable  {
      boolean boolean0 = Jipa.isNumeric("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void tesdt09()  throws Throwable  {
      String string0 = Jipa.getStringValue("\".");
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void tesst10()  throws Throwable  {
      String string0 = Jipa.getStringValue("<\"");
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void tedst11()  throws Throwable  {
      String string0 = Jipa.getStringValue("\"");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void tedst12()  throws Throwable  {
      String string0 = Jipa.getStringValue("");
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void teszat13()  throws Throwable  {
      String[] stringArray0 = Jipa.splitArguments("s,");
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void tesct14()  throws Throwable  {
      String[] stringArray0 = Jipa.splitArguments("");
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void testv15()  throws Throwable  {
      String string0 = Jipa.removeComment("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1b6()  throws Throwable  {
      boolean boolean0 = Jipa.loadInstructions("K");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void testd17()  throws Throwable  {
      Jipa.processInstruction("");
  }

  @Test(timeout = 4000)
  public void testwd18()  throws Throwable  {
      Jipa jipa0 = new Jipa();
      assertEquals(0, Jipa.TOTAL_INSTRUCTIONS);
  }

  @Test(timeout = 4000)
  public void testq19()  throws Throwable  {
      int int0 = Jipa.getJumpValue("");
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Label label0 = new Label(0, "C");
      label0.getName();
      assertEquals(0, label0.getLine());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Label label0 = new Label(0, "");
      label0.getName();
      assertEquals(0, label0.getLine());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Label label0 = new Label((-1), "");
      int int0 = label0.getLine();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int int0 = Label.findLabel((String) null);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Label.buildLabelList();
  }
  
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Variable.addVariable("INNER");
      Variable.setVariableValue("INNER", 97526364);
      Variable.setVariableValue("9&=^Y%RYc4B%?", 678);
      int int0 = Variable.getVariableValue("%s is not a Type variable");
      //  // Unstable assertion: assertEquals(0, int0);
      
      Variable.setVariableValue("9&=^Y%RYc4B%?", 678);
      boolean boolean0 = Variable.addVariable("%s is not a Type variable");
      Variable.getVariableValue("INNER");
      Variable.addVariable("b+E90Yfi}oZF{>9gOL");
      Variable.addVariable("%s is not a Type variable");
      Variable.removeVariable("%s is not a Type variable");
      Variable.removeVariable("9&=^Y%RYc4B%?");
      Variable.setVariableValue("}l~El?NC!/", 97526364);
      Variable.addVariable("#h|");
      Variable.addVariable("9&=^Y%RYc4B%?");
      Variable.addVariable("#h|");
      Variable.removeVariable("<9m");
      Variable.setVariableValue("}l~El?NC!/", (-936));
      Variable.addVariable("b+E90Yfi}oZF{>9gOL");
      int int1 = Variable.getVariableValue("");
      //  // Unstable assertion: assertEquals(1570, int1);
      
      Variable.getVariableValue("#h|");
      Variable.setVariableValue("h}RPM=S^ U3HJm/6", (-737));
      boolean boolean1 = Variable.addVariable("");
      //  // Unstable assertion: assertFalse(boolean1 == boolean0);
      //  // Unstable assertion: assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Variable.getVariableValue("#h|");
      Variable.addVariable("INNER");
      Variable.setVariableValue("INNER", 97526364);
      Variable.addVariable("INNER");
      Variable.setVariableValue("9&=^Y%RYc4B%?", 678);
      int int0 = Variable.getVariableValue("9&=^Y%RYc4B%?");
      //  // Unstable assertion: assertEquals(678, int0);
      
      Variable.setVariableValue("9&=^Y%RYc4B%?", 678);
      Variable.addVariable("9&=^Y%RYc4B%?");
      Variable.getVariableValue("INNER");
      Variable.addVariable("b+E90Yfi}oZF{>9gOL");
      boolean boolean0 = Variable.addVariable("INNER");
      Variable.removeVariable("INNER");
      Variable.removeVariable("9&=^Y%RYc4B%?");
      Variable.setVariableValue("}l~El?NC!/", 97526364);
      Variable.addVariable("#h|");
      Variable.addVariable("9&=^Y%RYc4B%?");
      Variable.addVariable("#h|");
      Variable.removeVariable("<9m");
      Variable.setVariableValue("}l~El?NC!/", (-936));
      Variable.addVariable("b+E90Yfi}oZF{>9gOL");
      Variable.getVariableValue("");
      Variable.getVariableValue("#h|");
      String string0 = "h}RPM=S^ U3HJm/6";
      int int1 = (-737);
      Variable.setVariableValue(string0, int1);
      String string1 = "";
      Variable.addVariable(string1);
      String string2 = "";
      Variable.getVariableValue(string2);
      String string3 = "Q";
      boolean boolean1 = Variable.addVariable(string3);
      //  // Unstable assertion: assertFalse(boolean1 == boolean0);
      //  // Unstable assertion: assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Variable.getVariableValue("#h|");
      Variable.addVariable("INNER");
      Variable.setVariableValue("INNER", 97526364);
      Variable.addVariable("INNER");
      String string0 = "9&=^Y%R\\Yc4B%?";
      Variable.setVariableValue("9&=^Y%RYc4B%?", 678);
      Variable.getVariableValue("%s is not a Type variable");
      Variable.setVariableValue("9&=^Y%RYc4B%?", 678);
      Variable.addVariable("%s is not a Type variable");
      Variable.getVariableValue("INNER");
      Variable.addVariable("b+E90Yfi}oZF{>9gOL");
      Variable.addVariable("%s is not a Type variable");
      Variable.removeVariable("%s is not a Type variable");
      Variable.removeVariable("9&=^Y%RYc4B%?");
      Variable.setVariableValue("}l~El?NC!/", 97526364);
      Variable.addVariable("#h|");
      Variable.addVariable("9&=^Y%RYc4B%?");
      Variable.addVariable("#h|");
      Variable.removeVariable("<9m");
      Variable.setVariableValue("}l~El?NC!/", (-936));
      Variable.addVariable("b+E90Yfi}oZF{>9gOL");
      String string1 = "";
      Variable.getVariableValue("");
      Variable.getVariableValue("#h|");
      String string2 = "h}RPM=S^ U3HJm/6";
      int int0 = (-737);
      Variable.setVariableValue(string2, int0);
      String string3 = "";
      boolean boolean0 = Variable.addVariable(string3);
      Variable.addVariable(string1);
      boolean boolean1 = Variable.addVariable(string0);
      //  // Unstable assertion: assertFalse(boolean1 == boolean0);
      //  // Unstable assertion: assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      assertEquals(0,Variable.getVariableValue("r#uXX`$8t?"));
      Variable.setVariableValue("r#uXX`$8t?", 0);
      Variable.addVariable("{\"(_x0C_w=r^<\"$");
      Variable.removeVariable("r#uXX`$8t?");
      assertEquals(0,Variable.getVariableValue("r#uXX`$8t?"));
      Variable.addVariable("{\"(_x0C_w=r^<\"$");
      String string0 = "*";
      assertEquals(2,Variable.getVariableValue("*"));
      assertEquals(0,Variable.getVariableValue("&"));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = "&";
      int int0 = 123;
      Variable.setVariableValue("&", 123);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Variable.setVariableValue("N", 306654252);
      Variable.setVariableValue("B'/8r3z r=b;VC`/l{", 306654252);
      Variable.setVariableValue("N", 306654252);
      Variable.setVariableValue("", 306654252);
      int int0 = Variable.getVariableValue("");
      //  // Unstable assertion: assertEquals(306654252, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = "lRUY?:nwlW^as+";
      Variable.addVariable("lRUY?:nwlW^as+");
      Variable.addVariable("lRUY?:nwlW^as+");
      Variable.removeVariable("lRUY?:nwlW^as+");
      Variable.addVariable("lRUY?:nwlW^as+");
      Variable.setVariableValue("lRUY?:nwlW^as+", (-2560));
      String string1 = null;
      // Undeclared exception!
      try { 
        Variable.getVariableValue((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Variable.addVariable("u@FG7-@|4In_gir");
      // Undeclared exception!
      try { 
        Variable.removeVariable((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Variable.addVariable("*");
      Variable.addVariable("*");
      Variable.setVariableValue("*", (-1858));
      String string0 = "QJX0v";
      Variable.getVariableValue("QJX0v");
      Variable.removeVariable("*");
      Variable.removeVariable("QJX0v");
      String string1 = null;
      // Undeclared exception!
      try { 
        Variable.addVariable((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Variable.getVariableValue("#h|");
      boolean boolean0 = Variable.addVariable("INNER");
      //  // Unstable assertion: assertTrue(boolean0);
      
      Variable.setVariableValue("INNER", 97526364);
      Variable.addVariable("INNER");
      Variable.setVariableValue("9&=^Y%RYc4B%?", 678);
      Variable.getVariableValue("%s is not a Type variable");
      Variable.setVariableValue("9&=^Y%RYc4B%?", 678);
      Variable.addVariable("%s is not a Type variable");
      Variable.getVariableValue("INNER");
      Variable.addVariable("b+E90Yfi}oZF{>9gOL");
      Variable.addVariable("%s is not a Type variable");
      Variable.removeVariable("%s is not a Type variable");
      Variable.removeVariable("9&=^Y%RYc4B%?");
      Variable.setVariableValue("}l~El?NC!/", 97526364);
      Variable.addVariable("#h|");
      Variable.addVariable("9&=^Y%RYc4B%?");
      Variable.addVariable("#h|");
      Variable.removeVariable("<9m");
      Variable.setVariableValue("}l~El?NC!/", (-936));
      boolean boolean1 = Variable.addVariable("b+E90Yfi}oZF{>9gOL");
      //  // Unstable assertion: assertFalse(boolean1);
      assertEquals(false,boolean1);
      Variable.getVariableValue("");
      Variable.getVariableValue("#h|");
      String string0 = "h}RPM=S^ U3HJm/6";
      int int0 = (-737);
      Variable.setVariableValue(string0, int0);
      String string1 = "";
      boolean boolean2 = Variable.addVariable(string1);
      //  // Unstable assertion: assertTrue(boolean2);
      assertEquals(false,boolean2);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Variable.addVariable("");
      Variable.getVariableValue("J0rQ@");
      Variable.removeVariable("");
      Variable.addVariable(")MV\"");
      Variable.setVariableValue("", 0);
      Variable.setVariableValue("", 0);
      Variable.removeVariable("EnumDeclaration");
      Variable.removeVariable("");
      Variable.removeVariable("");
      Variable.removeVariable("EnumDeclaration");
      Variable.getVariableValue("");
      Variable.getVariableValue(")MV\"");
      Variable.addVariable("");
      Variable.removeVariable("Sgu0+;Qbg}:~%I%");
      Variable.addVariable("cvG,W77?OFH");
      Variable.addVariable("");
      Variable.setVariableValue("J0rQ@", 0);
      Variable.removeVariable("j|co*x~BEs+L_k");
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Variable.addVariable("&");
      Variable.removeVariable("&");
      Variable.getVariableValue("&");
      Variable.removeVariable("&");
      Variable.getVariableValue("&");
      Variable.removeVariable("");
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Variable.setVariableValue("EO< nY$/%^w{[", (-1));
      Variable.addVariable(".7}d;q");
      assertEquals(0,Variable.getVariableValue(".7}d;q"));
      Variable.removeVariable(".7}d;q");
      Variable.removeVariable("EO< nY$/%^w{[");
      // Undeclared exception!
      try { 
        Variable.getVariableValue((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = null;
      // Undeclared exception!
      try { 
        Variable.getVariableValue((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Variable.setVariableValue("U,_Z|>zB", 0);
      Variable.addVariable("h>s w')");
      Variable.removeVariable("*");
      Variable.removeVariable("*");
      assertEquals(0,Variable.getVariableValue("h>s w')"));
      assertEquals(-1,Variable.getVariableValue("*"));
      assertEquals(0,Variable.getVariableValue("double"));
      Variable.addVariable("");
      Variable.removeVariable("");
      Variable.removeVariable("");
      assertEquals(0,Variable.getVariableValue("h>s w')"));
      assertEquals(-1,Variable.getVariableValue("*"));
      assertEquals(0,Variable.getVariableValue("double"));
  }
  
  @Test
  public void test34(){
	  
  }
  
  @Test(timeout=5)
  public void test2222(){
	  Jipa j = new Jipa();
	  j.processInstruction(" halt (1(,2))");
  }
  
  @Test
  public void test32(){
	  Jipa j = new Jipa();
	  j.processInstruction("out (1(,2))");
  }
  
  @Test(timeout=4000)
  public void test332(){
	  Jipa j = new Jipa();
	  in = new ByteArrayInputStream("123".getBytes());
	  System.setIn(in);
	  assertEquals(false,j.loadInstructions(""));
  }
  
  @Test(timeout=4000)
  public void test3324(){
	  Jipa j = new Jipa();
	  in = new ByteArrayInputStream("123".getBytes());
	  System.setIn(in);
	  assertEquals("123",j.getFileName());
  }
  
  @Test(timeout=4000)
  public void test33245(){
	  Jipa j = new Jipa();
	  in = new ByteArrayInputStream("123".getBytes());
	  System.setIn(in);
	  assertEquals(123,j.readValue());
  }
  
  @Test(timeout=4000)
  public void test332456(){
	  Jipa j = new Jipa();
	  in = new ByteArrayInputStream("123".getBytes());
	  System.setIn(in);
	  assertEquals("123;42",j.removeComment("123;42;45"));
  }
  
  @Test(timeout=4000)
  public void test3324567(){
	  Jipa j = new Jipa();
	  in = new ByteArrayInputStream("123".getBytes());
	  System.setIn(in);
	  assertEquals("\"123;42;45\"",j.removeComment("\"123;42;45\";"));
  }
  
  @Test(timeout=4000)
  public void test33245670(){
	  Jipa j = new Jipa();
	  assertEquals(true,j.isNumeric("123"));
	  assertEquals(false,j.isNumeric("avc"));
  }
  
}
