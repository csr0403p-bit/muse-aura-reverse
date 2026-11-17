package X;

import com.facebook.aura.maps.model.HatchMapSceneKt;

/* renamed from: X.Ebx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6901Ebx {
    public long A00 = 262144;
    public final InterfaceC6831Eaj A01;

    public final C6844Eaw A00() {
        C6845Eax c6845Eax = new C6845Eax();
        while (true) {
            String strAZb = this.A01.AZb(this.A00);
            long j = this.A00;
            int length = strAZb.length();
            this.A00 = j - length;
            if (length == 0) {
                return c6845Eax.A00();
            }
            int iA08 = C7BY.A08(strAZb, HatchMapSceneKt.ARTIFACT_ID_SEPARATOR, 1);
            if (iA08 != -1) {
                c6845Eax.A02(strAZb.substring(0, iA08), BV4.A0g(iA08, strAZb));
            } else {
                if (strAZb.charAt(0) == ':') {
                    strAZb = strAZb.substring(1);
                }
                c6845Eax.A02("", strAZb);
            }
        }
    }

    public C6901Ebx(InterfaceC6831Eaj interfaceC6831Eaj) {
        this.A01 = interfaceC6831Eaj;
    }
}
