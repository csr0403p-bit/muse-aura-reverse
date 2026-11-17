package com.facebook.aura.composer.dictation.voyager;

import X.AnonymousClass003;
import X.C07779iq;
import X.C3cG;
import X.C3cH;
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
import com.facebook.aura.vmbrowser.runtime.BrowserSessionControllerKt;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class VoyagerAsrHandshakeJson$$serializer implements C9cd<VoyagerAsrHandshakeJson> {
    public static final VoyagerAsrHandshakeJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final VoyagerAsrHandshakeJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = VoyagerAsrHandshakeJson.$childSerializers;
        String strA8f = null;
        VoyagerAsrAuthorizationJson voyagerAsrAuthorizationJson = null;
        String strA8f2 = null;
        String strA8f3 = null;
        List list = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new VoyagerAsrHandshakeJson(i, strA8f, voyagerAsrAuthorizationJson, strA8f2, strA8f3, list, null);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                voyagerAsrAuthorizationJson = (VoyagerAsrAuthorizationJson) c9j4A55.A8a(VoyagerAsrAuthorizationJson$$serializer.INSTANCE, c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                strA8f2 = c9j4A55.A8f(c9iZ, 2);
                i |= 4;
            } else if (iA8N == 3) {
                strA8f3 = c9j4A55.A8f(c9iZ, 3);
                i |= 8;
            } else {
                if (iA8N != 4) {
                    throw C3cG.A17(iA8N);
                }
                list = (List) C3cJ.A0G(c9iZ, c9j4A55, f0cArr, 4);
                i |= 16;
            }
        }
    }

    static {
        VoyagerAsrHandshakeJson$$serializer voyagerAsrHandshakeJson$$serializer = new VoyagerAsrHandshakeJson$$serializer();
        INSTANCE = voyagerAsrHandshakeJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.composer.dictation.voyager.VoyagerAsrHandshakeJson", voyagerAsrHandshakeJson$$serializer, 5);
        c9iKA1C.A08(BrowserSessionControllerKt.WEBSOCKIFY_MODE_PARAM, false);
        c9iKA1C.A08("authorization", false);
        c9iKA1C.A08("audioEncoding", false);
        c9iKA1C.A08("model", false);
        c9iKA1C.A08("languageBias", false);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = VoyagerAsrHandshakeJson.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, VoyagerAsrAuthorizationJson$$serializer.INSTANCE, c07779iq, c07779iq, C3cH.A14(f0cArr, 4)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, VoyagerAsrHandshakeJson voyagerAsrHandshakeJson) {
        AnonymousClass003.A0u(interfaceC07789is, voyagerAsrHandshakeJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        VoyagerAsrHandshakeJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_composer_dictation_voyager_voyager(voyagerAsrHandshakeJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
