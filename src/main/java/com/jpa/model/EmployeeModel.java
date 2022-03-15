package com.jpa.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity(name = "employee")
public class EmployeeModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String adresse;
private int age;
@Column(unique = true)
private String email;

private String mdp;
@Column(nullable = false)
private String nom;
@Column(nullable = false)
private String prenom;
private String recrutement;
private String tel;
private float salaire;
private String login;
private String description;



public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

public String getMdp() {
	return mdp;
}
public void setMdp(String mdp) {
	this.mdp = mdp;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getRecrutement() {
	return recrutement;
}
public void setRecrutement(String recrutement) {
	this.recrutement = recrutement;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
public float getSalaire() {
	return salaire;
}
public void setSalaire(float salaire) {
	this.salaire = salaire;
}
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
@Override
public String toString() {
	return "EmployeeModel [id=" + id + ", adresse=" + adresse + ", age=" + age + ", email=" + email + ", mdp=" + mdp
			+ ", nom=" + nom + ", prenom=" + prenom + ", recrutement=" + recrutement + ", tel=" + tel + ", salaire="
			+ salaire + ", login=" + login + ", description=" + description + "]";
}
public EmployeeModel(int id, String adresse, int age, String email, String mdp, String nom, String prenom,
		String recrutement, String tel, float salaire, String login, String description) {
	this.id = id;
	this.adresse = adresse;
	this.age = age;
	this.email = email;
	this.mdp = mdp;
	this.nom = nom;
	this.prenom = prenom;
	this.recrutement = recrutement;
	this.tel = tel;
	this.salaire = salaire;
	this.login = login;
	this.description = description;
}




public EmployeeModel(String adresse, int age, String email, String mdp, String nom, String prenom, String recrutement,
		String tel, float salaire, String login, String description) {
	super();
	this.adresse = adresse;
	this.age = age;
	this.email = email;
	this.mdp = mdp;
	this.nom = nom;
	this.prenom = prenom;
	this.recrutement = recrutement;
	this.tel = tel;
	this.salaire = salaire;
	this.login = login;
	this.description = description;
}
public EmployeeModel() {

}



}


