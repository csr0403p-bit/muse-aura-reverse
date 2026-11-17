package com.facebook.dsp.core;

import X.C4158CoD;
import X.C7384Etj;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class ColorData implements Parcelable {
    public static final Parcelable.Creator<ColorData> CREATOR = new C4158CoD(2);
    public final int A00;
    public final int A01;
    public final DspSpectrumRef A02;
    public final DspSpectrumRef A03;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C7384Etj.A0Y(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        DspSpectrumRef dspSpectrumRef = this.A03;
        if (dspSpectrumRef == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dspSpectrumRef.writeToParcel(parcel, i);
        }
        DspSpectrumRef dspSpectrumRef2 = this.A02;
        if (dspSpectrumRef2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dspSpectrumRef2.writeToParcel(parcel, i);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ColorData(DspSpectrumRef dspSpectrumRef, DspSpectrumRef dspSpectrumRef2, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A03 = dspSpectrumRef;
        this.A02 = dspSpectrumRef2;
    }
}
