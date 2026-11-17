package com.google.android.gms.common.internal.safeparcel;

import X.AbstractC4100CmU;
import X.C4387Cun;
import X.C7384Etj;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import java.util.Arrays;

/* loaded from: classes5.dex */
public abstract class AbstractSafeParcelable implements SafeParcelable {
    public static int A01(Parcel parcel) {
        C7384Etj.A0Y(parcel, 0);
        return AbstractC4100CmU.A01(parcel, 20293);
    }

    public static void A06(Parcel parcel, Parcelable parcelable, int i, int i2) {
        AbstractC4100CmU.A09(parcel, parcelable, 1, i);
        AbstractC4100CmU.A05(parcel, i2);
    }

    public static void A07(Parcel parcel, Parcelable parcelable, int i, int i2) {
        AbstractC4100CmU.A09(parcel, parcelable, 3, i);
        AbstractC4100CmU.A05(parcel, i2);
    }

    public static int A02(Parcel parcel, int i) {
        int iA01 = AbstractC4100CmU.A01(parcel, 20293);
        AbstractC4100CmU.A06(parcel, 1, i);
        return iA01;
    }

    public static Feature A03(String str, long j) {
        return new Feature(str, j);
    }

    public static C4387Cun A04(C4387Cun c4387Cun, Object obj, String str) {
        C4387Cun c4387Cun2 = new C4387Cun();
        c4387Cun.A00 = c4387Cun2;
        c4387Cun2.A01 = obj;
        c4387Cun2.A02 = str;
        return c4387Cun2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public static Integer A05(Object obj) {
        return Integer.valueOf(Arrays.hashCode(new Object[]{obj}));
    }
}
