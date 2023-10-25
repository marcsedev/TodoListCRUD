# TodoListCRUD

**Versión 1.0**

TodoListCRUD es una aplicación de gestión de tareas desarrollada en Kotlin utilizando Jetpack Compose. La arquitectura subyacente sigue los principios de MVVM y Clean Architecture para garantizar un código mantenible y escalable.

## Características Actuales

- **Jetpack Compose:** La interfaz de usuario se ha construido utilizando la moderna biblioteca de UI de Jetpack Compose, permitiendo una creación de UI declarativa y fácil de entender.

- **Arquitectura MVVM y Clean:** La aplicación sigue una arquitectura de Modelo-Vista-VistaModelo (MVVM) combinada con Clean Architecture. Esto ayuda a separar las preocupaciones y facilita la prueba unitaria de las diferentes capas.

- **Inyección de Dependencias con Dagger Hilt:** La inyección de dependencias se gestiona con Dagger Hilt, facilitando la creación y mantenimiento de instancias de clases y mejorando la modularidad del código.

- **Room como Base de Datos:** Se utiliza Room para proporcionar una capa de abstracción sobre SQLite, facilitando la persistencia de datos de manera eficiente.

- **LiveData y Flow/StateFlow:** La aplicación aprovecha LiveData y Flow/StateFlow para observar y reaccionar a cambios en los datos, proporcionando una experiencia de usuario en tiempo real.

## Características Futuras

- **Sincronización en la Nube:** Implementación de la capacidad de sincronizar tareas con un servicio en la nube para respaldo y acceso multiplataforma.

- **Recordatorios y Notificaciones:** Añadir la funcionalidad de establecer recordatorios y recibir notificaciones para tareas pendientes.

- **Mejoras en la Interfaz de Usuario:** Continuar mejorando y refinando la interfaz de usuario para una experiencia más intuitiva y agradable.

- **Pruebas Automatizadas:** Desarrollar suites de pruebas automatizadas, incluyendo pruebas unitarias y de integración, para garantizar la estabilidad y la calidad del código.

## Requisitos del Sistema

- Dispositivo con Android 5.0 (API nivel 21) o superior.
- Conexión a Internet (solo requerida para sincronización en futuras versiones).

## Configuración del Proyecto

1. Clona este repositorio: `git clone https://github.com/tuusuario/todolist-crud.git`
2. Abre el proyecto en Android Studio.
3. Sincroniza el proyecto con Gradle.
4. Compila y ejecuta la aplicación en un emulador o dispositivo Android.

## Contribuciones

¡Las contribuciones son bienvenidas! Si encuentras algún problema o tienes una mejora, no dudes en abrir un problema o enviar una solicitud de extracción.
