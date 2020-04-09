package hellojpa;

import javax.persistence.Entity;
import javax.persistence.Id;

//entity를 넣어야 jpa를 사용하는애구나 알 수 있음. javax persistence
@Entity
public class MEMBER {

    //PK 라는것을 알려줘야함
    @Id
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
