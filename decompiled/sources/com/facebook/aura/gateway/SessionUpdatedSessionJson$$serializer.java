package com.facebook.aura.gateway;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C5hV;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j1;
import X.C9j4;
import X.C9j5;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class SessionUpdatedSessionJson$$serializer implements C9cd<SessionUpdatedSessionJson> {
    public static final int $stable = 0;
    public static final SessionUpdatedSessionJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final SessionUpdatedSessionJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        int i;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        int i2 = 0;
        String strA0g = null;
        Long l = null;
        Long l2 = null;
        String strA0f = null;
        String strA0f2 = null;
        String strA0s = null;
        Long l3 = null;
        Long l4 = null;
        Long l5 = null;
        String strA8f = null;
        Long lA0P = null;
        String strA8f2 = null;
        boolean zA8G = false;
        boolean zA8G2 = false;
        int iA8U = 0;
        boolean zA8G3 = false;
        boolean zA8G4 = false;
        boolean zA8G5 = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new SessionUpdatedSessionJson(i2, strA8f, lA0P, l2, l, l4, l5, l3, strA8f2, zA8G, zA8G4, zA8G3, iA8U, strA0s, zA8G5, strA0f2, strA0g, strA0f, zA8G2, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    lA0P = C3cI.A0P(c9iZ, c9j4A55, 1);
                    i2 |= 2;
                    continue;
                case 2:
                    l2 = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 2);
                    i2 |= 4;
                    continue;
                case 3:
                    l = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 3);
                    i2 |= 8;
                    continue;
                case 4:
                    l4 = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    l5 = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    l3 = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    strA8f2 = c9j4A55.A8f(c9iZ, 7);
                    i2 |= 128;
                    continue;
                case 8:
                    zA8G = c9j4A55.A8G(c9iZ, 8);
                    i2 |= 256;
                    continue;
                case 9:
                    zA8G4 = c9j4A55.A8G(c9iZ, 9);
                    i2 |= 512;
                    continue;
                case 10:
                    zA8G3 = c9j4A55.A8G(c9iZ, 10);
                    i2 |= 1024;
                    continue;
                case 11:
                    iA8U = c9j4A55.A8U(c9iZ, 11);
                    i2 |= 2048;
                    continue;
                case 12:
                    strA0s = C3cI.A0s(c9iZ, c9j4A55);
                    i2 |= 4096;
                    continue;
                case 13:
                    zA8G5 = c9j4A55.A8G(c9iZ, 13);
                    i2 |= 8192;
                    continue;
                case 14:
                    strA0f2 = C3cH.A0f(C07779iq.A01, c9iZ, c9j4A55, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    strA0g = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 15);
                    i = 32768;
                    break;
                case 16:
                    strA0f = C3cH.A0f(C07779iq.A01, c9iZ, c9j4A55, 16);
                    i = 65536;
                    break;
                case 17:
                    zA8G2 = c9j4A55.A8G(c9iZ, 17);
                    i = 131072;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
            i2 |= i;
        }
    }

    static {
        SessionUpdatedSessionJson$$serializer sessionUpdatedSessionJson$$serializer = new SessionUpdatedSessionJson$$serializer();
        INSTANCE = sessionUpdatedSessionJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.gateway.SessionUpdatedSessionJson", sessionUpdatedSessionJson$$serializer, 18);
        c9iKA1C.A08("session_id", true);
        c9iKA1C.A08("created_at_ms", true);
        c9iKA1C.A08("created_at", true);
        c9iKA1C.A08("createdAt", true);
        c9iKA1C.A08("updated_at_ms", true);
        c9iKA1C.A08("updated_at", true);
        C3cH.A1H("updatedAt", c9iKA1C, true);
        c9iKA1C.A08("archived", true);
        c9iKA1C.A08("pinned", true);
        c9iKA1C.A08("is_pinned", true);
        c9iKA1C.A08("unread_count", true);
        c9iKA1C.A08("snippet", true);
        C3cH.A1G("is_thread", c9iKA1C, true);
        c9iKA1C.A08("channel", true);
        c9iKA1C.A08("account_username", true);
        c9iKA1C.A08("can_send_messages", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C9j1 c9j1 = C9j1.A00;
        C9hr c9hrA00 = AbstractC07749im.A00(c9j1);
        C9hr c9hrA002 = AbstractC07749im.A00(c9j1);
        C9hr c9hrA003 = AbstractC07749im.A00(c9j1);
        C9hr c9hrA004 = AbstractC07749im.A00(c9j1);
        C9hr c9hrA005 = AbstractC07749im.A00(c9j1);
        C9hr c9hrA006 = AbstractC07749im.A00(c9j1);
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c07779iq, c9hrA00, c9hrA002, c9hrA003, c9hrA004, c9hrA005, c9hrA006, c07779iq, c07839ix, c07839ix, c07839ix, C07729ii.A00, AbstractC07749im.A00(c07779iq), c07839ix, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), c07839ix};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, SessionUpdatedSessionJson sessionUpdatedSessionJson) {
        AnonymousClass003.A0u(interfaceC07789is, sessionUpdatedSessionJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        SessionUpdatedSessionJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(sessionUpdatedSessionJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
