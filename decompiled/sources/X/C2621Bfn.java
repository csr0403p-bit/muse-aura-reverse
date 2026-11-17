package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Bfn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2621Bfn implements InterfaceC2795BlW {
    public final /* synthetic */ C2605BfM A00;

    public C2621Bfn(C2605BfM c2605BfM) {
        this.A00 = c2605BfM;
    }

    @Override // X.InterfaceC2795BlW
    public final void Ahf() {
        C2605BfM c2605BfM = this.A00;
        AtomicReference<Integer> atomicReference = c2605BfM.A08;
        synchronized (atomicReference) {
            Integer num = (Integer) C8j3.A10(atomicReference);
            if (num != null && num.intValue() != C2605BfM.A00(c2605BfM)) {
                C2605BfM.A02(c2605BfM);
            }
        }
    }
}
