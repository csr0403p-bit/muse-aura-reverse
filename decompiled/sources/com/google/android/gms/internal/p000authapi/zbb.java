package com.google.android.gms.internal.p000authapi;

import X.AbstractC4119CnD;
import X.AbstractC4178Com;
import X.AbstractC4188Coy;
import X.AbstractC4189Cp0;
import X.AbstractC4261Crj;
import X.AbstractC4272Cry;
import X.AbstractC4359Cu3;
import X.AnonymousClass002;
import X.BV6;
import X.BV8;
import X.C3828CfG;
import X.C4152Cnx;
import X.C4165CoQ;
import X.C4187Cox;
import X.C4236Cqx;
import X.C4240CrC;
import X.C4245CrH;
import X.C4246CrI;
import X.C4276Cs4;
import X.C4365CuK;
import X.C4396Cv3;
import X.C4407CvM;
import X.C8j3;
import X.CRy;
import X.CSE;
import X.Cq2;
import X.RunnableC4151Cnw;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zbh;
import com.google.android.gms.auth.api.signin.internal.zbj;
import com.google.android.gms.auth.api.signin.internal.zbq;
import com.google.android.gms.auth.api.signin.internal.zbt;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes5.dex */
public abstract class zbb extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Status status;
        BasePendingResult basePendingResult;
        AbstractC4272Cry abstractC4272Cry;
        AbstractC4359Cu3 c4245CrH;
        BasePendingResult basePendingResult2;
        boolean z;
        Status status2;
        Parcelable parcelableA0V;
        CSE cse;
        if (i <= 16777215) {
            BV6.A0y(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        if (this instanceof zbao) {
            zbao zbaoVar = (zbao) this;
            z = true;
            if (i != 1) {
                return false;
            }
            status2 = (Status) BV8.A0V(parcel, Status.CREATOR);
            parcelableA0V = BV8.A0V(parcel, PendingIntent.CREATOR);
            Cq2.A00(parcel);
            cse = zbaoVar.A00;
        } else {
            if (!(this instanceof zbam)) {
                if (!(this instanceof zbt)) {
                    zbq zbqVar = (zbq) this;
                    switch (i) {
                        case FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE /* 101 */:
                            BV8.A0V(parcel, GoogleSignInAccount.CREATOR);
                            BV8.A0V(parcel, Status.CREATOR);
                            Cq2.A00(parcel);
                            throw C8j3.A17();
                        case 102:
                            status = (Status) BV8.A0V(parcel, Status.CREATOR);
                            Cq2.A00(parcel);
                            if (!(zbqVar instanceof zbh)) {
                                throw C8j3.A17();
                            }
                            basePendingResult = ((zbh) zbqVar).A00;
                            break;
                        case 103:
                            status = (Status) BV8.A0V(parcel, Status.CREATOR);
                            Cq2.A00(parcel);
                            if (!(zbqVar instanceof zbj)) {
                                throw C8j3.A17();
                            }
                            basePendingResult = ((zbj) zbqVar).A00;
                            break;
                        default:
                            return false;
                    }
                    basePendingResult.A02(status);
                    parcel2.writeNoException();
                    return true;
                }
                zbt zbtVar = (zbt) this;
                if (i != 1) {
                    if (i != 2) {
                        return false;
                    }
                    zbt.A00(zbtVar);
                    C4187Cox.A00(zbtVar.A00).A01();
                    return true;
                }
                zbt.A00(zbtVar);
                Context context = zbtVar.A00;
                C4165CoQ c4165CoQA00 = C4165CoQ.A00(context);
                GoogleSignInAccount googleSignInAccountA02 = c4165CoQA00.A02();
                GoogleSignInOptions googleSignInOptionsA03 = GoogleSignInOptions.A0C;
                if (googleSignInAccountA02 != null) {
                    googleSignInOptionsA03 = c4165CoQA00.A03();
                }
                CRy.A03(googleSignInOptionsA03);
                C4240CrC<GoogleSignInOptions> c4240CrC = AbstractC4261Crj.A03;
                C3828CfG c3828CfG = new C3828CfG(context, googleSignInOptionsA03, c4240CrC, new C4276Cs4(Looper.getMainLooper(), new C4407CvM()));
                if (googleSignInAccountA02 != null) {
                    abstractC4272Cry = c3828CfG.A05;
                    Context context2 = c3828CfG.A01;
                    boolean zA1Q = AnonymousClass002.A1Q(C3828CfG.A00(c3828CfG), 3);
                    if (AbstractC4188Coy.A00.A00 <= 3) {
                        Log.d("GoogleSignInCommon", "".concat("Revoking access"));
                    }
                    String strA01 = C4165CoQ.A01(C4165CoQ.A00(context2), "refreshToken");
                    AbstractC4188Coy.A00(context2);
                    if (!zA1Q) {
                        c4245CrH = new C4246CrI(c4240CrC, abstractC4272Cry);
                        AbstractC4178Com.A03(((C4365CuK) abstractC4272Cry).A00, c4245CrH, 1);
                        basePendingResult2 = c4245CrH;
                    } else if (strA01 == null) {
                        Status status3 = new Status(4, null);
                        BasePendingResult c4236Cqx = new C4236Cqx(status3);
                        c4236Cqx.A02(status3);
                        basePendingResult2 = c4236Cqx;
                    } else {
                        RunnableC4151Cnw runnableC4151Cnw = new RunnableC4151Cnw(strA01);
                        new Thread(runnableC4151Cnw).start();
                        basePendingResult2 = runnableC4151Cnw.A00;
                    }
                } else {
                    abstractC4272Cry = c3828CfG.A05;
                    Context context3 = c3828CfG.A01;
                    boolean zA1Q2 = AnonymousClass002.A1Q(C3828CfG.A00(c3828CfG), 3);
                    if (AbstractC4188Coy.A00.A00 <= 3) {
                        Log.d("GoogleSignInCommon", "".concat("Signing out"));
                    }
                    AbstractC4188Coy.A00(context3);
                    if (zA1Q2) {
                        Status status4 = Status.A08;
                        CRy.A04(status4, "Result must not be null");
                        BasePendingResult c4152Cnx = new C4152Cnx(abstractC4272Cry);
                        c4152Cnx.A02(status4);
                        basePendingResult2 = c4152Cnx;
                    } else {
                        c4245CrH = new C4245CrH(c4240CrC, abstractC4272Cry);
                        AbstractC4178Com.A03(((C4365CuK) abstractC4272Cry).A00, c4245CrH, 1);
                        basePendingResult2 = c4245CrH;
                    }
                }
                AbstractC4189Cp0.A00(basePendingResult2, new C4396Cv3());
                return true;
            }
            zbam zbamVar = (zbam) this;
            z = true;
            if (i != 1) {
                return false;
            }
            status2 = (Status) BV8.A0V(parcel, Status.CREATOR);
            parcelableA0V = BV8.A0V(parcel, BeginSignInResult.CREATOR);
            Cq2.A00(parcel);
            cse = zbamVar.A00;
        }
        AbstractC4119CnD.A00(status2, cse, parcelableA0V);
        return z;
    }
}
