package com.example.restTest.service

import com.example.restTest.delegate.KittenDelegate
import com.example.restTest.model.Kitten
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class KittenService {
    @Autowired
    KittenDelegate kittenDelegate

    def getAllKittens() {
        kittenDelegate.getAllKittens()
    }

    def getKittenById(String id) {
        kittenDelegate.getKittenById(id)
    }

    def getKittenByName(String name) {
        kittenDelegate.getKittenByName(name)
    }

    def addKitten(Kitten kitten) {
        kittenDelegate.addKitten(kitten)
    }

    def removeKittenById(String id) {
        kittenDelegate.removeKittenById(id)
    }

    def updateKitten(Kitten kitten) {
        kittenDelegate.updateKitten(kitten)
    }
}
