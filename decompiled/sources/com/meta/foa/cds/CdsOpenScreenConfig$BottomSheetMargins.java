package com.meta.foa.cds;

import X.C4157CoC;
import X.C7384Etj;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class CdsOpenScreenConfig$BottomSheetMargins implements Parcelable {
    public static final Parcelable.Creator<CdsOpenScreenConfig$BottomSheetMargins> CREATOR = new C4157CoC(69);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C7384Etj.A0Y(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public CdsOpenScreenConfig$BottomSheetMargins(int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
    }
}
