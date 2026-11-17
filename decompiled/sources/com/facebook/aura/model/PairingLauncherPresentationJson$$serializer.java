package com.facebook.aura.model;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C5hV;
import X.C60Q;
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
import com.facebook.aura.wearablebroadcast.MetaAiAppBroadcastSender;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class PairingLauncherPresentationJson$$serializer implements C9cd<PairingLauncherPresentationJson> {
    public static final int $stable = 0;
    public static final PairingLauncherPresentationJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final PairingLauncherPresentationJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        Integer numA0X = null;
        String strA0w = null;
        String strA0w2 = null;
        String strA0w3 = null;
        String strA0m = null;
        String strA0l = null;
        String strA0i = null;
        String strA0j = null;
        String strA0k = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new PairingLauncherPresentationJson(i, numA0X, strA0i, strA0j, strA0k, strA0l, strA0m, strA0w3, strA0w, strA0w2, (C2hx) null);
                case 0:
                    numA0X = C60Q.A0X(c9iZ, c9j4A55, 0);
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
                    strA0k = C3cI.A0k(c9iZ, c9j4A55);
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
                    strA0w3 = C3cI.A0w(c9iZ, c9j4A55, 6);
                    i |= 64;
                    break;
                case 7:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 7);
                    i |= 128;
                    break;
                case 8:
                    strA0w2 = C3cI.A0w(c9iZ, c9j4A55, 8);
                    i |= 256;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        PairingLauncherPresentationJson$$serializer pairingLauncherPresentationJson$$serializer = new PairingLauncherPresentationJson$$serializer();
        INSTANCE = pairingLauncherPresentationJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.model.PairingLauncherPresentationJson", pairingLauncherPresentationJson$$serializer, 9);
        c9iKA1C.A08("version", true);
        C3cH.A1G("action", c9iKA1C, true);
        c9iKA1C.A08(MetaAiAppBroadcastSender.EXTRA_BODY, true);
        c9iKA1C.A08("button_label", true);
        c9iKA1C.A08("person_name", true);
        c9iKA1C.A08("level", true);
        c9iKA1C.A08("invitation_url", true);
        c9iKA1C.A08("muse_id", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C9hr c9hrA00 = AbstractC07749im.A00(C07729ii.A00);
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c9hrA00, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, PairingLauncherPresentationJson pairingLauncherPresentationJson) {
        AnonymousClass003.A0u(interfaceC07789is, pairingLauncherPresentationJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        PairingLauncherPresentationJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(pairingLauncherPresentationJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
