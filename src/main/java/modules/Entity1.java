package modules;

import org.springframework.data.annotation.Transient;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "abc")
public class Entity1 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private long Id;
	
	@Column(name="YEAR")
	private String year;
	
	@Column(name = "SCORE")
	private String score;
	
	@Transient
	private String temp;

	public void setYear(String year2) {
	this.year=year2;	
	}

	
}

