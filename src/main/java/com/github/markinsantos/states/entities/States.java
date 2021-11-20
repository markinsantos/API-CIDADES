package com.github.markinsantos.states.entities;

import java.util.List;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;



import com.github.markinsantos.contries.entities.Country;

@Entity(name = "States")
@Table(name = "estado")

@TypeDefs({
    @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
})
public class States {

	@Id
	private Long id;

	@Column(name = "nome")
	private String name;

	private String uf;

	private Integer ibge;

	/*
	 * 1st
	 * 
	 * @Column(name = "pais") private Integer countryId;
	 */

	// 2nd - @ManyToOne
	@ManyToOne
	@JoinColumn(name = "pais", referencedColumnName = "id")
	private Country country;

	@Type(type = "jsonb")
	@Basic(fetch = FetchType.LAZY)
	@Column(name = "ddd", columnDefinition = "jsonb")
	private List<Integer> ddd;

	public States() {
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getUf() {
		return uf;
	}

	public Integer getIbge() {
		return ibge;
	}

	public List<Integer> getDdd() {
		return ddd;
	}

	public Country getCountry() {
		return country;
	}

	/*
	 * public Integer getCountryId() { return countryId; }
	 */

}
