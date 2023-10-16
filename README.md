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


## Dentro del tema "**Confección de interfaces intro**":

**Ventana_prueba.java**: Esta clase creará una ventana con dos botones, "aceptar" y "cancelar". Es sólo la interfaz de usuario, generada con las herramientas de la vista de diseño de oracle, usando las librerías de Swing.

**MiPrimeraVentanaSoloCodigo.java**: Esta clase crea una ventana JFrame directamente desde código, sin usar la vista de diseño. Notaréis que no se habilita la pestaña de vista "diseño" en la ventana de Eclipse, siendo esta otra manera de crear interfaces de usuario, aunque es más costosa en tiempo y esfuerzo, pero mucho más personalizable.

**BotonesPuntosCardinalesJFrame.java**: Esta clase es generada directamente con la vista de diseño, arrastrando botones al panel de diseño y cambiando propiedades con la interfaz de la ventana "properties".


## Dentro del tema "**Confección de interfaces intro**":

**ClasesYComponentes.java**: Esta clase abrirá un JDialog "DialogHola" desde un JButton, y además practicaremos con JLabel, JCheckBox, JRadioButton y ButtonGroup, y por último con un JComboBox.


**DialogHola.java**: Creamos en esta clase un molde para nuestro DialogHola, que hereda de JDialog, modificando su constructor para que pueda ser un JDialog modal o no.

**DisenioCalculadora.java**: Diseñamos, sin ninguna funcionalidad, una calculadora. Habría que modificarla para haber añadido la pantalla arriba a la izquierda. ¿Te animas a incluirle esa pantalla? Puedes enviarme un PullRequest si lo deseas, así practicamos Git y GitHub. 

**EjemploFlowLayout.java**: Si lo ejecutas, podrá ver cómo al cambiar las dimensiones de la ventana, cambia su disposición para seguir ocupando toda la ventana los tres JLabels. De ahí su nombre, FlowLayout, el diseño fluye dentro del JFrame, amoldándose a las dimensiones que le demos a su contenedor.

**EjemploGridLayout.java**: Creamos un GridLayout de 2x2, establecemos el Layout del JPanel a GridLayout en la línea 51, en el constructor, después de establecer el ContentPane.

**InicioSesionUsuario.java**: Esta clase es el molde de InicioSesionUsuario, que es un JFrame que se abrirá después de pulsar el botón "Inicio" en la ventana que abre la clase InicioUsuarioContrasenia.java. Lo normal sería abrir un JDialog, pero he querido demostrar que también es posible abrir otros JFrame, según sea nuestra necesidad.

**InicioUsuarioContrasenia.java**: Este JFrame no abrirá un InicioSesionUsuario a menos que introduzcamos el usario y contraseña correctos.

**VentanaPago1.java**: Este es un JFrame, que simula un pago. Recordarás como abrir otro JFrame, conectando dos ventanas.

**VentanaPago2.java**: Esta es la ventana que se abre al pulsar "pagar" en VentanaPago1, y usamos JLabel, JRadioButton, ButtonGroup y JButton. Puedes seguir desarrollando el proyecto si lo deseas...


