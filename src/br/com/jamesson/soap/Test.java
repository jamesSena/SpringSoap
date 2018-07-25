//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.07.24 às 06:01:28 PM BRT 
//


package br.com.jamesson.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de test complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="test">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="testId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="testname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="testCPF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="testRG" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "test", propOrder = {
    "testId",
    "testname",
    "testCPF",
    "testRG"
})
public class Test {

    protected int testId;
    @XmlElement(required = true)
    protected String testname;
    @XmlElement(required = true)
    protected String testCPF;
    @XmlElement(required = true)
    protected String testRG;

    /**
     * Obtém o valor da propriedade testId.
     * 
     */
    public int getTestId() {
        return testId;
    }

    /**
     * Define o valor da propriedade testId.
     * 
     */
    public void setTestId(int value) {
        this.testId = value;
    }

    /**
     * Obtém o valor da propriedade testname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestname() {
        return testname;
    }

    /**
     * Define o valor da propriedade testname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestname(String value) {
        this.testname = value;
    }

    /**
     * Obtém o valor da propriedade testCPF.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestCPF() {
        return testCPF;
    }

    /**
     * Define o valor da propriedade testCPF.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestCPF(String value) {
        this.testCPF = value;
    }

    /**
     * Obtém o valor da propriedade testRG.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestRG() {
        return testRG;
    }

    /**
     * Define o valor da propriedade testRG.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestRG(String value) {
        this.testRG = value;
    }

}
