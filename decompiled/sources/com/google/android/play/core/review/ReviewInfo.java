package com.google.android.play.core.review;

import X.C4157CoC;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public abstract class ReviewInfo implements Parcelable {
    public static final Parcelable.Creator<ReviewInfo> CREATOR = C4157CoC.A00(62);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zza zzaVar = (zza) this;
        parcel.writeParcelable(zzaVar.A00, 0);
        parcel.writeInt(zzaVar.A01 ? 1 : 0);
    }
}
