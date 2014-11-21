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
 * Classe POJO para Certificado Revogado
 * CertificadoRevogado generated by hbm2java
 */
public class CertificadoRevogado  implements java.io.Serializable {

    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = -8971583588461039082L;
	private long id;
     private CertificadoAc certificadoAc;
     private long versao;
     private String enderecoWeb;
     private boolean autoAtualizacao;
     private Date dtUltimaAtualizacao;
     private Date dtProximaAtualizacao;
     private Date dtInclusao;
     private byte[] arquivo;

     // Constructors

    /** default constructor */
    public CertificadoRevogado() {
    }

	/**
	 * minimal constructor
	 * @param id
	 * @param certificadoAc
	 * @param versao
	 * @param autoAtualizacao
	 * @param dtUltimaAtualizacao
	 * @param dtInclusao
	 * @param arquivo
	 */
    public CertificadoRevogado(long id, CertificadoAc certificadoAc, long versao, boolean autoAtualizacao, Date dtUltimaAtualizacao, Date dtInclusao, byte[] arquivo) {
        this.id = id;
        this.certificadoAc = certificadoAc;
        this.versao = versao;
        this.autoAtualizacao = autoAtualizacao;
        this.dtUltimaAtualizacao = dtUltimaAtualizacao;
        this.dtInclusao = dtInclusao;
        this.arquivo = arquivo;
    }

    /**
     * full constructor
     * @param id
     * @param certificadoAc
     * @param versao
     * @param enderecoWeb
     * @param autoAtualizacao
     * @param dtUltimaAtualizacao
     * @param dtProximaAtualizacao
     * @param dtInclusao
     * @param arquivo
     */
    public CertificadoRevogado(long id, CertificadoAc certificadoAc, long versao, String enderecoWeb, boolean autoAtualizacao, Date dtUltimaAtualizacao, Date dtProximaAtualizacao, Date dtInclusao, byte[] arquivo) {
       this.id = id;
       this.certificadoAc = certificadoAc;
       this.versao = versao;
       this.enderecoWeb = enderecoWeb;
       this.autoAtualizacao = autoAtualizacao;
       this.dtUltimaAtualizacao = dtUltimaAtualizacao;
       this.dtProximaAtualizacao = dtProximaAtualizacao;
       this.dtInclusao = dtInclusao;
       this.arquivo = arquivo;
    }
  
    /**
     * 
     * @return identificador unico na base.
     */
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    /**
     * 
     * @return Certificado da Autoridade Certificadora
     */
    public CertificadoAc getCertificadoAc() {
        return this.certificadoAc;
    }
    
    public void setCertificadoAc(CertificadoAc certificadoAc) {
        this.certificadoAc = certificadoAc;
    }
    
    public long getVersao() {
        return this.versao;
    }
    
    public void setVersao(long versao) {
        this.versao = versao;
    }
    /**
     * 
     * @return endereco WEB (dns) onde esta armazenada a LCR (lista de certificados Revogados)
     */
    public String getEnderecoWeb() {
        return this.enderecoWeb;
    }
    
    public void setEnderecoWeb(String enderecoWeb) {
        this.enderecoWeb = enderecoWeb;
    }
    
    /**
     * 
     * @return true, se faz atualizacao automatica
     */
    public boolean isAutoAtualizacao() {
        return this.autoAtualizacao;
    }
    
    public void setAutoAtualizacao(boolean autoAtualizacao) {
        this.autoAtualizacao = autoAtualizacao;
    }
    
    /**
     * 
     * @return Data e Hora da ultima atualizacao.
     */
    public Date getDtUltimaAtualizacao() {
        return this.dtUltimaAtualizacao;
    }
    
    public void setDtUltimaAtualizacao(Date dtUltimaAtualizacao) {
        this.dtUltimaAtualizacao = dtUltimaAtualizacao;
    }
    
    /**
     * 
     * @return data e hora da proxima atualizacao
     */
    public Date getDtProximaAtualizacao() {
        return this.dtProximaAtualizacao;
    }
    
    public void setDtProximaAtualizacao(Date dtProximaAtualizacao) {
        this.dtProximaAtualizacao = dtProximaAtualizacao;
    }
    
    /**
     * 
     * @return data e hora da inclusao da lista na base de dados do Tabeliao
     */
    public Date getDtInclusao() {
        return this.dtInclusao;
    }
    
    public void setDtInclusao(Date dtInclusao) {
        this.dtInclusao = dtInclusao;
    }
    
    /**
     * 
     * @return conteudo do arquivo da LCR (Lista de Certificados Revogados)
     */
    public byte[] getArquivo() {
        return this.arquivo;
    }
    
    public void setArquivo(byte[] arquivo) {
        this.arquivo = arquivo;
    }
}