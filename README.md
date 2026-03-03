<div align="center">

# 📱 Práctica 1  
## Instalación y Funcionamiento de los Entornos Móviles

![Android](https://img.shields.io/badge/Android-API%2034+-3DDC84?style=for-the-badge&logo=android)
![Android Studio](https://img.shields.io/badge/Android%20Studio-Jellyfish+-3DDC84?style=for-the-badge&logo=androidstudio)
![GitHub](https://img.shields.io/badge/GitHub-Repository-181717?style=for-the-badge&logo=github)
![Docker](https://img.shields.io/badge/Docker-Installed-2496ED?style=for-the-badge&logo=docker)

</div>

---

## 📑 Tabla de Contenido

- [👥 Integrantes](#-integrantes)
- [🛠 Ejercicio 1: Instalación de Herramientas](#-ejercicio-1-instalación-de-herramientas)
- [🧭 Ejercicio 2: Navegación Creativa](#-ejercicio-2-navegación-creativa)
- [🔄 Manejo de Transiciones y Ciclo de Vida](#-manejo-de-transiciones-y-ciclo-de-vida)
- [▶ Instrucciones de Ejecución](#-instrucciones-de-ejecución)
- [🏆 Ranking de Computadoras](#-ranking-de-computadoras)

---

# 👥 Integrantes

| Nombre | Usuario GitHub |
|--------|----------------|
| González Rodríguez Zoe | [ZoeGR14](https://github.com/ZoeGR14) |
| Quintanar Bravo Jacqueline Williams | [WilliamsZeppelli](https://github.com/WilliamsZeppeli) |
| Vázquez Hernández Michel | [Jimmysito316](https://github.com/Jimmysito316) |
| Vazquez Segura Brandon | [PandaKiller05](https://github.com/PandaKiller05) |

---

# 🛠 Ejercicio 1: Instalación de Herramientas

<details>
<summary><strong>📸 Ver capturas</strong></summary>

---

## 👩‍💻 Capturas Zoe

**1️⃣ Android Studio**  
![Captura Android Zoe](/capturas/Gonzalez%20Rodriguez%20Zoe/captura_android_zoe.png)

**2️⃣ GitHub Desktop**  
![Captura GitHub Zoe](/capturas/Gonzalez%20Rodriguez%20Zoe/captura_github_zoe.png)

**3️⃣ Docker**  
![Captura Docker Zoe](/capturas/Gonzalez%20Rodriguez%20Zoe/captura_docker_zoe.png)

---

## 👩‍💻 Capturas Jacqueline

**1️⃣ Android Studio**  
![Captura Android Jacqueline](/capturas/Quintanar%20Bravo%20Jacqueline%20Williams/AndroidStudio-QuintanarBravo.png)

**2️⃣ Docker**  
![Captura Docker Jacqueline](/capturas/Quintanar%20Bravo%20Jacqueline%20Williams/Docker-QuintanarBravo.png)

**3️⃣ GitHub Desktop**  
![Captura GitHub Jacqueline](/capturas/Quintanar%20Bravo%20Jacqueline%20Williams/GitHubDesktop-QuintanarBravo.png)

---

## 👨‍💻 Capturas Michel

**1️⃣ Android Studio**  
![Captura Android Michel](capturas/Android_Michel.jpg)

**2️⃣ GitHub Desktop**  
![Captura GitHub Michel](capturas/Github_Michel.jpg)

---

## 👨‍💻 Capturas Brandon

**1️⃣ Android Studio**  
![Captura Android Brandon](/capturas/Segura%20Vazquez%20Brandon/Android_Brandon.png)

**2️⃣ Docker**  
![Captura Docker Brandon](/capturas/Segura%20Vazquez%20Brandon/Doker_Brandon.png)

**3️⃣ GitHub Desktop**  
![Captura GitHub Brandon](/capturas/Segura%20Vazquez%20Brandon/Github_Brandon.png)

</details>

---

# 🧭 Ejercicio 2: Navegación Creativa

## 🏗 Descripción de Activities

---

## 🔹 MainActivity  
**PC Michel Vázquez Hernández**

**MainActivity:**  
Es el punto de entrada de la aplicación. Sirve como base del primer nivel de navegación y contiene el botón para acceder al siguiente nivel.

**FragmentGabinete:**  
Componente modular que muestra la vista global del sistema (Gabinete). Se carga dinámicamente al iniciar la aplicación.

---

## 🔹 SecondActivity: MotherBoard

Segunda pantalla dedicada a la **Tarjeta Madre**, nivel intermedio de la arquitectura de hardware.

Su propósito es explicar cómo este componente actúa como el *“sistema nervioso”* de la computadora, permitiendo la conectividad entre RAM, almacenamiento y puertos de expansión.

### 🧩 Estructura

- **Barra de título (`LinearLayout`)**
  - Fondo: `#5C73B8`
  - Título: *Tarjeta Madre*
  - Subtítulo: *El Sistema Nervioso de la PC*

- **Contenido educativo (`GamasMoboFragment`)**
  - `ScrollView`
  - Imagen representativa
  - Texto explicativo
  - Clasificación por gama:
    - Entrada
    - Media
    - Alta
  - Botón **“Inspeccionar el Socket del CPU”** (Intent explícito)

---

## 🔹 ThirdActivity: CPU

Es la tercera pantalla de la aplicación y está dedicada al nivel de la **Unidad Central de Procesamiento (CPU)**, componente encargado de ejecutar instrucciones y coordinar el funcionamiento general del sistema.

Esta pantalla funciona como punto intermedio entre **SecondActivity (MotherBoard)** y **FourthActivity (ALU y Transistores)**, manteniendo la jerarquía educativa del proyecto.

La arquitectura se compone de:

- **ThirdActivity:**  
  Actúa como contenedor principal. Implementa diseño *edge-to-edge* mediante `enableEdgeToEdge()`, infla el layout `activity_third` y ajusta automáticamente los márgenes según las barras del sistema utilizando `WindowInsetsCompat`.

- **ThirdFragment:**  
  Se encarga de la lógica de interacción. Dentro de `onViewCreated()` configura dos botones:
  - `btnBack`: Regresa a **SecondActivity** mediante un `Intent` explícito.
  - `btnNext`: Avanza a **FourthActivity** mediante un `Intent` explícito.

En ambos casos se utiliza `finish()` para cerrar la actividad actual, manteniendo una navegación lineal y evitando acumulación innecesaria en el back stack., garantizando navegación jerárquica y estructurada dentro de la aplicación.

---

## 🔹 FourthActivity: ALU y Transistores

Pantalla educativa titulada:

> **ALU y Transistores — El nivel atómico de la computación**

Presenta información sobre:

- Unidad Aritmético-Lógica (ALU)
- Compuertas lógicas
- Transistores modernos

### 🧩 Estructura

- **Barra de título (`ConstraintLayout`)**
  - Fondo: `#5C72B8`
  - Título y subtítulo

- **Contenido (`FourthFragment`)**
  - `ScrollView`
  - Imágenes representativas
  - Texto explicativo
  - Botón **Regresar**

---

# 🔄 Manejo de Transiciones y Ciclo de Vida

## 🚀 Intents Explícitos

Transición entre actividades mediante `Intent`.

**Actividad origen:**
- `onPause()`
- `onStop()`

**Actividad destino:**
- `onCreate()`
- `onStart()`
- `onResume()`

---

## 🧱 Uso de Fragments

### ✔ Ventajas

- **Eficiencia de memoria**
- **Modularidad**
- **Actualización independiente de vistas**

Uso de `FragmentTransaction` para reemplazo dinámico de contenido.

---

# ▶ Instrucciones de Ejecución

1. Clonar el repositorio desde GitHub.
2. Abrir el proyecto en Android Studio (Jellyfish o superior).
3. Sincronizar con Gradle.
4. Ejecutar en:
   - Emulador API 34+
   - Dispositivo físico con Depuración USB habilitada.

---

# 🏆 Ranking de Computadoras

<details>
<summary><strong>📸 Ver ranking</strong></summary>

---

## 🥇 Top 1

![Captura PC Jacqueline](/capturas/Quintanar%20Bravo%20Jacqueline%20Williams/PC-QuintanarBravo.png)

---

## 🥈 Top 2: PC Ryzen 5 5600X + RTX 3060

![Captura PC Zoe](/capturas/Gonzalez%20Rodriguez%20Zoe/pc_zoe.png)

---

## 🥉 Top 3: Huawei 14 Intel Core Ultra 5

![Captura PC Brandon](/capturas/Segura%20Vazquez%20Brandon/PC_Brandon.png)

---

## 🎖 Top 4: Huawei 14T Intel Core i5 10th

![Captura PC Michel](capturas/PC_Michel.jpg)

</details>

---
### 📲 Capturas de pantalla del programa funcionando

## Main Activity

![Captura Docker Zoe](/capturas/Programa/MainActivity-1.png)

---

## Main Activity

![Captura Second Activity](/capturas/Programa/SecondActivity-1.png)
![Captura Second Activity 2](/capturas/Programa/SecondActivity-2.png)

---

## Main Activity

![Captura Third Activity](/capturas/Programa/ThirdActivity-1.png)
![Captura Third Activity 2](/capturas/Programa/ThirdActivity-2.png)

---

## Main Activity

![Captura Fourth Activity](/capturas/Programa/FourthActivity-1.png)
![Captura Fourth Activity 2](/capturas/Programa/FourthActivity-2.png)

---
<div align="center">

### 🚀 Proyecto Académico — Desarrollo de Entornos Móviles con Android

</div>


