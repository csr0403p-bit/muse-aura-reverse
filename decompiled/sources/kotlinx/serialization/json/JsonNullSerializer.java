package kotlinx.serialization.json;

import X.C7384Etj;
import X.C9hr;
import X.C9i3;
import X.C9i9;
import X.C9iY;
import X.C9iZ;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import kotlinx.serialization.json.internal.JsonDecodingException;

/* loaded from: classes4.dex */
public final class JsonNullSerializer implements C9hr<JsonNull> {
    public static final JsonNullSerializer A01 = new JsonNullSerializer();
    public static final C9iZ A00 = C9iY.A03("kotlinx.serialization.json.JsonNull", C9i9.A00);

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9i3.A00(interfaceC07829iw);
        if (interfaceC07829iw.A8Y()) {
            throw new JsonDecodingException("Expected 'null' literal");
        }
        return JsonNull.A00;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        C7384Etj.A0Y(interfaceC07789is, 0);
        C9i3.A01(interfaceC07789is);
        interfaceC07789is.AAO();
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A00;
    }
}
