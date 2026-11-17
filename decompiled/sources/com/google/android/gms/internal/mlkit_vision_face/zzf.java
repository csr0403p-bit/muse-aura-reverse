package com.google.android.gms.internal.mlkit_vision_face;

import X.AbstractC4100CmU;
import X.C4158CoD;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = C4158CoD.A03(78);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final int A0B;
    public final int A0C;
    public final zzd[] A0D;
    public final zzn[] A0E;

    public zzf(zzd[] zzdVarArr, zzn[] zznVarArr, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, int i, int i2) {
        this.A0B = i;
        this.A0C = i2;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
        this.A04 = f5;
        this.A05 = f6;
        this.A06 = f7;
        this.A0E = zznVarArr;
        this.A07 = f8;
        this.A08 = f9;
        this.A09 = f10;
        this.A0D = zzdVarArr;
        this.A0A = f11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A06(parcel, 1, this.A0B);
        AbstractC4100CmU.A06(parcel, 2, this.A0C);
        AbstractC4100CmU.A04(parcel, this.A00, 3);
        AbstractC4100CmU.A04(parcel, this.A01, 4);
        AbstractC4100CmU.A04(parcel, this.A02, 5);
        AbstractC4100CmU.A04(parcel, this.A03, 6);
        AbstractC4100CmU.A04(parcel, this.A04, 7);
        AbstractC4100CmU.A04(parcel, this.A05, 8);
        AbstractC4100CmU.A0E(parcel, this.A0E, 9, i);
        AbstractC4100CmU.A04(parcel, this.A07, 10);
        AbstractC4100CmU.A04(parcel, this.A08, 11);
        AbstractC4100CmU.A04(parcel, this.A09, 12);
        AbstractC4100CmU.A0E(parcel, this.A0D, 13, i);
        AbstractC4100CmU.A04(parcel, this.A06, 14);
        AbstractC4100CmU.A04(parcel, this.A0A, 15);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
