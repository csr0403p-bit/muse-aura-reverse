package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class BDj extends BDi {
    public boolean A00;
    public final BDi A01;

    /* JADX WARN: Incorrect types in method signature: (JLX/AI7;LX/G0U<Ljava/lang/Object;Lkotlin/Unit;>;LX/G0U<Ljava/lang/Object;Lkotlin/Unit;>;LX/BDi;)V */
    public BDj(BDi bDi, AI7 ai7, G0U g0u, G0U g0u2, long j) {
        super(ai7, g0u, g0u2, j);
        this.A01 = bDi;
        bDi.A0H();
    }

    @Override // X.BDi
    public final AnonymousClass776 A0T() {
        HashMap mapA0B;
        BDi bDi = this.A01;
        if (bDi.A01 || ((Snapshot) bDi).A01) {
            return new BDt(this);
        }
        C0917AHt<BDs> c0917AHtA0R = A0R();
        long jA09 = A09();
        if (c0917AHtA0R != null) {
            mapA0B = BDh.A0B(this, bDi.A0C(), bDi.A09());
        } else {
            mapA0B = null;
        }
        synchronized (BDh.A08) {
            BDh.A0F(this);
            if (c0917AHtA0R == null || c0917AHtA0R.A01 == 0) {
                A0L();
            } else {
                AnonymousClass776 anonymousClass776A0U = A0U(c0917AHtA0R, bDi.A0C(), mapA0B, bDi.A09());
                if (!anonymousClass776A0U.equals(C2253BDv.A00)) {
                    return anonymousClass776A0U;
                }
                C0917AHt<BDs> c0917AHtA0R2 = bDi.A0R();
                if (c0917AHtA0R2 != null) {
                    c0917AHtA0R2.A08(c0917AHtA0R);
                } else {
                    bDi.A0Y(c0917AHtA0R);
                    A0Y(null);
                }
            }
            if (C7384Etj.A01(bDi.A09(), jA09) < 0) {
                bDi.A0W();
            }
            bDi.A0O(bDi.A0C().A01(jA09).A03(((BDi) this).A00));
            bDi.A0X(jA09);
            int i = ((Snapshot) this).A00;
            ((Snapshot) this).A00 = -1;
            if (i >= 0) {
                int[] iArr = bDi.A02;
                C7384Etj.A0Y(iArr, 0);
                int length = iArr.length;
                int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                iArrCopyOf[length] = i;
                bDi.A02 = iArrCopyOf;
            }
            bDi.A00 = bDi.A00.A04(((BDi) this).A00);
            int[] iArr2 = ((BDi) this).A02;
            int length2 = iArr2.length;
            if (length2 != 0) {
                int[] iArr3 = bDi.A02;
                int length3 = iArr3.length;
                if (length3 != 0) {
                    int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length3 + length2);
                    System.arraycopy(iArr2, 0, iArrCopyOf2, length3, length2);
                    C7384Etj.A0X(iArrCopyOf2);
                    iArr2 = iArrCopyOf2;
                }
                bDi.A02 = iArr2;
            }
            ((BDi) this).A01 = true;
            if (!this.A00) {
                this.A00 = true;
                bDi.A0I();
            }
            return C2253BDv.A00;
        }
    }

    @Override // X.BDi, androidx.compose.runtime.snapshots.Snapshot
    public final void A0G() {
        if (((Snapshot) this).A01) {
            return;
        }
        super.A0G();
        if (this.A00) {
            return;
        }
        this.A00 = true;
        this.A01.A0I();
    }
}
