create database ssambd;

/*Apagar tabelas*/
drop table if exists pes_pessoa;
drop table if exists pos_poscomp;
drop table if exists arm_area_mestrado;
drop table if exists ari_interesse;
drop table if exists alu_aluno;
drop table if exists crs_curso;
drop table if exists gra_graduacao;
drop table if exists adm_administrador;
drop table if exists apr_aprovados;
drop table if exists prof_profissional;

/*Depois que criar as tabelas,Incrementar tabelas*/
ALTER TABLE pes_pessoa  AUTO_INCREMENT = 10000;
ALTER TABLE pos_poscomp  AUTO_INCREMENT = 20000;
ALTER TABLE arm_area_mestrado  AUTO_INCREMENT = 1;
ALTER TABLE ari_interesse  AUTO_INCREMENT = 30000;
ALTER TABLE alu_aluno  AUTO_INCREMENT = 40000;
ALTER TABLE crs_curso  AUTO_INCREMENT = 50000;
ALTER TABLE gra_graduacao  AUTO_INCREMENT = 60000;
ALTER TABLE adm_administrador  AUTO_INCREMENT = 1;
ALTER TABLE prof_profissional  AUTO_INCREMENT = 70000;
ALTER TABLE apr_aprovados  AUTO_INCREMENT = 80000;
ALTER TABLE pesq_pesquisa  AUTO_INCREMENT = 90000;




create table pes_pessoa(
	pes_id_pessoa int auto_increment,
	pes_nome varchar(60) not null,
	pes_telefone1 varchar(11) not null,
	pes_telefone2 varchar(11) null,
	pes_email varchar(40) not null,
	pes_naturalidade varchar(40) not null,
	pes_estado        varchar(2) not null,
	pes_nacionalidade varchar(40) not null,
	pes_genero	char(1) not null,
	primary key(pes_id_pessoa)
)ENGINE= InnoDB;


create table pos_poscomp(
	pos_id_poscomp	int      auto_increment,
	pos_inscricao varchar(30) not null,
	pos_ano varchar(4) not null,
	pos_nota_matematica decimal (5,2) not null,
	pos_nota_fundamentos	decimal (5,2) not null,
	pos_nota_tecnologia	decimal (5,2) not null,
	primary key (pos_id_poscomp)
)ENGINE= InnoDB;


create table arm_area_mestrado(
	arm_id_area_mestrado int      auto_increment,
	arm_ds_area_mestrado varchar(50) not null,
	primary key(arm_id_area_mestrado)
)ENGINE = InnoDB;


create table ari_interesse(
	ari_id_area_interesse int auto_increment,
	ari_id_area1	int	not null,
	ari_id_area2	int	null,
	ari_id_area3	int	null,
	ari_id_area4	int	null,
	primary key (ari_id_area_interesse),
	FOREIGN KEY (ari_id_area1) REFERENCES arm_area_mestrado(arm_id_area_mestrado),
	FOREIGN KEY (ari_id_area2) REFERENCES arm_area_mestrado(arm_id_area_mestrado),
	FOREIGN KEY (ari_id_area3) REFERENCES arm_area_mestrado(arm_id_area_mestrado),
	FOREIGN KEY (ari_id_area4) REFERENCES arm_area_mestrado(arm_id_area_mestrado)
)ENGINE= InnoDB;


create table alu_aluno(
	alu_id_aluno    int      auto_increment ,
	alu_id_pessoa    int       not null ,
	alu_id_area_interesse int not null,
	alu_id_poscomp int	not null,
	alu_rg          varchar(11)       not null,
    alu_cpf           varchar(11)       not null,  
	alu_dt_nascimento    date, 
	alu_endereco           varchar(80)       not null,
	alu_bairro varchar(30) not null,
	alu_cep varchar(8) not null,
	alu_cidade varchar(40) not null,
	alu_estado	varchar(2) not null,
	alu_dedicacao char(1) not null,
	alu_horas_semanais decimal (2,1) not null,
	alu_necessidade_bolsa char(1) not null,
	primary key (alu_id_aluno),
	FOREIGN KEY (alu_id_pessoa) REFERENCES pes_pessoa(pes_id_pessoa),
	FOREIGN KEY (alu_id_area_interesse) REFERENCES ari_interesse(ari_id_area_interesse),
	FOREIGN KEY (alu_id_poscomp) REFERENCES pos_poscomp(pos_id_poscomp)
)ENGINE= InnoDB;


create table crs_curso(
crs_id_curso	int	auto_increment,
	crs_id_aluno	int not null,
	crs_nome	varchar(60)	not null,
	crs_instituicao varchar(50)	not null,
	crs_ano		varchar(4)	not null,
	crs_carga_horaria	decimal (5,2)	not null,
	crs_score decimal (5,2) not null,
	crs_img_historico	blob	not null,
	primary key (crs_id_curso),
	FOREIGN KEY (crs_id_aluno) REFERENCES alu_aluno(alu_id_aluno)
)ENGINE= InnoDB;


create table gra_graduacao(
	gra_id_graduacao int       auto_increment ,
	gra_id_aluno int       not null ,
	gra_ds_graducao varchar(60)	not null,
	gra_instituicao varchar(50)	not null,
	gra_cidade varchar(40)	not null,
	gra_estado        varchar(2) not null,
	gra_ano_ingresso  varchar(4) not null,
	gra_ano_conclusão varchar(4) not null,
	gra_score decimal (5,2) not null,
	gra_img_historico blob	not null,
	primary key (gra_id_graduacao),
	FOREIGN KEY (gra_id_aluno) REFERENCES alu_aluno(alu_id_aluno)
)ENGINE= InnoDB;


create table adm_administrador(
	adm_id_administrador	int       auto_increment ,
	adm_id_pessoa    int       not null ,
	adm_user          varchar(20)       not null,
	adm_password           varchar(8)       not null,
	primary key (adm_id_administrador),
	FOREIGN KEY (adm_id_pessoa) REFERENCES pes_pessoa(pes_id_pessoa)
)ENGINE= InnoDB;


create table apr_aprovados(
	apr_id_aprovado	int       auto_increment,
	apr_id_aluno    int       not null ,
	apr_score decimal (5,2) not null,
	apr_ano_selecao  varchar(4) not null,
	primary key (apr_id_aprovado),
	FOREIGN KEY (apr_id_aluno) REFERENCES alu_aluno(alu_id_aluno)
)ENGINE= InnoDB;


create table prof_profissional(
	prof_id_profissional int      auto_increment,
	prof_id_aluno int not null,
	prof_local varchar(40) null,
	prof_cargo varchar(30) null,
	prof_tempo char(1) not null,
	primary key (prof_id_profissional),
	FOREIGN KEY (prof_id_aluno) REFERENCES alu_aluno(alu_id_aluno)
)ENGINE= InnoDB;


create table pesq_pesquisa(
	pesq_id_pesquisa int      auto_increment,
	pesq_id_aluno int not null,
	pesq_link_lattes varchar(100) not null,
	pesq_publicacao char(1) not null,
	pesq_tempo char(1) not null,
	primary key (pesq_id_pesquisa),
	FOREIGN KEY (pesq_id_aluno) REFERENCES alu_aluno(alu_id_aluno)
)ENGINE= InnoDB;