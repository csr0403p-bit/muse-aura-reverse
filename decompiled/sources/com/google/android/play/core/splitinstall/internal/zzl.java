package com.google.android.play.core.splitinstall.internal;

import X.BV4;
import X.BV5;
import X.BV6;
import X.BV8;
import X.C3392CJg;
import X.CJQ;
import X.CKE;
import X.CKb;
import X.CSE;
import android.os.BaseBundle;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.zzbh;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public abstract class zzl extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public static void A00(Parcel parcel, Object obj) {
        CKE.A01(parcel, Bundle.CREATOR);
        CKE.A00(parcel);
        zzbh zzbhVar = (zzbh) obj;
        zzbhVar.A01.A00.A02(zzbhVar.A00);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        CJQ cjq;
        Object[] objArrA1Y;
        String str;
        if (i <= 16777215) {
            BV6.A0y(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        zzbp zzbpVar = (zzbp) this;
        switch (i) {
            case 2:
                int i3 = parcel.readInt();
                Bundle bundle = (Bundle) BV8.A0V(parcel, Bundle.CREATOR);
                CKE.A00(parcel);
                zzbpVar.Ajp(i3, bundle);
                return true;
            case 3:
                int i4 = parcel.readInt();
                A00(parcel, zzbpVar);
                cjq = C3392CJg.A02;
                objArrA1Y = BV5.A1Y(i4);
                str = "onCompleteInstall(%d)";
                break;
            case 4:
                int i5 = parcel.readInt();
                Bundle bundle2 = (Bundle) BV8.A0V(parcel, Bundle.CREATOR);
                CKE.A00(parcel);
                zzbpVar.AjS(i5, bundle2);
                return true;
            case 5:
                int i6 = parcel.readInt();
                A00(parcel, zzbpVar);
                cjq = C3392CJg.A02;
                objArrA1Y = BV5.A1Y(i6);
                str = "onGetSession(%d)";
                break;
            case 6:
                BaseBundle baseBundle = (BaseBundle) BV8.A0V(parcel, Bundle.CREATOR);
                CKE.A00(parcel);
                zzbh zzbhVar = (zzbh) zzbpVar;
                CKb cKb = zzbhVar.A01.A00;
                CSE cse = zzbhVar.A00;
                cKb.A02(cse);
                int i7 = baseBundle.getInt("error_code");
                C3392CJg.A02.A02("onError(%d)", BV5.A1Y(i7));
                cse.A01(new SplitInstallException(i7));
                return true;
            case 7:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
                CKE.A00(parcel);
                zzbpVar.Ajm(arrayListCreateTypedArrayList);
                return true;
            case 8:
                Bundle bundle3 = (Bundle) BV8.A0V(parcel, Bundle.CREATOR);
                CKE.A00(parcel);
                zzbpVar.Ajj(bundle3);
                return true;
            case 9:
                Bundle bundle4 = (Bundle) BV8.A0V(parcel, Bundle.CREATOR);
                CKE.A00(parcel);
                zzbpVar.Ajf(bundle4);
                return true;
            case 10:
                A00(parcel, zzbpVar);
                cjq = C3392CJg.A02;
                objArrA1Y = BV4.A1W();
                str = "onGetSplitsForAppUpdate";
                break;
            case 11:
                A00(parcel, zzbpVar);
                cjq = C3392CJg.A02;
                objArrA1Y = BV4.A1W();
                str = "onCompleteInstallForAppUpdate";
                break;
            case 12:
                A00(parcel, zzbpVar);
                cjq = C3392CJg.A02;
                objArrA1Y = BV4.A1W();
                str = "onDeferredLanguageInstall";
                break;
            case 13:
                A00(parcel, zzbpVar);
                cjq = C3392CJg.A02;
                objArrA1Y = BV4.A1W();
                str = "onDeferredLanguageUninstall";
                break;
            default:
                return false;
        }
        cjq.A03(str, objArrA1Y);
        return true;
    }
}
