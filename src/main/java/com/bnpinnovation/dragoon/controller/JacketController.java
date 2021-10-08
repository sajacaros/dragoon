package com.bnpinnovation.dragoon.controller;

import com.bnpinnovation.dragoon.dto.JacketDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class JacketController {

    @PostMapping(value = "/gas", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public void gas(@RequestBody JacketDto.GasDetails gasDetails) {
        log.info("gas : {}", gasDetails);
    }

    @PostMapping(value = "/sos", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public void sos(@RequestBody JacketDto.SOSDetails sosDetails) {
        log.info("sos : {}", sosDetails);
    }

    @PostMapping(value = "/rental", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public void rental(@RequestBody JacketDto.RentalDetails rentalDetails) {
        log.info("rental : {}", rentalDetails);
    }
}
