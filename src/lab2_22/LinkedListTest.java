package lab2_22;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

class LinkedListTest {

	@Test
	void addFirstTest() {
		LinkedList<Integer> tester = new LinkedList<>();
		tester.addFirst(1);
		assertEquals(1, tester.getFirst());
	}

	@Test
	void getFirstTest() {
		LinkedList<Integer> tester = new LinkedList<>();
		tester.addFirst(1);
		assertEquals(1, tester.getFirst());
	}

	@Test
	void testGetLast() {
		LinkedList<String> L = new LinkedList<>();
		assertThrows(NoSuchElementException.class, () -> {
			L.getLast();
		}); // test 1

		L.addFirst("A");
		assertEquals("A", L.getLast()); // test 2
		L.addLast("B");
		assertTrue(L.getLast().equals("B")); // test 3
		L.removeLast();
		assertNotEquals("B", L.getLast()); // test 4
	}
}
