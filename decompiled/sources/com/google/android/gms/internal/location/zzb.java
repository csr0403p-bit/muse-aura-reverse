package com.google.android.gms.internal.location;

import X.AbstractC4119CnD;
import X.BV6;
import X.BV8;
import X.C4200Cpj;
import X.C4363Cu8;
import X.C4380Cue;
import X.Cpe;
import X.InterfaceC4283CsI;
import X.RunnableC4282CsH;
import android.app.PendingIntent;
import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* loaded from: classes5.dex */
public abstract class zzb extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        C4200Cpj c4200CpjAjE;
        InterfaceC4283CsI c4363Cu8;
        if (i <= 16777215) {
            BV6.A0y(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        if (this instanceof zzq) {
            zzq zzqVar = (zzq) this;
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                zzqVar.Aje();
                return true;
            }
            zzl zzlVar = (zzl) BV8.A0V(parcel, zzl.CREATOR);
            Cpe.A00(parcel);
            zzqVar.Aja(zzlVar);
            return true;
        }
        if (this instanceof zzdv) {
            zzdv zzdvVar = (zzdv) this;
            if (i == 1) {
                LocationResult locationResult = (LocationResult) BV8.A0V(parcel, LocationResult.CREATOR);
                Cpe.A00(parcel);
                c4200CpjAjE = zzdvVar.A00.AjE();
                c4363Cu8 = new C4363Cu8(locationResult);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    zzdvVar.Ajg();
                    return true;
                }
                LocationAvailability locationAvailability = (LocationAvailability) BV8.A0V(parcel, LocationAvailability.CREATOR);
                Cpe.A00(parcel);
                c4200CpjAjE = zzdvVar.A00.AjE();
                c4363Cu8 = new C4380Cue(locationAvailability);
            }
            c4200CpjAjE.A00.execute(new RunnableC4282CsH(c4363Cu8, c4200CpjAjE));
            return true;
        }
        if (this instanceof zzdk) {
            zzdk zzdkVar = (zzdk) this;
            if (i != 1) {
                return false;
            }
            Status status = (Status) BV8.A0V(parcel, Status.CREATOR);
            Parcelable parcelableA0V = BV8.A0V(parcel, Location.CREATOR);
            Cpe.A00(parcel);
            AbstractC4119CnD.A00(status, zzdkVar.A00, parcelableA0V);
            return true;
        }
        zzdg zzdgVar = (zzdg) this;
        if (i == 1 || i == 2) {
            i3 = parcel.readInt();
            parcel.createStringArray();
        } else {
            if (i != 3) {
                return false;
            }
            i3 = parcel.readInt();
            BV8.A0V(parcel, PendingIntent.CREATOR);
        }
        Cpe.A00(parcel);
        if (i3 != 0 && (i3 < 1000 || i3 >= 1006)) {
            i3 = 13;
        }
        AbstractC4119CnD.A00(new Status(i3, null), zzdgVar.A00, null);
        return true;
    }
}
