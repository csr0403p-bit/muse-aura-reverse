package com.facebook.video.heroplayer.ipc;

import X.BV7;
import X.C7580F4t;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class SpatialAudioFocusParams implements Parcelable {
    public static final Parcelable.Creator<SpatialAudioFocusParams> CREATOR = new C7580F4t(23);
    public final double A00;
    public final double A01;
    public final boolean A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.A02 ? (byte) 1 : (byte) 0);
        parcel.writeDouble(this.A01);
        parcel.writeDouble(this.A00);
    }

    public SpatialAudioFocusParams(Parcel parcel) {
        this.A02 = BV7.A1Q(parcel.readByte());
        this.A01 = parcel.readDouble();
        this.A00 = parcel.readDouble();
    }
}
