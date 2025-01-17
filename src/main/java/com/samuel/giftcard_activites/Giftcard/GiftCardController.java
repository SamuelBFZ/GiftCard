package com.samuel.giftcard_activites.Giftcard;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/giftcards")
@RequiredArgsConstructor
public class GiftCardController {

    private final GiftCardService giftCardService;

    @PostMapping
    public void createGiftCard(@RequestBody GiftCard giftCard) {
        giftCardService.createGiftCard(giftCard);
    }

    @GetMapping
    public List<GiftCard> getAllGiftCards() {
        return giftCardService.getAllGiftCards();
    }
    
    @DeleteMapping("/{id}")
    public void deleteGiftCard(@PathVariable Integer id){
        giftCardService.deleteGiftCardById(id);
    } 
    

}
