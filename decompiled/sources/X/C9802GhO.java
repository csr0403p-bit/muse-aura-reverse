package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Serializable;

/* renamed from: X.GhO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9802GhO implements InterfaceC10165Gqa, Serializable {
    public static final long serialVersionUID = 1;
    public final JsonDeserializer<?> _deserializer;

    @Override // X.InterfaceC10165Gqa
    public final /* synthetic */ Object ACA(AbstractC9904Gkk abstractC9904Gkk) {
        return this._deserializer.A0m(abstractC9904Gkk);
    }

    @Override // X.InterfaceC10165Gqa
    public final Object AIA(AbstractC9904Gkk abstractC9904Gkk) {
        return this._deserializer.A0m(abstractC9904Gkk);
    }

    public C9802GhO(JsonDeserializer<?> jsonDeserializer) {
        this._deserializer = jsonDeserializer;
    }
}
