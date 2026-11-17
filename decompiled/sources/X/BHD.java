package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class BHD implements C3b6<BOx> {
    public final List<BOx> A00 = C3cG.A0h();

    public static void A00(BHD bhd, String str, float f) {
        bhd.A01(str, new C1DG(f));
    }

    public final void A01(String str, Object obj) {
        this.A00.add(new BOx(str, obj));
    }

    @Override // X.C3b6
    public final Iterator<BOx> iterator() {
        return this.A00.iterator();
    }
}
