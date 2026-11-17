package com.google.android.gms.fido.fido2.api.common;

import X.C4158CoD;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public enum ErrorCode implements Parcelable {
    NOT_SUPPORTED_ERR(9),
    INVALID_STATE_ERR(11),
    SECURITY_ERR(18),
    NETWORK_ERR(19),
    ABORT_ERR(20),
    TIMEOUT_ERR(23),
    ENCODING_ERR(27),
    UNKNOWN_ERR(28),
    CONSTRAINT_ERR(29),
    DATA_ERR(30),
    NOT_ALLOWED_ERR(35),
    ATTESTATION_NOT_PRIVATE_ERR(36);

    public static final Parcelable.Creator<ErrorCode> CREATOR = C4158CoD.A03(50);
    public final int zzb;

    public class UnsupportedErrorCodeException extends Exception {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zzb);
    }

    ErrorCode(int i) {
        this.zzb = i;
    }
}
