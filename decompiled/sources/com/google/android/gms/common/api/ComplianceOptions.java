package com.google.android.gms.common.api;

import X.AbstractC4100CmU;
import X.BV6;
import X.BV7;
import X.C4158CoD;
import X.C60O;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class ComplianceOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ComplianceOptions> CREATOR = C4158CoD.A03(20);
    public final int A00;
    public final int A01;
    public final int A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (!(obj instanceof ComplianceOptions)) {
            return false;
        }
        ComplianceOptions complianceOptions = (ComplianceOptions) obj;
        return this.A00 == complianceOptions.A00 && this.A01 == complianceOptions.A01 && this.A02 == complianceOptions.A02 && this.A03 == complianceOptions.A03;
    }

    public final int hashCode() {
        return BV6.A0A(Integer.valueOf(this.A00), Integer.valueOf(this.A01), Integer.valueOf(this.A02), Boolean.valueOf(this.A03));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ComplianceOptions{callerProductId=");
        sbA0x.append(this.A00);
        sbA0x.append(", dataOwnerProductId=");
        sbA0x.append(this.A01);
        sbA0x.append(", processingReason=");
        sbA0x.append(this.A02);
        sbA0x.append(", isUserData=");
        sbA0x.append(this.A03);
        return BV7.A11(sbA0x);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA02 = AbstractSafeParcelable.A02(parcel, this.A00);
        AbstractC4100CmU.A06(parcel, 2, this.A01);
        AbstractC4100CmU.A06(parcel, 3, this.A02);
        AbstractC4100CmU.A08(parcel, 4, this.A03);
        AbstractC4100CmU.A05(parcel, iA02);
    }

    public ComplianceOptions(int i, int i2, int i3, boolean z) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = z;
    }
}
