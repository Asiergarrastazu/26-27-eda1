# Estructura, vistas y justificación

## 1. Array de votos

Se utiliza un array de tipo `int`, cuyo tamaño es igual al número de candidatos más dos posiciones adicionales.

- **Función:** almacenar el número de votos recibidos por cada candidato, así como contabilizar las abstenciones y los votos nulos.
- **Organización:** cada posición del array representa a un candidato o a uno de los dos tipos de voto adicionales.
- **Justificación:** este sistema permite almacenar únicamente los resultados numéricos, sin asociar cada voto a una persona concreta. De este modo, se favorece el anonimato de los votantes. Además, el uso de un array permite gestionar los datos de forma sencilla y eficiente, aprovechando adecuadamente los recursos disponibles.

## 2. Array de candidatos

Se utiliza un array de tipo `String` para almacenar los nombres de los candidatos. Su tamaño es igual al número de candidatos más dos posiciones adicionales, destinadas a representar las abstenciones y los votos nulos.

- **Función:** guardar los nombres de los candidatos y facilitar su identificación al consultar los resultados de la votación.
- **Organización:** cada posición del array corresponde a un candidato, manteniendo la misma estructura que el array de votos. Las dos posiciones adicionales permiten identificar las abstenciones y los votos nulos.
- **Justificación:** se utiliza un array porque el número de candidatos se conoce de antemano y permanece fijo durante la ejecución del programa. Por tanto, no es necesario emplear una estructura de datos dinámica que permita modificar su tamaño. Esto simplifica la implementación y facilita la relación entre cada candidato y su número de votos.

## 3. Relación entre ambos arrays

Los dos arrays mantienen la misma estructura, de manera que cada posición del array de candidatos se corresponde con la posición equivalente del array de votos. Así, es posible consultar el nombre de cada candidato y el número de votos que ha obtenido utilizando el mismo índice.