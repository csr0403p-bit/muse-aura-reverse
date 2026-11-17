package com.facebook.aura.devices.pairing;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
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
/* loaded from: classes4.dex */
public final /* synthetic */ class LinkDeviceInfoJson$$serializer implements C9cd<LinkDeviceInfoJson> {
    public static final int $stable = 0;
    public static final LinkDeviceInfoJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final LinkDeviceInfoJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        int i;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = LinkDeviceInfoJson.$childSerializers;
        String strA8f = null;
        Integer num = null;
        String strA0g = null;
        List list = null;
        String strA0g2 = null;
        Boolean boolA0M = null;
        Integer num2 = null;
        Integer num3 = null;
        Boolean bool = null;
        String strA0h = null;
        String strA0i = null;
        String strA0o = null;
        String strA8f2 = null;
        String strA8f3 = null;
        String strA8f4 = null;
        String strA8f5 = null;
        int i2 = 0;
        boolean zA8G = false;
        int iA8U = 0;
        int iA8U2 = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new LinkDeviceInfoJson(i2, strA8f, strA0h, strA0i, strA0o, strA8f2, strA8f3, strA8f4, iA8U, num, zA8G, strA8f5, iA8U2, strA0g2, list, bool, strA0g, num3, num2, boolA0M, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
                    i2 |= 2;
                    continue;
                case 2:
                    strA0i = C3cH.A0i(c9iZ, c9j4A55);
                    i2 |= 4;
                    continue;
                case 3:
                    strA0o = C60Q.A0o(c9iZ, c9j4A55);
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
                    strA8f4 = c9j4A55.A8f(c9iZ, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    iA8U = c9j4A55.A8U(c9iZ, 7);
                    i2 |= 128;
                    continue;
                case 8:
                    num = (Integer) c9j4A55.A8Z(C07729ii.A00, c9iZ, 8);
                    i2 |= 256;
                    continue;
                case 9:
                    zA8G = c9j4A55.A8G(c9iZ, 9);
                    i2 |= 512;
                    continue;
                case 10:
                    strA8f5 = c9j4A55.A8f(c9iZ, 10);
                    i2 |= 1024;
                    continue;
                case 11:
                    iA8U2 = c9j4A55.A8U(c9iZ, 11);
                    i2 |= 2048;
                    continue;
                case 12:
                    strA0g2 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 12);
                    i2 |= 4096;
                    continue;
                case 13:
                    list = (List) C3cJ.A0E(c9iZ, c9j4A55, f0cArr, 13);
                    i2 |= 8192;
                    continue;
                case 14:
                    bool = (Boolean) c9j4A55.A8Z(C07839ix.A00, c9iZ, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    strA0g = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 15);
                    i = 32768;
                    break;
                case 16:
                    num3 = (Integer) c9j4A55.A8Z(C07729ii.A00, c9iZ, 16);
                    i = 65536;
                    break;
                case 17:
                    num2 = (Integer) c9j4A55.A8Z(C07729ii.A00, c9iZ, 17);
                    i = 131072;
                    break;
                case 18:
                    boolA0M = C3cI.A0M(c9iZ, c9j4A55, 18);
                    i = 262144;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
            i2 |= i;
        }
    }

    static {
        LinkDeviceInfoJson$$serializer linkDeviceInfoJson$$serializer = new LinkDeviceInfoJson$$serializer();
        INSTANCE = linkDeviceInfoJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.devices.pairing.LinkDeviceInfoJson", linkDeviceInfoJson$$serializer, 19);
        c9iKA1C.A08("type", true);
        c9iKA1C.A08("node_id", true);
        c9iKA1C.A08("device_id", true);
        c9iKA1C.A08("mac", true);
        C9iK.A04("model", c9iKA1C, true);
        c9iKA1C.A08("build_sha", true);
        c9iKA1C.A08("pairing_protocol", true);
        c9iKA1C.A08("pairing_transcript_version", true);
        c9iKA1C.A08("pairing_required", true);
        c9iKA1C.A08("pairing_auth", true);
        c9iKA1C.A08("pairing_auth_epoch", true);
        c9iKA1C.A08("pairing_policy", true);
        c9iKA1C.A08("cipher_suites", true);
        c9iKA1C.A08("ota_supported", true);
        c9iKA1C.A08("wifi", true);
        c9iKA1C.A08("mgcommands", true);
        c9iKA1C.A08("device_key_auth", true);
        c9iKA1C.A08("cvm_supported", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = LinkDeviceInfoJson.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        C07729ii c07729ii = C07729ii.A00;
        C9hr c9hrA00 = AbstractC07749im.A00(c07729ii);
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c07779iq, c07779iq, c07779iq, c07779iq, c07779iq, c07779iq, c07779iq, c07729ii, c9hrA00, c07839ix, c07779iq, c07729ii, AbstractC07749im.A00(c07779iq), C3cG.A16(f0cArr, 13), AbstractC07749im.A00(c07839ix), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07729ii), AbstractC07749im.A00(c07729ii), AbstractC07749im.A00(c07839ix)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, LinkDeviceInfoJson linkDeviceInfoJson) {
        AnonymousClass003.A0u(interfaceC07789is, linkDeviceInfoJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        LinkDeviceInfoJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_devices_pairing_pairing(linkDeviceInfoJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
