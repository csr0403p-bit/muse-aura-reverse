package androidx.compose.runtime;

import X.AG4;
import X.AGE;
import X.AN3;
import X.AN8;
import X.ATF;
import X.AbstractC1798ArH;
import X.AnonymousClass001;
import X.BDh;
import X.BDo;
import X.BSH;
import X.C00r;
import X.C7384Etj;
import X.FGI;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.Snapshot;

/* loaded from: classes4.dex */
public final class ParcelableSnapshotMutableIntState extends AbstractC1798ArH implements C00r, AG4<Integer>, Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableIntState> CREATOR = new BSH(2);
    public AN3 A00;

    @Override // X.BDs
    public final AN8 AFh() {
        return this.A00;
    }

    @Override // X.C00r
    public final int AGd() {
        return ((AN3) BDh.A07(this, this.A00)).A00;
    }

    @Override // X.AG4
    public final ATF<Integer> AIq() {
        return AGE.A00;
    }

    @Override // X.BDs
    public final void AYT(AN8 an8) {
        C7384Etj.A0Z(an8, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.A00 = (AN3) an8;
    }

    @Override // X.C00r
    public final void AdX(int i) {
        Snapshot snapshotA00;
        AN3 an3 = (AN3) BDh.A08(this.A00);
        if (an3.A00 != i) {
            AN3 an32 = this.A00;
            synchronized (BDh.A08) {
                snapshotA00 = BDh.A00();
                ((AN3) BDh.A03(snapshotA00, this, an32, an3)).A00 = i;
            }
            BDh.A0G(snapshotA00, this);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return FGI.A0T("MutableIntState(value=", ")@", ((AN3) BDh.A08(this.A00)).A00, hashCode());
    }

    public ParcelableSnapshotMutableIntState(int i) {
        Snapshot snapshotA00 = BDh.A00();
        long jA09 = snapshotA00.A09();
        AN3 an3 = new AN3();
        ((AN8) an3).A00 = jA09;
        an3.A00 = i;
        if (!(snapshotA00 instanceof BDo)) {
            AN3 an32 = new AN3();
            ((AN8) an32).A00 = 1L;
            an32.A00 = i;
            an3.A01 = an32;
        }
        this.A00 = an3;
    }

    @Override // androidx.compose.runtime.MutableState
    public final /* bridge */ /* synthetic */ void Af8(Object obj) {
        AdX(AnonymousClass001.A0F(obj));
    }

    @Override // androidx.compose.runtime.MutableState, X.C1BO
    public final /* bridge */ /* synthetic */ Object getValue() {
        return Integer.valueOf(AGd());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(AGd());
    }
}
