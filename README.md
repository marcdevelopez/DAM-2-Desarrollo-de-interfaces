# desarrollo-interfaces-dam-2
Módulo del segundo curso de Desarrollo de Aplicaciones Multiplataforma (DAM). En este repositorio agregaré todo el contenido que halle de interés para quien desee estudiar este grado superior de Informática de la Formación Profesional.

Puntualizar que solamente están los archivos .java que contienen la clase main de cada proyecto. Para poder ejecutar cada archivo .java deberéis crear un proyecto con vuestro entorno de desarrollo preferido (yo estoy usando Eclipse para este curso), y luego agregar una clase java al proyecto. Después tendréis que copiar el contenido de el archivo .java de este repositorio que queráis ejecutar. Tened en cuenta a la hora de agregar el archivo que éste está en mi proyecto en el package que aparece en la primera línea de código, entonces tendréis que crear dicho paquete con el mismo nombre que aparece en el archivo. Esto suele pedirse en los IDE a la hora de crear-agregar la clase java. Por supuesto, el archivo .java creado en vuestro proyecto deberá tener el mismo nombre que tiene la clase. Ejemplo:

```
public class Ventana_prueba {

	public static void main(String[] args) {
		...
```
En este caso el archivo .java que contendrá la clase java que estáis agregando se deberá de llamar:
Ventana_prueba.java, de la misma manera que aparece en mi repositorio...

Cualquier duda no dudéis en preguntarme o en consultar páginas como stackoverflow.com.

 Dentro del tema "**Confección de interfaces intro**":

**Ventana_prueba.java**: Esta clase creará una ventana con dos botones, "aceptar" y "cancelar". Es sólo la interfaz de usuario, generada con las herramientas de la vista de diseño de oracle, usando las librerías de Swing.

**MiPrimeraVentanaSoloCodigo.java**: Esta clase crea una ventana JFrame directamente desde código, sin usar la vista de diseño. Notaréis que no se habilita la pestaña de vista "diseño" en la ventana de Eclipse, siendo esta otra manera de crear interfaces de usuario, aunque es más costosa en tiempo y esfuerzo, pero mucho más personalizable.

**BotonesPuntosCardinalesJFrame.java**: Esta clase es generada directamente con la vista de diseño, arrastrando botones al panel de diseño y cambiando propiedades con la interfaz de la ventana "properties".


