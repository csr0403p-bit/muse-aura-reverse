package com.google.android.gms.common.internal.safeparcel;

import X.C3cG;
import X.C60P;
import android.os.Parcel;

/* loaded from: classes5.dex */
public class SafeParcelReader$ParseException extends RuntimeException {
    /* JADX WARN: Illegal instructions before constructor call */
    public SafeParcelReader$ParseException(Parcel parcel, String str) {
        int iDataPosition = parcel.dataPosition();
        int iDataSize = parcel.dataSize();
        StringBuilder sbA0g = C3cG.A0g(str);
        sbA0g.append(" Parcel: pos=");
        sbA0g.append(iDataPosition);
        super(C60P.A1O(" size=", sbA0g, iDataSize));
    }
}
