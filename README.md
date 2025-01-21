
# Foro Hub

Foro Hub es una aplicación de foros que permite a los usuarios compartir ideas, debatir y aprender en un entorno colaborativo. Esta aplicación utiliza **Spring Boot**, **Java**, y **MySQL** para la construcción de un backend robusto y escalable. 

---

## Índice

1. [Descripción del Proyecto](#descripción-del-proyecto)
2. [Arquitectura del Sistema](#arquitectura-del-sistema)
3. [Tecnologías Utilizadas](#tecnologías-utilizadas)
4. [Requisitos del Sistema](#requisitos-del-sistema)
5. [Instalación](#instalación)
6. [Configuración](#configuración)
7. [Ejecución](#ejecución)
8. [Pruebas](#pruebas)
9. [Contribuciones](#contribuciones)
10. [Licencia](#licencia)

---

## Descripción del Proyecto

Foro Hub es una plataforma diseñada para la creación de foros temáticos, donde los usuarios pueden discutir sobre diversos tópicos, compartir sus conocimientos y aprender de otros. El sistema incluye funcionalidades clave como la autenticación de usuarios, gestión de categorías y temas, y moderación de contenidos.

---

## Arquitectura del Sistema

Foro Hub está construido utilizando una arquitectura basada en tres capas:

1. **Capa de Presentación**: Se utiliza **Thymeleaf** para el renderizado de las vistas HTML, que permite una interacción fluida con el backend.
2. **Capa de Aplicación**: Gestionada por **Spring Boot**, maneja la lógica de negocio, validación de datos y servicios.
3. **Capa de Persistencia**: Implementada con **JPA/Hibernate**, se comunica con la base de datos **MySQL** para almacenar y recuperar los datos del foro.

---

## Tecnologías Utilizadas

- **Java 17**: Lenguaje principal de desarrollo.
- **Spring Boot**: Framework para crear aplicaciones web rápidas y eficientes.
- **MySQL**: Sistema de gestión de bases de datos relacional.
- **JPA / Hibernate**: Proveedor de persistencia para el acceso a datos.
- **Thymeleaf**: Motor de plantillas para generar vistas HTML.
- **Jasypt**: Para cifrado y seguridad de propiedades sensibles.
- **Maven**: Herramienta para la gestión de dependencias.

---

## Requisitos del Sistema

Antes de instalar Foro Hub, asegúrate de tener los siguientes requisitos:

- **Java JDK 17+**
- **Maven 3.8+**
- **MySQL 8.0+**
- **Git** (para clonar el repositorio)

---

## Instalación

### Clonación del Repositorio

Clona el repositorio de GitHub a tu máquina local:

```bash
git clone https://github.com/tuusuario/foro-hub.git
cd foro-hub
```

### Instalación de Dependencias

Usa Maven para descargar todas las dependencias necesarias:

```bash
mvn clean install
```

---

## Configuración

### Configuración de la Base de Datos

1. Crea una base de datos en MySQL:

   ```sql
   CREATE DATABASE foro_hub_db;
   ```

2. Actualiza el archivo `application.properties` con las credenciales de la base de datos:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/foro_hub_db
   spring.datasource.username=tu_usuario
   spring.datasource.password=tu_contraseña
   ```

### Configuración de Variables de Entorno

Si utilizas **Jasypt** para cifrar las propiedades sensibles, debes configurar una clave de cifrado:

```bash
export JASYPT_ENCRYPTOR_PASSWORD=mi_clave_secreta
```

---

## Ejecución

### Ejecución en Entorno Local

Para ejecutar la aplicación en un entorno local, utiliza el siguiente comando de Maven:

```bash
mvn spring-boot:run
```

La aplicación estará disponible en [http://localhost:8080](http://localhost:8080).

---

## Pruebas

El proyecto incluye un conjunto de pruebas unitarias y de integración. Puedes ejecutar todas las pruebas con el siguiente comando:

```bash
mvn test
```

---

## Contribuciones

¡Las contribuciones son bienvenidas! Para contribuir al proyecto:

1. Haz un fork del repositorio.
2. Crea una nueva rama para tu funcionalidad (`git checkout -b nueva-funcionalidad`).
3. Realiza los cambios y haz commit (`git commit -m "Añadir nueva funcionalidad"`).
4. Envía tus cambios a GitHub (`git push origin nueva-funcionalidad`).
5. Abre un **Pull Request**.

---

## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo [LICENSE](LICENSE) para obtener más información.

---

