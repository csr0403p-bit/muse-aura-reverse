package com.google.android.gms.auth.api.identity;

import X.AbstractC4100CmU;
import X.BV7;
import X.C4158CoD;
import X.CRy;
import X.CS7;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* loaded from: classes5.dex */
public final class GetSignInIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetSignInIntentRequest> CREATOR = C4158CoD.A03(8);
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (!(obj instanceof GetSignInIntentRequest)) {
            return false;
        }
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) obj;
        return CS7.A01(this.A01, getSignInIntentRequest.A01) && CS7.A01(this.A04, getSignInIntentRequest.A04) && CS7.A01(this.A02, getSignInIntentRequest.A02) && CS7.A01(Boolean.valueOf(this.A05), Boolean.valueOf(getSignInIntentRequest.A05)) && this.A00 == getSignInIntentRequest.A00;
    }

    public final int hashCode() {
        return BV7.A0F(this.A01, this.A02, this.A04, Boolean.valueOf(this.A05), Integer.valueOf(this.A00));
    }

    public GetSignInIntentRequest(String str, int i, String str2, String str3, String str4, boolean z) {
        CRy.A03(str);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = z;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A0A(parcel, this.A01, 1);
        AbstractC4100CmU.A0A(parcel, this.A02, 2);
        AbstractC4100CmU.A0A(parcel, this.A03, 3);
        AbstractC4100CmU.A0A(parcel, this.A04, 4);
        AbstractC4100CmU.A08(parcel, 5, this.A05);
        AbstractC4100CmU.A06(parcel, 6, this.A00);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
