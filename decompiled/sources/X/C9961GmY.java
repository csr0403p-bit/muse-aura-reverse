package X;

import com.fasterxml.jackson.databind.JsonDeserializer;

/* renamed from: X.GmY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9961GmY extends AbstractC9915Gl5 {
    public static final long serialVersionUID = 1;
    public final C10035GoB _objectIdReader;

    public C9961GmY(C10034GoA c10034GoA, C10035GoB c10035GoB) {
        super(c10035GoB._idType, c10035GoB._deserializer, c10034GoA, c10035GoB.propertyName);
        this._objectIdReader = c10035GoB;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/GmY;Lcom/fasterxml/jackson/databind/JsonDeserializer<*>;LX/Gqa;)V */
    public C9961GmY(JsonDeserializer jsonDeserializer, InterfaceC10165Gqa interfaceC10165Gqa, C9961GmY c9961GmY) {
        super(jsonDeserializer, interfaceC10165Gqa, c9961GmY);
        this._objectIdReader = c9961GmY._objectIdReader;
    }

    public C9961GmY(C10009Gnh c10009Gnh, C9961GmY c9961GmY) {
        super(c10009Gnh, c9961GmY);
        this._objectIdReader = c9961GmY._objectIdReader;
    }
}
