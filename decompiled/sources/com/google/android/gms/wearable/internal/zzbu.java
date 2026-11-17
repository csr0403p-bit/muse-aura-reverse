package com.google.android.gms.wearable.internal;

import X.AbstractC4100CmU;
import X.C3cG;
import X.C4157CoC;
import X.C60P;
import X.CRy;
import X.CS7;
import X.FGI;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelClient$Channel;

/* loaded from: classes5.dex */
public final class zzbu extends AbstractSafeParcelable implements Channel, ChannelClient$Channel {
    public static final Parcelable.Creator<zzbu> CREATOR = C4157CoC.A00(5);
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof zzbu) {
                zzbu zzbuVar = (zzbu) obj;
                if (!this.A00.equals(zzbuVar.A00) || !CS7.A01(zzbuVar.A01, this.A01) || !CS7.A01(zzbuVar.A02, this.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        String str = this.A00;
        int i = 0;
        for (char c : str.toCharArray()) {
            i += c;
        }
        String strTrim = str.trim();
        int length = strTrim.length();
        if (length > 25) {
            String strSubstring = strTrim.substring(0, 10);
            String strSubstring2 = strTrim.substring(length - 10, length);
            StringBuilder sbA0g = C3cG.A0g(strSubstring);
            sbA0g.append("...");
            sbA0g.append(strSubstring2);
            strTrim = C60P.A1O("::", sbA0g, i);
        }
        return FGI.A0k("Channel{token=", strTrim, ", nodeId=", this.A01, ", path=", this.A02, "}");
    }

    public zzbu(String str, String str2, String str3) {
        CRy.A03(str);
        this.A00 = str;
        CRy.A03(str2);
        this.A01 = str2;
        CRy.A03(str3);
        this.A02 = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A0A(parcel, this.A00, 2);
        AbstractC4100CmU.A0A(parcel, this.A01, 3);
        AbstractC4100CmU.A0A(parcel, this.A02, 4);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
