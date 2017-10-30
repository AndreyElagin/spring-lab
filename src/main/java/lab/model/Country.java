package lab.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "Country")
public class Country implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CODE_NAME")
    private String codeName;

    public Country() {
    }

    public Country(int id, String name, String codeName) {
        this.id = id;
        this.name = name;
        this.codeName = codeName;
    }

    public Country(String name, String codeName) {
        this.name = name;
        this.codeName = codeName;
    }

}
