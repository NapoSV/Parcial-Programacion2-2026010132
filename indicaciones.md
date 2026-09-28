Construir una aplicación en Java organizada con Interfaces, Clases Abstractas y Patrón Strategy que calcule la comisión de ventas de un empleado.

Paso 1: Configuración en Git y GitHub (1.0 pt)

Crea un repositorio público en GitHub llamado Parcial-Programacion2-[tunumerocif].

Incluye un archivo .gitignore para Java.

Realiza la entrega inicial con un commit firmado con tu nombre completo y cif.

Paso 2: Diseño en Java (3.0 pts.)

Interfaz EstrategiaComision: Define el método double calcularComision(double montoVenta).

Implementaciones de la Estrategia:

ComisionEstandar: Retorna el 5% de la venta.

ComisionPersonalizada: Retorna el (5 + N)% de la venta, donde N es la cantidad de letras de tu primer nombre (ejemplo: "Daniel" tiene 6 letras, el porcentaje de la venta será 11%).

Clase Abstracta Empleado:

Atributos: String nombre, double ventasMes, EstrategiaComision estrategia.

Método concreto: public void cambiarEstrategia(EstrategiaComision nueva) (Inyección del patrón Strategy).

Método abstracto: public abstract void mostrarDetalle().

Subclase Concreta Vendedor (hereda de Empleado):

Implementa mostrarDetalle() imprimiendo el nombre, la venta total y el cálculo polimórfico de la comisión obtenida.

Paso 3: Flujo de Ramas y Conflicto en Git (2.0 pts.)

En la rama main, la clase Vendedor debe usar por defecto la ComisionEstandar.

Crea una rama llamada feature/comision-personalizada. En esta rama, modifica el Main.java para asignar la ComisionPersonalizada.

Haz push de la rama a GitHub.

Intenta hacer merge a main. Si ocurre un conflicto en el Main.java, resuélvelo manualmente conservando la llamada a la comisión personalizada.

El commit final en main debe tener el mensaje: "fix: resolver conflicto e integrar comision personalizada"

Colocar la URL Pública del repositorio en la respuesta de esta pregunta.