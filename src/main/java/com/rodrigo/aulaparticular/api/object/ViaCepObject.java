package com.rodrigo.aulaparticular.api.object;




public class ViaCepObject {

    private String logradouro;

    private String cep;

    private String bairro;

    private String localidade;

    private String uf;

    private Integer numero;

    private String complemento;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;

    public ViaCepObject() {
    }

    public ViaCepObject(String logradouro, String cep, String bairro, String localidade, String uf, Integer numero, String complemento, String ibge, String gia, String ddd, String siafi) {
        this.logradouro = logradouro;
        this.cep = cep;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
        this.numero = numero;
        this.complemento = complemento;
        this.ibge = ibge;
        this.gia = gia;
        this.ddd = ddd;
        this.siafi = siafi;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getlocalidade() {
        return localidade;
    }

    public void setlocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Integer getnumero() {
        return numero;
    }

    public void setnumero(Integer numero) {
        this.numero = numero;
    }

    public String getcomplemento() {
        return complemento;
    }

    public void setcomplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getIbge() {
        return ibge;
    }

    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getSiafi() {
        return siafi;
    }

    public void setSiafi(String siafi) {
        this.siafi = siafi;
    }

    @Override
    public String toString() {
        return "ViaCepObject{" +
                "logradouro='" + logradouro + '\'' +
                ", cep='" + cep + '\'' +
                ", bairro='" + bairro + '\'' +
                ", localidade='" + localidade + '\'' +
                ", uf='" + uf + '\'' +
                ", numero=" + numero +
                ", complemento='" + complemento + '\'' +
                ", ibge='" + ibge + '\'' +
                ", gia='" + gia + '\'' +
                ", ddd='" + ddd + '\'' +
                ", siafi='" + siafi + '\'' +
                '}';
    }
}
