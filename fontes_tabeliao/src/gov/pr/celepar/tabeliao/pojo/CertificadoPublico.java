package gov.pr.celepar.tabeliao.pojo;
// Generated 01/09/2006 13:27:07 by J-Querena using Hibernate Tools 3.1.0.beta5
/*
Este programa � licenciado de acordo com a 
LPG-AP (LICEN�A P�BLICA GERAL PARA PROGRAMAS DE COMPUTADOR DA ADMINISTRA��O P�BLICA), 
vers�o 1.1 ou qualquer vers�o posterior.
A LPG-AP deve acompanhar todas PUBLICA��ES, DISTRIBUI��ES e REPRODU��ES deste Programa.
Caso uma c�pia da LPG-AP n�o esteja dispon�vel junto com este Programa, 
voc� pode contatar o LICENCIANTE ou ent�o acessar diretamente:
http://www.celepar.pr.gov.br/licenca/LPG-AP.pdf
Para poder USAR, PUBLICAR, DISTRIBUIR, REPRODUZIR ou ALTERAR este Programa 
� preciso estar de acordo com os termos da LPG-AP
*/

import java.util.Date;

/**
 * Classe POJO para Certificado Publico
 * CertificadoPublico generated by hbm2java
 */
public class CertificadoPublico  implements java.io.Serializable {

    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = -4111334593069729924L;
	private long id;
     private CertificadoAc certificadoAc;
     private String numSerie;
     private String nome;
     private String email;
     private String dn;
     private Long idUsuSentinela;
     private Date dtValidadeIni;
     private Date dtValidadeFim;
     private Date dtInclusao;
     private boolean revogado;
     private byte[] arquivo;

     // Constructors

    /** default constructor */
    public CertificadoPublico() {
    }

	/**
	 * minimal constructor
	 * @param id
	 * @param certificadoAc
	 * @param numSerie
	 * @param nome
	 * @param email
	 * @param dn
	 * @param dtValidadeIni
	 * @param dtValidadeFim
	 * @param dtInclusao
	 * @param revogado
	 * @param arquivo
	 */
    public CertificadoPublico(long id, CertificadoAc certificadoAc, String numSerie, String nome, String email, String dn, Date dtValidadeIni, Date dtValidadeFim, Date dtInclusao, boolean revogado, byte[] arquivo) {
        this.id = id;
        this.certificadoAc = certificadoAc;
        this.numSerie = numSerie;
        this.nome = nome;
        this.email = email;
        this.dn = dn;
        this.dtValidadeIni = dtValidadeIni;
        this.dtValidadeFim = dtValidadeFim;
        this.dtInclusao = dtInclusao;
        this.revogado = revogado;
        this.arquivo = arquivo;
    }
    
    /**
     * full constructor
     * @param id
     * @param certificadoAc
     * @param numSerie
     * @param idUsuSentinela
     * @param nome
     * @param email
     * @param dn
     * @param dtValidadeIni
     * @param dtValidadeFim
     * @param dtInclusao
     * @param revogado
     * @param arquivo
     */
    public CertificadoPublico(long id, CertificadoAc certificadoAc, String numSerie, Long idUsuSentinela, String nome, String email, String dn, Date dtValidadeIni, Date dtValidadeFim, Date dtInclusao, boolean revogado, byte[] arquivo) {
       this.id = id;
       this.certificadoAc = certificadoAc;
       this.numSerie = numSerie;
       this.idUsuSentinela = idUsuSentinela;
       this.nome = nome;
       this.email = email;
       this.dn = dn;
       this.dtValidadeIni = dtValidadeIni;
       this.dtValidadeFim = dtValidadeFim;
       this.dtInclusao = dtInclusao;
       this.revogado = revogado;
       this.arquivo = arquivo;
    }
    
    /**
     * 
     * @return identificador unico
     */
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    /**
     * 
     * @return Certificado do Autoridade Certificadora
     */
    public CertificadoAc getCertificadoAc() {
        return this.certificadoAc;
    }
    
    public void setCertificadoAc(CertificadoAc certificadoAc) {
        this.certificadoAc = certificadoAc;
    }
    
    public String getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}
	
	/**
	 * 
	 * @return Id do usuario do certificado publico no Sentinela
	 */
	public Long getIdUsuSentinela() {
        return this.idUsuSentinela;
    }
    
    public void setIdUsuSentinela(Long idUsuSentinela) {
        this.idUsuSentinela = idUsuSentinela;
    }
    
    /**
     * 
     * @return Nome do titular do certificado
     */
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /**
     * 
     * @return Endereco de e-mail armazenado no Certificado
     */
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * 
     * @return Distinguished Name do certificado
     */
    public String getDn() {
        return this.dn;
    }
    
    public void setDn(String dn) {
        this.dn = dn;
    }
    
    /**
     * 
     * @return Data e hora do inicio da validade do certificado
     */
    public Date getDtValidadeIni() {
        return this.dtValidadeIni;
    }
    
    public void setDtValidadeIni(Date dtValidadeIni) {
        this.dtValidadeIni = dtValidadeIni;
    }
    /**
     * 
     * @return Data e hora do final da validade do certificado
     */
    public Date getDtValidadeFim() {
        return this.dtValidadeFim;
    }
    
    public void setDtValidadeFim(Date dtValidadeFim) {
        this.dtValidadeFim = dtValidadeFim;
    }
    
    /**
     * 
     * @return Data e hora da inclusao do certificado na base do Tabeliao
     */
    public Date getDtInclusao() {
        return this.dtInclusao;
    }
    
    public void setDtInclusao(Date dtInclusao) {
        this.dtInclusao = dtInclusao;
    }
    
    /**
     * 
     * @return true, se o certificado esta revogado
     */
    public boolean isRevogado() {
        return this.revogado;
    }
    
    public void setRevogado(boolean revogado) {
        this.revogado = revogado;
    }
    
    /**
     * 
     * @return conteudo do arquivo do certificado
     */
    public byte[] getArquivo() {
        return this.arquivo;
    }
    
    public void setArquivo(byte[] arquivo) {
        this.arquivo = arquivo;
    }
}


