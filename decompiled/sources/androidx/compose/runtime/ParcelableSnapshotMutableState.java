package androidx.compose.runtime;

import X.AG5;
import X.AGE;
import X.AGG;
import X.AN1;
import X.AN8;
import X.ATF;
import X.AbstractC1798ArH;
import X.BDh;
import X.BDo;
import X.C0994AMz;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C8j5;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.Snapshot;

/* JADX WARN: Incorrect class signature: super class is equals to this class */
/* loaded from: classes4.dex */
public final class ParcelableSnapshotMutableState<T> extends AbstractC1798ArH implements Parcelable, Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new AN1();
    public C0994AMz<T> A00;
    public final ATF<T> A01;

    @Override // X.BDs
    public final AN8 AFh() {
        return this.A00;
    }

    public final ATF<T> AIq() {
        return this.A01;
    }

    @Override // X.BDs
    public final void AYT(AN8 an8) {
        C7384Etj.A0Z(an8, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.A00 = (C0994AMz) an8;
    }

    public final void Af8(T t) {
        Snapshot snapshotA00;
        C0994AMz c0994AMz = (C0994AMz) BDh.A08(this.A00);
        if (this.A01.AAp(c0994AMz.A00, t)) {
            return;
        }
        C0994AMz<T> c0994AMz2 = this.A00;
        synchronized (BDh.A08) {
            snapshotA00 = BDh.A00();
            ((C0994AMz) BDh.A03(snapshotA00, this, c0994AMz2, c0994AMz)).A00 = t;
        }
        BDh.A0G(snapshotA00, this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final T getValue() {
        return ((C0994AMz) BDh.A07(this, this.A00)).A00;
    }

    public final String toString() {
        C0994AMz c0994AMz = (C0994AMz) BDh.A08(this.A00);
        StringBuilder sbA0x = C60O.A0x("MutableState(value=");
        sbA0x.append(c0994AMz.A00);
        return C8j5.A0V(this, sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (TT;LX/ATF<TT;>;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public ParcelableSnapshotMutableState(ATF atf, Object obj) {
        this.A01 = atf;
        Snapshot snapshotA00 = BDh.A00();
        long jA09 = snapshotA00.A09();
        C0994AMz<T> c0994AMz = new C0994AMz<>();
        ((AN8) c0994AMz).A00 = jA09;
        c0994AMz.A00 = obj;
        if (!(snapshotA00 instanceof BDo)) {
            C0994AMz c0994AMz2 = new C0994AMz();
            ((AN8) c0994AMz2).A00 = 1L;
            c0994AMz2.A00 = obj;
            c0994AMz.A01 = c0994AMz2;
        }
        this.A00 = c0994AMz;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        ATF<T> atf = this.A01;
        if (C7384Etj.areEqual(atf, AGG.A00)) {
            i2 = 0;
        } else if (C7384Etj.areEqual(atf, AGE.A00)) {
            i2 = 1;
        } else {
            if (!C7384Etj.areEqual(atf, AG5.A00)) {
                throw C3cG.A0Q("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
