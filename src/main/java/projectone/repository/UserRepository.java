package projectone.repository;


import org.springframework.data.repository.CrudRepository;
import projectone.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
