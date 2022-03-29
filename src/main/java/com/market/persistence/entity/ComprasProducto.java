package com.market.persistence.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "compras_producto")
public class ComprasProducto {
    @EmbeddedId
    private ComprasProductoPk id;

    private Long cantidad;
    private BigDecimal total;
    private Boolean estado;

    public ComprasProductoPk getId() {
        return id;
    }

    public void setId(ComprasProductoPk id) {
        this.id = id;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
