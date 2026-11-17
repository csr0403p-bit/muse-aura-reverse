package kotlinx.serialization.json;

import X.C2276BSc;
import X.C7384Etj;
import X.C9hr;
import X.C9hv;
import X.C9hy;
import X.C9i3;
import X.C9iY;
import X.C9iZ;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes4.dex */
public final class JsonElementSerializer implements C9hr<JsonElement> {
    public static final JsonElementSerializer A00 = new JsonElementSerializer();
    public static final C9iZ A01 = C9iY.A02("kotlinx.serialization.json.JsonElement", new C2276BSc(46), C9hy.A00);

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        return C9i3.A00(interfaceC07829iw).A8V();
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        C9hv c9hv;
        C7384Etj.A0Y(interfaceC07789is, 0);
        C7384Etj.A0Y(obj, 1);
        C9i3.A01(interfaceC07789is);
        if (obj instanceof JsonPrimitive) {
            c9hv = JsonPrimitiveSerializer.A01;
        } else if (obj instanceof JsonObject) {
            c9hv = JsonObjectSerializer.A01;
        } else {
            if (!(obj instanceof JsonArray)) {
                throw new NoWhenBranchMatchedException();
            }
            c9hv = JsonArraySerializer.A01;
        }
        interfaceC07789is.AAR(obj, c9hv);
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }
}
