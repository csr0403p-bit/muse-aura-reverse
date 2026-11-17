package com.facebook.aura.user.repo;

import X.A64;
import X.AnonymousClass003;
import X.BNA;
import X.C07779iq;
import X.C0881AGi;
import X.C3cG;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes2.dex */
public final class LenientStringListSerializer implements C9hr<List<? extends String>> {
    public static final LenientStringListSerializer INSTANCE = new LenientStringListSerializer();
    public static final C9hr<List<String>> delegate;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public List<String> deserialize(InterfaceC07829iw interfaceC07829iw) {
        JsonArray jsonArray;
        JsonPrimitive jsonPrimitive;
        String strA00;
        BNA bna;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        JsonElement jsonElementA8V = null;
        if ((interfaceC07829iw instanceof BNA) && (bna = (BNA) interfaceC07829iw) != null) {
            jsonElementA8V = bna.A8V();
        }
        if (!(jsonElementA8V instanceof JsonArray) || (jsonArray = (JsonArray) jsonElementA8V) == null) {
            return C0881AGi.A00;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<JsonElement> it = jsonArray.iterator();
        while (it.hasNext()) {
            JsonElement next = it.next();
            if ((next instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) next) != null && jsonPrimitive.A01() && (strA00 = jsonPrimitive.A00()) != null) {
                arrayListA0h.add(strA00);
            }
        }
        return arrayListA0h;
    }

    static {
        A64 a64A19 = C3cG.A19(C07779iq.A01);
        delegate = a64A19;
        descriptor = a64A19.A00;
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public C9iZ getDescriptor() {
        return descriptor;
    }

    @Override // X.C9hv
    public void serialize(InterfaceC07789is interfaceC07789is, List<String> list) {
        AnonymousClass003.A0u(interfaceC07789is, list);
        delegate.serialize(interfaceC07789is, list);
    }
}
