package com.example.fidelizr.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.fidelizr.dto.request.SaleRequest;

@Api(tags = "Sales")
@RestController
@RequestMapping("/sales")
public class SaleController {

        @ApiOperation(value = "Crear venta",
                notes = "Servicio para crear venta")
        @ApiResponses(value = { @ApiResponse(code = 201, message = "Venta creada correctamente"),
                @ApiResponse(code = 400, message = "Solicitud inválida"),
                @ApiResponse(code = 500, message = "Error en el servidor") })
        @PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
                produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
        public ResponseEntity<String> createUser(@RequestBody SaleRequest saleRequest) {
            return ResponseEntity.ok("");
        }
}
