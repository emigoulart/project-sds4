package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Sale;
import com.devsuperior.dsvendas.entities.Seller;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SaleSumDTO implements Serializable {

    private Double sum;
    private String sellerName;

    private  SellerDTO seller;

    public SaleSumDTO(Seller seller, Double sum){
        this.sum = sum;
        sellerName = seller.getName();

    }
}
