package com.google.android.gms.common.api.internal;

import X.AbstractC4147Cnr;
import X.AbstractC4203Cpp;
import X.C4145Cnp;
import X.C4164CoO;
import X.C4165CoQ;
import X.C4172Cob;
import X.C4173Cod;
import X.CRy;
import X.Cv1;
import X.InterfaceC4139Cng;
import X.InterfaceC4140Cnh;
import X.InterfaceC4148Cns;
import X.RunnableC4169CoV;
import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.signin.internal.zad;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;

/* loaded from: classes5.dex */
public final class zact extends zad implements InterfaceC4139Cng, InterfaceC4140Cnh {
    public static final AbstractC4203Cpp A07 = AbstractC4147Cnr.A00;
    public Cv1 A00;
    public InterfaceC4148Cns A01;
    public final Context A02;
    public final Handler A03;
    public final AbstractC4203Cpp A04;
    public final C4173Cod A05;
    public final Set A06;

    @Override // X.InterfaceC4392Cuv
    public final void ASM() {
        C4145Cnp c4145Cnp = (C4145Cnp) this.A01;
        try {
            Account account = new Account("<<default account>>", "com.google");
            GoogleSignInAccount googleSignInAccountA02 = "<<default account>>".equals(account.name) ? C4165CoQ.A00(c4145Cnp.A0A).A02() : null;
            Integer num = c4145Cnp.A02;
            CRy.A03(num);
            zat zatVar = new zat(account, googleSignInAccountA02, 2, num.intValue());
            zaa zaaVar = (zaa) c4145Cnp.A03();
            zai zaiVar = new zai(zatVar, 1);
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(zaaVar.A01);
            parcelObtain.writeInt(1);
            zaiVar.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(asBinder());
            zaaVar.A00(parcelObtain, 12);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.A03.post(new RunnableC4169CoV(this, new zak(new ConnectionResult(null, null, 1, 8), null, 1)));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // X.InterfaceC4393Cuw
    public final void ASN(ConnectionResult connectionResult) {
        this.A00.Aj9(connectionResult);
    }

    @Override // X.InterfaceC4392Cuv
    public final void ASO(int i) {
        C4172Cob c4172Cob = (C4172Cob) this.A00;
        C4164CoO c4164CoO = (C4164CoO) c4172Cob.A05.A08.get(c4172Cob.A04);
        if (c4164CoO != null) {
            if (c4164CoO.A02) {
                c4164CoO.A0A(new ConnectionResult(17));
            } else {
                c4164CoO.ASO(i);
            }
        }
    }

    public zact() {
    }

    public zact(Context context, Handler handler, C4173Cod c4173Cod) {
        AbstractC4203Cpp abstractC4203Cpp = A07;
        this.A02 = context;
        this.A03 = handler;
        this.A05 = c4173Cod;
        this.A06 = c4173Cod.A04;
        this.A04 = abstractC4203Cpp;
    }
}
