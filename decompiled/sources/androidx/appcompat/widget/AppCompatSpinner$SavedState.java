package androidx.appcompat.widget;

import X.C10638I0i;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes6.dex */
public final class AppCompatSpinner$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<AppCompatSpinner$SavedState> CREATOR = new C10638I0i(12);
    public boolean A00;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.A00 ? (byte) 1 : (byte) 0);
    }
}
