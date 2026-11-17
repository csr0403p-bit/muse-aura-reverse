package X;

import com.facebook.pushlite.model.PushInfraMetaData;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class A5H implements C9cd<PushInfraMetaData> {
    public static final A5H A00;
    public static final C9iZ A01;

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        int i;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = A01;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        Long l = null;
        Long l2 = null;
        String strA0g = null;
        String strA0g2 = null;
        Long l3 = null;
        String strA0r = null;
        Long l4 = null;
        String str = null;
        String strA0o = null;
        String strA0n = null;
        String strA0l = null;
        String strA0m = null;
        String strA0w = null;
        String strA0t = null;
        Long l5 = null;
        String strA0u = null;
        String str2 = null;
        Long l6 = null;
        int i2 = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new PushInfraMetaData(l6, l2, l4, l3, l5, l, strA0w, strA0g2, strA0g, strA0l, strA0m, strA0n, strA0o, str, strA0r, strA0t, strA0u, str2, i2);
                case 0:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    l6 = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 1);
                    i2 |= 2;
                    continue;
                case 2:
                    strA0g2 = C3cI.A0g(c9iZ, c9j4A55);
                    i2 |= 4;
                    continue;
                case 3:
                    strA0g = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 3);
                    i2 |= 8;
                    continue;
                case 4:
                    strA0l = C3cI.A0l(c9iZ, c9j4A55);
                    i2 |= 16;
                    continue;
                case 5:
                    strA0m = C3cI.A0m(c9iZ, c9j4A55);
                    i2 |= 32;
                    continue;
                case 6:
                    strA0n = C3cI.A0n(c9iZ, c9j4A55);
                    i2 |= 64;
                    continue;
                case 7:
                    strA0o = C3cI.A0o(c9iZ, c9j4A55);
                    i2 |= 128;
                    continue;
                case 8:
                    str = (String) C3cI.A0U(c9iZ, c9j4A55);
                    i2 |= 256;
                    continue;
                case 9:
                    l2 = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 9);
                    i2 |= 512;
                    continue;
                case 10:
                    l4 = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 10);
                    i2 |= 1024;
                    continue;
                case 11:
                    strA0r = C3cI.A0r(c9iZ, c9j4A55);
                    i2 |= 2048;
                    continue;
                case 12:
                    l3 = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 12);
                    i2 |= 4096;
                    continue;
                case 13:
                    strA0t = C3cI.A0t(c9iZ, c9j4A55);
                    i2 |= 8192;
                    continue;
                case 14:
                    l5 = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    strA0u = C3cI.A0u(c9iZ, c9j4A55);
                    i = 32768;
                    break;
                case 16:
                    str2 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 16);
                    i = 65536;
                    break;
                case 17:
                    l = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 17);
                    i = 131072;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
            i2 |= i;
        }
    }

    static {
        A5H a5h = new A5H();
        A00 = a5h;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.pushlite.model.PushInfraMetaData", a5h, 18);
        c9iKA1C.A08("l", true);
        c9iKA1C.A08("ui", true);
        c9iKA1C.A08("pjid", true);
        c9iKA1C.A08("hcs", true);
        c9iKA1C.A08("hek", true);
        c9iKA1C.A08("hki", true);
        c9iKA1C.A08("tid", true);
        c9iKA1C.A08("nid", true);
        c9iKA1C.A08("ca", true);
        c9iKA1C.A08("mit", true);
        c9iKA1C.A08("iad", true);
        c9iKA1C.A08("t", true);
        c9iKA1C.A08("sid", true);
        c9iKA1C.A08("d", true);
        c9iKA1C.A08("u", true);
        c9iKA1C.A08("nt", true);
        c9iKA1C.A08("ir", true);
        c9iKA1C.A08("et", true);
        A01 = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C9j1 c9j1 = C9j1.A00;
        return new C9hr[]{c9hrA00, AbstractC07749im.A00(c9j1), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c9j1), AbstractC07749im.A00(c9j1), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c9j1), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c9j1), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c9j1)};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        PushInfraMetaData pushInfraMetaData = (PushInfraMetaData) obj;
        boolean zA1a = AnonymousClass002.A1a(interfaceC07789is, pushInfraMetaData);
        C9iZ c9iZ = A01;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        C9sU c9sU = PushInfraMetaData.A0I;
        boolean zAfR = c9j5A56.AfR();
        if (zAfR || pushInfraMetaData.A0D != null) {
            c9j5A56.AAP(pushInfraMetaData.A0D, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || pushInfraMetaData.A04 != null) {
            c9j5A56.AAP(pushInfraMetaData.A04, C9j1.A00, c9iZ, zA1a ? 1 : 0);
        }
        if (zAfR || pushInfraMetaData.A0G != null) {
            c9j5A56.AAP(pushInfraMetaData.A0G, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || pushInfraMetaData.A07 != null) {
            c9j5A56.AAP(pushInfraMetaData.A07, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || pushInfraMetaData.A08 != null) {
            c9j5A56.AAP(pushInfraMetaData.A08, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || pushInfraMetaData.A09 != null) {
            c9j5A56.AAP(pushInfraMetaData.A09, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || pushInfraMetaData.A0H != null) {
            c9j5A56.AAP(pushInfraMetaData.A0H, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || pushInfraMetaData.A0F != null) {
            c9j5A56.AAP(pushInfraMetaData.A0F, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || pushInfraMetaData.A06 != null) {
            c9j5A56.AAP(pushInfraMetaData.A06, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || pushInfraMetaData.A03 != null) {
            c9j5A56.AAP(pushInfraMetaData.A03, C9j1.A00, c9iZ, 9);
        }
        if (zAfR || pushInfraMetaData.A00 != null) {
            c9j5A56.AAP(pushInfraMetaData.A00, C9j1.A00, c9iZ, 10);
        }
        if (zAfR || pushInfraMetaData.A0B != null) {
            c9j5A56.AAP(pushInfraMetaData.A0B, C07779iq.A01, c9iZ, 11);
        }
        if (zAfR || pushInfraMetaData.A02 != null) {
            c9j5A56.AAP(pushInfraMetaData.A02, C9j1.A00, c9iZ, 12);
        }
        if (zAfR || pushInfraMetaData.A0A != null) {
            c9j5A56.AAP(pushInfraMetaData.A0A, C07779iq.A01, c9iZ, 13);
        }
        if (zAfR || pushInfraMetaData.A05 != null) {
            c9j5A56.AAP(pushInfraMetaData.A05, C9j1.A00, c9iZ, 14);
        }
        if (zAfR || pushInfraMetaData.A0E != null) {
            c9j5A56.AAP(pushInfraMetaData.A0E, C07779iq.A01, c9iZ, 15);
        }
        if (zAfR || pushInfraMetaData.A0C != null) {
            c9j5A56.AAP(pushInfraMetaData.A0C, C07779iq.A01, c9iZ, 16);
        }
        if (zAfR || pushInfraMetaData.A01 != null) {
            c9j5A56.AAP(pushInfraMetaData.A01, C9j1.A00, c9iZ, 17);
        }
        c9j5A56.AAd(c9iZ);
    }

    @Override // X.C9cd
    public final /* synthetic */ C9hr[] typeParametersSerializers() {
        return C5hV.A00;
    }
}
