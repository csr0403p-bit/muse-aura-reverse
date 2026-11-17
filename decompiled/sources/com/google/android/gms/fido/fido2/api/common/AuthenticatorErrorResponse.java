package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC4100CmU;
import X.AbstractC4295Csi;
import X.BV5;
import X.BV7;
import X.C3cI;
import X.C4158CoD;
import X.C4387Cun;
import X.C4441Cw5;
import X.CS7;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class AuthenticatorErrorResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorErrorResponse> CREATOR = C4158CoD.A03(49);
    public final ErrorCode A00;
    public final String A01;
    public final int A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorErrorResponse)) {
            return false;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
        if (CS7.A01(this.A00, authenticatorErrorResponse.A00) && CS7.A01(this.A01, authenticatorErrorResponse.A01)) {
            return CS7.A00(Integer.valueOf(this.A02), Integer.valueOf(authenticatorErrorResponse.A02));
        }
        return false;
    }

    public final int hashCode() {
        return BV7.A0E(this.A00, this.A01, Integer.valueOf(this.A02));
    }

    public AuthenticatorErrorResponse(int i, String str, int i2) throws ErrorCode.UnsupportedErrorCodeException {
        try {
            for (ErrorCode errorCode : ErrorCode.values()) {
                if (i == errorCode.zzb) {
                    this.A00 = errorCode;
                    this.A01 = str;
                    this.A02 = i2;
                    return;
                }
            }
            throw new ErrorCode.UnsupportedErrorCodeException(String.format(Locale.US, "Error code %d is not supported", BV5.A1Y(i)));
        } catch (ErrorCode.UnsupportedErrorCodeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final String toString() {
        String strA0Y = C3cI.A0Y(this);
        C4387Cun c4387Cun = new C4387Cun();
        String strValueOf = String.valueOf(this.A00.zzb);
        C4441Cw5 c4441Cw5 = new C4441Cw5();
        c4387Cun.A00 = c4441Cw5;
        c4441Cw5.A01 = strValueOf;
        c4441Cw5.A02 = "errorCode";
        String str = this.A01;
        if (str != null) {
            C4387Cun c4387Cun2 = new C4387Cun();
            c4441Cw5.A00 = c4387Cun2;
            c4387Cun2.A01 = str;
            c4387Cun2.A02 = "errorMessage";
        }
        return AbstractC4295Csi.A00(c4387Cun, strA0Y);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A06(parcel, 2, this.A00.zzb);
        AbstractC4100CmU.A0A(parcel, this.A01, 3);
        AbstractC4100CmU.A06(parcel, 4, this.A02);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
