package com.example.fidelizr.controller;

import com.example.fidelizr.model.User;
import com.example.fidelizr.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Plant", description = "the Plant Api")
@RestController
@RequestMapping("/users")
public class UserController {

        @Autowired
        UserService userService;

        @Operation(summary = "Listar plantas por usuario",
                description = "Servicio para listar las plantas por usuario")
        @ApiResponses(value = { @ApiResponse(responseCode = "201", description = "Plantas listadas correctamente"),
                @ApiResponse(responseCode = "400", description = "Solicitud inválida"),
                @ApiResponse(responseCode = "500", description = "Error en el servidor") })
        @GetMapping(value = "/oli", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
                produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
        public ResponseEntity<User> createUser() {
            return ResponseEntity.ok(userService.getUser());
        }
}
