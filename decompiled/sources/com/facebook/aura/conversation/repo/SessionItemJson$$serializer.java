package com.facebook.aura.conversation.repo;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
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
public final /* synthetic */ class SessionItemJson$$serializer implements C9cd<SessionItemJson> {
    public static final SessionItemJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final SessionItemJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        long jA8X = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String strA8f2 = null;
        long jA8X2 = 0;
        int i = 0;
        boolean zA8G = false;
        boolean zA8G2 = false;
        boolean zA8G3 = false;
        boolean zA8G4 = false;
        int iA8U = 0;
        boolean zA8G5 = false;
        boolean zA8G6 = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new SessionItemJson(i, strA8f, jA8X, jA8X2, strA8f2, str2, zA8G5, str, iA8U, zA8G6, zA8G4, zA8G3, zA8G2, str4, str3, zA8G, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    jA8X = c9j4A55.A8X(c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    jA8X2 = c9j4A55.A8X(c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    strA8f2 = c9j4A55.A8f(c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    zA8G5 = c9j4A55.A8G(c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    str = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    iA8U = c9j4A55.A8U(c9iZ, 7);
                    i |= 128;
                    break;
                case 8:
                    zA8G6 = c9j4A55.A8G(c9iZ, 8);
                    i |= 256;
                    break;
                case 9:
                    zA8G4 = c9j4A55.A8G(c9iZ, 9);
                    i |= 512;
                    break;
                case 10:
                    zA8G3 = c9j4A55.A8G(c9iZ, 10);
                    i |= 1024;
                    break;
                case 11:
                    zA8G2 = c9j4A55.A8G(c9iZ, 11);
                    i |= 2048;
                    break;
                case 12:
                    str4 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 12);
                    i |= 4096;
                    break;
                case 13:
                    str3 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 13);
                    i |= 8192;
                    break;
                case 14:
                    zA8G = c9j4A55.A8G(c9iZ, 14);
                    i |= 16384;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        SessionItemJson$$serializer sessionItemJson$$serializer = new SessionItemJson$$serializer();
        INSTANCE = sessionItemJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.conversation.repo.SessionItemJson", sessionItemJson$$serializer, 15);
        c9iKA1C.A08("session_id", true);
        c9iKA1C.A08("created_at_ms", true);
        C3cH.A1H("updated_at_ms", c9iKA1C, true);
        c9iKA1C.A08("snippet", true);
        C3cH.A1G("is_thread", c9iKA1C, true);
        c9iKA1C.A08("unread_count", true);
        c9iKA1C.A08("archived", true);
        c9iKA1C.A08("pinned", true);
        c9iKA1C.A08("is_pinned", true);
        c9iKA1C.A08("is_primary", true);
        c9iKA1C.A08("channel", true);
        c9iKA1C.A08("account_username", true);
        c9iKA1C.A08("can_send_messages", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C9j1 c9j1 = C9j1.A00;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c07779iq, c9j1, c9j1, c07779iq, c9hrA00, c07839ix, AbstractC07749im.A00(c07779iq), C07729ii.A00, c07839ix, c07839ix, c07839ix, c07839ix, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), c07839ix};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, SessionItemJson sessionItemJson) {
        AnonymousClass003.A0u(interfaceC07789is, sessionItemJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        SessionItemJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_conversation_repo_repo(sessionItemJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
