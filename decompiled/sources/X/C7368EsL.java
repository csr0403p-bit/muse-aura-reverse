package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.EsL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7368EsL extends GBP {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A03 = AtomicReferenceFieldUpdater.newUpdater(C7368EsL.class, Object.class, "_disposer$volatile");
    public HsS A00;
    public final Hm1<List<? extends T>> A01;
    public final /* synthetic */ EsK<T> A02;
    public volatile /* synthetic */ Object _disposer$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public C7368EsL(EsK esK, Hm1<? super List<? extends T>> hm1) {
        this.A02 = esK;
        this.A01 = hm1;
    }

    @Override // X.GBP
    public final void A06(Throwable th) {
        if (th != null) {
            Hm1<List<? extends T>> hm1 = this.A01;
            if (GBL.A02(new C10474Hkl(th, false), null, null, (GBL) hm1) != null) {
                hm1.A6g();
                EsM esM = (EsM) A03.get(this);
                if (esM != null) {
                    esM.A00();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = EsK.A01;
        EsK<T> esK = this.A02;
        if (atomicIntegerFieldUpdater.decrementAndGet(esK) == 0) {
            HtJ htJ = this.A01;
            Object[] objArr = esK.A00;
            ArrayList arrayListA11 = C60O.A11(objArr.length);
            for (Object obj : objArr) {
                arrayListA11.add(((GBM) obj).A0C());
            }
            htJ.resumeWith(arrayListA11);
        }
    }

    @Override // X.GBP
    public final boolean A07() {
        return false;
    }
}
