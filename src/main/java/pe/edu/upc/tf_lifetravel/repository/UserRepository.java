package pe.edu.upc.tf_lifetravel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.tf_lifetravel.entities.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findByEmail(String email);
}
