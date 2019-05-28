package Vista;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.*;

import javax.swing.JFileChooser;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Sonidos {

	public static void reproducir() {
		AdvancedPlayer reproductor;
		ClassLoader classLoader = ClassLoader.getSystemClassLoader();
		try {
			File archivo = new File(classLoader.getResource("Musica/Cancion.mp3").getFile());
				reproductor= new AdvancedPlayer(new FileInputStream(archivo));
					reproductor.play();
					
				} catch (JavaLayerException e) {
				} catch (FileNotFoundException es) {
				System.out.println("Archivo no encontrado");
			}
		}
	}