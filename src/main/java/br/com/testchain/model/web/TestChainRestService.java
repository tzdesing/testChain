package br.com.testchain.model.web;


import br.com.testchain.model.Wallet;
import br.com.testchain.service.TestChainService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.KeyPair;

@RestController
@AllArgsConstructor
@RequestMapping("/v1/testchain")
public class TestChainRestService {

   private final TestChainService service;

    @GetMapping
    public String getByIdPool() {
        return service.generateWallet();//wallet.generateKeyPair();
    }



}
