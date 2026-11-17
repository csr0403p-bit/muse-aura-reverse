package X;

import android.util.Range;
import android.util.Size;

/* renamed from: X.Bc7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2480Bc7 {
    public final C2492BcJ A00(InterfaceC2585Beh interfaceC2585Beh) {
        C2487BcE c2487BcE = (C2487BcE) this;
        Size size = c2487BcE.A02;
        Range<Integer> range = AbstractC2481Bc8.A00;
        C2493BcK c2493BcK = new C2493BcK();
        if (size == null) {
            throw BV4.A0a("Null resolution");
        }
        c2493BcK.A01 = size;
        c2493BcK.A00 = range;
        c2493BcK.A02 = C2507Bcd.A07;
        c2493BcK.A04 = AnonymousClass001.A0h();
        C2507Bcd c2507Bcd = c2487BcE.A03;
        if (c2507Bcd == null) {
            throw BV4.A0a("Null dynamicRange");
        }
        c2493BcK.A02 = c2507Bcd;
        c2493BcK.A03 = interfaceC2585Beh;
        Range<Integer> range2 = c2487BcE.A01;
        if (range2 != null) {
            c2493BcK.A00 = range2;
        }
        return c2493BcK.A01();
    }
}
