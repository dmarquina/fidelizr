package com.example.fidelizr.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "Users")
@RestController
@RequestMapping("/users")
public class UserController {

        @ApiOperation(value = "Listar plantas por usuario",
                notes = "Servicio para listar las plantas por usuario")
        @ApiResponses(value = { @ApiResponse(code = 201, message = "Plantas listadas correctamente"),
                @ApiResponse(code = 400, message = "Solicitud inválida"),
                @ApiResponse(code = 500, message = "Error en el servidor") })
        @GetMapping(value = "/{id}/plants", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
                produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
        public ResponseEntity<String> createUser() {
            return ResponseEntity.ok("");
        }
}
