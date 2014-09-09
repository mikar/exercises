package string1;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class String1Test {

	@Test
	public void testStringTimes() {
		assertThat(String1.helloName("Bob"), is("Hello Bob"));
		assertThat(String1.helloName("Alice"), is("Hello Alice"));
		assertThat(String1.helloName("X"), is("Hello X"));
	}

	@Test
	public void testMakeAbba() {
		assertThat(String1.makeAbba("Hi", "Bye"), is("HiByeByeHi"));
		assertThat(String1.makeAbba("Yo", "Alice"), is("YoAliceAliceYo"));
		assertThat(String1.makeAbba("What", "Up"), is("WhatUpUpWhat"));
	}

	@Test
	public void testMakeTags() {
		assertThat(String1.makeTags("i", "Yay"), is("<i>Yay</i>"));
		assertThat(String1.makeTags("i", "Hello"), is("<i>Hello</i>"));
		assertThat(String1.makeTags("cite", "Yay"), is("<cite>Yay</cite>"));
	}

	@Test
	public void testMakeOutWord() {
		assertThat(String1.makeOutWord("<<>>", "Yay"), is("<<Yay>>"));
		assertThat(String1.makeOutWord("<<>>", "WooHoo"), is("<<WooHoo>>"));
		assertThat(String1.makeOutWord("[[]]", "word"), is("[[word]]"));
	}

	@Test
	public void testExtraEnd() {
		assertThat(String1.extraEnd("Hello"), is("lololo"));
		assertThat(String1.extraEnd("ab"), is("ababab"));
		assertThat(String1.extraEnd("Hi"), is("HiHiHi"));
	}

	@Test
	public void testFirstTwo() {
		assertThat(String1.firstTwo("Hello"), is("He"));
		assertThat(String1.firstTwo("abcdefg"), is("ab"));
		assertThat(String1.firstTwo("ab"), is("ab"));
	}

	@Test
	public void testFirstHalf() {
		assertThat(String1.firstHalf("WooHoo"), is("Woo"));
		assertThat(String1.firstHalf("HelloThere"), is("Hello"));
		assertThat(String1.firstHalf("abcdef"), is("abc"));
	}

	@Test
	public void testWithoutEnd() {
		assertThat(String1.withoutEnd("Hello"), is("ell"));
		assertThat(String1.withoutEnd("java"), is("av"));
		assertThat(String1.withoutEnd("coding"), is("odin"));
	}

	@Test
	public void testComboString() {
		assertThat(String1.comboString("Hello", "hi"), is("hiHellohi"));
		assertThat(String1.comboString("hi", "Hello"), is("hiHellohi"));
		assertThat(String1.comboString("aaa", "b"), is("baaab"));
	}

	@Test
	public void testNonStart() {
		assertThat(String1.nonStart("Hello", "There"), is("ellohere"));
		assertThat(String1.nonStart("java", "code"), is("avaode"));
		assertThat(String1.nonStart("shotl", "java"), is("hotlava"));
	}

	@Test
	public void testLeft2() {
		assertThat(String1.left2("Hello"), is("lloHe"));
		assertThat(String1.left2("java"), is("vaja"));
		assertThat(String1.left2("Hi"), is("Hi"));
	}

	@Test
	public void testRight2() {
		assertThat(String1.right2("Hello"), is("loHel"));
		assertThat(String1.right2("java"), is("vaja"));
		assertThat(String1.right2("Hi"), is("Hi"));
	}

	@Test
	public void testTheEnd() {
		assertThat(String1.theEnd("Hello", true), is("H"));
		assertThat(String1.theEnd("Hello", false), is("o"));
		assertThat(String1.theEnd("oh", true), is("o"));
	}

	@Test
	public void testWithouEnd() {
		assertThat(String1.withouEnd("Hello"), is("ell"));
		assertThat(String1.withouEnd("abc"), is("b"));
		assertThat(String1.withouEnd("ab"), is(""));
	}

	@Test
	public void testMiddleTwo() {
		assertThat(String1.middleTwo("string"), is("ri"));
		assertThat(String1.middleTwo("code"), is("od"));
		assertThat(String1.middleTwo("Practice"), is("ct"));
	}

	@Test
	public void testEndsLy() {
		assertThat(String1.endsLy("oddly"), is(true));
		assertThat(String1.endsLy("y"), is(false));
		assertThat(String1.endsLy("oddy"), is(false));
	}

	@Test
	public void testNTwice() {
		assertThat(String1.nTwice("Hello", 2), is("Helo"));
		assertThat(String1.nTwice("Chocolate", 3), is("Choate"));
		assertThat(String1.nTwice("Chocolate", 1), is("Ce"));
	}
	
	@Test
	public void testTwoChar() {
		assertThat(String1.twoChar("java", 0), is("ja"));
		assertThat(String1.twoChar("java", 2), is("va"));
		assertThat(String1.twoChar("java", 3), is("ja"));
	}
}