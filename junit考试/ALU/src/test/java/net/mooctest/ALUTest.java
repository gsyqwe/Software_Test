package net.mooctest;

import org.junit.Test;

import static org.junit.Assert.*;
import net.mooctest.ALU;

import org.junit.runner.RunWith;

public class ALUTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ALU aLU0 = new ALU();
      aLU0.normalize("-");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ALU aLU0 = new ALU();
      aLU0.floatRepresentation("101", ':', ':');
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ALU aLU0 = new ALU();
      aLU0.floatTrueValue("1", 0, (-1));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ALU aLU0 = new ALU();
      aLU0.integerTrueValue("hz");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ALU aLU0 = new ALU();
      aLU0.ieee754("", 65);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ALU aLU0 = new ALU();
      aLU0.ieee754("", 33);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ALU aLU0 = new ALU();
      aLU0.floatRepresentation("0", 0, 1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ALU aLU0 = new ALU();
      aLU0.floatRepresentation("-6", 0, ':');
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ALU aLU0 = new ALU();
      aLU0.normalize("");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ALU aLU0 = new ALU();
      aLU0.negation("");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ALU aLU0 = new ALU();
      aLU0.leftShift("", 0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ALU aLU0 = new ALU();
      aLU0.floatRepresentation("10", (-1), 0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ALU aLU0 = new ALU();
      String string0 = aLU0.integerSubtraction("I", "I", 1000);
      // Undeclared exception!
      aLU0.oneAdder(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ALU aLU0 = new ALU();
      // Undeclared exception!
      try { 
        aLU0.leftShift("", 1);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ALU aLU0 = new ALU();
      // Undeclared exception!
      aLU0.integerSubtraction("2", "2", 1112);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ALU aLU0 = new ALU();
      // Undeclared exception!
      try { 
        aLU0.integerRepresentation("", 0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ALU aLU0 = new ALU();
      // Undeclared exception!
      try { 
        aLU0.floatRepresentation("", 0, 0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ALU aLU0 = new ALU();
      // Undeclared exception!
      try { 
        aLU0.claAdder((String) null, "", '[');
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ALU aLU0 = new ALU();
      // Undeclared exception!
      aLU0.adder("1", "1", '@', 1112);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ALU aLU0 = new ALU();
      // Undeclared exception!
      try { 
        aLU0.adder("", (String) null, 'H', 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ALU aLU0 = new ALU();
      char char0 = aLU0.xorGate('G', 'G');
      assertEquals('0', char0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ALU aLU0 = new ALU();
      char char0 = aLU0.xorGate('o', 'z');
      assertEquals('1', char0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ALU aLU0 = new ALU();
      char char0 = aLU0.andGate('t', 't');
      assertEquals('0', char0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ALU aLU0 = new ALU();
      char char0 = aLU0.andGate('1', '1');
      assertEquals('1', char0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ALU aLU0 = new ALU();
      String string0 = aLU0.claAdder("tioe", "tioe", 'N');
      assertEquals("00001", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ALU aLU0 = new ALU();
      // Undeclared exception!
      try { 
        aLU0.claAdder("", "", '~');
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ALU aLU0 = new ALU();
      String string0 = aLU0.adder("0", "I", '>', 5);
      assertEquals("000001", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ALU aLU0 = new ALU();
      String string0 = aLU0.adder("6", "1", ':', 9);
      assertEquals("0111111111", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ALU aLU0 = new ALU();
      String string0 = aLU0.oneAdder("0");
      assertEquals("01", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ALU aLU0 = new ALU();
      String string0 = aLU0.negation("0");
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ALU aLU0 = new ALU();
      String string0 = aLU0.negation("8");
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ALU aLU0 = new ALU();
      String string0 = aLU0.integerRepresentation("0", 1);
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ALU aLU0 = new ALU();
      String string0 = aLU0.integerRepresentation("1", 0);
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ALU aLU0 = new ALU();
      String string0 = aLU0.integerRepresentation("0", 0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ALU aLU0 = new ALU();
      String string0 = aLU0.fullAdder('#', '#', '#');
      assertEquals("01", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ALU aLU0 = new ALU();
      int int0 = aLU0.normalize("3");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ALU aLU0 = new ALU();
      int int0 = aLU0.normalize("0");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ALU aLU0 = new ALU();
      String string0 = aLU0.floatTrueValue("00000000000000000000", 5, 0);
      assertEquals("0.0", string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ALU aLU0 = new ALU();
      String string0 = aLU0.oneAdder("");
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ALU aLU0 = new ALU();
      String string0 = aLU0.leftShift("I", 1);
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ALU aLU0 = new ALU();
      String string0 = aLU0.floatTrueValue("1111111111111111111111111111111110000000000000000", 33, 0);
      assertEquals("-1.0", string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ALU aLU0 = new ALU();
      String string0 = aLU0.floatTrueValue("u|2Zmw@u-G@q", 4, 2);
      assertEquals("36.5", string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ALU aLU0 = new ALU();
      String string0 = aLU0.floatTrueValue("11", 0, 0);
      assertEquals("NaN", string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ALU aLU0 = new ALU();
      String string0 = aLU0.ieee754("", 0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ALU aLU0 = new ALU();
      String string0 = aLU0.floatRepresentation("0", 1, 0);
      assertEquals("00", string0);
  }
  
  @Test
  public void testa1(){
	  ALU alu = new ALU();
	  String string0 = alu.ieee754("100",32);
	  assertEquals("010000101100100",string0);
  }
  
  @Test
  public void testa2(){
	  ALU alu = new ALU();
	  String string0 = alu.ieee754("100",64);
	  assertEquals("010000000101100100",string0);
  }
  
  @Test
  public void testa3(){
	  ALU alu = new ALU();
	  String string0 = alu.floatRepresentation("1.2", 4, 4);
	  assertEquals("001110011",string0);
  }
  
  @Test
  public void testa4(){
	  ALU alu = new ALU();
	  String string0 = alu.floatRepresentation("12.24", 10, 10);
	  assertEquals("010000000101000011110",string0);
  }
  
  @Test
  public void testa5(){
	  ALU alu = new ALU();
	  String string0 = alu.floatRepresentation("1.01", 4, 4);
	  assertEquals("001110000",string0);
  }
  
  @Test
  public void testa6(){
	  ALU alu = new ALU();
	  String string0 = alu.integerRepresentation("0", 4);
	  assertEquals("0000",string0);
  }
  
  @Test
  public void testa7(){
	  ALU alu = new ALU();
	  String string0 = alu.integerRepresentation("100", 4);
	  assertEquals("1100100",string0);
  }
  
  @Test
  public void testa8(){
	  ALU alu = new ALU();
	  String string0 = alu.integerRepresentation("2", 4);
	  assertEquals("0010",string0);
  }
  
  @Test
  public void testa9(){
	  ALU alu = new ALU();
	  String string0 = alu.integerRepresentation("100", 10);
	  assertEquals("0001100100",string0);
  }
  
  @Test
  public void testa10(){
	  ALU alu  = new ALU();
	  String string0 = alu.integerRepresentation("-100",10);
	  assertEquals("1110011100",string0);
  }
  
  @Test
  public void testa11(){
	  ALU alu  = new ALU();
	  String string0 = alu.integerRepresentation("-100",4);
	  assertEquals("0011100",string0);
  }
  @Test
  public void testa12(){
	  ALU alu  = new ALU();
	  String string0 = alu.floatRepresentation("0.235", 4, 6);
	  assertEquals("00100111000",string0);
  }
  
  @Test
  public void testa13(){
	  ALU alu = new ALU();
	  String string0 = alu.floatRepresentation("0.675", 0, 6);
	  assertEquals("0101011001",string0);
  }
  
  @Test 
  public void testa14(){
	  ALU alu = new ALU();
	  String string0 = alu.floatRepresentation("0.675", 0, 2);
	  assertEquals("010101",string0);
  }
  
  @Test 
  public void testa15(){
	  ALU alu = new ALU();
	  String string0 = alu.floatRepresentation("0.675", 0, 1);
	  assertEquals("01010",string0);
  }
  
  @Test
  public void testa16(){
	  ALU alu = new ALU();
	  String string0 = alu.floatRepresentation("0.75", 0, 10);
	  assertEquals("01100000000000",string0);
  }
  
  @Test
  public void testa17(){
	  ALU alu = new ALU();
	  String string0 = alu.floatRepresentation("2147483647", 10, 10);
	  assertEquals("010000111011111111111",string0);
  }
  
  @Test
  public void testa18(){
	  ALU alu = new ALU();
	  String string0 = alu.floatRepresentation("-2147483647", 10, 10);
	  assertEquals(string0,"110000111011111111111");
  }
  
  @Test
  public void testa19(){
	  ALU alu = new ALU();
	  String string0 = alu.floatTrueValue("011110000", 4,4);
	  assertEquals("+Inf",string0);
  }
  
  @Test
  public void testa20(){
	  ALU alu = new ALU();
	  String string0 = alu.floatTrueValue("111110000", 4,4);
	  assertEquals("-Inf",string0);
  }
  
  @Test
  public void test21(){
	  ALU alu = new ALU();
	  String string0 = alu.floatTrueValue("11111111", 4,4);
	  assertEquals("NaN",string0);
  }
  
  @Test
  public void test22(){
	  ALU alu = new ALU();
	  String string0 = alu.floatTrueValue("000000000",4,4);
	  assertEquals("0",string0);
  }
  
  @Test
  public void testa23(){
	 ALU alu = new ALU();
	 String string0 = alu.floatTrueValue("011010000", 4,4);
	 assertEquals("64.0",string0);
  }
  
  @Test
  public void testa24(){
	  ALU alu = new ALU();
	  String string0 = alu.floatTrueValue("011010101", 4,4);
	  assertEquals("84.0",string0);
  }
  
  @Test
  public void testa25(){
	  ALU alu = new ALU();
	  String string0 = alu.floatTrueValue("111010101", 4,4);
	  assertEquals("-84.0",string0);
  }
  
  @Test
  public void testa26(){
	  ALU alu = new ALU();
	  String string0 = alu.floatTrueValue("1111010101", 4,4);
	  assertEquals("-212.0",string0);
  }
  
  @Test
  public void testa27(){
	  ALU alu = new ALU();
	  String string0 = alu.floatTrueValue("111101", 4,4);
	  assertEquals("-192.0",string0);
  }
  
  @Test
  public void testa29(){
	  ALU alu = new ALU();
	  String string0 = alu.floatTrueValue("111101", 2,2);
	  assertEquals("NaN",string0);
  }
  
  @Test
  public void testa30(){
	  ALU alu = new ALU();
	  String string0 = alu.floatTrueValue("111101", 4,2);
	  assertEquals("-192.0",string0);
  }
  
  @Test
  public void testab30(){
	  ALU alu = new ALU();
	  String string0 = alu.floatRepresentation("0", -1,4);
	  assertEquals("0000",string0);
  }
  
  @Test
  public void testabc30(){
	  ALU alu = new ALU();
	  String string0 = alu.floatRepresentation("0", 4,-1);
	  assertEquals("0000",string0);
  }
  
  @Test(timeout = 4000)
  public void ccc31(){
	  ALU alu = new ALU();
	  String string0 = alu.integerTrueValue("0");
	  assertEquals("0",string0);
  }
  
  @Test(timeout = 4000)
  public void cccc31(){
	  ALU alu = new ALU();
	  String string0 = alu.integerRepresentation("-10",4);
	  assertEquals("0110",string0);
  }
  
  @Test(timeout = 4000)
  public void ccccd31(){
	  ALU alu = new ALU();
	  String string0 = alu.integerRepresentation("1",4);
	  assertEquals("0001",string0);
  }
  
  @Test(timeout = 4000)
  public void ccccdd31(){
	  ALU alu = new ALU();
	  String string0 = alu.integerRepresentation("-1",4);
	  assertEquals("1111",string0);
  }
}
