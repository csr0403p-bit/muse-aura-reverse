package androidx.fragment.app;

import X.C10638I0i;
import X.C3cG;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new C10638I0i(17);
    public int A00;
    public ArrayList<String> A02;
    public ArrayList<String> A03;
    public ArrayList<FragmentManager$LaunchedFragmentInfo> A06;
    public BackStackRecordState[] A07;
    public String A01 = null;
    public ArrayList<String> A04 = C3cG.A0h();
    public ArrayList<BackStackState> A05 = C3cG.A0h();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.A02);
        parcel.writeStringList(this.A03);
        parcel.writeTypedArray(this.A07, i);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01);
        parcel.writeStringList(this.A04);
        parcel.writeTypedList(this.A05);
        parcel.writeTypedList(this.A06);
    }
}
