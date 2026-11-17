package X;

import com.facebook.aura.localbrowser.LocalBrowserCapacityKt;

/* renamed from: X.Ak6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC1499Ak6 {
    public static long A01(C0dm c0dm, float f) {
        InterfaceC1502Ak9 interfaceC1502Ak9A01;
        return C19U.A02((c0dm.AFo() < 1.03f || (interfaceC1502Ak9A01 = C1672Anz.A00.A01(c0dm.AFo())) == null) ? f / c0dm.AFo() : interfaceC1502Ak9A01.A7F(f));
    }

    public static float A00(C0dm c0dm, long j) {
        float fA00;
        if (C1809ArT.A01(j) != LocalBrowserCapacityKt.BACKGROUND_WAKE_MIN_RAM_BYTES) {
            throw new IllegalStateException("Only Sp can convert to Px");
        }
        C1672Anz c1672Anz = C1672Anz.A00;
        if (c0dm.AFo() >= 1.03f) {
            InterfaceC1502Ak9 interfaceC1502Ak9A01 = c1672Anz.A01(c0dm.AFo());
            fA00 = C1809ArT.A00(j);
            if (interfaceC1502Ak9A01 != null) {
                return interfaceC1502Ak9A01.A7H(fA00);
            }
        } else {
            fA00 = C1809ArT.A00(j);
        }
        return fA00 * c0dm.AFo();
    }
}
