package com.cameski.service;

import com.cameski.dto.MobileStockRequestDto;
import com.cameski.dto.MobileStockResponseDto;
import com.cameski.enties.MobileStock;
import com.cameski.mappers.MobileStockMapper;
import com.cameski.repositories.MobileStockRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
@Slf4j
public class MobileStockServiceImpl implements MobileStockService {
    private MobileStockRepository mobileStockRepository;
    private MobileStockMapper mapper;
    @Override
    public MobileStockResponseDto save(MobileStockRequestDto mobileStockRequestDto) {
        MobileStock mobileStock = mapper.fromMobilestockRequestDto(mobileStockRequestDto) ;
        Optional <MobileStock> stock = Optional.ofNullable(mobileStockRepository.mobileStockMag(mobileStock.getId_magasin()));
        if(stock.isPresent()){
            MobileStock mobileStock1 = stock.get();
            if(mobileStock1.getId_article().equals(mobileStock.getId_article())){
                mobileStock1.setQte(mobileStock1.getQte()+ mobileStock.getQte());
            }
        }else{
            MobileStock saveMobile = mobileStockRepository.save(mobileStock);
            MobileStockResponseDto responseDto = mapper.fromMobileStock(saveMobile);
            return responseDto;
        }

        return  null;
    }
}
