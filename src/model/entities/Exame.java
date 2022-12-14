package model.entities;

import java.io.Serializable;

public class Exame implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String descricao;
    private String metodo;

    private Integer tipoExameId;
    private Integer materialExameId;

    public Exame() {
    }

    public Exame(Integer id, String descricao, String metodo, Integer tipoExameId, Integer materialExameId) {
        this.id = id;
        this.descricao = descricao;
        this.metodo = metodo;
        this.tipoExameId = tipoExameId;
        this.materialExameId = materialExameId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public Integer getTipoExameId() {
        return tipoExameId;
    }

    public void setTipoExameId(Integer tipoExameId) {
        this.tipoExameId = tipoExameId;
    }

    public Integer getMaterialExameId() {
        return materialExameId;
    }

    public void setMaterialExameId(Integer materialExameId) {
        this.materialExameId = materialExameId;
    }

    @Override
    public String toString() {
        return "Exame [id=" + id + ", descricao=" + descricao + ", metodo=" + metodo + ", tipoExameId=" + tipoExameId
                + ", materialExameId=" + materialExameId + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Exame other = (Exame) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    

    
    
}
