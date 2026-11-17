package com.google.android.gms.internal.base;

import X.AbstractC4118CnB;
import X.BV6;
import X.BV8;
import X.C3415CMa;
import X.C8j3;
import X.CSE;
import X.RunnableC4169CoV;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.common.moduleinstall.internal.zat;
import com.google.android.gms.signin.internal.zad;
import com.google.android.gms.signin.internal.zag;
import com.google.android.gms.signin.internal.zak;

/* loaded from: classes5.dex */
public abstract class zab extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Parcelable.Creator creator;
        if (i <= 16777215) {
            BV6.A0y(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        if (this instanceof zad) {
            zad zadVar = (zad) this;
            switch (i) {
                case 3:
                    BV8.A0V(parcel, ConnectionResult.CREATOR);
                    creator = com.google.android.gms.signin.internal.zaa.CREATOR;
                    BV8.A0V(parcel, creator);
                    C3415CMa.A00(parcel);
                    parcel2.writeNoException();
                    return true;
                case 4:
                case 6:
                    creator = Status.CREATOR;
                    BV8.A0V(parcel, creator);
                    C3415CMa.A00(parcel);
                    parcel2.writeNoException();
                    return true;
                case 5:
                default:
                    return false;
                case 7:
                    BV8.A0V(parcel, Status.CREATOR);
                    creator = GoogleSignInAccount.CREATOR;
                    BV8.A0V(parcel, creator);
                    C3415CMa.A00(parcel);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    zak zakVar = (zak) BV8.A0V(parcel, zak.CREATOR);
                    C3415CMa.A00(parcel);
                    zact zactVar = (zact) zadVar;
                    zactVar.A03.post(new RunnableC4169CoV(zactVar, zakVar));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    creator = zag.CREATOR;
                    BV8.A0V(parcel, creator);
                    C3415CMa.A00(parcel);
                    parcel2.writeNoException();
                    return true;
            }
        }
        if (!(this instanceof com.google.android.gms.common.moduleinstall.internal.zad)) {
            IStatusCallback.Stub stub = (IStatusCallback.Stub) this;
            if (i != 1) {
                return false;
            }
            Status status = (Status) BV8.A0V(parcel, Status.CREATOR);
            C3415CMa.A00(parcel);
            stub.AVY(status);
            return true;
        }
        com.google.android.gms.common.moduleinstall.internal.zad zadVar2 = (com.google.android.gms.common.moduleinstall.internal.zad) this;
        if (i == 1) {
            BV8.A0V(parcel, Status.CREATOR);
            BV8.A0V(parcel, ModuleAvailabilityResponse.CREATOR);
            C3415CMa.A00(parcel);
            throw C8j3.A17();
        }
        if (i == 2) {
            Status status2 = (Status) BV8.A0V(parcel, Status.CREATOR);
            Parcelable parcelableA0V = BV8.A0V(parcel, ModuleInstallResponse.CREATOR);
            C3415CMa.A00(parcel);
            CSE cse = ((zat) zadVar2).A00;
            if (status2.A00 <= 0) {
                cse.A00.A0H(parcelableA0V);
                return true;
            }
            cse.A01(AbstractC4118CnB.A00(status2));
            return true;
        }
        if (i == 3) {
            BV8.A0V(parcel, Status.CREATOR);
            BV8.A0V(parcel, ModuleInstallIntentResponse.CREATOR);
            C3415CMa.A00(parcel);
            throw C8j3.A17();
        }
        if (i != 4) {
            return false;
        }
        BV8.A0V(parcel, Status.CREATOR);
        C3415CMa.A00(parcel);
        throw C8j3.A17();
    }
}
