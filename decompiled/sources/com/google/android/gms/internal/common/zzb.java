package com.google.android.gms.internal.common;

import X.AbstractC4160CoH;
import X.BV6;
import X.BV8;
import X.C4353Ctv;
import X.CRy;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.common.zzj;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes5.dex */
public abstract class zzb extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public static void A01(Parcel parcel, zzb zzbVar, String str) {
        parcel.writeInterfaceToken(str);
        parcel.writeStrongBinder(zzbVar.asBinder());
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        IBinder strongBinder;
        Bundle bundle;
        if (i <= 16777215) {
            BV6.A0y(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        if (this instanceof zzz) {
            zzz zzzVar = (zzz) this;
            if (i == 1) {
                ObjectWrapper objectWrapper = new ObjectWrapper(((zzj) zzzVar).A01());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(objectWrapper.asBinder());
                return true;
            }
            if (i != 2) {
                return false;
            }
            int i4 = ((zzj) zzzVar).A00;
            parcel2.writeNoException();
            parcel2.writeInt(i4);
            return true;
        }
        if (!(this instanceof zzd)) {
            return false;
        }
        zzd zzdVar = (zzd) this;
        if (i == 1) {
            i3 = parcel.readInt();
            strongBinder = parcel.readStrongBinder();
            bundle = (Bundle) BV8.A0V(parcel, Bundle.CREATOR);
            int iDataAvail = parcel.dataAvail();
            if (iDataAvail > 0) {
                throw BV8.A0U(iDataAvail);
            }
        } else {
            if (i == 2) {
                parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                if (parcel.readInt() != 0) {
                    creator.createFromParcel(parcel);
                }
                int iDataAvail2 = parcel.dataAvail();
                if (iDataAvail2 > 0) {
                    throw BV8.A0U(iDataAvail2);
                }
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
                parcel2.writeNoException();
                return true;
            }
            if (i != 3) {
                return false;
            }
            i3 = parcel.readInt();
            strongBinder = parcel.readStrongBinder();
            zzk zzkVar = (zzk) BV8.A0V(parcel, zzk.CREATOR);
            int iDataAvail3 = parcel.dataAvail();
            if (iDataAvail3 > 0) {
                throw BV8.A0U(iDataAvail3);
            }
            AbstractC4160CoH abstractC4160CoH = zzdVar.A00;
            CRy.A04(abstractC4160CoH, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            CRy.A03(zzkVar);
            abstractC4160CoH.A0L = zzkVar;
            if (abstractC4160CoH.A06()) {
                ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzkVar.A02;
                C4353Ctv c4353CtvA00 = C4353Ctv.A00();
                RootTelemetryConfiguration rootTelemetryConfiguration = connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.A01;
                synchronized (c4353CtvA00) {
                    if (rootTelemetryConfiguration == null) {
                        rootTelemetryConfiguration = C4353Ctv.A02;
                    } else {
                        RootTelemetryConfiguration rootTelemetryConfiguration2 = c4353CtvA00.A00;
                        if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.A00 < rootTelemetryConfiguration.A00) {
                        }
                    }
                    c4353CtvA00.A00 = rootTelemetryConfiguration;
                }
            }
            bundle = zzkVar.A01;
        }
        CRy.A04(zzdVar.A00, "onPostInitComplete can be called only once per call to getRemoteService");
        zzdVar.A00.A05(bundle, strongBinder, i3, zzdVar.A01);
        zzdVar.A00 = null;
        parcel2.writeNoException();
        return true;
    }
}
