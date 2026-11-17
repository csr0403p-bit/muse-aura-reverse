package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Serializable;

/* renamed from: X.Gn7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9985Gn7 extends AbstractC9930GlR implements Serializable {
    public static final long serialVersionUID = 1;
    public final int _parameterIndex;
    public final AbstractC9944Glx _valueInstantiator;

    /* JADX WARN: Incorrect types in method signature: (LX/Gnp;LX/Gmj;LX/GjI;LX/Gjl;Lcom/fasterxml/jackson/databind/JsonDeserializer<Ljava/lang/Object;>;LX/Gn8;LX/Glx;I)V */
    public C9985Gn7(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9870GjI abstractC9870GjI, JsonDeserializer jsonDeserializer, AbstractC9877Gjl abstractC9877Gjl, AbstractC9944Glx abstractC9944Glx, AbstractC9970Gmj abstractC9970Gmj, AbstractC9986Gn8 abstractC9986Gn8, int i) {
        super(interfaceC10017Gnp, abstractC9870GjI, jsonDeserializer, abstractC9877Gjl, abstractC9970Gmj, abstractC9986Gn8);
        Hqg.A00(abstractC9944Glx, "ValueInstantiator for MapParameterAnyProperty cannot be `null`");
        this._valueInstantiator = abstractC9944Glx;
        this._parameterIndex = i;
    }
}
