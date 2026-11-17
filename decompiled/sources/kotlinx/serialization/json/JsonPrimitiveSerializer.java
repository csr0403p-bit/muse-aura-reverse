package kotlinx.serialization.json;

import X.C07669ib;
import X.C60O;
import X.C7384Etj;
import X.C8j5;
import X.C9hr;
import X.C9i3;
import X.C9iY;
import X.C9iZ;
import X.C9rA;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;

/* loaded from: classes4.dex */
public final class JsonPrimitiveSerializer implements C9hr<JsonPrimitive> {
    public static final JsonPrimitiveSerializer A01 = new JsonPrimitiveSerializer();
    public static final C9iZ A00 = C9iY.A03("kotlinx.serialization.json.JsonPrimitive", C07669ib.A00);

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        JsonElement jsonElementA8V = C9i3.A00(interfaceC07829iw).A8V();
        if (jsonElementA8V instanceof JsonPrimitive) {
            return jsonElementA8V;
        }
        StringBuilder sbA0x = C60O.A0x("Unexpected JSON element, expected JsonPrimitive, had ");
        C8j5.A0o(sbA0x, jsonElementA8V);
        throw C9rA.A03(jsonElementA8V, sbA0x.toString());
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        C7384Etj.A0Y(interfaceC07789is, 0);
        C7384Etj.A0Y(obj, 1);
        C9i3.A01(interfaceC07789is);
        if (!(obj instanceof JsonNull)) {
            interfaceC07789is.AAR(obj, JsonLiteralSerializer.A01);
        } else {
            interfaceC07789is.AAR(JsonNull.A00, JsonNullSerializer.A01);
        }
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A00;
    }
}
