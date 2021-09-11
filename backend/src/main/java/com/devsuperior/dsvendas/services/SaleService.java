package com.devsuperior.dsvendas.services;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.repositories.SaleRepository;
import com.devsuperior.dsvendas.repositories.SellerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
public class SaleService {

    private final SaleRepository saleRepository;

    private final SellerRepository sellerRepository;

    @Transactional(readOnly = true) //para não ter lock de escrita
    public Page<SaleDTO> findAll(Pageable pageable){
        sellerRepository.findAll();//irá carregar em cache os vendedores
        return saleRepository.findAll(pageable).map(SaleDTO::new);
    }
}
