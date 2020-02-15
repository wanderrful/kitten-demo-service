package com.example.restTest.controller

import com.example.restTest.model.Kitten
import com.example.restTest.service.KittenService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = "/kitten")
class KittenController {

    @Autowired
    KittenService kittenService

    @GetMapping("")
    def getKittens() {
        kittenService.getAllKittens()
    }

    @GetMapping("/id/{id}")
    def getKittenById(@PathVariable id) {
        kittenService.getKittenById(id)
    }

    @GetMapping("/name/{name}")
    def getKittenByName(@PathVariable name) {
        kittenService.getKittenByName(name)
    }

    @PostMapping("")
    def addKitten(@RequestBody Kitten kitten) {
        kittenService.addKitten(kitten)
    }

    @PatchMapping("")
    def updateKitten(@RequestBody Kitten kitten) {
        kittenService.updateKitten(kitten)
    }

    @DeleteMapping("/id/{id}")
    def removeKittenById(@PathVariable String id) {
        kittenService.removeKittenById(id)
    }

}
