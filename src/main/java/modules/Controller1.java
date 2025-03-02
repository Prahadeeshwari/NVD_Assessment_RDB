package modules;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@Data
@CrossOrigin(allowedHeaders = "*")
@Slf4j
public class Controller1 {
	
	@Autowired
	private Service1 service1;
	
	@PostMapping("/create")
	public String createData(@RequestBody Dto1 dto1) {
		log.warn("warning");
		return service1.createData(dto1);
	}	
	

	@PutMapping("/update/{id}")
	public String updateData(@PathVariable Long id, @RequestBody Dto1 dto1) {
		return service1.updateData(id, dto1);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteData(@PathVariable Long id) {
		return service1.deleteData(id);
	}
	
	@GetMapping("/page/{name}")
	public List<Entity1> page1(@RequestParam String score,int id){
		return service1.page1(score,id);
	}
	@GetMapping("get/{id}")
	public Dto1 getData(@PathVariable Long id) throws IOException{
		return service1.getData(id);
	}
	
}
