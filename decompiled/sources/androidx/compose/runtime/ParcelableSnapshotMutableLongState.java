package androidx.compose.runtime;

import X.AG4;
import X.AGE;
import X.AN7;
import X.AN8;
import X.ATF;
import X.AbstractC1798ArH;
import X.BDh;
import X.BDo;
import X.BSH;
import X.C00s;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C8j5;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.Snapshot;

/* loaded from: classes4.dex */
public final class ParcelableSnapshotMutableLongState extends AbstractC1798ArH implements C00s, AG4<Long>, Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableLongState> CREATOR = new BSH(3);
    public AN7 A00;

    @Override // X.BDs
    public final AN8 AFh() {
        return this.A00;
    }

    @Override // X.C00s
    public final long AHH() {
        return ((AN7) BDh.A07(this, this.A00)).A00;
    }

    @Override // X.AG4
    public final ATF<Long> AIq() {
        return AGE.A00;
    }

    @Override // X.BDs
    public final void AYT(AN8 an8) {
        C7384Etj.A0Z(an8, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.A00 = (AN7) an8;
    }

    @Override // X.C00s
    public final void Adh(long j) {
        Snapshot snapshotA00;
        AN7 an7 = (AN7) BDh.A08(this.A00);
        if (an7.A00 != j) {
            AN7 an72 = this.A00;
            synchronized (BDh.A08) {
                snapshotA00 = BDh.A00();
                ((AN7) BDh.A03(snapshotA00, this, an72, an7)).A00 = j;
            }
            BDh.A0G(snapshotA00, this);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        AN7 an7 = (AN7) BDh.A08(this.A00);
        StringBuilder sbA0x = C60O.A0x("MutableLongState(value=");
        sbA0x.append(an7.A00);
        return C8j5.A0V(this, sbA0x);
    }

    public ParcelableSnapshotMutableLongState(long j) {
        Snapshot snapshotA00 = BDh.A00();
        long jA09 = snapshotA00.A09();
        AN7 an7 = new AN7();
        ((AN8) an7).A00 = jA09;
        an7.A00 = j;
        if (!(snapshotA00 instanceof BDo)) {
            AN7 an72 = new AN7();
            ((AN8) an72).A00 = 1L;
            an72.A00 = j;
            an7.A01 = an72;
        }
        this.A00 = an7;
    }

    @Override // androidx.compose.runtime.MutableState
    public final /* bridge */ /* synthetic */ void Af8(Object obj) {
        Adh(C3cG.A05(obj));
    }

    @Override // androidx.compose.runtime.MutableState, X.C1BO
    public final /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(AHH());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(AHH());
    }
}
