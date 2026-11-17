package com.facebook.aura.watchlink;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
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
import com.facebook.aura.gateway.JarvisProtocolKt;
import com.facebook.aura.gateway.service.NodeCommandFallbackWorker;
import com.facebook.aura.login.nativeflow.NativeLoginCheckpointContinuationKt;
import com.facebook.aura.partners.voice.prefs.VoicePrefs;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class WatchLinkResponse$$serializer implements C9cd<WatchLinkResponse> {
    public static final int $stable = 0;
    public static final WatchLinkResponse$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final WatchLinkResponse deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        Boolean boolA0M = null;
        String strA0i = null;
        String strA0w = null;
        String strA0w2 = null;
        String strA0w3 = null;
        String strA0w4 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new WatchLinkResponse(i, strA8f, strA0i, strA0w, strA0w2, strA0w3, strA0w4, boolA0M, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0i = C3cI.A0i(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 2);
                    i |= 4;
                    break;
                case 3:
                    strA0w2 = C3cI.A0w(c9iZ, c9j4A55, 3);
                    i |= 8;
                    break;
                case 4:
                    strA0w3 = C3cI.A0w(c9iZ, c9j4A55, 4);
                    i |= 16;
                    break;
                case 5:
                    strA0w4 = C3cI.A0w(c9iZ, c9j4A55, 5);
                    i |= 32;
                    break;
                case 6:
                    boolA0M = C3cI.A0M(c9iZ, c9j4A55, 6);
                    i |= 64;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        WatchLinkResponse$$serializer watchLinkResponse$$serializer = new WatchLinkResponse$$serializer();
        INSTANCE = watchLinkResponse$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.watchlink.WatchLinkResponse", watchLinkResponse$$serializer, 7);
        c9iKA1C.A08("state", false);
        c9iKA1C.A08("link_id", true);
        c9iKA1C.A08(NodeCommandFallbackWorker.KEY_USER_ID, true);
        c9iKA1C.A08(NativeLoginCheckpointContinuationKt.ACCESS_TOKEN_PARAM, true);
        c9iKA1C.A08("vm_url", true);
        c9iKA1C.A08(JarvisProtocolKt.APP_VERSION_QUERY_PARAM, true);
        c9iKA1C.A08(VoicePrefs.KEY_BACKGROUNDING_ENABLED, true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(C07839ix.A00)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, WatchLinkResponse watchLinkResponse) {
        AnonymousClass003.A0u(interfaceC07789is, watchLinkResponse);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        WatchLinkResponse.write$Self$fbandroid_express_aura_watchlink_watchlink(watchLinkResponse, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
