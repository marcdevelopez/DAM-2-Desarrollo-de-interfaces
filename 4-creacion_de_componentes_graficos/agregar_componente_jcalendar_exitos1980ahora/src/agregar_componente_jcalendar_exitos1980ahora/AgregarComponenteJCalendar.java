package agregar_componente_jcalendar_exitos1980ahora;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import com.toedter.calendar.JYearChooser;
import com.toedter.calendar.JDateChooser;

import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.awt.event.ActionEvent;

public class AgregarComponenteJCalendar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarComponenteJCalendar frame = new AgregarComponenteJCalendar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AgregarComponenteJCalendar() {
		// llamamos al constructor padre JFrame:
		super();
		// Código autogenerado al crear el JFrame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		// Se agrega un JPanel:
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblFondoImagen = new JLabel("");
		/**
		 *  el tamaño del JLabel será el que queramos para 
		 *  nuestra imagen de fondo
		 */
		lblFondoImagen.setBounds(12, 12, 338, 197);
		lblFondoImagen.setBackground(new Color(0, 255, 255));
		lblFondoImagen.setHorizontalAlignment(SwingConstants.CENTER);
		/**
		 *  creamos el icon para el fondo del JLabel de la 
		 *  siguiente manera:
		 */
		ImageIcon image = new ImageIcon("src/images/imagen_fondo.png");
		Icon icon = new ImageIcon(
				image.getImage().getScaledInstance(
						lblFondoImagen.getWidth(), 
						lblFondoImagen.getHeight(),
						Image.SCALE_DEFAULT));
		// y lo añadimos al JLabel:
		lblFondoImagen.setIcon(icon);
		/**
		 *  y ahora se adaptará el tamaño de nuestro JLabel!
		 *  obtenido de: https://www.youtube.com/watch?v=jegnbN8nVB8
		 */

		contentPane.add(lblFondoImagen);
		
		// Esta etiqueta mostrará la canción de ese año
		JLabel lblCancion = new JLabel("");
		lblCancion.setBounds(64, 221, 310, 15);
		contentPane.add(lblCancion);
		
		
		JYearChooser yearChooser = new JYearChooser();
		// establecemos el primer año elegible:
		yearChooser.setStartYear(1980);
		// establecemos el último año elegible:
		yearChooser.setEndYear(1989);
		// por último, establecemos el año que aparece por defecto:
		yearChooser.setYear(1980);
		// Para poder escuchar el evento de cambio de año:
		yearChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {

			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				switch (yearChooser.getYear()) {
				case 1980: 
					lblCancion.setText("“Call Me” - Blondie");
					break;
				case 1981: 
					lblCancion.setText("“Bette Davis Eyes” - Kim Carnes");
					break;
				case 1982: 
					lblCancion.setText("“Physical” - Olivia Newton-John");
					break;
				case 1983: 
					lblCancion.setText("“Every Breath You Take” - The Police");
					break;
				case 1984: 
					lblCancion.setText("“When Doves Cry” - Prince");
					break;
				case 1985: 
					lblCancion.setText("Careless Whisper” - Wham!");
					break;
				case 1986: 
					lblCancion.setText("“That's What Friends Are For” - Dionne & Friends");
					break;
				case 1987: 
					lblCancion.setText("“Walk Like an Egyptian” - The Bangles");
					break;
				case 1988: 
					lblCancion.setText("“Faith” - George Michael");
					break;
				case 1989: 
					lblCancion.setText("“Look Away” - Chicago");
					break;
				
				default:
					lblCancion.setText("Ese año no tiene canción... lo sentimos");;
				}
				
			}
			
		});
		
		// Establecemos los límites de la ventana
		yearChooser.setBounds(368, 75, 53, 19);
		// Y agrrgamos el JBean JYearChooser al JPanel:
		contentPane.add(yearChooser);
	}
}
