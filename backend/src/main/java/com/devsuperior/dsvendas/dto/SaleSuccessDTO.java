package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Seller;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SaleSuccessDTO implements Serializable {

    private String sellerName;
    private Long deals;
    private Long visited;

    private  SellerDTO seller;

    public SaleSuccessDTO(Seller seller, Long visited, Long deals){
        sellerName = seller.getName();
        this.visited = visited;
        this.deals = deals;

    }
}
