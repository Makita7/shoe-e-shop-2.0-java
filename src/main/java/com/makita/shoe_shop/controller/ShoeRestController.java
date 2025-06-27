package com.makita.shoe_shop.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shoes")
@CrossOrigin(origins = "http://localhost:9090")
@RequiredArgsConstructor
public class ShoeRestController {
}
