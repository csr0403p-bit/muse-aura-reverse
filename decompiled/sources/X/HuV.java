package X;

import kotlin.Unit;

/* loaded from: classes6.dex */
public final class HuV<V> {
    public HsD<V> A00;
    public InterfaceC10560Hsz<Hsa<V>> A01;
    public final Object A02 = C3cG.A0T();

    public static final InterfaceC10560Hsz A00(HuV huV, C78U c78u, G0V g0v) {
        synchronized (huV.A02) {
            InterfaceC10560Hsz<Hsa<V>> interfaceC10560Hsz = huV.A01;
            if (interfaceC10560Hsz != null) {
                return interfaceC10560Hsz;
            }
            GAt gAt = new GAt(null);
            huV.A01 = gAt;
            c78u.A04(new C8192FYj(huV, (G0U<? super Throwable, Unit>) gAt, c78u, 9), new C8897FtE(gAt, huV, g0v, null, 2), new C8197FYo(14, huV, gAt));
            return gAt;
        }
    }

    public static final void A01(InterfaceC10512HoG interfaceC10512HoG, HuV huV, InterfaceC10560Hsz interfaceC10560Hsz) {
        synchronized (huV.A02) {
            if (huV.A01 == interfaceC10560Hsz) {
                huV.A01 = null;
            }
        }
        C3cG.A1F(interfaceC10560Hsz, new C10541Hqt(interfaceC10512HoG));
    }
}
