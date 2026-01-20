# RegisterBlockExample - Fabric Mod 1.20.4

## Descripción
Este es un mod de ejemplo que muestra cómo crear y registrar un bloque personalizado en Minecraft usando Fabric API 1.20.4.

## Estructura del Proyecto

```
RegisterBlockExample/
├── src/
│   └── main/
│       ├── java/
│       │   └── space/
│       │       └── registerblockexample/
│       │           ├── Registerblockexample.java     # Clase principal del mod
│       │           └── block/
│       │               └── ModBlocks.java            # Registro de bloques
│       └── resources/
│           ├── fabric.mod.json                       # Metadatos del mod
│           └── assets/
│               └── registerblockexample/
│                   ├── blockstates/
│                   │   └── example_block.json        # Estados del bloque
│                   ├── models/
│                   │   ├── block/
│                   │   │   └── example_block.json    # Modelo 3D del bloque
│                   │   └── item/
│                   │       └── example_block.json    # Modelo del item
│                   ├── textures/
│                   │   └── block/
│                   │       └── example_block.png     # Textura (16x16 o 32x32)
│                   └── lang/
│                       └── en_us.json                # Traducciones
```

## Archivos Necesarios

### 1. Clase Principal (Registerblockexample.java)
Define el MOD_ID y inicializa el registro de bloques.

### 2. Clase ModBlocks (ModBlocks.java)
Contiene la lógica para registrar bloques y sus items correspondientes.

### 3. fabric.mod.json
Archivo de configuración del mod con metadatos, dependencias y entrypoints.

### 4. Blockstate JSON (example_block.json)
Define qué modelo debe usar el bloque en diferentes estados.

### 5. Block Model JSON
Define la forma y texturas del bloque usando el parent "block/cube_all".

### 6. Item Model JSON
Hereda el modelo del bloque para que el item se vea igual.

### 7. Texture (example_block.png)
Imagen PNG de 16x16 o 32x32 píxeles ubicada en `assets/registerblockexample/textures/block/`.

### 8. Lang File (en_us.json)
Archivo de traducción para el nombre del bloque.

## Cómo Usar

1. **Añade tu textura**: Coloca un archivo PNG llamado `example_block.png` en `src/main/resources/assets/registerblockexample/textures/block/`.

2. **Compila el mod**: Ejecuta `./gradlew build` en la terminal.

3. **Prueba el mod**: Copia el archivo JAR generado en `build/libs/` a la carpeta `mods` de tu instalación de Minecraft con Fabric.

4. **Encuentra el bloque**: En el juego, busca "Example Block" en el inventario creativo o usa el comando `/give @s registerblockexample:example_block`.

## Personalización

### Crear más bloques
1. Añade una nueva constante en `ModBlocks.java`:
```java
public static final Block MI_BLOQUE = registerBlock("mi_bloque",
    new Block(FabricBlockSettings.create()
        .strength(3.0f)
        .requiresTool()
        .sounds(BlockSoundGroup.WOOD)));
```

2. Crea los archivos JSON correspondientes en `blockstates`, `models/block`, `models/item`.

3. Añade la textura en `textures/block/mi_bloque.png`.

4. Añade la traducción en `lang/en_us.json`.

### Propiedades del Bloque
Modifica `FabricBlockSettings.create()` para cambiar:
- `.strength(hardness, resistance)`: Dureza y resistencia a explosiones
- `.requiresTool()`: Requiere herramienta para dropear
- `.sounds(BlockSoundGroup)`: Sonidos al romper/colocar
- `.luminance(value)`: Nivel de luz (0-15)
- `.slipperiness(value)`: Deslizamiento como el hielo

## Requisitos

- Minecraft 1.20.4
- Fabric Loader 0.15.11+
- Fabric API
- Java 17+

## Autor
zSharkkWhitee

## Licencia
All Rights Reserved

---
**Nota**: Este proyecto es solo para propósitos educativos sobre modding con Fabric.
