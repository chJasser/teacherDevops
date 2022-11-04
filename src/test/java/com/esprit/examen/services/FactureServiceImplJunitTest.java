package com.esprit.examen.services;

import com.esprit.examen.entities.Facture;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class FactureServiceImplJunitTest {

    @Autowired
    IFactureService iFactureService;

//    Facture f = Facture.builder().

    @Order(0)
    @Test
    public void testAddFacture(){

    }

//    @Test
//    public void  testAssignOperateurToFacture(){
//
//    }
}

