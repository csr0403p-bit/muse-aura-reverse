package X;

import android.app.Application;
import java.util.List;

/* renamed from: X.C5j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3249C5j {
    public long A00;
    public F18<String> A02;
    public F18<String> A03;
    public F18 A04;
    public F18<String> A05;
    public F18<String> A06;
    public F18<C4U> A07;
    public F18<Boolean> A08;
    public F18<String> A09;
    public F18<String> A0A;
    public F18<String> A0B;
    public final Application A0D;
    public final List<InterfaceC3269C6v> A0E = C3cG.A0h();
    public final List<InterfaceC3269C6v> A0F = C3cG.A0h();
    public final List<InterfaceC3269C6v> A0G = C3cG.A0h();
    public final List<InterfaceC3269C6v> A0H = C3cG.A0h();
    public boolean A0C = false;
    public C3237C4u A01 = new C3237C4u();

    public static void A00(C5t c5t, C3249C5j c3249C5j) {
        C5E<InterfaceC3235C4s> c5e = c5t.A00;
        BWq bWq = c5t.A02;
        EnumC3250C5k enumC3250C5k = c5t.A05;
        boolean z = c5t.A03;
        c3249C5j.A01(new C59(c5t.A04, c5e, c5t.A01, enumC3250C5k, bWq, z));
    }

    public C3249C5j(Application application) {
        this.A0D = application;
    }

    public final void A01(InterfaceC3269C6v interfaceC3269C6v) {
        List<InterfaceC3269C6v> list;
        int iOrdinal = interfaceC3269C6v.getWhenToInit().ordinal();
        if (iOrdinal == 0) {
            list = this.A0E;
        } else if (iOrdinal == 1) {
            list = this.A0F;
        } else if (iOrdinal == 2) {
            list = this.A0G;
        } else if (iOrdinal != 3) {
            return;
        } else {
            list = this.A0H;
        }
        list.add(interfaceC3269C6v);
    }
}
