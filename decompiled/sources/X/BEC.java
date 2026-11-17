package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes4.dex */
public final class BEC implements InterfaceC1840AsD {
    public C1BO<Boolean> A00;

    public BEC() {
        this.A00 = E9X.A08 != null ? A00(this) : null;
    }

    public static final C1BO A00(BEC bec) {
        E9X e9xA00 = E9X.A00();
        if (e9xA00.A01() == 1) {
            return new BEE(true);
        }
        ParcelableSnapshotMutableState parcelableSnapshotMutableStateA08 = AbstractC1798ArH.A08(false);
        e9xA00.A06(new BED(parcelableSnapshotMutableStateA08, bec));
        return parcelableSnapshotMutableStateA08;
    }
}
