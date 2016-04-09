import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("d36fa037-9712-42bb-abd5-74c60d3c74ae")
public interface MecanicaDoJogo {
    @objid ("75a3cd94-1695-4de1-aee7-22199e7fea99")
    void iniciarJogo();

    @objid ("c693dfd1-0b12-404c-8738-e38de5513bc1")
    int getTentativasRestantes();

    @objid ("43693be9-de76-492d-b651-63110554b770")
    float getPontuacao();

    @objid ("58902c73-82fe-4a33-95a8-3e89a2969c37")
    boolean getFimDeJogo();

    @objid ("f223fd83-7ac0-469c-bd51-6c09bdab94e8")
    boolean tentarPalavra(String palavra);

}
