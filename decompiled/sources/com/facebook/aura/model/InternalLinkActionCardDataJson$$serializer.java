package com.facebook.aura.model;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C5hV;
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
public final /* synthetic */ class InternalLinkActionCardDataJson$$serializer implements C9cd<InternalLinkActionCardDataJson> {
    public static final int $stable = 0;
    public static final InternalLinkActionCardDataJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final InternalLinkActionCardDataJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = InternalLinkActionCardDataJson.$childSerializers;
        C2hx c2hx = null;
        String strA0w = null;
        List listA0P = null;
        String strA0l = null;
        List listA0P2 = null;
        String strA0w2 = null;
        String strA0i = null;
        String strA0j = null;
        boolean zA8G = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new InternalLinkActionCardDataJson(i, strA0w2, strA0i, strA0j, listA0P2, strA0l, zA8G, strA0w, listA0P, c2hx);
                case 0:
                    strA0w2 = C3cI.A0w(c9iZ, c9j4A55, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0i = C3cI.A0i(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    strA0j = C3cI.A0j(c9iZ, c9j4A55);
                    i |= 4;
                    break;
                case 3:
                    listA0P2 = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 3);
                    i |= 8;
                    break;
                case 4:
                    strA0l = C3cI.A0l(c9iZ, c9j4A55);
                    i |= 16;
                    break;
                case 5:
                    zA8G = c9j4A55.A8G(c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 6);
                    i |= 64;
                    break;
                case 7:
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 7);
                    i |= 128;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        InternalLinkActionCardDataJson$$serializer internalLinkActionCardDataJson$$serializer = new InternalLinkActionCardDataJson$$serializer();
        INSTANCE = internalLinkActionCardDataJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.model.InternalLinkActionCardDataJson", internalLinkActionCardDataJson$$serializer, 8);
        c9iKA1C.A08("connector_id", true);
        C3cI.A1N("scope_key", c9iKA1C, true);
        c9iKA1C.A08("auth_providers", true);
        c9iKA1C.A08("account_id", true);
        c9iKA1C.A08("wallet_setup", true);
        c9iKA1C.A08("action_label", true);
        c9iKA1C.A08("wallet_setup_options", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = InternalLinkActionCardDataJson.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), C3cH.A12(f0cArr), AbstractC07749im.A00(c07779iq), C07839ix.A00, AbstractC07749im.A00(c07779iq), C3cG.A16(f0cArr, 7)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, InternalLinkActionCardDataJson internalLinkActionCardDataJson) {
        AnonymousClass003.A0u(interfaceC07789is, internalLinkActionCardDataJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        InternalLinkActionCardDataJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(internalLinkActionCardDataJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
