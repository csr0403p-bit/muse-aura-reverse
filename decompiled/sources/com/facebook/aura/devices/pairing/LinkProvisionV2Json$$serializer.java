package com.facebook.aura.devices.pairing;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
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
import com.facebook.aura.login.nativeflow.NativeLoginCheckpointContinuationKt;
import com.facebook.aura.perf.HatchConnectorQplLogger;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class LinkProvisionV2Json$$serializer implements C9cd<LinkProvisionV2Json> {
    public static final int $stable = 0;
    public static final LinkProvisionV2Json$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final LinkProvisionV2Json deserialize(InterfaceC07829iw interfaceC07829iw) {
        int i;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA0g = null;
        String strA0g2 = null;
        String strA0g3 = null;
        String strA0u = null;
        String str = null;
        String strA0t = null;
        String strA0r = null;
        String strA0q = null;
        Boolean bool = null;
        String strA0o = null;
        String str2 = null;
        String strA0s = null;
        String strA8f = null;
        String strA0o2 = null;
        String strA8f2 = null;
        String strA8f3 = null;
        String strA0i = null;
        int i2 = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new LinkProvisionV2Json(i2, strA8f, strA0i, strA0g3, strA0o2, strA8f2, strA8f3, strA0g2, strA0o, str2, bool, strA0q, strA0r, strA0s, strA0t, str, strA0u, strA0g, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    strA0i = C3cI.A0i(c9iZ, c9j4A55);
                    i2 |= 2;
                    continue;
                case 2:
                    strA0g3 = C3cI.A0g(c9iZ, c9j4A55);
                    i2 |= 4;
                    continue;
                case 3:
                    strA0o2 = C60Q.A0o(c9iZ, c9j4A55);
                    i2 |= 8;
                    continue;
                case 4:
                    strA8f2 = c9j4A55.A8f(c9iZ, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    strA8f3 = c9j4A55.A8f(c9iZ, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    strA0g2 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    strA0o = C3cI.A0o(c9iZ, c9j4A55);
                    i2 |= 128;
                    continue;
                case 8:
                    str2 = (String) C3cI.A0U(c9iZ, c9j4A55);
                    i2 |= 256;
                    continue;
                case 9:
                    bool = (Boolean) c9j4A55.A8Z(C07839ix.A00, c9iZ, 9);
                    i2 |= 512;
                    continue;
                case 10:
                    strA0q = C3cI.A0q(c9iZ, c9j4A55);
                    i2 |= 1024;
                    continue;
                case 11:
                    strA0r = C3cI.A0r(c9iZ, c9j4A55);
                    i2 |= 2048;
                    continue;
                case 12:
                    strA0s = C3cI.A0s(c9iZ, c9j4A55);
                    i2 |= 4096;
                    continue;
                case 13:
                    strA0t = C3cI.A0t(c9iZ, c9j4A55);
                    i2 |= 8192;
                    continue;
                case 14:
                    str = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    strA0u = C3cI.A0u(c9iZ, c9j4A55);
                    i = 32768;
                    break;
                case 16:
                    strA0g = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 16);
                    i = 65536;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
            i2 |= i;
        }
    }

    static {
        LinkProvisionV2Json$$serializer linkProvisionV2Json$$serializer = new LinkProvisionV2Json$$serializer();
        INSTANCE = linkProvisionV2Json$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.devices.pairing.LinkProvisionV2Json", linkProvisionV2Json$$serializer, 17);
        c9iKA1C.A08("action", true);
        c9iKA1C.A08("ssid", true);
        c9iKA1C.A08(HatchConnectorQplLogger.AuthType.PASSWORD, true);
        c9iKA1C.A08(NativeLoginCheckpointContinuationKt.ACCESS_TOKEN_PARAM, false);
        c9iKA1C.A08("refresh_token", false);
        c9iKA1C.A08("token_type", true);
        c9iKA1C.A08("username", true);
        c9iKA1C.A08("fleet_manager_url", true);
        c9iKA1C.A08("ota_url", true);
        c9iKA1C.A08("ota_force", true);
        c9iKA1C.A08("api_url", true);
        c9iKA1C.A08("api_url_v2", true);
        c9iKA1C.A08("noise_host", true);
        c9iKA1C.A08("device_key", true);
        c9iKA1C.A08("device_key_id", true);
        c9iKA1C.A08("vm_id", true);
        c9iKA1C.A08("vm_kind", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), c07779iq, c07779iq, c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(C07839ix.A00), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, LinkProvisionV2Json linkProvisionV2Json) {
        AnonymousClass003.A0u(interfaceC07789is, linkProvisionV2Json);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        LinkProvisionV2Json.write$Self$fbandroid_express_aura_java_com_facebook_aura_devices_pairing_pairing(linkProvisionV2Json, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
