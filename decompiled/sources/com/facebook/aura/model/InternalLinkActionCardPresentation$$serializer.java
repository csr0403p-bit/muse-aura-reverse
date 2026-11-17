package com.facebook.aura.model;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cI;
import X.C3cJ;
import X.C5hV;
import X.C60Q;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j4;
import X.C9j5;
import X.F0C;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class InternalLinkActionCardPresentation$$serializer implements C9cd<InternalLinkActionCardPresentation> {
    public static final int $stable = 0;
    public static final InternalLinkActionCardPresentation$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final InternalLinkActionCardPresentation deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = InternalLinkActionCardPresentation.$childSerializers;
        int i = 0;
        String str = null;
        List listA0P = null;
        String strA0m = null;
        List listA0P2 = null;
        String strA0n = null;
        String strA0l = null;
        String strA0w = null;
        String strA0j = null;
        String strA8f = null;
        String strA0f = null;
        String strA0o = null;
        boolean zA8G = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new InternalLinkActionCardPresentation(i, strA8f, strA0f, strA0j, strA0o, strA0l, strA0m, strA0n, listA0P, str, zA8G, strA0w, listA0P2, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0f = C3cI.A0f(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    strA0j = C3cI.A0j(c9iZ, c9j4A55);
                    i |= 4;
                    break;
                case 3:
                    strA0o = C60Q.A0o(c9iZ, c9j4A55);
                    i |= 8;
                    break;
                case 4:
                    strA0l = C3cI.A0l(c9iZ, c9j4A55);
                    i |= 16;
                    break;
                case 5:
                    strA0m = C3cI.A0m(c9iZ, c9j4A55);
                    i |= 32;
                    break;
                case 6:
                    strA0n = C3cI.A0n(c9iZ, c9j4A55);
                    i |= 64;
                    break;
                case 7:
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 7);
                    i |= 128;
                    break;
                case 8:
                    str = (String) C3cI.A0U(c9iZ, c9j4A55);
                    i |= 256;
                    break;
                case 9:
                    zA8G = c9j4A55.A8G(c9iZ, 9);
                    i |= 512;
                    break;
                case 10:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 10);
                    i |= 1024;
                    break;
                case 11:
                    listA0P2 = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 11);
                    i |= 2048;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        InternalLinkActionCardPresentation$$serializer internalLinkActionCardPresentation$$serializer = new InternalLinkActionCardPresentation$$serializer();
        INSTANCE = internalLinkActionCardPresentation$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.model.InternalLinkActionCardPresentation", internalLinkActionCardPresentation$$serializer, 12);
        c9iKA1C.A08("title", false);
        c9iKA1C.A08("subtitle", true);
        c9iKA1C.A08("imageUrl", true);
        c9iKA1C.A08("type", false);
        c9iKA1C.A08("connectorId", true);
        C3cI.A1N("scopeKey", c9iKA1C, true);
        c9iKA1C.A08("authProviders", true);
        c9iKA1C.A08("accountId", true);
        c9iKA1C.A08("walletSetup", true);
        c9iKA1C.A08("actionLabel", true);
        c9iKA1C.A08("walletSetupOptions", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = InternalLinkActionCardPresentation.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), C3cG.A16(f0cArr, 7), AbstractC07749im.A00(c07779iq), C07839ix.A00, AbstractC07749im.A00(c07779iq), C3cG.A16(f0cArr, 11)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, InternalLinkActionCardPresentation internalLinkActionCardPresentation) {
        AnonymousClass003.A0u(interfaceC07789is, internalLinkActionCardPresentation);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        InternalLinkActionCardPresentation.write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(internalLinkActionCardPresentation, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
