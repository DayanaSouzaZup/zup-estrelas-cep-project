package br.com.zup.estrelas.trilhas.CepProject;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "cepService", url = "https://viacep.com.br")
public interface CepService {

    @RequestMapping("/ws/03964000/{cep}")
    Cep getCep(@PathVariable("cep") String cep);

}
