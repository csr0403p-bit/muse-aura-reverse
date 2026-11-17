package androidx.customview.view;

import X.C60O;
import X.I15;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public abstract class AbsSavedState implements Parcelable {
    public static final AbsSavedState A01 = new AbsSavedState() { // from class: androidx.customview.view.AbsSavedState.1
    };
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new I15(2);
    public final Parcelable A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }

    public AbsSavedState() {
        this.A00 = null;
    }

    public AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.A00 = parcelable == null ? A01 : parcelable;
    }

    public AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.A00 = parcelable == A01 ? null : parcelable;
            return;
        }
        throw C60O.A0i("superState must not be null");
    }
}
