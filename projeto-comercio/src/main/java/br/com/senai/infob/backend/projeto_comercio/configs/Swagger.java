package br.com.senai.infob.backend.projeto_comercio.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
  info = @Info(
    title = "Projeto Comércio",
    version = "1.0",
    description = "API para o sistema Projeto Comércio"
  )
)
public class Swagger {

}