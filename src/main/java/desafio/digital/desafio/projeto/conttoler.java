package desafio.digital.desafio.projeto;

import entity.Person;
import  org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import  org.springframework.web.bind.annotation.RestController;


@RequestMapping
@RestController("*/api/v1/people")
public class conttoler {

    @GetMapping
    public String getBook(){
        Person person = new Person();
        person.getId();
        return "api teste";
    }
}
