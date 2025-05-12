package br.com.henrymori.desafio_todolist;

import java.util.ArrayList;
import java.util.List;

import br.com.henrymori.desafio_todolist.entity.Todo;

public class TestConstants {
    public static final List<Todo> TODOS = new ArrayList<>() {
        {
            add(new Todo(9995L, "@henrymcruz", "Curtir", false, 1));
            add(new Todo(9996L, "@henrymcruz", "Comentar", false, 1));
            add(new Todo(9997L, "@henrymcruz", "Compartilhar", false, 1));
            add(new Todo(9998L, "@henrymcruz", "Se Inscrever", false, 1));
            add(new Todo(9999L, "@henrymcruz", "Ativar as Notificações", false, 1));
        }
    };

    public static final Todo TODO = TODOS.get(0);
}