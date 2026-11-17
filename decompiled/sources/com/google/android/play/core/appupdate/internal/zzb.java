package com.google.android.play.core.appupdate.internal;

import X.BV6;
import X.BV8;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes5.dex */
public abstract class zzb extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            BV6.A0y(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        zzg zzgVar = (zzg) this;
        if (i == 2) {
            Bundle bundle = (Bundle) BV8.A0V(parcel, Bundle.CREATOR);
            int iDataAvail = parcel.dataAvail();
            if (iDataAvail > 0) {
                throw BV8.A0U(iDataAvail);
            }
            zzgVar.AjW(bundle);
            return true;
        }
        if (i != 3) {
            return false;
        }
        Bundle bundle2 = (Bundle) BV8.A0V(parcel, Bundle.CREATOR);
        int iDataAvail2 = parcel.dataAvail();
        if (iDataAvail2 > 0) {
            throw BV8.A0U(iDataAvail2);
        }
        zzgVar.AjT(bundle2);
        return true;
    }
}
