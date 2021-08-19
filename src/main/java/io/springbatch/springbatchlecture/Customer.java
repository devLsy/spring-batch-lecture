package io.springbatch.springbatchlecture;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {

	@Id
	@GeneratedValue
	private Long Id;
	private String firstname;
	private String lastname;
	private String birthdate;

	@OneToOne(mappedBy = "customer")
	private Address address;

}