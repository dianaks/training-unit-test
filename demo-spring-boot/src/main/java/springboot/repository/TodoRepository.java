package springboot.repository;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import springboot.model.Todo;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by indra.e.prasetya on 1/18/2017.
 */
@Service
public class TodoRepository {

  private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(TodoRepository.class);
  private final List<Todo> todos = new ArrayList<Todo>();

  public boolean store(Todo todo) {
    LOG.debug("store..");
    todos.add(todo);
    return true;
  }

  public List<Todo> getAll() {
    LOG.debug("RepogetAll..");
    return new ArrayList<Todo>(todos);
  }
}
