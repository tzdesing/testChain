package br.com.testchain.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import static lombok.AccessLevel.PRIVATE;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor(access = PRIVATE)
@EqualsAndHashCode
public class WalletDTO {
    private String publicKey;
    private String privateKey;
    private String owner;

}
