/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.25).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.HTTPProblem;
import io.swagger.model.InlineResponse200;
import io.swagger.model.Notificacion;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-18T16:15:28.764Z[GMT]")
@Validated
public interface NotificacionApi {

    @Operation(summary = "Obtiene todas las notificaciones de un cliente.", description = "", security = {
        @SecurityRequirement(name = "userToken")    }, tags={ "🔴 Notificacion" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Array de notificaciones con su estado correspondiente.", content = @Content(schema = @Schema(implementation = InlineResponse200.class))),
        
        @ApiResponse(responseCode = "401", description = "`UNAUTHORIZED`: no se ha encontrado la autenticación necesaria", content = @Content(schema = @Schema(implementation = HTTPProblem.class))),
        
        @ApiResponse(responseCode = "403", description = "`FORBIDDEN`: el servidor entiende la petición pero no la autoriza", content = @Content(schema = @Schema(implementation = HTTPProblem.class))),
        
        @ApiResponse(responseCode = "404", description = "`NOT FOUND`: recurso no disponible", content = @Content(schema = @Schema(implementation = HTTPProblem.class))) })
    @RequestMapping(value = "/notificacion",
        produces = { "application/json", "application/problem+json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse200> s4NotificacionArrayGet();


    @Operation(summary = "Proporciona la lista de los métodos HTTP soportados.", description = "Devuelve una cabecera `Allow` con la lista de métodos HTTP soportados (separados por comas).", tags={ "🔴 Notificacion" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "cabecera `Allow` &lt;El cuerpo de la respuesta está vacío&gt;") })
    @RequestMapping(value = "/notificacion",
        method = RequestMethod.OPTIONS)
    ResponseEntity<Void> s4NotificacionArrayOptions();


    @Operation(summary = "Elimina una notificación identificada por su ID.", description = "Elimina la notificacion identificada por `notificacionId`.", security = {
        @SecurityRequirement(name = "subsystemToken")    }, tags={ "🔴 Notificacion" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Notificación eliminada &lt;Cuerpo de la respuesta vacío&gt;"),
        
        @ApiResponse(responseCode = "401", description = "`UNAUTHORIZED`: no se ha encontrado la autenticación necesaria", content = @Content(schema = @Schema(implementation = HTTPProblem.class))),
        
        @ApiResponse(responseCode = "404", description = "`NOT FOUND`: recurso no disponible", content = @Content(schema = @Schema(implementation = HTTPProblem.class))) })
    @RequestMapping(value = "/notificacion/{notificacionId}",
        produces = { "application/problem+json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> s4NotificacionDelete(@Pattern(regexp="^\\d+$") @Parameter(in = ParameterIn.PATH, description = "ID de una notificación", required=true, schema=@Schema()) @PathVariable("notificacionId") Integer notificacionId);


    @Operation(summary = "Recupera una notificacion específica identificada por su ID.", description = "Devuelve la notificación identificada por `notificacionId`.", security = {
        @SecurityRequirement(name = "userToken")    }, tags={ "🔴 Notificacion" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Notificacion recuperada", content = @Content(schema = @Schema(implementation = Notificacion.class))),
        
        @ApiResponse(responseCode = "401", description = "`UNAUTHORIZED`: no se ha encontrado la autenticación necesaria", content = @Content(schema = @Schema(implementation = HTTPProblem.class))),
        
        @ApiResponse(responseCode = "403", description = "`FORBIDDEN`: el servidor entiende la petición pero no la autoriza", content = @Content(schema = @Schema(implementation = HTTPProblem.class))),
        
        @ApiResponse(responseCode = "404", description = "`NOT FOUND`: recurso no disponible", content = @Content(schema = @Schema(implementation = HTTPProblem.class))) })
    @RequestMapping(value = "/notificacion/{notificacionId}",
        produces = { "application/json", "application/problem+json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Notificacion> s4NotificacionGet(@Pattern(regexp="^\\d+$") @Parameter(in = ParameterIn.PATH, description = "ID de una notificación", required=true, schema=@Schema()) @PathVariable("notificacionId") Integer notificacionId);


    @Operation(summary = "Proporciona la lista de los métodos HTTP soportados.", description = "Devuelve una cabecera `Allow` con la lista de métodos HTTP soportados (separados por comas).", tags={ "🔴 Notificacion" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "cabecera `Allow` &lt;El cuerpo de la respuesta está vacío&gt;") })
    @RequestMapping(value = "/notificacion/{notificacionId}",
        method = RequestMethod.OPTIONS)
    ResponseEntity<Void> s4NotificacionOptions(@Pattern(regexp="^\\d+$") @Parameter(in = ParameterIn.PATH, description = "ID de una notificación", required=true, schema=@Schema()) @PathVariable("notificacionId") Integer notificacionId);


    @Operation(summary = "Crea una nueva notificacion.", description = "Genera una nueva notificacion para un cliente y trabajo concretos, autorizada previamente por otro subsistema.", security = {
        @SecurityRequirement(name = "subsystemToken")    }, tags={ "🔴 Notificacion" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "notificacion creada", content = @Content(schema = @Schema(implementation = Notificacion.class))),
        
        @ApiResponse(responseCode = "400", description = "`BAD REQUEST`: el servidor no puede procesar la petición porque se ha detectado un error en el cliente", content = @Content(schema = @Schema(implementation = HTTPProblem.class))),
        
        @ApiResponse(responseCode = "401", description = "`UNAUTHORIZED`: no se ha encontrado la autenticación necesaria", content = @Content(schema = @Schema(implementation = HTTPProblem.class))),
        
        @ApiResponse(responseCode = "403", description = "`FORBIDDEN`: el servidor entiende la petición pero no la autoriza", content = @Content(schema = @Schema(implementation = HTTPProblem.class))),
        
        @ApiResponse(responseCode = "422", description = "`UNPROCESSABLE ENTITY`: falta la referencia o un campo necesario", content = @Content(schema = @Schema(implementation = HTTPProblem.class))) })
    @RequestMapping(value = "/notificacion",
        produces = { "application/json", "application/problem+json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Notificacion> s4NotificacionPost(@Parameter(in = ParameterIn.DEFAULT, description = "`Notificacion` data", required=true, schema=@Schema()) @Valid @RequestBody Object body);


    @Operation(summary = "Modifica una notificación identificada por su ID.", description = "Actualiza la notificacion identificada por `notificacionId`.", security = {
        @SecurityRequirement(name = "subsystemToken")    }, tags={ "🔴 Notificacion" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "`OK`: la notificación ha sido modificada", content = @Content(schema = @Schema(implementation = Notificacion.class))),
        
        @ApiResponse(responseCode = "401", description = "`UNAUTHORIZED`: no se ha encontrado la autenticación necesaria", content = @Content(schema = @Schema(implementation = HTTPProblem.class))),
        
        @ApiResponse(responseCode = "404", description = "`NOT FOUND`: recurso no disponible", content = @Content(schema = @Schema(implementation = HTTPProblem.class))),
        
        @ApiResponse(responseCode = "412", description = "`PRECONDITION FAILED`: no se cumple alguna condición previa", content = @Content(schema = @Schema(implementation = HTTPProblem.class))) })
    @RequestMapping(value = "/notificacion/{notificacionId}",
        produces = { "application/json", "application/problem+json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Notificacion> s4NotificacionPut(@Parameter(in = ParameterIn.HEADER, description = "ETag del recurso que se desea modificar" ,required=true,schema=@Schema()) @RequestHeader(value="If-Match", required=true) String ifMatch, @Pattern(regexp="^\\d+$") @Parameter(in = ParameterIn.PATH, description = "ID de una notificación", required=true, schema=@Schema()) @PathVariable("notificacionId") Integer notificacionId, @Parameter(in = ParameterIn.DEFAULT, description = "`Notificacion` data", required=true, schema=@Schema()) @Valid @RequestBody Object body);

}

