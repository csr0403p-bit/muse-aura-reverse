package androidx.fragment.app;

import X.C10638I0i;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class FragmentManager$LaunchedFragmentInfo implements Parcelable {
    public static final Parcelable.Creator<FragmentManager$LaunchedFragmentInfo> CREATOR = new C10638I0i(16);
    public int A00;
    public String A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
    }
}
