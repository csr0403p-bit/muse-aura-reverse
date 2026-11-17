package com.google.android.gms.wearable;

import X.AbstractC4100CmU;
import X.C4157CoC;
import X.FGI;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public class AppTheme extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AppTheme> CREATOR = C4157CoC.A00(58);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AppTheme) {
                AppTheme appTheme = (AppTheme) obj;
                if (this.A01 != appTheme.A01 || this.A00 != appTheme.A00 || this.A02 != appTheme.A02 || this.A03 != appTheme.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A01 * 31) + this.A00) * 31) + this.A02) * 31) + this.A03;
    }

    public final String toString() {
        return FGI.A0i("AppTheme {dynamicColor =", ", colorTheme =", ", screenAlignment =", ", screenItemsSize =", "}", this.A01, this.A00, this.A02, this.A03);
    }

    public AppTheme() {
        this.A00 = 0;
        this.A01 = 0;
        this.A02 = 0;
        this.A03 = 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        int i2 = this.A00;
        if (i2 == 0) {
            i2 = 1;
        }
        AbstractC4100CmU.A06(parcel, 1, i2);
        int i3 = this.A01;
        if (i3 == 0) {
            i3 = 1;
        }
        AbstractC4100CmU.A06(parcel, 2, i3);
        int i4 = this.A02;
        AbstractC4100CmU.A06(parcel, 3, i4 != 0 ? i4 : 1);
        int i5 = this.A03;
        AbstractC4100CmU.A06(parcel, 4, i5 != 0 ? i5 : 3);
        AbstractC4100CmU.A05(parcel, iA00);
    }

    public AppTheme(int i, int i2, int i3, int i4) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
    }
}
