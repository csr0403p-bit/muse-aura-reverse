package androidx.swiperefreshlayout.widget;

import X.AnonymousClass002;
import X.C10638I0i;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes6.dex */
public final class SwipeRefreshLayout$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<SwipeRefreshLayout$SavedState> CREATOR = new C10638I0i(24);
    public final boolean A00;

    public SwipeRefreshLayout$SavedState(Parcel parcel) {
        super(parcel);
        this.A00 = AnonymousClass002.A1L(parcel.readByte());
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.A00 ? (byte) 1 : (byte) 0);
    }

    public SwipeRefreshLayout$SavedState(Parcelable parcelable, boolean z) {
        super(parcelable);
        this.A00 = z;
    }
}
