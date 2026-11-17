package X;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.AYw, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1110AYw implements InterfaceC1180Adj {
    public static final AFs<C1110AYw, ?> A0A = new C0872AFu(C2282BSi.A00(0), C2278BSe.A00(26));
    public float A00;
    public final C00r A04;
    public final C00r A05 = new ParcelableSnapshotMutableIntState(0);
    public final C00r A03 = new ParcelableSnapshotMutableIntState(0);
    public final InterfaceC1072AWd A02 = new C1qN();
    public C00r A01 = new ParcelableSnapshotMutableIntState(Integer.MAX_VALUE);
    public final InterfaceC1180Adj A08 = new C6XV(C2295BSv.A00(this, 9));
    public final C1111AYx A07 = new C1111AYx(this);
    public final C1BO A06 = new BBP(null, C2292BSs.A00(this, 16));
    public final C1BO A09 = AbstractC1798ArH.A01(null, this, 17);

    public final void A01(int i) {
        this.A01.AdX(i);
        Snapshot snapshotA03 = Snapshot.A03();
        G0U g0uA1F = C8j3.A1F(snapshotA03);
        Snapshot snapshotA04 = Snapshot.A04(snapshotA03);
        try {
            C00r c00r = this.A04;
            if (c00r.AGd() > i) {
                c00r.AdX(i);
            }
        } finally {
            Snapshot.A07(snapshotA03, snapshotA04, g0uA1F);
        }
    }

    @Override // X.InterfaceC1180Adj
    public final float A98(float f) {
        return this.A08.A98(f);
    }

    @Override // X.InterfaceC1180Adj
    public final boolean ADN() {
        return C1BO.A0F(this.A09);
    }

    @Override // X.InterfaceC1180Adj
    public final boolean ADO() {
        return C1BO.A0F(this.A06);
    }

    @Override // X.InterfaceC1180Adj
    public final boolean AOz() {
        return this.A08.AOz();
    }

    /* JADX WARN: Incorrect types in method signature: (LX/3UY;LX/G0V<-LX/3Q0;-LX/HtJ<-Lkotlin/Unit;>;+Ljava/lang/Object;>;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    @Override // X.InterfaceC1180Adj
    public final Object AcF(C3UY c3uy, HtJ htJ, G0V g0v) {
        return C3cG.A0U(this.A08.AcF(c3uy, htJ, g0v));
    }

    public C1110AYw(int i) {
        this.A04 = new ParcelableSnapshotMutableIntState(i);
    }
}
