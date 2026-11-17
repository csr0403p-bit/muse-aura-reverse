package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Serializable;

/* renamed from: X.Gmh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9969Gmh extends AbstractC9930GlR implements Serializable {
    public static final long serialVersionUID = 1;
    public final C9808GhY _nodeFactory;
    public final int _parameterIndex;

    /* JADX WARN: Incorrect types in method signature: (LX/Gnp;LX/Gmj;LX/GjI;Lcom/fasterxml/jackson/databind/JsonDeserializer<Ljava/lang/Object;>;LX/GhY;I)V */
    public C9969Gmh(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9870GjI abstractC9870GjI, JsonDeserializer jsonDeserializer, AbstractC9970Gmj abstractC9970Gmj, C9808GhY c9808GhY, int i) {
        super(interfaceC10017Gnp, abstractC9870GjI, jsonDeserializer, null, abstractC9970Gmj, null);
        this._nodeFactory = c9808GhY;
        this._parameterIndex = i;
    }
}
