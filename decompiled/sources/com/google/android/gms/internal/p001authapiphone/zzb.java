package com.google.android.gms.internal.p001authapiphone;

import X.AbstractC4119CnD;
import X.BV4;
import X.BV6;
import X.BV7;
import X.BV8;
import X.C60P;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

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
        zzaj zzajVar = (zzaj) this;
        if (i != 1) {
            return false;
        }
        Status status = (Status) BV8.A0V(parcel, Status.CREATOR);
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(C60P.A1O("Parcel data not fully consumed, unread size: ", BV4.A0p(BV7.A03(iDataAvail) + 45), iDataAvail));
        }
        AbstractC4119CnD.A00(status, zzajVar.A00, null);
        return true;
    }
}
