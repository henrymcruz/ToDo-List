package br.com.henrymori.desafio_todolist;

import br.com.henrymori.desafio_todolist.entity.Todo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DesafioTodolistApplicationTests {

	@Test
	void testCreateTodoSuccess() {
		var todo = new Todo("todo 1", "desc todo 1", false, 1);
	}

	@Test
	void testeCreateTodoFailure(){

	}
}
