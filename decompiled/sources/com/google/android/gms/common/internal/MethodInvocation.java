package com.google.android.gms.common.internal;

import X.AbstractC4100CmU;
import X.C4158CoD;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MethodInvocation> CREATOR = C4158CoD.A03(26);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final String A07;
    public final String A08;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA02 = AbstractSafeParcelable.A02(parcel, this.A00);
        AbstractC4100CmU.A06(parcel, 2, this.A01);
        AbstractC4100CmU.A06(parcel, 3, this.A02);
        AbstractC4100CmU.A07(parcel, 4, this.A05);
        AbstractC4100CmU.A07(parcel, 5, this.A06);
        AbstractC4100CmU.A0A(parcel, this.A07, 6);
        AbstractC4100CmU.A0A(parcel, this.A08, 7);
        AbstractC4100CmU.A06(parcel, 8, this.A03);
        AbstractC4100CmU.A06(parcel, 9, this.A04);
        AbstractC4100CmU.A05(parcel, iA02);
    }

    public MethodInvocation(String str, String str2, int i, int i2, int i3, int i4, int i5, long j, long j2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A05 = j;
        this.A06 = j2;
        this.A07 = str;
        this.A08 = str2;
        this.A03 = i4;
        this.A04 = i5;
    }
}
