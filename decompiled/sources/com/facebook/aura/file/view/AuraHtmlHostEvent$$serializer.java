package com.facebook.aura.file.view;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cI;
import X.C5hV;
import X.C60P;
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
import com.facebook.aura.bloks.data.AuraBloksDataProps;
import kotlin.Deprecated;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class AuraHtmlHostEvent$$serializer implements C9cd<AuraHtmlHostEvent> {
    public static final int $stable = 0;
    public static final AuraHtmlHostEvent$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final AuraHtmlHostEvent deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        String strA0v = null;
        String strA0v2 = null;
        JsonElement jsonElementA16 = null;
        JsonElement jsonElementA162 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new AuraHtmlHostEvent(i, strA8f, strA0v, strA0v2, jsonElementA16, jsonElementA162, (C2hx) null);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                strA0v = C3cI.A0v(c9iZ, c9j4A55, 1);
                i |= 2;
            } else if (iA8N == 2) {
                strA0v2 = C3cI.A0v(c9iZ, c9j4A55, 2);
                i |= 4;
            } else if (iA8N == 3) {
                jsonElementA16 = C3cI.A16(c9iZ, c9j4A55, 3);
                i |= 8;
            } else {
                if (iA8N != 4) {
                    throw C3cG.A17(iA8N);
                }
                jsonElementA162 = C3cI.A16(c9iZ, c9j4A55, 4);
                i |= 16;
            }
        }
    }

    static {
        AuraHtmlHostEvent$$serializer auraHtmlHostEvent$$serializer = new AuraHtmlHostEvent$$serializer();
        INSTANCE = auraHtmlHostEvent$$serializer;
        C9iK c9iKA1T = C60P.A1T("com.facebook.aura.file.view.AuraHtmlHostEvent", auraHtmlHostEvent$$serializer, 5);
        c9iKA1T.A08("action", true);
        c9iKA1T.A08("target", true);
        c9iKA1T.A08("payload", true);
        c9iKA1T.A08(AuraBloksDataProps.PARAMS, true);
        descriptor = c9iKA1T;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA002 = AbstractC07749im.A00(c07779iq);
        JsonElementSerializer jsonElementSerializer = JsonElementSerializer.A00;
        return C3cI.A1b(jsonElementSerializer, c07779iq, c9hrA00, c9hrA002, AbstractC07749im.A00(jsonElementSerializer));
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
    public final void serialize(InterfaceC07789is interfaceC07789is, AuraHtmlHostEvent auraHtmlHostEvent) {
        AnonymousClass003.A0u(interfaceC07789is, auraHtmlHostEvent);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        AuraHtmlHostEvent.write$Self$fbandroid_express_aura_java_com_facebook_aura_file_view_view(auraHtmlHostEvent, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
