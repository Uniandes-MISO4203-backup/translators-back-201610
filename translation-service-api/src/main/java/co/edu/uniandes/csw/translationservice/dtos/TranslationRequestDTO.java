package co.edu.uniandes.csw.translationservice.dtos;

import javax.xml.bind.annotation.XmlRootElement;
import uk.co.jemos.podam.common.PodamExclude;

/**
 * @generated
 */
@XmlRootElement
public class TranslationRequestDTO extends RequestDTO {

    @PodamExclude
    private LanguageDTO originalLanguage;
    @PodamExclude
    private LanguageDTO targetLanguage;
    @PodamExclude
    private String description;
    @PodamExclude
    private String contexto;
    @PodamExclude
    private int numberOfWords;

    /**
     * @generated
     */
    public LanguageDTO getOriginalLanguage() {
        return originalLanguage;
    }

    /**
     * @generated
     */
    public void setOriginalLanguage(LanguageDTO originallanguage) {
        this.originalLanguage = originallanguage;
    }

    /**
     * @generated
     */
    public LanguageDTO getTargetLanguage() {
        return targetLanguage;
    }

    /**
     * @generated
     */
    public void setTargetLanguage(LanguageDTO targetlanguage) {
        this.targetLanguage = targetlanguage;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * @return the contexto
     */
    public String getContexto() {
        return contexto;
    }

    /**
     * @param contexto the contexto to set
     */
    public void setContexto(String contexto) {
        this.contexto = contexto;
    }

    public int getNumberOfWords() {
        return numberOfWords;
    }

    public void setNumberOfWords(int numberOfWords) {
        this.numberOfWords = numberOfWords;
    }
    
}
