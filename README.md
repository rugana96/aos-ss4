# Subsistema 4
Envío de **notificaciones** relacionadas con el funcionamiento del taller. 
Este subsistema es el encargado de notificar a los clientes el estado de los diferentes trabajos.

## Instalación y despliegue
### Ruta

localhost/AOS4




## Explicación del diseño de la API para la gestión de **Notificaciones**
### API segura: Autenticación
Hemos decidido crear dos tipos de autenticación mediante **JWT** (JSON Web Token) destinadas a funcionalidades distintas:
- **userToken:** para autorizar a los clientes registrados en el taller a consultar todas sus notificaciones o una en concreto.
- **subsystemToken:** para permitir al subsistema encargado de la gestión de trabajos crear una notificación si el estado de un trabajo cambia.

### Endpoints y métodos HTTP ###
Para la gestión de las notificaciones del taller se ha contemplado los siguientes Endpoints y métodos HTTP:

#### **/notificacion**
- **/notificacion - GET:** 
  Devuelve en un array todas las notificaciones de un cliente previamente autenticado.
  - **JWT** utilizado:
    - **userToken:**
  - Propiedades de cada una de las notificaciones recuperadas en el array:
    - notificacionId
    - clienteId
    - objetoTrabajo:
      - trabajoId
      - nombreTrabajo
      - estadoTrabajo
    - fechaNotificacion
    - links (HATEOAS)
      - parent
      - self
- **/notificacion - POST:** 
  Crea una notificación especificando las propiedades requeridas. 
  - **JWT** utilizado:
    - **subsystemToken:**
  - Campos json a especificar en la petición:
    - clienteId
    - trabajoId
    - estadoTrabajo
    - fechaNotificacion
    - links (HATEOAS)
      - parent
      - self
- **/notificacion - OPTIONS:**
  Proporciona la lista de los métodos HTTP soportados.
  - No requiere de autenticación.

#### **/notificacion/{notificacionId}**
- **/notificacion/{notificacionId} - GET:**
  Recupera una notificación específica identificada por su ID.
  - **JWT** utilizado:
    - **userToken:**
  - Parámetros requeridos:
    - notificaciónId
  - Propiedades de una notificación recuperada:
    - clienteId
    - objetoTrabajo:
      - trabajoId
      - nombreTrabajo
      - estadoTrabajo
    - fechaNotificacion
    - links (HATEOAS)
      - parent
      - self
- **/notificacion/{notificacionId} - PUT:**
  Modifica una notificación específica identificada por su ID.
  - **JWT** utilizado:
    - **subsystemToken:**
  - Parámetros requeridos:
    - notificaciónId
    - ETag del recurso que se desea modificar
  - Campos json a especificar en la petición:
    - clienteId
    - trabajoId
    - estadoTrabajo
    - fechaNotificacion
    - links (HATEOAS)
      - parent
      - self
- **/notificacion/{notificacionId} - DELETE:**
  Elimina una notificación específica identificada por su ID.
  - **JWT** utilizado:
    - **subsystemToken:**
  - Parámetros requeridos:
    - notificaciónId
- **/notificacion/{notificacionId} - OPTIONS:**
  Proporciona la lista de los métodos HTTP soportados.
  - No requiere de autenticación.