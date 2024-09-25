package br.com.testchain.model.web;

import br.com.testchain.model.dto.FundDTO;
import br.com.testchain.model.dto.OwnerDTO;
import br.com.testchain.model.dto.TransferDTO;
import br.com.testchain.model.dto.WalletDTO;
import br.com.testchain.service.TestChainService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@AllArgsConstructor
@RequestMapping("/v1/testchain")
public class TestChainRestService {

   private final TestChainService service;

    @PostMapping("/wallet")
    public WalletDTO generateWallet( @RequestBody OwnerDTO owner) {
        return service.generateWallet(owner.getOwner());
    }

    @GetMapping("/wallet/{owner}")
    public WalletDTO getWalletByOwner( @PathVariable String owner) {
        return service.getWalletByOwner(owner);
    }

    @GetMapping("/wallet/balance/{owner}")
    public Float getWalletBalanceByOwner( @PathVariable String owner) {
        return service.getWalletBalanceByOwner(owner);
    }

    @PostMapping("/transfer")
    public String Transfer(@RequestBody TransferDTO transfer) {
        return service.transfer(transfer).getTransactionId();
    }

    @PostMapping("/fund")
    public String addFunds(@RequestBody FundDTO fund) {
        return service.addFunds(fund).getTransactionId();
    }

}
