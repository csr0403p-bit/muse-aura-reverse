package X;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class C56 implements C57 {
    public final /* synthetic */ F4R A00;

    public C56(F4R f4r) {
        this.A00 = f4r;
    }

    @Override // X.C57
    public final void ATR(boolean z) {
        Iterator<C57> it = C2b.A00.iterator();
        while (it.hasNext()) {
            it.next().ATR(z);
        }
    }
}
