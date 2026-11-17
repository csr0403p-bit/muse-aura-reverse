package com.facebook.video.heroplayer.ipc;

import X.BV7;
import X.C7580F4t;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class SubtitleConfiguration implements Parcelable {
    public static final Parcelable.Creator<SubtitleConfiguration> CREATOR = new C7580F4t(24);
    public final Uri A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
        parcel.writeByte(this.A03 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A02);
    }

    public SubtitleConfiguration(Parcel parcel) {
        this.A00 = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.A01 = parcel.readString();
        this.A03 = BV7.A1Q(parcel.readByte());
        this.A02 = parcel.readString();
    }
}
