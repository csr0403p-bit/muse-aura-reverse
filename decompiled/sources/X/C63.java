package X;

import java.io.File;

/* loaded from: classes5.dex */
public final class C63 extends AbstractC3220C4c {
    @Override // X.AbstractC3220C4c
    public final C5l A00() {
        return C5l.A01;
    }

    @Override // X.AbstractC3220C4c
    public final Integer A01() {
        return C79.A01;
    }

    @Override // X.AbstractC3220C4c
    public final void A02(EnumC3223C4g enumC3223C4g, File file, File file2) {
        boolean z;
        if (enumC3223C4g == EnumC3223C4g.LARGE_REPORT) {
            synchronized (C64.class) {
                z = C64.A0B;
            }
            if (z) {
                return;
            }
            super.A02(enumC3223C4g, file, file2);
        }
    }
}
