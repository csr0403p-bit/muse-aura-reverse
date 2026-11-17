package com.google.android.gms.wearable.internal;

import X.AbstractC4100CmU;
import X.AnonymousClass001;
import X.C4157CoC;
import X.C60O;
import X.Cax;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class zzgp extends AbstractSafeParcelable implements Cax {
    public static final Parcelable.Creator<zzgp> CREATOR = C4157CoC.A00(39);
    public final String A00;
    public final String A01;
    public final byte[] A02;
    public final int A03;

    public final String toString() {
        int i = this.A03;
        String str = this.A00;
        byte[] bArr = this.A02;
        String string = (bArr == null ? HatchCcvLoggingKt.NO_POSTAL_FIELD : Integer.valueOf(bArr.length)).toString();
        StringBuilder sbA0y = C60O.A0y("MessageEventParcelable[", i);
        sbA0y.append(",");
        sbA0y.append(str);
        sbA0y.append(", size=");
        sbA0y.append(string);
        return AnonymousClass001.A0v("]", sbA0y);
    }

    public zzgp(String str, String str2, byte[] bArr, int i) {
        this.A03 = i;
        this.A00 = str;
        this.A02 = bArr;
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A06(parcel, 2, this.A03);
        AbstractC4100CmU.A0A(parcel, this.A00, 3);
        AbstractC4100CmU.A0D(parcel, this.A02, 4);
        AbstractC4100CmU.A0A(parcel, this.A01, 5);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
