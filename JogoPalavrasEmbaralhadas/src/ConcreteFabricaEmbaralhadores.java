import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("5b7b9293-1fcf-43d4-9a08-ca0c69006386")
public class ConcreteFabricaEmbaralhadores implements FabricaEmbaralhadores {
    @objid ("9bf3f66f-45f4-449a-ace4-2f195780738c")
    public EmbaralharComLetras embaralharComLetras;

    @objid ("23e107aa-e24a-449f-aa35-4288c57d99dd")
    public EmbaralharComNumero embaralharComNumero;

    @objid ("0ea81cce-49dc-4106-a1ca-c97c93a51977")
    public Embaralhador criarEmbaralhador(TipoEmbaralhador tipoEmbaralhador) {
    }

}
