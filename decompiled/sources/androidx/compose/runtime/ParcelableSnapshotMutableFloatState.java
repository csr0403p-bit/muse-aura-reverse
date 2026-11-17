package androidx.compose.runtime;

import X.AG4;
import X.AGE;
import X.AN5;
import X.AN8;
import X.ATF;
import X.AbstractC1798ArH;
import X.AnonymousClass001;
import X.BDh;
import X.BDo;
import X.BSH;
import X.C00q;
import X.C60O;
import X.C7384Etj;
import X.C8j5;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.Snapshot;

/* loaded from: classes4.dex */
public final class ParcelableSnapshotMutableFloatState extends AbstractC1798ArH implements C00q, AG4<Float>, Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableFloatState> CREATOR = new BSH(1);
    public AN5 A00;

    @Override // X.BDs
    public final AN8 AFh() {
        return this.A00;
    }

    @Override // X.C00q
    public final float AFn() {
        return ((AN5) BDh.A07(this, this.A00)).A00;
    }

    @Override // X.AG4
    public final ATF<Float> AIq() {
        return AGE.A00;
    }

    @Override // X.BDs
    public final void AYT(AN8 an8) {
        C7384Etj.A0Z(an8, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.A00 = (AN5) an8;
    }

    @Override // X.C00q
    public final void AdS(float f) {
        Snapshot snapshotA00;
        AN5 an5 = (AN5) BDh.A08(this.A00);
        if (an5.A00 != f) {
            AN5 an52 = this.A00;
            synchronized (BDh.A08) {
                snapshotA00 = BDh.A00();
                ((AN5) BDh.A03(snapshotA00, this, an52, an5)).A00 = f;
            }
            BDh.A0G(snapshotA00, this);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        AN5 an5 = (AN5) BDh.A08(this.A00);
        StringBuilder sbA0x = C60O.A0x("MutableFloatState(value=");
        sbA0x.append(an5.A00);
        return C8j5.A0V(this, sbA0x);
    }

    public ParcelableSnapshotMutableFloatState(float f) {
        Snapshot snapshotA00 = BDh.A00();
        long jA09 = snapshotA00.A09();
        AN5 an5 = new AN5();
        ((AN8) an5).A00 = jA09;
        an5.A00 = f;
        if (!(snapshotA00 instanceof BDo)) {
            AN5 an52 = new AN5();
            ((AN8) an52).A00 = 1L;
            an52.A00 = f;
            an5.A01 = an52;
        }
        this.A00 = an5;
    }

    @Override // androidx.compose.runtime.MutableState
    public final /* bridge */ /* synthetic */ void Af8(Object obj) {
        AdS(AnonymousClass001.A02(obj));
    }

    @Override // androidx.compose.runtime.MutableState, X.C1BO
    public final /* bridge */ /* synthetic */ Object getValue() {
        return Float.valueOf(AFn());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(AFn());
    }
}
