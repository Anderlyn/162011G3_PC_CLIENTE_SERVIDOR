package proyectoSorteoUsuarios;

public class usuarioLoteria {
    private int numeroTelefono;
    private String nombreUsuario;
    private String correoElectronico;
    private String tipoUsuario;

    public usuarioLoteria() {
    }

    public usuarioLoteria(int numeroTelefono, String nombreUsuario, String correoElectronico, String tipoUsuario) {
        this.numeroTelefono = numeroTelefono;
        this.nombreUsuario = nombreUsuario;
        this.correoElectronico = correoElectronico;
        this.tipoUsuario=tipoUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "usuarioLoteria{" + "numeroTelefono=" + numeroTelefono + ", nombreUsuario=" + nombreUsuario + ", correoElectronico=" + correoElectronico + ", tipoUsuario=" + tipoUsuario + '}';
    }

    
    
}
