package br.com.testchain.service;

import br.com.testchain.model.TestChain;
import br.com.testchain.model.Transaction;
import br.com.testchain.model.Wallet;
import br.com.testchain.model.dto.FundDTO;
import br.com.testchain.model.dto.TransferDTO;
import br.com.testchain.model.dto.WalletDTO;
import br.com.testchain.util.StringUtil;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TestChainService {

    public WalletDTO generateWallet(String owner) {
        Wallet wallet = new Wallet(owner);

        WalletDTO response = new WalletDTO();
        response.setOwner(wallet.getOwner());
        response.setPublicKey(StringUtil.getStringFromKey(wallet.getPublicKey()));
        response.setPrivateKey(StringUtil.getStringFromKey(wallet.getPrivateKey()));
        return response;
    }

    public WalletDTO getWalletByOwner (String owner) {
        Wallet wallet = TestChain.wallets.get(owner);
        WalletDTO response = new WalletDTO();
        response.setOwner(wallet.getOwner());
        response.setPublicKey(StringUtil.getStringFromKey(wallet.getPublicKey()));
        response.setPrivateKey(StringUtil.getStringFromKey(wallet.getPrivateKey()));
        return response;
    }


    public Float getWalletBalanceByOwner (String owner) {
        Wallet wallet = TestChain.wallets.get(owner);
        return wallet.getBalance();
    }

    public Transaction transfer(TransferDTO transfer) {
        Wallet wallet = TestChain.wallets.get(transfer.getOwner());
        Wallet walletRecipient = TestChain.wallets.get(transfer.getRecipient());
        return wallet.transfer(walletRecipient.getPublicKey(), transfer.getAmount());
    }

    public Transaction addFunds(FundDTO fund) {
        Wallet wallet = TestChain.wallets.get("admin");
        Wallet walletRecipient = TestChain.wallets.get(fund.getRecipient());
        return wallet.transfer(walletRecipient.getPublicKey(), fund.getAmount());
    }
}
