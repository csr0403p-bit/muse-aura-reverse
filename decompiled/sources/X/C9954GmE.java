package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.Serializable;

/* renamed from: X.GmE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9954GmE extends AbstractC9930GlR implements Serializable {
    public static final long serialVersionUID = 1;
    public final C9808GhY _nodeFactory;

    /* JADX WARN: Incorrect types in method signature: (LX/Gnp;LX/Gmj;LX/GjI;Lcom/fasterxml/jackson/databind/JsonDeserializer<Ljava/lang/Object;>;LX/GhY;)V */
    public C9954GmE(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9870GjI abstractC9870GjI, JsonDeserializer jsonDeserializer, AbstractC9970Gmj abstractC9970Gmj, C9808GhY c9808GhY) {
        super(interfaceC10017Gnp, abstractC9870GjI, jsonDeserializer, null, abstractC9970Gmj, null);
        this._nodeFactory = c9808GhY;
    }

    public static final void A00(AbstractC9804GhQ abstractC9804GhQ, C9954GmE c9954GmE, Object obj, String str) throws IllegalAccessException, JsonMappingException, IllegalArgumentException {
        C9809Ghf c9809Ghf;
        C9943Glv c9943Glv = (C9943Glv) c9954GmE._setter;
        Object objA0D = c9943Glv.A0D(obj);
        if (objA0D == null) {
            c9809Ghf = new C9809Ghf(c9954GmE._nodeFactory);
            c9943Glv.A0G(obj, c9809Ghf);
        } else {
            if (!(objA0D instanceof C9809Ghf)) {
                throw new JsonMappingException(null, String.format("Value \"any-setter\" '%s' not `ObjectNode` but %s", c9954GmE._property.getName(), AbstractC9855Gj3.A06(objA0D.getClass())));
            }
            c9809Ghf = (C9809Ghf) objA0D;
        }
        if (abstractC9804GhQ == null) {
            abstractC9804GhQ = Gh1.A00;
        }
        c9809Ghf._children.put(str, abstractC9804GhQ);
    }
}
