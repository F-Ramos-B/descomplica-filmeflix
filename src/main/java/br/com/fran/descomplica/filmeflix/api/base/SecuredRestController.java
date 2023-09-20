package br.com.fran.descomplica.filmeflix.api.base;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@SecurityRequirement(name = "bearerAuth")
interface SecuredRestController {

}
