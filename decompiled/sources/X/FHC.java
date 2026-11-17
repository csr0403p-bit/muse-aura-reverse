package X;

import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class FHC extends FHE {
    public C0917AHt<Object> A00;
    public C0917AHt<Object> A01;
    public Object A02;
    public Object A03;
    public HxO<? super Unit> A04;
    public final G0U<Object, Unit> A06 = new C8944Fu0(this, 0);
    public final AOY A05 = Snapshot.A01(new C8943Ftz(this, 1));

    @Override // X.FHE
    public final void A03(HxO<? super Unit> hxO) {
        this.A03 = null;
        this.A01 = null;
    }

    @Override // X.FHE
    public final G0U<Object, Unit> A00(HxO<? super Unit> hxO) {
        HxO<? super Unit> hxO2 = this.A04;
        if (hxO2 == null || hxO2.equals(hxO)) {
            this.A04 = hxO;
            return this.A06;
        }
        AK7.A00("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        throw F60.createAndThrow();
    }

    @Override // X.FHE
    public final void A01() {
        synchronized (super.A00) {
            this.A02 = this.A03;
            if (this.A01 == null) {
                this.A00 = null;
            } else {
                C0917AHt<Object> c0917AHtA02 = this.A00;
                if (c0917AHtA02 == null) {
                    c0917AHtA02 = C0917AHt.A02();
                    this.A00 = c0917AHtA02;
                }
                this.A00 = this.A01;
                this.A01 = c0917AHtA02;
            }
        }
    }
}
