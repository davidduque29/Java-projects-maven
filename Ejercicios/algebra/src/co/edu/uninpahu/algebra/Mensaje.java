package co.edu.uninpahu.algebra;

import java.io.Serializable;

/**
 *
 * @author Nelson
 */
public class Mensaje implements Serializable{

	private static final long serialVersionUID = 1L;

	private boolean mensajePendiente;

	private String title;
	private String text;
	private String type;


	public Mensaje() {
		super();
		this.mensajePendiente = false;

		this.title = "Atencion";
		this.text = null;
		this.type = null;
	}

	public Mensaje(String title) {
		this();

	}

	public boolean isMensajePendiente() {
		return mensajePendiente;
	}

	public void setMensajePendiente(boolean mensajePendiente) {
		this.mensajePendiente = mensajePendiente;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}