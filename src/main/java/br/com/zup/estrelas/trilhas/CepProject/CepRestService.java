package br.com.zup.estrelas.trilhas.CepProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ws/03964000/")
public class CepRestService {

    @Autowired
    private final CepService cepService;

    public CepRestService(CepService cepService) {
        this.cepService = cepService;
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/{cep}", method = RequestMethod.GET)
    public Cep getCep(@PathVariable String cep) {
        return cepService.getCep(cep);
    }


}
