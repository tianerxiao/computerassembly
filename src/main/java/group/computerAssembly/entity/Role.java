package group.computerAssembly.entity;

public class Role {
    private Integer roleId;

    private String roleName;

    private String roleIntro;

    public Role(Integer roleId, String roleName, String roleIntro) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleIntro = roleIntro;
    }

    public Role() {
        super();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleIntro() {
        return roleIntro;
    }

    public void setRoleIntro(String roleIntro) {
        this.roleIntro = roleIntro == null ? null : roleIntro.trim();
    }
}