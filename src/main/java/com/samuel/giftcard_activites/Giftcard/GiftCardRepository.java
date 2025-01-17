package com.samuel.giftcard_activites.Giftcard;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GiftCardRepository extends JpaRepository <GiftCard, Integer> {

}
