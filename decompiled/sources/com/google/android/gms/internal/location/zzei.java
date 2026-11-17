package com.google.android.gms.internal.location;

import X.AbstractC4100CmU;
import X.C4158CoD;
import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.zzw;
import com.google.android.gms.location.zzx;
import com.google.android.gms.location.zzz;

@Deprecated
/* loaded from: classes5.dex */
public final class zzei extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzei> CREATOR = C4158CoD.A03(72);
    public final int A00;
    public final PendingIntent A01;
    public final zzeg A02;
    public final zzr A03;
    public final zzw A04;
    public final zzz A05;
    public final String A06;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA02 = AbstractSafeParcelable.A02(parcel, this.A00);
        AbstractC4100CmU.A09(parcel, this.A02, 2, i);
        zzz zzzVar = this.A05;
        AbstractC4100CmU.A03(zzzVar == null ? null : zzzVar.asBinder(), parcel, 3);
        AbstractC4100CmU.A09(parcel, this.A01, 4, i);
        zzw zzwVar = this.A04;
        AbstractC4100CmU.A03(zzwVar == null ? null : zzwVar.asBinder(), parcel, 5);
        zzr zzrVar = this.A03;
        AbstractC4100CmU.A03(zzrVar != null ? zzrVar.asBinder() : null, parcel, 6);
        AbstractC4100CmU.A0A(parcel, this.A06, 8);
        AbstractC4100CmU.A05(parcel, iA02);
    }

    public zzei(PendingIntent pendingIntent, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, zzeg zzegVar, String str, int i) {
        zzz zzxVar;
        zzw zzuVar;
        this.A00 = i;
        this.A02 = zzegVar;
        zzr zzpVar = null;
        if (iBinder != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            zzxVar = iInterfaceQueryLocalInterface instanceof zzz ? (zzz) iInterfaceQueryLocalInterface : new zzx("com.google.android.gms.location.ILocationListener", iBinder);
        } else {
            zzxVar = null;
        }
        this.A05 = zzxVar;
        this.A01 = pendingIntent;
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            zzuVar = iInterfaceQueryLocalInterface2 instanceof zzw ? (zzw) iInterfaceQueryLocalInterface2 : new com.google.android.gms.location.zzu("com.google.android.gms.location.ILocationCallback", iBinder2);
        } else {
            zzuVar = null;
        }
        this.A04 = zzuVar;
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzpVar = iInterfaceQueryLocalInterface3 instanceof zzr ? (zzr) iInterfaceQueryLocalInterface3 : new zzp("com.google.android.gms.location.internal.IFusedLocationProviderCallback", iBinder3);
        }
        this.A03 = zzpVar;
        this.A06 = str;
    }
}
