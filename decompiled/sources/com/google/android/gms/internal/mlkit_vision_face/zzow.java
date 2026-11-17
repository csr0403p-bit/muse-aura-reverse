package com.google.android.gms.internal.mlkit_vision_face;

import X.AbstractC4100CmU;
import X.C4158CoD;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* loaded from: classes5.dex */
public final class zzow extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzow> CREATOR = C4158CoD.A03(84);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final int A06;
    public final Rect A07;
    public final List A08;
    public final List A09;
    public final float A0A;

    public zzow(Rect rect, List list, List list2, float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        this.A06 = i;
        this.A07 = rect;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
        this.A04 = f5;
        this.A05 = f6;
        this.A0A = f7;
        this.A08 = list;
        this.A09 = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A06(parcel, 1, this.A06);
        AbstractC4100CmU.A09(parcel, this.A07, 2, i);
        AbstractC4100CmU.A04(parcel, this.A00, 3);
        AbstractC4100CmU.A04(parcel, this.A01, 4);
        AbstractC4100CmU.A04(parcel, this.A02, 5);
        AbstractC4100CmU.A04(parcel, this.A03, 6);
        AbstractC4100CmU.A04(parcel, this.A04, 7);
        AbstractC4100CmU.A04(parcel, this.A05, 8);
        AbstractC4100CmU.A04(parcel, this.A0A, 9);
        AbstractC4100CmU.A0C(parcel, this.A08, 10);
        AbstractC4100CmU.A0C(parcel, this.A09, 11);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
