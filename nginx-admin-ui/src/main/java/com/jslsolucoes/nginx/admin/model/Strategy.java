package com.jslsolucoes.nginx.admin.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.jslsolucoes.i18n.Messages;

@SuppressWarnings("serial")
@Entity
@Table(name = "strategy")
@SequenceGenerator(name = "strategy_sq", initialValue = 1, allocationSize = 1, sequenceName = "strategy_sq")
public class Strategy implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "strategy_sq")
	private Long id;

	@Column(name = "name")
	private String name;
	
	@Column(name = "description_key")
	private String descriptionKey;
	
	@Column(name = "directive")
	private String directive;

	public Strategy() {
		// default constructor
	}

	public Strategy(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return Messages.getString(descriptionKey);
	}

	public String getDirective() {
		return directive;
	}

	public void setDirective(String directive) {
		this.directive = directive;
	}

	public String getDescriptionKey() {
		return descriptionKey;
	}

	public void setDescriptionKey(String descriptionKey) {
		this.descriptionKey = descriptionKey;
	}
}
