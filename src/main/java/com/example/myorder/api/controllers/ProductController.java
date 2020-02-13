package com.example.myorder.api.controllers;

import com.example.myorder.api.RestPath;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestPath.BASE_PATH + "/product")
public class ProductController {
    

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    @ApiResponses({
            @ApiResponse(code = 201, message = "Produto criado!", response = ProductResponseDto.class)
    })
    public ProductResponseDto create() {
        return null; //TODO chamar productService
    }


}
