package com.google.android.gms.fido.common;

import X.C4158CoD;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes5.dex */
public enum Transport implements ReflectedParcelable {
    /* JADX INFO: Fake field, exist only in values array */
    BLUETOOTH_CLASSIC("bt"),
    /* JADX INFO: Fake field, exist only in values array */
    BLUETOOTH_LOW_ENERGY("ble"),
    /* JADX INFO: Fake field, exist only in values array */
    NFC("nfc"),
    /* JADX INFO: Fake field, exist only in values array */
    USB("usb"),
    /* JADX INFO: Fake field, exist only in values array */
    INTERNAL("internal"),
    HYBRID("cable"),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_V2("hybrid");

    public static final Parcelable.Creator<Transport> CREATOR = C4158CoD.A03(39);
    public final String zzc;

    public class UnsupportedTransportException extends Exception {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzc);
    }

    Transport(String str) {
        this.zzc = str;
    }
}
