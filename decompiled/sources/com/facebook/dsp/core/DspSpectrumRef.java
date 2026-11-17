package com.facebook.dsp.core;

import X.C4158CoD;
import X.C7384Etj;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class DspSpectrumRef implements Parcelable {
    public static final Parcelable.Creator<DspSpectrumRef> CREATOR = C4158CoD.A03(3);
    public final int A00;
    public final Float A01;
    public final String A02;

    public DspSpectrumRef(Float f, String str, int i) {
        C7384Etj.A0Y(str, 0);
        this.A02 = str;
        this.A00 = i;
        this.A01 = f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C7384Etj.A0Y(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
        Float f = this.A01;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }
}
