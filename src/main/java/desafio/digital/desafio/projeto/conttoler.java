package desafio.digital.desafio.projeto;

import  org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import  org.springframework.web.bind.annotation.RestController;


@RequestMapping
@RestController("*/api/v1/people")
public class conttoler {

    @GetMapping
    public String getBook(){
        return "api teste";
    }
}
