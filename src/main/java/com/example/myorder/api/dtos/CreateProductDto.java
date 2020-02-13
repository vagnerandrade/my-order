package com.example.myorder.api.dtos;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CreateProductDto {
    @NotEmpty
    @ApiModelProperty(value = "${product.create.name}")
    private String name;

    @NotNull
    @Min(value = 1, message = "Valor minimo deve ser 1")
    @ApiModelProperty(value = "${product.create.value}")
    private Double value;

    @NotNull
    @ApiModelProperty(value = "${product.create.restaurantId}")
    private Integer restaurantId;
}
