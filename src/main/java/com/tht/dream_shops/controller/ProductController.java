package com.tht.dream_shops.controller;

import com.tht.dream_shops.service.product.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("${api.prefix}/products")
public class ProductController {
    private final IProductService productService;

//    @GetMapping("/all")
////    public ResponseEntity<ApiResponse> getAllProducts() {
////
////    }

}
