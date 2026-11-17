package androidx.fragment.app;

import X.C10638I0i;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes6.dex */
public final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new C10638I0i(15);
    public final List<String> A00;
    public final List<BackStackRecordState> A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.A00);
        parcel.writeTypedList(this.A01);
    }

    public BackStackState(Parcel parcel) {
        this.A00 = parcel.createStringArrayList();
        this.A01 = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }
}
