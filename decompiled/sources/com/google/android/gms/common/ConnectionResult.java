package com.google.android.gms.common;

import X.AbstractC4100CmU;
import X.BV7;
import X.C4158CoD;
import X.C7392EuT;
import X.CS7;
import X.FGI;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.aura.model.ReplyAttributionSerializer;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class ConnectionResult extends AbstractSafeParcelable {
    public static final ConnectionResult A04 = new ConnectionResult(0);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = C4158CoD.A03(37);
    public final int A00;
    public final int A01;
    public final PendingIntent A02;
    public final String A03;

    public ConnectionResult(int i) {
        this(null, null, 1, i);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ConnectionResult) {
                ConnectionResult connectionResult = (ConnectionResult) obj;
                if (this.A01 != connectionResult.A01 || !CS7.A01(this.A02, connectionResult.A02) || !CS7.A01(this.A03, connectionResult.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public static String A00(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        return FGI.A0I("UNKNOWN_ERROR_CODE(", i, ")");
                }
        }
    }

    public final int hashCode() {
        return BV7.A0E(Integer.valueOf(this.A01), this.A02, this.A03);
    }

    public final String toString() {
        C7392EuT c7392EuT = new C7392EuT(this);
        c7392EuT.A00(A00(this.A01), "statusCode");
        c7392EuT.A00(this.A02, "resolution");
        c7392EuT.A00(this.A03, ReplyAttributionSerializer.TYPE_MESSAGE);
        return c7392EuT.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA02 = AbstractSafeParcelable.A02(parcel, this.A00);
        AbstractC4100CmU.A06(parcel, 2, this.A01);
        AbstractC4100CmU.A09(parcel, this.A02, 3, i);
        AbstractC4100CmU.A0A(parcel, this.A03, 4);
        AbstractC4100CmU.A05(parcel, iA02);
    }

    public ConnectionResult(PendingIntent pendingIntent, String str, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = pendingIntent;
        this.A03 = str;
    }
}
