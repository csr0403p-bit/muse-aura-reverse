package com.facebook.aura.devices.pairing;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
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
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class LinkPairingReadyJson$$serializer implements C9cd<LinkPairingReadyJson> {
    public static final int $stable = 0;
    public static final LinkPairingReadyJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final LinkPairingReadyJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        int i;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        Integer num = null;
        String strA0v = null;
        Integer num2 = null;
        String strA0v2 = null;
        String strA8f = null;
        String strA0o = null;
        String strA8f2 = null;
        String strA8f3 = null;
        String strA8f4 = null;
        String strA8f5 = null;
        String strA8f6 = null;
        String strA8f7 = null;
        String strA8f8 = null;
        String strA8f9 = null;
        String strA8f10 = null;
        String strA8f11 = null;
        int i2 = 0;
        int iA8U = 0;
        int iA8U2 = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new LinkPairingReadyJson(i2, strA8f, iA8U, num, strA0o, strA8f2, strA8f3, strA8f4, strA8f5, strA8f6, strA8f7, iA8U2, strA0v, num2, strA8f8, strA8f9, strA8f10, strA8f11, strA0v2, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    iA8U = c9j4A55.A8U(c9iZ, 1);
                    i2 |= 2;
                    continue;
                case 2:
                    num = (Integer) c9j4A55.A8Z(C07729ii.A00, c9iZ, 2);
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
                    strA8f5 = c9j4A55.A8f(c9iZ, 7);
                    i2 |= 128;
                    continue;
                case 8:
                    strA8f6 = c9j4A55.A8f(c9iZ, 8);
                    i2 |= 256;
                    continue;
                case 9:
                    strA8f7 = c9j4A55.A8f(c9iZ, 9);
                    i2 |= 512;
                    continue;
                case 10:
                    iA8U2 = c9j4A55.A8U(c9iZ, 10);
                    i2 |= 1024;
                    continue;
                case 11:
                    strA0v = C3cI.A0v(c9iZ, c9j4A55, 11);
                    i2 |= 2048;
                    continue;
                case 12:
                    num2 = (Integer) c9j4A55.A8Z(C07729ii.A00, c9iZ, 12);
                    i2 |= 4096;
                    continue;
                case 13:
                    strA8f8 = c9j4A55.A8f(c9iZ, 13);
                    i2 |= 8192;
                    continue;
                case 14:
                    strA8f9 = c9j4A55.A8f(c9iZ, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    strA8f10 = c9j4A55.A8f(c9iZ, 15);
                    i = 32768;
                    break;
                case 16:
                    strA8f11 = c9j4A55.A8f(c9iZ, 16);
                    i = 65536;
                    break;
                case 17:
                    strA0v2 = C3cI.A0v(c9iZ, c9j4A55, 17);
                    i = 131072;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
            i2 |= i;
        }
    }

    static {
        LinkPairingReadyJson$$serializer linkPairingReadyJson$$serializer = new LinkPairingReadyJson$$serializer();
        INSTANCE = linkPairingReadyJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.devices.pairing.LinkPairingReadyJson", linkPairingReadyJson$$serializer, 18);
        C9iK.A04("type", c9iKA1C, true);
        c9iKA1C.A08("transcript_version", true);
        c9iKA1C.A08("device_id", true);
        c9iKA1C.A08("node_id", true);
        c9iKA1C.A08("mac", true);
        c9iKA1C.A08("model", true);
        c9iKA1C.A08("firmware_version", true);
        c9iKA1C.A08("selected_cipher_suite", true);
        c9iKA1C.A08("pairing_auth", true);
        c9iKA1C.A08("pairing_auth_epoch", true);
        c9iKA1C.A08("pairing_policy", true);
        c9iKA1C.A08("confirm_timeout_seconds", true);
        c9iKA1C.A08("device_pub", true);
        c9iKA1C.A08("device_nonce", true);
        c9iKA1C.A08("transcript_hash", true);
        c9iKA1C.A08("session_id", true);
        c9iKA1C.A08("device_proof", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C07729ii c07729ii = C07729ii.A00;
        return new C9hr[]{c07779iq, c07729ii, AbstractC07749im.A00(c07729ii), c07779iq, c07779iq, c07779iq, c07779iq, c07779iq, c07779iq, c07779iq, c07729ii, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07729ii), c07779iq, c07779iq, c07779iq, c07779iq, AbstractC07749im.A00(c07779iq)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, LinkPairingReadyJson linkPairingReadyJson) {
        AnonymousClass003.A0u(interfaceC07789is, linkPairingReadyJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        LinkPairingReadyJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_devices_pairing_pairing(linkPairingReadyJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
