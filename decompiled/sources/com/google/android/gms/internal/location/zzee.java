package com.google.android.gms.internal.location;

import X.AbstractC4100CmU;
import X.C4158CoD;
import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class zzee extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzee> CREATOR = C4158CoD.A03(70);
    public final int A00;
    public final PendingIntent A01;
    public final IBinder A02;
    public final IBinder A03;
    public final String A04;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA02 = AbstractSafeParcelable.A02(parcel, this.A00);
        AbstractC4100CmU.A03(this.A02, parcel, 2);
        AbstractC4100CmU.A03(this.A03, parcel, 3);
        AbstractC4100CmU.A09(parcel, this.A01, 4, i);
        AbstractC4100CmU.A0A(parcel, this.A04, 6);
        AbstractC4100CmU.A05(parcel, iA02);
    }

    public zzee(PendingIntent pendingIntent, IBinder iBinder, IBinder iBinder2, String str, int i) {
        this.A00 = i;
        this.A02 = iBinder;
        this.A03 = iBinder2;
        this.A01 = pendingIntent;
        this.A04 = str;
    }
}
