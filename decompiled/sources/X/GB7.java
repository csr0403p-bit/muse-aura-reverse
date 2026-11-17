package X;

import com.facebook.aura.localbrowser.LocalBrowserCapacityKt;

/* loaded from: classes6.dex */
public abstract class GB7 extends GBK {
    public long A00;
    public AIG<GBN<?>> A01;
    public boolean A02;

    public abstract long A06();

    public abstract void A07();

    public final void A03(GBN<?> gbn) {
        AIG<GBN<?>> aig = this.A01;
        if (aig == null) {
            aig = new AIG<>();
            this.A01 = aig;
        }
        aig.addLast(gbn);
    }

    public final void A04(boolean z) {
        long j = this.A00 - (z ? LocalBrowserCapacityKt.BACKGROUND_WAKE_MIN_RAM_BYTES : 1L);
        this.A00 = j;
        if (j > 0 || !this.A02) {
            return;
        }
        A07();
    }

    public final boolean A05() {
        AIG<GBN<?>> aig = this.A01;
        if (aig == null) {
            return false;
        }
        GBN<?> gbnRemoveFirst = aig.isEmpty() ? null : aig.removeFirst();
        if (gbnRemoveFirst == null) {
            return false;
        }
        gbnRemoveFirst.run();
        return true;
    }

    @Override // X.GBK
    public final GBK limitedParallelism(int i, String str) {
        GBA.A00(i);
        return str != null ? new GBE(str, this) : this;
    }
}
