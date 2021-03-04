
/**
 * Enumeration class Size - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum Size {
/**
*Enumerado Small com os seus atributos
 */
 SMALL(32, 36, "Pequeno",'S'),
 /**
*Enumerado Medium com os seus atributos
 */
 MEDIUM(37, 44, "Médio",'M'),
 /**
*Enumerado Large com os seus atributos
 */
 LARGE(45, 52, "Grande",'L');
 private final String description;
 private final int minValue;
 private final int maxValue;
 private final char code;
/**
 * Dependendo do enumerado irá alteralo com as informações obtidas anteriormente
 */
 private Size(int minValue, int maxValue, String description, char code){
 this.description=description;
 this.minValue=minValue;
 this.maxValue=maxValue;
 this.code=code;
 }
 @Override
 /**
 *Metodo to string da descrição
 */
 public String toString() {
 return this.description;
 }
  /**
 *Metodo getter da descrição
 *irá dar return a descrição do Enum
 */
 public String getDescription() {
 return description;
 }
   /**
 *Metodo getter do Valor Minimo
 *irá dar return do Valor Minimo
 */
 public int getMinValue() {
 return minValue;
 }
    /**
 *Metodo getter do Valor Maximo
 *irá dar return do Valor Maximo
 */
 public int getMaxValue() {
 return maxValue;
 }
     /**
 *Metodo getter do Codigo
 *irá dar return do VCodigo
 */
 public char getCode() {
 return code;
 }
}