package br.com.testchain.service;

import br.com.testchain.model.Wallet;
import br.com.testchain.util.StringUtil;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TestChainService {

    public String generateWallet() {
        return StringUtil.getStringFromKey(new Wallet().getPublicKey());
    }
}
