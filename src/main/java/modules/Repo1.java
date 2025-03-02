package modules;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo1 extends JpaRepository<Entity1, Long>{

	List<Entity1> findByScoreStartingWith(String score);

}
