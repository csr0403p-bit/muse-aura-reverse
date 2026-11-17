package com.facebook.aura.model;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cI;
import X.C5hV;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j4;
import X.C9j5;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.model.LocalMapWidgetDataSerializer;
import kotlin.Deprecated;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class LocalMapWidgetDataSerializer$Surrogate$$serializer implements C9cd<LocalMapWidgetDataSerializer.Surrogate> {
    public static final int $stable = 0;
    public static final LocalMapWidgetDataSerializer$Surrogate$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final LocalMapWidgetDataSerializer.Surrogate deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        String strA0v = null;
        JsonElement jsonElementA16 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new LocalMapWidgetDataSerializer.Surrogate(i, strA8f, strA0v, jsonElementA16, (C2hx) null);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                strA0v = C3cI.A0v(c9iZ, c9j4A55, 1);
                i |= 2;
            } else {
                if (iA8N != 2) {
                    throw C3cG.A17(iA8N);
                }
                jsonElementA16 = C3cI.A16(c9iZ, c9j4A55, 2);
                i |= 4;
            }
        }
    }

    static {
        LocalMapWidgetDataSerializer$Surrogate$$serializer localMapWidgetDataSerializer$Surrogate$$serializer = new LocalMapWidgetDataSerializer$Surrogate$$serializer();
        INSTANCE = localMapWidgetDataSerializer$Surrogate$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.model.LocalMapWidgetDataSerializer.Surrogate", localMapWidgetDataSerializer$Surrogate$$serializer, 3);
        c9iKA1C.A08("html", true);
        c9iKA1C.A08("path", true);
        c9iKA1C.A08("scene", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return C3cG.A1b(JsonElementSerializer.A00, c07779iq, AbstractC07749im.A00(c07779iq));
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return descriptor;
    }

    @Override // X.C9cd
    public /* bridge */ C9hr<?>[] typeParametersSerializers() {
        return C5hV.A00;
    }

    @Override // X.C9hv
    public final void serialize(InterfaceC07789is interfaceC07789is, LocalMapWidgetDataSerializer.Surrogate surrogate) {
        AnonymousClass003.A0u(interfaceC07789is, surrogate);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        LocalMapWidgetDataSerializer.Surrogate.write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(surrogate, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
