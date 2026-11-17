package com.facebook.video.heroplayer.ipc;

import X.BV7;
import X.BWp;
import X.C60O;
import X.C7580F4t;
import X.C8j3;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class AudioFocusLossSettings implements Parcelable {
    public static final Parcelable.Creator<AudioFocusLossSettings> CREATOR = new C7580F4t(20);
    public final float A00;
    public final BWp A01;
    public final BWp A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AudioFocusLossSettings) {
                AudioFocusLossSettings audioFocusLossSettings = (AudioFocusLossSettings) obj;
                if (Float.compare(audioFocusLossSettings.A00, this.A00) != 0 || this.A01 != audioFocusLossSettings.A01 || this.A02 != audioFocusLossSettings.A02) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return BV7.A0E(this.A01, this.A02, Float.valueOf(this.A00));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("AudioFocusLossSettings{mAudioFocusLossBehavior=");
        sbA0x.append(this.A01);
        sbA0x.append(", mAudioFocusTransientLossBehavior=");
        sbA0x.append(this.A02);
        sbA0x.append(", mAudioFocusTransientLossDuckVolume=");
        sbA0x.append(this.A00);
        return C8j3.A15(sbA0x);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01.name());
        parcel.writeString(this.A02.name());
        parcel.writeFloat(this.A00);
    }

    public AudioFocusLossSettings(Parcel parcel) {
        String string = parcel.readString();
        this.A01 = string == null ? BWp.NONE : BWp.valueOf(string);
        String string2 = parcel.readString();
        this.A02 = string2 == null ? BWp.NONE : BWp.valueOf(string2);
        this.A00 = parcel.readFloat();
    }

    public AudioFocusLossSettings(BWp bWp, BWp bWp2) {
        this.A01 = bWp;
        this.A02 = bWp2;
        this.A00 = -1.0f;
    }

    public AudioFocusLossSettings() {
        this.A01 = BWp.PAUSE;
        this.A02 = BWp.NONE;
        this.A00 = 0.0f;
    }
}
