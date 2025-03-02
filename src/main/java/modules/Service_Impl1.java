package modules;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Service
@Data
@Slf4j
public class Service_Impl1 implements Service1 {

    @Autowired
    private Repo1 repo1;


    @Override
    public String createData(Dto1 dto1) {
        Entity1 entity = new Entity1();
        entity.setYear(dto1.getYear());
        entity.setScore(dto1.getScore());
        
        log.info("hello");
        repo1.save(entity);

        return "Saved Successfully and Weather Data Fetched!";
    }


    @Override
    public String updateData(Long id, Dto1 dto1) {
        Optional<Entity1> entityOptional = repo1.findById(id);
        if (entityOptional.isPresent()) {
            Entity1 entity = entityOptional.get();
            entity.setScore(dto1.getScore());
            entity.setYear(dto1.getYear());
            repo1.save(entity);
            return "Updated Successfully!";
        }
        return "User not found!";
    }

    @Override
    public String deleteData(Long id) {
        if (repo1.existsById(id)) {
            repo1.deleteById(id);
            return "Deleted Successfully!";
        }
        return "User not found!";
    }

	@Override
	public Dto1 getData(Long id) throws IOException {
		Optional<Entity1> e1=repo1.findById(id);
		if(e1.isPresent()) {
			Entity1 e=e1.get();
			Dto1 d=new Dto1();
			d.setScore(e.getScore());
			return d;
		}
		else {
			throw new IOException("not found");
		}
	}

	@Override
	public List<Entity1> page1(String score,int no) {
		List<Entity1> s=repo1.findByScoreStartingWith(score);
		return s;
	}

}
