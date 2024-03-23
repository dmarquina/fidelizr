package com.example.fidelizr.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.fidelizr.dto.request.SaleRequest;

@Tag(name = "Plan2t", description = "the Plant Api")
@RestController
@RequestMapping("/sales")
public class SaleController {

        @Operation(summary = "Crear venta",
                description = "Servicio para crear venta")
        @ApiResponses(value = { @ApiResponse(responseCode = "201", description = "Venta creada correctamente"),
                @ApiResponse(responseCode = "400", description = "Solicitud inválida"),
                @ApiResponse(responseCode = "500", description = "Error en el servidor") })
        @PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
                produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
        public ResponseEntity<String> createUser(@RequestBody SaleRequest saleRequest) {
            return ResponseEntity.ok("");
        }
}
