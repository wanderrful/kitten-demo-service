package com.example.restTest.delegate

import com.example.restTest.model.Kitten
import com.example.restTest.repository.KittenRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class KittenDelegate {

    @Autowired
    KittenRepository kittenRepository

    def getAllKittens() {
        kittenRepository.findAll()
    }

    def getKittenById(String id) {
        kittenRepository.findById(id)
    }

    def getKittenByName(String name) {
        kittenRepository.findByName(name)
    }

    def addKitten(Kitten kitten) {
        kittenRepository.insert(kitten)
    }

    def removeKittenById(String id) {
        kittenRepository.deleteById(id)
    }

    def updateKitten(Kitten kitten) throws Exception {
        Optional<Kitten> foundKitten = kittenRepository.findById(kitten.getId())
        foundKitten.ifPresentOrElse( { k ->
            return kittenRepository.save(kitten)
        }, { ->
            return "Error: ID not found"
        })
    }

}
