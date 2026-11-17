package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Serializable;

/* renamed from: X.GoB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10035GoB implements Serializable {
    public static final long serialVersionUID = 1;
    public final JsonDeserializer<Object> _deserializer;
    public final AbstractC9870GjI _idType;
    public final AbstractC9848Gir<?> generator;
    public final AbstractC9915Gl5 idProperty;
    public final C10009Gnh propertyName;
    public final InterfaceC9851Giv resolver;

    /* JADX WARN: Incorrect types in method signature: (LX/GjI;LX/Gnh;LX/Gir<*>;Lcom/fasterxml/jackson/databind/JsonDeserializer<*>;LX/Gl5;LX/Giv;)V */
    public C10035GoB(AbstractC9848Gir abstractC9848Gir, InterfaceC9851Giv interfaceC9851Giv, AbstractC9870GjI abstractC9870GjI, JsonDeserializer jsonDeserializer, C10009Gnh c10009Gnh, AbstractC9915Gl5 abstractC9915Gl5) {
        this._idType = abstractC9870GjI;
        this.propertyName = c10009Gnh;
        this.generator = abstractC9848Gir;
        this.resolver = interfaceC9851Giv;
        this._deserializer = jsonDeserializer;
        this.idProperty = abstractC9915Gl5;
    }
}
