// default package
// Generated 10/07/2014 12:37:06 AM by Hibernate Tools 3.4.0.CR1
package gradesTracker;
/**
 * RolesUsuarios generated by hbm2java
 */
public class RolesUsuarios implements java.io.Serializable {

	private RolesUsuariosId id;
	private Usuarios usuarios;
	private Roles roles;

	public RolesUsuarios() {
	}

	public RolesUsuarios(RolesUsuariosId id, Usuarios usuarios, Roles roles) {
		this.id = id;
		this.usuarios = usuarios;
		this.roles = roles;
	}

	public RolesUsuariosId getId() {
		return this.id;
	}

	public void setId(RolesUsuariosId id) {
		this.id = id;
	}

	public Usuarios getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}

	public Roles getRoles() {
		return this.roles;
	}

	public void setRoles(Roles roles) {
		this.roles = roles;
	}

}
