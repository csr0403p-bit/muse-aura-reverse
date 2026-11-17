package android.support.v4.media;

import X.C10638I0i;
import X.FGI;
import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* loaded from: classes6.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C10638I0i(3);
    public Object A00;
    public final float A01;
    public final int A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.A02;
    }

    public final String toString() {
        int i = this.A02;
        float f = this.A01;
        return FGI.A0W("Rating:style=", " rating=", f < 0.0f ? "unrated" : String.valueOf(f), i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02);
        parcel.writeFloat(this.A01);
    }

    public RatingCompat(int i, float f) {
        this.A02 = i;
        this.A01 = f;
    }
}
