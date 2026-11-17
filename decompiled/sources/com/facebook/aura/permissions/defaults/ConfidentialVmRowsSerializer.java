package com.facebook.aura.permissions.defaults;

import X.A64;
import X.AnonymousClass003;
import X.BNA;
import X.C0881AGi;
import X.C3cG;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9sU;
import X.F0C;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes2.dex */
public final class ConfidentialVmRowsSerializer implements C9hr<List<? extends ConfidentialVmSettingJson>> {
    public static final ConfidentialVmRowsSerializer INSTANCE = new ConfidentialVmRowsSerializer();
    public static final C9hr<List<ConfidentialVmSettingJson>> delegate;
    public static final C9iZ descriptor;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    @Override // X.C9jG
    public List<ConfidentialVmSettingJson> deserialize(InterfaceC07829iw interfaceC07829iw) {
        ?? A0h;
        Object objA01;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        BNA bna = interfaceC07829iw instanceof BNA ? (BNA) interfaceC07829iw : null;
        if (bna == null) {
            A0h = delegate.deserialize(interfaceC07829iw);
        } else {
            JsonElement jsonElementA8V = bna.A8V();
            JsonArray jsonArray = jsonElementA8V instanceof JsonArray ? (JsonArray) jsonElementA8V : null;
            if (jsonArray == null) {
                return C0881AGi.A00;
            }
            A0h = C3cG.A0h();
            Iterator<JsonElement> it = jsonArray.iterator();
            while (it.hasNext()) {
                JsonElement next = it.next();
                try {
                    C9sU c9sUAGk = bna.AGk();
                    F0C<C9hr<Object>>[] f0cArr = ConfidentialVmSettingJson.$childSerializers;
                    objA01 = c9sUAGk.A01(ConfidentialVmSettingJson$$serializer.INSTANCE, next);
                } catch (IllegalArgumentException unused) {
                    objA01 = null;
                }
                if (objA01 != null) {
                    A0h.add(objA01);
                }
            }
        }
        return (List) A0h;
    }

    static {
        F0C<C9hr<Object>>[] f0cArr = ConfidentialVmSettingJson.$childSerializers;
        ConfidentialVmSettingJson$$serializer confidentialVmSettingJson$$serializer = ConfidentialVmSettingJson$$serializer.INSTANCE;
        C7384Etj.A0Y(confidentialVmSettingJson$$serializer, 0);
        A64 a64A19 = C3cG.A19(confidentialVmSettingJson$$serializer);
        delegate = a64A19;
        descriptor = a64A19.A00;
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public C9iZ getDescriptor() {
        return descriptor;
    }

    @Override // X.C9hv
    public void serialize(InterfaceC07789is interfaceC07789is, List<ConfidentialVmSettingJson> list) {
        AnonymousClass003.A0u(interfaceC07789is, list);
        delegate.serialize(interfaceC07789is, list);
    }
}
