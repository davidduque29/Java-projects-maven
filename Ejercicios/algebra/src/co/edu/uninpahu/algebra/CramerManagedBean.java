package co.edu.uninpahu.algebra;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ValueChangeEvent;

@ManagedBean
@ViewScoped
public class CramerManagedBean {

	private int tipoSistema;
	private boolean solucionado;
	private Number solucion[];
	private Double matriz[][];
	private Double resultado[];
	private Mensaje mensaje;
        private Util util;

	public CramerManagedBean() {
		super();
		this.tipoSistema = 3;
		this.solucionado = false;
		this.mensaje = new Mensaje();
                this.util = new Util();
		actualizar();
	}

    public Util getUtil() {
        return util;
    }

    public void setUtil(Util util) {
        this.util = util;
    }

	public void cambioTipo(ValueChangeEvent event) {
		this.tipoSistema = Integer.parseInt(event.getNewValue().toString());
		actualizar();
	}

	public void actualizar() {
		this.matriz = new Double[this.tipoSistema][this.tipoSistema];
		this.resultado = new Double[this.tipoSistema];
		this.solucionado = false;
		for (int i=0;i<this.matriz.length;i++) {
			for(int j=0;j<this.matriz[0].length;j++) {
				this.matriz[i][j]=0d;
				this.resultado[i]=0d;
			}
		}
	} 

	public String solucionar() {
		try {
			System.out.println("Entro a solucionar el sistema");
			Util.mostrarMatriz(matriz);
			if (Util.determinante(this.matriz).doubleValue()==0d) {
				this.mensaje.setMensajePendiente(true);
				this.mensaje.setTitle("Atencion");
				this.mensaje.setText("El determinante del sistema es cero, el sistema no tiene solucion o tiene infinitas soluciones");
				this.mensaje.setType("warning");
				this.solucionado = false;
			} else {
				this.solucion = Util.reglaCramer(this.matriz, this.resultado);
				this.mensaje.setMensajePendiente(true);
				this.mensaje.setTitle("Atencion");
				this.mensaje.setText("Se soluciono con exito el sistema de ecuaciones");
				this.mensaje.setType("success");
				this.solucionado = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			this.mensaje.setMensajePendiente(true);
			this.mensaje.setTitle("Atencion");
			this.mensaje.setText("Ocurrio³ un error al intentar solucionar el sistema de ecuaciones");
			this.mensaje.setType("error");
			this.solucionado = false;
		}
		return "";
	}

	public int getTipoSistema() {
		return tipoSistema;
	}

	public void setTipoSistema(int tipoSistema) {
		this.tipoSistema = tipoSistema;
	}

	public Double[][] getMatriz() {
          
		return matriz;
	}

	public void setMatriz(Double[][] matriz) {
		this.matriz = matriz;
	}

	public Double[] getResultado() {
		return resultado;
	}

	public void setResultado(Double[] resultado) {
		this.resultado = resultado;
	}

	public boolean isSolucionado() {
		return solucionado;
	}

	public void setSolucionado(boolean solucionado) {
		this.solucionado = solucionado;
	}

	public Number[] getSolucion() {
		return solucion;
	}

	public void setSolucion(Number[] solucion) {
		this.solucion = solucion;
	}

	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}

}
