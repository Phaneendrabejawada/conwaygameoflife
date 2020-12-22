import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

class TestJunitNextGeneration {

	@Test
	public void Next() {
		int i[][]= {{1,2}};
		Board b = new Board(3,i);
		CurrentGeneration curr = new CurrentGeneration(b);
		NextGeneration n = new NextGeneration(curr);
		System.out,println("----TEST ONE EXECUTED----");
		Assertions.assertEquals("...\n...\n...",n.generate().toString());
	}

}
