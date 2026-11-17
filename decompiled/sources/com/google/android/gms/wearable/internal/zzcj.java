package com.google.android.gms.wearable.internal;

import X.AbstractC4100CmU;
import X.BV7;
import X.C4157CoC;
import X.C6tA;
import X.FGI;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class zzcj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcj> CREATOR = C4157CoC.A00(10);
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this != obj) {
            if (obj instanceof zzcj) {
                zzcj zzcjVar = (zzcj) obj;
                if (this.A00 != zzcjVar.A00 || ((str = this.A01) != (str2 = zzcjVar.A01) && (str == null || !str.equals(str2)))) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV7.A0D(Integer.valueOf(this.A00), this.A01);
    }

    public final String toString() {
        String strA0H;
        int i = this.A00;
        switch (i) {
            case C6tA.ERROR_REDIRECT_LOOP /* -9 */:
                strA0H = "Migration was cancelled";
                break;
            case C6tA.ERROR_TIMEOUT /* -8 */:
                strA0H = "Another migration is already in progress";
                break;
            case C6tA.ERROR_IO /* -7 */:
                strA0H = "Connect message malformed";
                break;
            case C6tA.ERROR_CONNECT /* -6 */:
                strA0H = "Migration status mismatch between watch and phone";
                break;
            case -5:
                strA0H = "Phone switching feature disabled";
                break;
            case -4:
                strA0H = "Did not receive connect msg";
                break;
            case -3:
                strA0H = "No bluetooth connection";
                break;
            case -2:
                strA0H = "Accounts mismatch";
                break;
            case -1:
                strA0H = "Unknown failure";
                break;
            case 0:
                strA0H = "Connected";
                break;
            case 1:
                strA0H = "Connection handshake in progress";
                break;
            case 2:
                strA0H = "Connection handshake complete";
                break;
            case 3:
                strA0H = "Sync with old node suspended";
                break;
            case 4:
                strA0H = "Control plane transport connected";
                break;
            case 5:
                strA0H = "Accounts Matched";
                break;
            case 6:
                strA0H = "Association to watch terminated";
                break;
            default:
                strA0H = FGI.A0H("Unrecognized state value: ", i);
                break;
        }
        return String.format("ConnectionStateEvent: address: %s, state: %s", this.A01, strA0H);
    }

    public zzcj(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A06(parcel, 1, this.A00);
        AbstractC4100CmU.A0A(parcel, this.A01, 2);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
