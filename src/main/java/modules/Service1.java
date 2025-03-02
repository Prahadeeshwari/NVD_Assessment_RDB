package modules;

import java.io.IOException;
import java.util.List;

public interface Service1 {

	public String createData(Dto1 dto1);

	public Dto1 getData(Long id) throws IOException;

	public String updateData(Long id, Dto1 dto1);

	public String deleteData(Long id);

	public List<Entity1> page1(String name, int id);


}
