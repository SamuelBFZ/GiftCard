package com.samuel.giftcard_activites.Giftcard;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;

import com.samuel.giftcard_activites.Activiy.Activity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class GiftCard {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String recipientName; //Nombre del receptor
    private String carrierName; //Nombre del emisor 
    @CreatedDate
    private LocalDateTime createdDate;

    @OneToMany(targetEntity = Activity.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Activity> activities;
}
