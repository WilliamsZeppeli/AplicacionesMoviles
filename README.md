# Práctica 1: "Instalación y Funcionamiento de los Entornos Móviles"

## Integrantes

- González Rodríguez Zoe - [ZoeGR14](https://github.com/ZoeGR14)
- Quintanar Bravo Jacqueline Williams - [WilliamsZeppelli](https://github.com/WilliamsZeppeli)
- Vázquez Hernández Michel - [Jimmysito316](https://github.com/Jimmysito316)
- Vazquez Segura Brandon - [PandaKiller05](https://github.com/PandaKiller05)

   
## Ejercicio 1: Instalación de Herramientas

<details>
<summary>📸 Ver capturas</summary>
   
### Capturas Zoe

1. Android Studio

![Captura Android Zoe](/capturas/Gonzalez%20Rodrigue%20Zoe/captura_android_zoe.png "Android Studio")

2. GitHub Desktop

![Captura GitHub Zoe](/capturas/Gonzalez%20Rodrigue%20Zoe/captura_github_zoe.png "GitHub Desktop")

3. Docker

![Captura Docker Zoe](/capturas/Gonzalez%20Rodrigue%20Zoe/captura_docker_zoe.png "Docker")

### Capturas Jacqueline

1. Android Studio

   ![Captura Android Jacqueline](/capturas/Quintanar%20Bravo%20Jacqueline%20Williams/AndroidStudio-QuintanarBravo.png "Android Studio")

2. Docker

   ![Captura Android Jacqueline](/capturas/Quintanar%20Bravo%20Jacqueline%20Williams/Docker-QuintanarBravo.png "Docker")

3. GitHub Desktop

   ![Captura Android Jacqueline](/capturas/Quintanar%20Bravo%20Jacqueline%20Williams/GitHubDesktop-QuintanarBravo.png "GitHub Desktop")

### Capturas Michel

1. **Android Studio**

   ![Captura Android Michel](capturas/Android_Michel.jpg "Android Studio")

2. **GitHub Desktop**

   ![Captura GitHub Michel](capturas/Github_Michel.jpg "GitHub Michel")

### Capturas Brandon

1. Android Studio

   ![Captura Android Brandon](/capturas/Android_Brandon.png "Android Studio")

2. Docker

   ![Captura Docker Brandon](/capturas/Doker_Brandon.png "Docker")

3. GitHub Desktop

   ![Captura GitHub Brandon](/capturas/Github_Brandon.png "GitHub Desktop")

</details>

## Ejercicio 2: Navegación Creativa

### Descripción de Activities

#### MainActivity: PC Michel Vazquez Hernandez

MainActivity: Es el punto de entrada de la aplicación. Su función principal es servir como base para el primer nivel de navegación y contener el botón de acceso al siguiente nivel.
FragmentGabinete: Es un componente modular que muestra la vista global del sistema (Gabinete). Contiene la información visual del hardware externo y se carga dinámicamente al iniciar la app.

#### SecondActivity: MotherBoard

#### ThirdActivity: CPU

#### FourthActivity: ALU y Transistores

Es la cuarta pantalla de la aplicación y está dedicada al tema educativo "ALU y Transistores — El nivel atómico de la computación". Su propósito es presentar al usuario información sobre la Unidad Aritmético-Lógica (ALU), las compuertas lógicas y los transistores que componen los procesadores modernos.

La interfaz se divide en dos secciones principales:

- **Barra de título**: Un ConstraintLayout con fondo de color (#5C72B8) que muestra el título "ALU y Transistores" y el subtítulo "El nivel atómico de la computación".
- **Contenido educativo** (`FourthFragment`): Un FragmentContainerView que aloja de forma estática al FourthFragment. Este fragmento contiene un ScrollView con imagenes representativas, texto explicativo y el botón de `Regresar` para volver a la pantalla principal

### Manejo de transiciones y ciclo de vida

Para manejar las transiciones, utilizamos un Intent explícito que permite la navegación entre MainActivity y SecondActivity. Al presionar el botón, la actividad actual entra en estado onPause() y onStop(), mientras que la nueva actividad inicia su ciclo con onCreate() y onStart(). El uso de un Fragment permite que la interfaz sea más eficiente, ya que no se recrea toda la pantalla, solo se reemplaza el contenedor mediante un FragmentTransaction.

### Instrucciones de ejecución

1. Clonar el repositorio desde GitHub.
2. Abrir el proyecto en Android Studio (asegúrarse de tener instalada la versión Jellyfish o superior).
3. Sincronizar el proyecto con los archivos de Gradle.
4. Ejecutar en un emulador con API 34 o superior, o conectar un dispositivo físico mediante Depuración USB.

### Capturas de Programa Funcional

## Ranking de Computadoras

<details>

<summary>📸 Ver ranking</summary>

### 🥇 Top 1

### 🥈 Top 2: PC Ryzen 5 5600X + RTX 3060

![Captura PC Zoe](/capturas/Gonzalez%20Rodrigue%20Zoe/pc_zoe.png "PC de Zoe")

### 🥉 Top 3: Huawei 14 Intel Core Ultra 5

![Captura PC Brandon](/capturas/PC_Brandon.png "PC de Brandon")

### Top 4: Huawei 14T Intel Core i5 11th

</details>
