package X;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.7b5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7b5 {
    public final SnapshotStateList<G0W<C7az, BFM, Integer, Unit>> A00 = new SnapshotStateList();
    public final G2n<BRg, String, Boolean, C7az, G0W<? super B6A, ? super BFM, ? super Integer, Unit>, Function0<Unit>, BFM, Integer, Unit> A01;

    /* JADX WARN: Multi-variable type inference failed */
    public C7b5(G2n<? super BRg, ? super String, ? super Boolean, ? super C7az, ? super G0W<? super B6A, ? super BFM, ? super Integer, Unit>, ? super Function0<Unit>, ? super BFM, ? super Integer, Unit> g2n) {
        this.A01 = g2n;
    }

    public final void A00(C7az c7az, BFM bfm, int i) {
        bfm.AgG(-798501095);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c7az) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, this);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            SnapshotStateList<G0W<C7az, BFM, Integer, Unit>> snapshotStateList = this.A00;
            int size = snapshotStateList.size();
            for (int i2 = 0; i2 < size; i2++) {
                AnonymousClass001.A1G(c7az, bfm, (G0W) snapshotStateList.get(i2), iA0d & 14);
            }
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C8iB(c7az, this, i, 0);
        }
    }
}
