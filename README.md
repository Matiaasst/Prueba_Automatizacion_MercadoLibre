# Prueba_Automatizacion_MercadoLibre
Pruebas en la pagina web de Mercado Libre, usando Selenium, Cucumber, Java y VSC. El flujo abre la pagina y busca un producto en especifico, aplica varios filtros y al final extrae el nombre y los precios de los primeros cinco productos que salen en la pagina, al final genera un reporte tanto en pdf como en html mostrando fallos y mas información.


-------------------------------------------------------------------------------------------------------------------------------------------


## Requisitos

| Herramienta           | Versión probada                      |
|------------------------|--------------------------------------|
| Gradle                | 8.14.x                               |
| Java JDK              | 22                                   |
| Visual Studio         | Cualquier Version                    |


-------------------------------------------------------------------------------------------------------------------------------------------

## Instalación

```bash
# 1. Instalar JDK, Gradle y Visual Studio, sus versiones mencionadas ya anteriormente

# 2. Para la instalacion de gradle, primero descargarlo de este link https://gradle.org/releases/#8.14.2, despues descomprimir la carpeta en donde sea nuestra preferencia y generar su variable de entorno, al final mi variable de entorno y se vera algo asi "D:\Desarrollo\gradle-8.14.3\bin"

# 3. Para la instalacion del JDK, primero descargarlo de este link https://www.oracle.com/java/technologies/javase/jdk22-archive-downloads.html es la opcion llamada "Windows x64 Installer", una ves descargado realizar la instalacion, a todo darle next y dejar la ruta de instalacion predeterminada, al finalizar solo generar su variable de entorno y ve algo asi "C:\Program Files\Java\jdk-17\bin"

# 4. Al realizar las instalaciones y crear las variables de entorno podemos corroborar si estan bien instaladas por medio del cmd poniendo los siguientes comandos y de estar bien todo nos arrojara cada version de lo instalado 
java --version y gradle --version

# 5. Para la instalacion de VSC, primero descargarlo de este link https://code.visualstudio.com/Download, una ves descargado realizar la instalicon de manera normal

# 6. Clonar repositorio
git clone https://github.com/Matiaasst/Prueba_Automatizacion_MercadoLibre.git


-------------------------------------------------------------------------------------------------------------------------------------------
```
## Ejecutar Proyecto

```bash
# 1. Abrir la carpeta del proyecto en Visual Studio

# 2. Dentro de src/ se encuentrabn los archivos creados para la automatizacion

# 3. Abrir la terminal de visual estudio
ctrl+shift+ñ

# 4. En la terminal escribir lo siguiente y se comenzara a ejecutar la prueba automatizada
gradle test --info

# 5. Desde el explorador de archivos de windows ir a la carpeta del proyecto y dentro de ella hay una carpeta que se llama ExtentReports donde se encontrarar los reportes ordenados por fecha y hora, estara tanto el archivo pdf como el html




