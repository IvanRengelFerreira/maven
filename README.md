# maven
Ejercicio 18
1. ¿Que es maven?
Maven es una herramienta que tiene el mismo fin que el makefile que hemos usado, administrar y construir proyectos java.
2. ¿Qué es el repositorio central de Maven?, ¿hasta qué punto son fiables las bibliotecas que hay en él?
El repositorio local es donde se almacenan los archivos .jar y logren tener versiones distintas. Las bibliotecas son fiables ya que son open source
3. ¿Qué es el repositorio local?
El repositorio local es donde se iran a almacenar las dependencias.Esta localizado en la direccion <USER_HOME>/. m2/repository

Ejercicio 20
2. ¿Qué es un arquetipo en Maven?
Un arqueotipo es la plantilla de como se va a crear el proyecto.
4. Explique el fichero pom.xml
En este fichero estara la descripcion del proyecto donde se especificara cosas como el nombre,la ubicación que tendrá éste en el repositorio de binarios, las dependencias que necesita para compilar, para ejecutar o para lanzar los test. También se especifica si se hará uso de plugins.
10. Explica en que consistan las fases
- validate: valida que el proyecto sea correcto y que toda la informacion este disponibles
- compile:compila el codigo fuente del proyecto y lo mira en el main java
- test: hace una prueba del codigo fuente y si en el marco de prueba alguno nno sale correcto se interrumpe la construccion.
- package: es donde se recoge el codigo compilado y lo guarda como .jar
- install: instala el paquete en el repositorio local para usarlo como dependencia en otros proyectos. 
- deploy:  copia el binario construido en el repositorio remoto para compartirlo con otros desarrolladores y proyectos
- clean: elimina todos los recursos de la compilacion
- site: produce un HTML acerca de todo el proyecto

