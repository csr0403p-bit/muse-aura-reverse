package com.facebook.aura.gateway;

import X.AGH;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9tS;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes2.dex */
public final class LenientStringMapSerializer implements C9hr<Map<String, ? extends String>> {
    public static final int $stable = 0;
    public static final LenientStringMapSerializer INSTANCE = new LenientStringMapSerializer();
    public static final C9hr<Map<String, String>> delegate;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public Map<String, String> deserialize(InterfaceC07829iw interfaceC07829iw) {
        Map mapA0E;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        Object objA8b = interfaceC07829iw.A8b(JsonElementSerializer.A00);
        if (!(objA8b instanceof JsonObject) || (mapA0E = (JsonObject) objA8b) == null) {
            mapA0E = AGH.A0E();
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator itA0n = AnonymousClass002.A0n(mapA0E);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            Object key = entryA0l.getKey();
            String strStringOrNull = HatchAiIdentityHandlerJsonKt.stringOrNull((JsonElement) entryA0l.getValue());
            if (strStringOrNull != null) {
                AnonymousClass002.A1J(key, strStringOrNull, arrayListA0h);
            }
        }
        return AGH.A06(arrayListA0h);
    }

    static {
        C9tS c9tSA1A = C3cG.A1A();
        delegate = c9tSA1A;
        descriptor = c9tSA1A.A00;
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public C9iZ getDescriptor() {
        return descriptor;
    }

    @Override // X.C9hv
    public void serialize(InterfaceC07789is interfaceC07789is, Map<String, String> map) {
        AnonymousClass003.A0u(interfaceC07789is, map);
        interfaceC07789is.AAR(map, delegate);
    }
}
