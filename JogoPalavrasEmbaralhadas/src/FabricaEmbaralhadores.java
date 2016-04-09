import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("9c08a675-76aa-4c4b-b500-a96415463c57")
public interface FabricaEmbaralhadores {
    @mdl.propgetter
    FabricaEmbaralhadores get();

    @mdl.propsetter
    void set(FabricaEmbaralhadores value);

    @objid ("512f0e2b-cd2f-45df-ad88-9d35ef0e482f")
    Embaralhador criarEmbaralhador(TipoEmbaralhador tipoEmbaralhador);

}
