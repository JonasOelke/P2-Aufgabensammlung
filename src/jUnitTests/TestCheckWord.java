
package jUnitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

class TestCheckWord {
	
	@Test
	void testCheckWord() {
		DataCheck dataCheck = new DataCheck();
		
		Boolean expected = true;
		String[] trueExpected = {
				"Sonne", "sonnig", "saß", "sitzen", "singen", "singen", "sammeln", "suchen", "sagen", "Sage"
		};
		
		String[] falseExpected = {
				"aus", "reißen", "Bpliss", "Spross", "huhu", "hu hu", "singe2", "sing2e"
		};
		
		for (int i = 0; i < trueExpected.length; i++) {
			System.out.println(trueExpected[i] + ": " + dataCheck.checkWord_ex1(trueExpected[i]));
			assertEquals(true, dataCheck.checkWord_ex1(trueExpected[i]));
		}
		
		for (int i = 0; i < falseExpected.length; i++) {
			System.out.println(falseExpected[i] + ": " + dataCheck.checkWord_ex1(falseExpected[i]));
			assertEquals(false, dataCheck.checkWord_ex1(falseExpected[i]));
		}
		
	}
	
	@Test
	void testCheckWord2() {
		DataCheck dataCheck = new DataCheck();
		
		String[] trueExpected = {
				"Martin Max Mustermann", "Mira van Hagen", "Torsten de Larrin", "Sina Schmidt", "marvin"
		};
		
		String[] falseExpected = {
				"St4phi", "Jan-Mirko", "Dennis  Carsten Klein", "Richard_Klein", "Richard.Klein", "Digga!"
		};
		
		for (int i = 0; i < trueExpected.length; i++) {
			assertEquals(true, dataCheck.checkWord_ex2(trueExpected[i]));
		}
		
		for (int i = 0; i < falseExpected.length; i++) {
			assertEquals(false, dataCheck.checkWord_ex2(falseExpected[i]));
		}
			}

	@Test
	void testCheckWord3() {
		DataCheck dataCheck = new DataCheck();
		
		String[] trueExpected = {
				"Abendessen", "Affen", "decken", "baden", "Chaoten", "Chancen", "denken", "dichten"
		};
		
		String[] falseExpected = {
				"barfuß gehen", "Biene", "Bruder", "Abend", "Rachen", "rufen"
		};
		
		for (int i = 0; i < trueExpected.length; i++) {
			System.out.println(trueExpected[i] + ": " + dataCheck.checkWord_ex3(trueExpected[i]));
			assertEquals(true, dataCheck.checkWord_ex2(trueExpected[i]));
		}
		
		for (int i = 0; i < falseExpected.length; i++) {
			System.out.println(falseExpected[i] + ": " + dataCheck.checkWord_ex3(falseExpected[i]));
			assertEquals(false, dataCheck.checkWord_ex3(falseExpected[i]));
		}
		
	}
}
