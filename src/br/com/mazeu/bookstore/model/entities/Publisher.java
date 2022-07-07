package br.com.mazeu.bookstore.model.entities;

public class Publisher {

    private String publisherName;
    private String publisherNumber;
    private String cnpj;

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getPublisherNumber() {
        return publisherNumber;
    }

    public void setPublisherNumber(String publisherNumber) {
        this.publisherNumber = publisherNumber;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
