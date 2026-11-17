package com.google.android.gms.common.internal;

import X.BV6;
import X.C4158CoD;
import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.facebook.aura.auth.credentialmanager.AuraCredentialManagerFetchHelper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class GetServiceRequest extends AbstractSafeParcelable {
    public Account A00;
    public Bundle A01;
    public IBinder A02;
    public String A03;
    public boolean A04;
    public Feature[] A05;
    public Feature[] A06;
    public Scope[] A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final String A0C;
    public final boolean A0D;
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = C4158CoD.A03(32);
    public static final Scope[] A0F = new Scope[0];
    public static final Feature[] A0E = new Feature[0];

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C4158CoD.A05(parcel, this, i);
    }

    public GetServiceRequest(Account account, Bundle bundle, IBinder iBinder, String str, String str2, Feature[] featureArr, Feature[] featureArr2, Scope[] scopeArr, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        IInterface zzwVar;
        scopeArr = scopeArr == null ? A0F : scopeArr;
        bundle = bundle == null ? BV6.A0N() : bundle;
        featureArr = featureArr == null ? A0E : featureArr;
        featureArr2 = featureArr2 == null ? A0E : featureArr2;
        this.A08 = i;
        this.A09 = i2;
        this.A0A = i3;
        if (AuraCredentialManagerFetchHelper.PROVIDER_PACKAGE.equals(str)) {
            this.A03 = AuraCredentialManagerFetchHelper.PROVIDER_PACKAGE;
        } else {
            this.A03 = str;
        }
        if (i >= 2) {
            this.A02 = iBinder;
        } else if (iBinder != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (iInterfaceQueryLocalInterface instanceof IAccountAccessor) {
                zzwVar = (IAccountAccessor) iInterfaceQueryLocalInterface;
            } else {
                zzwVar = new zzw("com.google.android.gms.common.internal.IAccountAccessor", iBinder);
            }
            account = null;
            if (zzwVar != null) {
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        zzw zzwVar2 = (zzw) zzwVar;
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.writeInterfaceToken(zzwVar2.A01);
                        Parcel parcelA00 = zzwVar2.A00(parcelObtain, 2);
                        Account account2 = (Account) (parcelA00.readInt() == 0 ? null : (Parcelable) Account.CREATOR.createFromParcel(parcelA00));
                        parcelA00.recycle();
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        account = account2;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    }
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    throw th;
                }
            }
        } else {
            account = null;
        }
        this.A00 = account;
        this.A07 = scopeArr;
        this.A01 = bundle;
        this.A05 = featureArr;
        this.A06 = featureArr2;
        this.A0D = z;
        this.A0B = i4;
        this.A04 = z2;
        this.A0C = str2;
    }
}
