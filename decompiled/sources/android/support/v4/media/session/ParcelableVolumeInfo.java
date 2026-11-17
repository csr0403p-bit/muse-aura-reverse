package android.support.v4.media.session;

import X.C10638I0i;
import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* loaded from: classes6.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C10638I0i(7);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
    }
}
