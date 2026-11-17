package X;

import java.io.File;
import java.util.List;

/* renamed from: X.COa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3454COa {
    public static final File A03 = BV4.A0G("/sys/kernel/debug/tracing/trace");
    public boolean A00;
    public final Object A01 = BV4.A1W();
    public final List<InterfaceC3458COe> A02 = C3cG.A0h();

    public final void A00() {
        synchronized (this.A01) {
            this.A00 = true;
            int i = 0;
            while (true) {
                List<InterfaceC3458COe> list = this.A02;
                if (i < list.size()) {
                    list.get(i).AWa();
                    i++;
                }
            }
        }
    }
}
