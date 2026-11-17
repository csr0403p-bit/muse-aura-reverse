package com.google.android.gms.common.internal;

import X.AbstractC4100CmU;
import X.C4158CoD;
import X.CS7;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = C4158CoD.A03(28);
    public final int A00;
    public final IBinder A01;
    public final ConnectionResult A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (this != obj) {
                if (obj instanceof zav) {
                    zav zavVar = (zav) obj;
                    if (!this.A02.equals(zavVar.A02) || !CS7.A01(A00(), zavVar.A00())) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final IAccountAccessor A00() {
        IBinder iBinder = this.A01;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        return iInterfaceQueryLocalInterface instanceof IAccountAccessor ? (IAccountAccessor) iInterfaceQueryLocalInterface : new zzw("com.google.android.gms.common.internal.IAccountAccessor", iBinder);
    }

    public zav(IBinder iBinder, ConnectionResult connectionResult, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = iBinder;
        this.A02 = connectionResult;
        this.A03 = z;
        this.A04 = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A06(parcel, 1, this.A00);
        AbstractC4100CmU.A03(this.A01, parcel, 2);
        AbstractC4100CmU.A09(parcel, this.A02, 3, i);
        AbstractC4100CmU.A08(parcel, 4, this.A03);
        AbstractC4100CmU.A08(parcel, 5, this.A04);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
