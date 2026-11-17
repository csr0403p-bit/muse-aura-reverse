package com.facebook.aura.gateway;

import X.C3cG;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

/* loaded from: classes2.dex */
public final class LenientStringSerializer implements C9hr<String> {
    public static final int $stable = 0;
    public static final LenientStringSerializer INSTANCE = new LenientStringSerializer();
    public static final C9iZ descriptor = C3cG.A15().getDescriptor();

    @Override // X.C9jG
    public String deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        return HatchAiIdentityHandlerJsonKt.stringOrNull((JsonElement) interfaceC07829iw.A8b(JsonElementSerializer.A00));
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public C9iZ getDescriptor() {
        return descriptor;
    }

    @Override // X.C9hv
    public void serialize(InterfaceC07789is interfaceC07789is, String str) {
        C7384Etj.A0Y(interfaceC07789is, 0);
        interfaceC07789is.AAR(str, C3cG.A15());
    }
}
