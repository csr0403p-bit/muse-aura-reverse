package com.google.android.gms.wearable.internal;

import X.AbstractC4100CmU;
import X.BV7;
import X.C4157CoC;
import X.C60O;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes5.dex */
public final class zzcl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcl> CREATOR = C4157CoC.A00(11);
    public final int A00;
    public final List A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zzcl) {
                zzcl zzclVar = (zzcl) obj;
                if (this.A00 == zzclVar.A00 && this.A02 == zzclVar.A02 && this.A03 == zzclVar.A03 && this.A04 == zzclVar.A04 && this.A05 == zzclVar.A05) {
                    List list = zzclVar.A01;
                    List list2 = this.A01;
                    if (list2 == null ? list2 != list : list == null || !list2.containsAll(list) || list2.size() != list.size()) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), Boolean.valueOf(this.A02), Boolean.valueOf(this.A03), Boolean.valueOf(this.A04), Boolean.valueOf(this.A05), this.A01});
    }

    public final String toString() {
        int i = this.A00;
        boolean z = this.A02;
        boolean z2 = this.A03;
        boolean z3 = this.A04;
        boolean z4 = this.A05;
        String strValueOf = String.valueOf(this.A01);
        StringBuilder sbA0y = C60O.A0y("ConsentResponse {statusCode =", i);
        sbA0y.append(", hasTosConsent =");
        sbA0y.append(z);
        sbA0y.append(", hasLoggingConsent =");
        sbA0y.append(z2);
        sbA0y.append(", hasCloudSyncConsent =");
        sbA0y.append(z3);
        sbA0y.append(", hasLocationConsent =");
        sbA0y.append(z4);
        sbA0y.append(", accountConsentRecords =");
        sbA0y.append(strValueOf);
        return BV7.A11(sbA0y);
    }

    public zzcl(List list, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = i;
        this.A02 = z;
        this.A03 = z2;
        this.A04 = z3;
        this.A05 = z4;
        this.A01 = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A06(parcel, 1, this.A00);
        AbstractC4100CmU.A08(parcel, 2, this.A02);
        AbstractC4100CmU.A08(parcel, 3, this.A03);
        AbstractC4100CmU.A08(parcel, 4, this.A04);
        AbstractC4100CmU.A08(parcel, 5, this.A05);
        AbstractC4100CmU.A0C(parcel, this.A01, 6);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
