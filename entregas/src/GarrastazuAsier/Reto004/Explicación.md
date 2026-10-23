# Estructuras de datos para un programa de elecciones en Java

| **Dato** | **Decisión** | **Justificación** | **Alternativa descartada** | **Limitación asumida** |
|---|---|---|---|---|
| **Censo / Alumnos electores** | Lista dinámica (`ArrayList`) | Permite añadir alumnos y eliminar registros cuando sea necesario, adaptándose a los cambios del censo. | Vector de tamaño fijo | Buscar un alumno por nombre requiere recorrer la lista. |
| **Papeletas depositadas (Urna)** | Cola (`Queue`) | Sigue el principio FIFO: la primera papeleta en entrar es la primera en salir durante el escrutinio. | Pila (`Stack`) | No permite acceder directamente a una papeleta concreta. |
| **Historial de acciones** | Pila (`Deque`) | Permite deshacer la última operación registrada si se detecta un error durante el recuento. | Cola (`Queue`) | Para deshacer una operación antigua, hay que gestionar las operaciones posteriores. |
| **Candidaturas** | Lista dinámica (`ArrayList`) | Permite añadir y retirar candidaturas durante la preparación de las elecciones. | Vector estático o enumeración (`enum`) | Comprobar si una candidatura existe requiere recorrer la lista. |
| **Recuento de votos** | Tabla asociativa (`HashMap`) | Relaciona cada candidatura con el número de votos obtenidos y facilita actualizar el recuento. | Dos vectores paralelos | Es necesario comprobar que cada candidatura sea válida antes de contabilizar un voto. |
| **Control de participación** | Conjunto (`HashSet`) | Almacena identificadores únicos de los alumnos que ya han votado y evita que participen más de una vez. | Lista dinámica (`ArrayList`) | No mantiene el orden de inserción y necesita identificadores únicos. |
| **Identificación de alumnos** | Tabla asociativa (`HashMap`) | Permite localizar rápidamente a un alumno mediante su identificador. | Búsqueda secuencial | Los identificadores deben ser únicos y estar correctamente registrados. |
| **Estado de las elecciones** | Enumeración (`enum`) | Define los estados posibles, como preparación, votación abierta y votación cerrada. | Variable de texto (`String`) | Hay que programar las reglas que determinan qué operaciones están permitidas en cada estado. |
| **Resultados finales** | Clase `Resultado` | Agrupa los votos obtenidos por cada candidatura, los votos en blanco y los votos nulos. | Variables independientes | Requiere crear y mantener una clase adicional. |
| **Almacenamiento de datos** | Archivos o base de datos | Permite conservar el censo, las candidaturas y los resultados después de cerrar el programa. | Almacenamiento exclusivo en memoria | Es necesario controlar los errores de lectura y escritura para evitar pérdidas de información. |

## Organización de las clases en Java

| **Clase** | **Función principal** |
|---|---|
| `Alumno` | Almacenar los datos y el identificador de cada elector. |
| `Candidato` | Guardar la información de cada candidatura. |
| `Voto` | Representar una papeleta electoral. |
| `Eleccion` | Gestionar el censo, las candidaturas y el proceso electoral. |
| `Recuento` | Contabilizar los votos y calcular los resultados. |
| `Historial` | Registrar las operaciones que pueden deshacerse. |
| `Elecciones` | Mostrar el menú y permitir la interacción con el usuario. |