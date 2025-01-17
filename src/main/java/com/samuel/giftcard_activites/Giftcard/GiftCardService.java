package com.samuel.giftcard_activites.Giftcard;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GiftCardService {

    private final GiftCardRepository giftCardRepo; //Inyeccion de dependencias

    public void createGiftCard(GiftCard giftCard){
        giftCardRepo.save(giftCard);
    }

    public GiftCard findGiftCardById(Integer id){
        return giftCardRepo.findById(id).orElse(null);
    }

    public void deleteGiftCardById(Integer id){
        if (!giftCardRepo.existsById(id)) {
            throw new IllegalArgumentException("GiftCard with ID " + id + " does not exists");
        }
        giftCardRepo.deleteById(id);
    }

    public List<GiftCard> getAllGiftCards(){
        return giftCardRepo.findAll();
    }

}
