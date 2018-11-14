package com.oesia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "tb_nodo_pe")
public class Pe {
	
	@Column(name = "ip_pe")
    String ip_pe;
	@Column(name = "nombre_pe")
    String nombre_pe;

}
