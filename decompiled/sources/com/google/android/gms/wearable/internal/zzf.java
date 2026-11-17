package com.google.android.gms.wearable.internal;

import X.AbstractC4100CmU;
import X.BV4;
import X.C4157CoC;
import X.CKg;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = C4157CoC.A00(38);
    public final zzfs A00;
    public final String A01;
    public final String A02;
    public final IntentFilter[] A03;

    public zzf() {
        this.A00 = null;
        throw BV4.A0a(CKg.__redex_internal_original_name);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        zzfs zzfsVar = this.A00;
        AbstractC4100CmU.A03(zzfsVar == null ? null : zzfsVar.asBinder(), parcel, 2);
        AbstractC4100CmU.A0E(parcel, this.A03, 3, i);
        AbstractC4100CmU.A0A(parcel, this.A01, 4);
        AbstractC4100CmU.A0A(parcel, this.A02, 5);
        AbstractC4100CmU.A05(parcel, iA00);
    }

    public zzf(IBinder iBinder, String str, String str2, IntentFilter[] intentFilterArr) {
        zzfs zzfqVar;
        if (iBinder != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            if (iInterfaceQueryLocalInterface instanceof zzfs) {
                zzfqVar = (zzfs) iInterfaceQueryLocalInterface;
            } else {
                zzfqVar = new zzfq("com.google.android.gms.wearable.internal.IWearableListener", iBinder);
            }
        } else {
            zzfqVar = null;
        }
        this.A00 = zzfqVar;
        this.A03 = intentFilterArr;
        this.A01 = str;
        this.A02 = str2;
    }
}
