package X;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.functions.Function0;

/* renamed from: X.ArH, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1798ArH implements BDs {
    public final C1726ApH A00 = new C1726ApH(0);

    public static BBP A00(BBI bbi, Function0 function0) {
        BBP bbp = new BBP(null, function0);
        BBI.A0O(bbi, bbp);
        return bbp;
    }

    public static BBP A02(Object obj, int i) {
        return new BBP(null, new C2328BUc(obj, i));
    }

    public static ParcelableSnapshotMutableState A03() {
        return new ParcelableSnapshotMutableState(AGE.A00, null);
    }

    public static BBP A01(ATF atf, Object obj, int i) {
        return new BBP(atf, new C2292BSs(obj, i));
    }

    public static ParcelableSnapshotMutableState A04(BBI bbi, Object obj) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(AGE.A00, obj);
        BBI.A0O(bbi, parcelableSnapshotMutableState);
        return parcelableSnapshotMutableState;
    }

    public static ParcelableSnapshotMutableState A06(Object obj) {
        return new ParcelableSnapshotMutableState(AGE.A00, obj);
    }

    public static ParcelableSnapshotMutableState A07(Object obj, Object obj2) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(AGE.A00, obj);
        BBI.A0O((BBI) obj2, parcelableSnapshotMutableState);
        return parcelableSnapshotMutableState;
    }

    public final void A0B(int i) {
        C1726ApH c1726ApH;
        int i2;
        do {
            c1726ApH = this.A00;
            i2 = c1726ApH.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!c1726ApH.compareAndSet(i2, i2 | i));
    }

    @Override // X.BDs
    public final /* synthetic */ AN8 AQi(AN8 an8, AN8 an82, AN8 an83) {
        int i;
        if (this instanceof ParcelableSnapshotMutableState) {
            C7384Etj.A0Z(an8, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
            C7384Etj.A0Z(an82, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
            C7384Etj.A0Z(an83, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
            if (((ParcelableSnapshotMutableState) this).A01.AAp(((C0994AMz) an82).A00, ((C0994AMz) an83).A00)) {
                return an82;
            }
            return null;
        }
        if (this instanceof ParcelableSnapshotMutableLongState) {
            C7384Etj.A0Z(an82, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
            C7384Etj.A0Z(an83, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
            i = (((AN7) an82).A00 > ((AN7) an83).A00 ? 1 : (((AN7) an82).A00 == ((AN7) an83).A00 ? 0 : -1));
        } else {
            if (this instanceof ParcelableSnapshotMutableIntState) {
                C7384Etj.A0Z(an82, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
                C7384Etj.A0Z(an83, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
                if (((AN3) an82).A00 == ((AN3) an83).A00) {
                    return an82;
                }
                return null;
            }
            if (!(this instanceof ParcelableSnapshotMutableFloatState)) {
                return null;
            }
            C7384Etj.A0Z(an82, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
            C7384Etj.A0Z(an83, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
            i = (((AN5) an82).A00 > ((AN5) an83).A00 ? 1 : (((AN5) an82).A00 == ((AN5) an83).A00 ? 0 : -1));
        }
        if (i == 0) {
            return an82;
        }
        return null;
    }

    public static ParcelableSnapshotMutableState A05(BBI bbi, boolean z) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(AGE.A00, Boolean.valueOf(z));
        BBI.A0O(bbi, parcelableSnapshotMutableState);
        return parcelableSnapshotMutableState;
    }

    public static ParcelableSnapshotMutableState A08(boolean z) {
        return new ParcelableSnapshotMutableState(AGE.A00, Boolean.valueOf(z));
    }
}
