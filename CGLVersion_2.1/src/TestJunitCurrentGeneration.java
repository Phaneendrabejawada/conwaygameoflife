import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

class TestJunitCurrentGeneration {

	@Test
	public void Current() {
		int c[][]= {{1,2}};
		Board b = new Board(3,c);
		CurrentGeneration curr = new CurrentGeneration(b);
		System.out.println("----TEST ONE EXECUTED----");
		Assertions.assertEquals("...\n..*\n...",curr.toString());
	}

}
