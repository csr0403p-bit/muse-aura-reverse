package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.auth.api.signin.internal.zbh;
import com.google.android.gms.auth.api.signin.internal.zbj;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.internal.p000authapi.zba;
import com.google.android.gms.internal.wearable.zza;
import com.google.android.gms.internal.wearable.zzb;
import com.google.android.gms.wearable.internal.zzio;
import com.google.android.gms.wearable.internal.zzis;
import com.google.android.gms.wearable.internal.zzjc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* renamed from: X.CoO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4164CoO implements InterfaceC4139Cng, InterfaceC4140Cnh {
    public boolean A02;
    public final int A03;
    public final InterfaceC4191CpP A04;
    public final C4247CrJ A05;
    public final C4170CoW A06;
    public final zact A0A;
    public final /* synthetic */ C4163CoN A0C;
    public final Queue A09 = BV4.A0y();
    public final Set A0B = C60O.A13();
    public final Map A08 = BV4.A0u();
    public final List A07 = C3cG.A0h();
    public ConnectionResult A01 = null;
    public int A00 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public C4164CoO(AbstractC4178Com abstractC4178Com, C4163CoN c4163CoN) {
        this.A0C = c4163CoN;
        Handler handler = c4163CoN.A05;
        Looper looper = handler.getLooper();
        C4279Cs9 c4279Cs9 = C4279Cs9.A00;
        Set set = Collections.EMPTY_SET;
        Ao0 ao0 = new Ao0(0);
        ao0.addAll(set);
        Context context = abstractC4178Com.A01;
        String strA0e = C60Q.A0e(context);
        context.getPackageName();
        C4173Cod c4173Cod = new C4173Cod(c4279Cs9, strA0e, ao0);
        AbstractC4203Cpp abstractC4203Cpp = abstractC4178Com.A04.A00;
        CRy.A03(abstractC4203Cpp);
        InterfaceC4191CpP interfaceC4191CpPA00 = abstractC4203Cpp.A00(context, looper, this, this, c4173Cod, abstractC4178Com.A03);
        String str = abstractC4178Com.A09;
        if (str != null && (interfaceC4191CpPA00 instanceof AbstractC4160CoH)) {
            ((AbstractC4160CoH) interfaceC4191CpPA00).A0M = str;
        }
        this.A04 = interfaceC4191CpPA00;
        this.A05 = abstractC4178Com.A06;
        this.A06 = new C4170CoW();
        this.A03 = abstractC4178Com.A00;
        if (!interfaceC4191CpPA00.AbJ()) {
            this.A0A = null;
            return;
        }
        Context context2 = c4163CoN.A04;
        Ao0 ao02 = new Ao0(0);
        ao02.addAll(set);
        context.getPackageName();
        this.A0A = new zact(context2, handler, new C4173Cod(c4279Cs9, strA0e, ao02));
    }

    @Override // X.InterfaceC4393Cuw
    public final void ASN(ConnectionResult connectionResult) {
        A0B(connectionResult, null);
    }

    private final void A00(ConnectionResult connectionResult) {
        Set set = this.A0B;
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            set.clear();
            return;
        }
        it.next();
        if (CS7.A01(connectionResult, ConnectionResult.A04)) {
            AbstractC4160CoH abstractC4160CoH = (AbstractC4160CoH) this.A04;
            if (!abstractC4160CoH.isConnected() || abstractC4160CoH.A04 == null) {
                throw BV4.A0c("Failed to connect when checking package");
            }
        }
        throw BV4.A0a("zac");
    }

    public static final void A01(Status status, C4164CoO c4164CoO) {
        CRy.A02(c4164CoO.A0C.A05);
        c4164CoO.A02(status, null, false);
    }

    private final void A02(Status status, Exception exc, boolean z) {
        CRy.A02(this.A0C.A05);
        if ((status == null) == (exc == null)) {
            throw C60O.A0i("Status XOR exception should be null");
        }
        Iterator it = this.A09.iterator();
        while (it.hasNext()) {
            AbstractC4176Cok abstractC4176Cok = (AbstractC4176Cok) it.next();
            if (!z || abstractC4176Cok.A00 == 2) {
                if (status != null) {
                    abstractC4176Cok.A00(status);
                } else {
                    abstractC4176Cok.A01(exc);
                }
                it.remove();
            }
        }
    }

    public static final void A03(C4164CoO c4164CoO) {
        Queue queue = c4164CoO.A09;
        ArrayList arrayListA0t = BV4.A0t(queue);
        int size = arrayListA0t.size();
        for (int i = 0; i < size; i++) {
            AbstractC4176Cok abstractC4176Cok = (AbstractC4176Cok) arrayListA0t.get(i);
            if (!c4164CoO.A04.isConnected()) {
                return;
            }
            if (c4164CoO.A07(abstractC4176Cok)) {
                queue.remove(abstractC4176Cok);
            }
        }
    }

    public static final void A04(C4164CoO c4164CoO) {
        Handler handler = c4164CoO.A0C.A05;
        CRy.A02(handler);
        c4164CoO.A01 = null;
        c4164CoO.A00(ConnectionResult.A04);
        if (c4164CoO.A02) {
            C4247CrJ c4247CrJ = c4164CoO.A05;
            handler.removeMessages(11, c4247CrJ);
            handler.removeMessages(9, c4247CrJ);
            c4164CoO.A02 = false;
        }
        Iterator itA10 = BV5.A10(c4164CoO.A08);
        while (itA10.hasNext()) {
            C4255CrS c4255CrS = ((C4280CsB) itA10.next()).A00;
            try {
                c4255CrS.A03.A02.accept(c4164CoO.A04, new CSE());
            } catch (DeadObjectException unused) {
                c4164CoO.ASO(3);
                AbstractC4160CoH abstractC4160CoH = (AbstractC4160CoH) c4164CoO.A04;
                abstractC4160CoH.A0N = "DeadObjectException thrown while calling register listener method.";
                abstractC4160CoH.A96();
            } catch (RemoteException unused2) {
                itA10.remove();
            }
        }
        A03(c4164CoO);
        A05(c4164CoO);
    }

    public static final void A05(C4164CoO c4164CoO) {
        C4247CrJ c4247CrJ = c4164CoO.A05;
        C4163CoN c4163CoN = c4164CoO.A0C;
        Handler handler = c4163CoN.A05;
        handler.removeMessages(12, c4247CrJ);
        handler.sendMessageDelayed(handler.obtainMessage(12, c4247CrJ), c4163CoN.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0066 A[LOOP:0: B:9:0x0060->B:11:0x0066, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A06(X.C4164CoO r7, int r8) {
        /*
            X.CoN r5 = r7.A0C
            android.os.Handler r4 = r5.A05
            X.CRy.A02(r4)
            r0 = 0
            r7.A01 = r0
            r6 = 1
            r7.A02 = r6
            X.CpP r0 = r7.A04
            X.CoH r0 = (X.AbstractC4160CoH) r0
            java.lang.String r2 = r0.A0N
            X.CoW r3 = r7.A06
            java.lang.String r0 = "The connection to Google Play services was lost"
            java.lang.StringBuilder r1 = X.C60O.A0x(r0)
            if (r8 != r6) goto L72
            java.lang.String r0 = " due to service disconnection."
        L1f:
            r1.append(r0)
        L22:
            if (r2 == 0) goto L2c
            java.lang.String r0 = " Last reason for disconnect: "
            r1.append(r0)
            r1.append(r2)
        L2c:
            java.lang.String r2 = r1.toString()
            r1 = 20
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r1, r2)
            X.C4170CoW.A00(r0, r3, r6)
            X.CrJ r3 = r7.A05
            r0 = 9
            android.os.Message r2 = android.os.Message.obtain(r4, r0, r3)
            r0 = 5000(0x1388, double:2.4703E-320)
            r4.sendMessageDelayed(r2, r0)
            r0 = 11
            android.os.Message r2 = android.os.Message.obtain(r4, r0, r3)
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            r4.sendMessageDelayed(r2, r0)
            X.Crr r0 = r5.A07
            android.util.SparseIntArray r0 = r0.A01
            r0.clear()
            java.util.Map r0 = r7.A08
            java.util.Iterator r1 = X.BV5.A10(r0)
        L60:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L78
            java.lang.Object r0 = r1.next()
            X.CsB r0 = (X.C4280CsB) r0
            java.lang.Runnable r0 = r0.A02
            r0.run()
            goto L60
        L72:
            r0 = 3
            if (r8 != r0) goto L22
            java.lang.String r0 = " due to dead object exception."
            goto L1f
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4164CoO.A06(X.CoO, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean A07(AbstractC4176Cok abstractC4176Cok) throws Resources.NotFoundException, DeadObjectException {
        CSE cse;
        Status status;
        AbstractC4194CpS abstractC4194CpS;
        zba zbaVar;
        Parcel parcelA00;
        int i;
        zza zzaVar;
        Parcel parcelA002;
        int i2;
        int length;
        if (abstractC4176Cok instanceof AbstractC4348Ctq) {
            AbstractC4348Ctq abstractC4348Ctq = (AbstractC4348Ctq) abstractC4176Cok;
            if (abstractC4348Ctq instanceof C4177Col) {
                C4232Cqg c4232Cqg = ((C4177Col) abstractC4348Ctq).A00;
                Feature[] featureArr = c4232Cqg.A02;
                if (featureArr != null && (length = featureArr.length) != 0) {
                    Object obj = this.A04;
                    zzk zzkVar = ((AbstractC4160CoH) obj).A0L;
                    Feature[] featureArr2 = zzkVar == null ? null : zzkVar.A03;
                    int i3 = 0;
                    if (featureArr2 == null) {
                        featureArr2 = new Feature[0];
                    }
                    DQd dQd = new DQd(featureArr2.length);
                    for (Feature feature : featureArr2) {
                        dQd.put(feature.A00, Long.valueOf(feature.A00()));
                    }
                    do {
                        Feature feature2 = featureArr[i3];
                        Number number = (Number) dQd.get(feature2.A00);
                        if (number == null || number.longValue() < feature2.A00()) {
                            String strA0e = C60Q.A0e(obj);
                            String str = feature2.A00;
                            long jA00 = feature2.A00();
                            StringBuilder sbA0g = C3cG.A0g(strA0e);
                            sbA0g.append(" could not execute call because it requires feature (");
                            sbA0g.append(str);
                            C8j3.A1K(sbA0g);
                            sbA0g.append(jA00);
                            Log.w("GoogleApiManager", AnonymousClass001.A0v(").", sbA0g));
                            C4163CoN c4163CoN = this.A0C;
                            if (!c4163CoN.A0D || !c4232Cqg.A01) {
                                abstractC4348Ctq.A01(new UnsupportedApiCallException(feature2));
                                return true;
                            }
                            C4193CpR c4193CpR = new C4193CpR(feature2, this.A05);
                            List list = this.A07;
                            int iIndexOf = list.indexOf(c4193CpR);
                            if (iIndexOf >= 0) {
                                Object obj2 = list.get(iIndexOf);
                                Handler handler = c4163CoN.A05;
                                handler.removeMessages(15, obj2);
                                handler.sendMessageDelayed(Message.obtain(handler, 15, obj2), 5000L);
                            } else {
                                list.add(c4193CpR);
                                Handler handler2 = c4163CoN.A05;
                                handler2.sendMessageDelayed(Message.obtain(handler2, 15, c4193CpR), 5000L);
                                handler2.sendMessageDelayed(Message.obtain(handler2, 16, c4193CpR), 120000L);
                                ConnectionResult connectionResult = new ConnectionResult(null, null, 1, 2);
                                synchronized (C4163CoN.A0H) {
                                }
                                c4163CoN.A07(connectionResult, this.A03);
                            }
                            return false;
                        }
                        i3++;
                    } while (i3 < length);
                }
            } else if (abstractC4348Ctq instanceof CpT) {
                this.A08.get(((CpT) abstractC4348Ctq).A00);
            }
        }
        C4170CoW c4170CoW = this.A06;
        InterfaceC4191CpP interfaceC4191CpP = this.A04;
        boolean zAbJ = interfaceC4191CpP.AbJ();
        boolean z = abstractC4176Cok instanceof C4177Col;
        if (z) {
            CSE cse2 = ((C4177Col) abstractC4176Cok).A01;
            c4170CoW.A01.put(cse2, Boolean.valueOf(zAbJ));
            cse2.A00.A05(new C4274Cs0(c4170CoW, cse2));
        } else if (!(abstractC4176Cok instanceof CpT) && !(abstractC4176Cok instanceof C4199Cpc)) {
            AbstractC4185Cov abstractC4185Cov = ((C4180Coq) abstractC4176Cok).A00;
            c4170CoW.A00.put(abstractC4185Cov, Boolean.valueOf(zAbJ));
            abstractC4185Cov.A00(new C4273Crz(abstractC4185Cov, c4170CoW));
        }
        try {
            if (abstractC4176Cok instanceof C4180Coq) {
                C4180Coq c4180Coq = (C4180Coq) abstractC4176Cok;
                try {
                    AbstractC4185Cov abstractC4185Cov2 = c4180Coq.A00;
                    try {
                        if (abstractC4185Cov2 instanceof C4183Cot) {
                            C4183Cot c4183Cot = (C4183Cot) abstractC4185Cov2;
                            String str2 = c4183Cot.A01;
                            int i4 = c4183Cot.A00;
                            zzaVar = (zza) ((AbstractC4160CoH) interfaceC4191CpP).A03();
                            parcelA002 = zzb.A00(c4183Cot, zzaVar, new zzio());
                            parcelA002.writeString(str2);
                            parcelA002.writeInt(i4);
                            i2 = 42;
                        } else if (abstractC4185Cov2 instanceof C4186Cow) {
                            zzaVar = (zza) ((AbstractC4160CoH) interfaceC4191CpP).A03();
                            parcelA002 = zzb.A00(abstractC4185Cov2, zzaVar, new zzis());
                            i2 = 15;
                        } else {
                            if (!(abstractC4185Cov2 instanceof C4184Cou)) {
                                if (abstractC4185Cov2 instanceof C4246CrI) {
                                    C4205Cpt c4205Cpt = (C4205Cpt) interfaceC4191CpP;
                                    zbaVar = (zba) c4205Cpt.A03();
                                    parcelA00 = zba.A00(c4205Cpt.A00, zbaVar, new zbj((C4246CrI) abstractC4185Cov2));
                                    i = 103;
                                } else {
                                    C4205Cpt c4205Cpt2 = (C4205Cpt) interfaceC4191CpP;
                                    zbaVar = (zba) c4205Cpt2.A03();
                                    parcelA00 = zba.A00(c4205Cpt2.A00, zbaVar, new zbh((C4245CrH) abstractC4185Cov2));
                                    i = 102;
                                }
                                zbaVar.A01(parcelA00, i);
                                return true;
                            }
                            C4184Cou c4184Cou = (C4184Cou) abstractC4185Cov2;
                            String str3 = c4184Cou.A00;
                            String str4 = c4184Cou.A01;
                            byte[] bArr = c4184Cou.A02;
                            zzaVar = (zza) ((AbstractC4160CoH) interfaceC4191CpP).A03();
                            parcelA002 = zzb.A00(c4184Cou, zzaVar, new zzjc());
                            parcelA002.writeString(str3);
                            parcelA002.writeString(str4);
                            parcelA002.writeByteArray(bArr);
                            i2 = 12;
                        }
                        zzaVar.A00(parcelA002, i2);
                        return true;
                    } catch (DeadObjectException e) {
                        abstractC4185Cov2.A02(abstractC4185Cov2.A01(new Status(null, null, e.getLocalizedMessage(), 8)));
                        throw e;
                    } catch (RemoteException e2) {
                        abstractC4185Cov2.A02(abstractC4185Cov2.A01(new Status(null, null, e2.getLocalizedMessage(), 8)));
                        return true;
                    }
                } catch (RuntimeException e3) {
                    c4180Coq.A01(e3);
                    return true;
                }
            }
            if (z) {
                C4177Col c4177Col = (C4177Col) abstractC4176Cok;
                try {
                    try {
                        c4177Col.A00.A03.A01.accept(interfaceC4191CpP, c4177Col.A01);
                        return true;
                    } catch (RuntimeException e4) {
                        e = e4;
                        cse = c4177Col.A01;
                        cse.A01(e);
                        return true;
                    }
                } catch (DeadObjectException e5) {
                    throw e5;
                } catch (RemoteException e6) {
                    status = new Status(19, FGI.A0U(C3cI.A0Y(e6), ": ", e6.getLocalizedMessage()));
                    abstractC4194CpS = c4177Col;
                    abstractC4194CpS.A00(status);
                    return true;
                }
            }
            AbstractC4194CpS abstractC4194CpS2 = (AbstractC4194CpS) abstractC4176Cok;
            try {
                try {
                    try {
                        if (!(abstractC4194CpS2 instanceof CpT)) {
                            C4199Cpc c4199Cpc = (C4199Cpc) abstractC4194CpS2;
                            C4280CsB c4280CsB = c4199Cpc.A00;
                            C4255CrS c4255CrS = c4280CsB.A00;
                            c4255CrS.A03.A02.accept(interfaceC4191CpP, ((AbstractC4194CpS) c4199Cpc).A00);
                            C4248CrK c4248CrK = c4255CrS.A01.A01;
                            if (c4248CrK == null) {
                                return true;
                            }
                            this.A08.put(c4248CrK, c4280CsB);
                            return true;
                        }
                        CpT cpT = (CpT) abstractC4194CpS2;
                        C4280CsB c4280CsB2 = (C4280CsB) this.A08.remove(cpT.A00);
                        if (c4280CsB2 == null) {
                            ((AbstractC4194CpS) cpT).A00.A00.A0H(AnonymousClass001.A0h());
                            return true;
                        }
                        c4280CsB2.A01.A01.A03.accept(interfaceC4191CpP, ((AbstractC4194CpS) cpT).A00);
                        C4200Cpj c4200Cpj = c4280CsB2.A00.A01;
                        c4200Cpj.A02 = null;
                        c4200Cpj.A01 = null;
                        return true;
                    } catch (RemoteException e7) {
                        status = new Status(19, FGI.A0U(C3cI.A0Y(e7), ": ", e7.getLocalizedMessage()));
                        abstractC4194CpS = abstractC4194CpS2;
                        abstractC4194CpS.A00(status);
                        return true;
                    }
                } catch (RuntimeException e8) {
                    e = e8;
                    cse = abstractC4194CpS2.A00;
                    cse.A01(e);
                    return true;
                }
            } catch (DeadObjectException e9) {
                abstractC4194CpS2.A00(new Status(19, FGI.A0U(C3cI.A0Y(e9), ": ", e9.getLocalizedMessage())));
                throw e9;
            }
        } catch (DeadObjectException unused) {
            ASO(1);
            AbstractC4160CoH abstractC4160CoH = (AbstractC4160CoH) interfaceC4191CpP;
            abstractC4160CoH.A0N = "DeadObjectException thrown while running ApiCallRunner.";
            abstractC4160CoH.A96();
            return true;
        }
        ASO(1);
        AbstractC4160CoH abstractC4160CoH2 = (AbstractC4160CoH) interfaceC4191CpP;
        abstractC4160CoH2.A0N = "DeadObjectException thrown while running ApiCallRunner.";
        abstractC4160CoH2.A96();
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.Cns, X.CpP] */
    public final void A08() {
        C4163CoN c4163CoN = this.A0C;
        CRy.A02(c4163CoN.A05);
        InterfaceC4191CpP interfaceC4191CpP = this.A04;
        if (interfaceC4191CpP.isConnected() || interfaceC4191CpP.AOH()) {
            return;
        }
        try {
            C4268Crr c4268Crr = c4163CoN.A07;
            Context context = c4163CoN.A04;
            CRy.A03(context);
            int iA01 = 0;
            if (interfaceC4191CpP.AbG()) {
                int iAHi = interfaceC4191CpP.AHi();
                SparseIntArray sparseIntArray = c4268Crr.A01;
                int i = sparseIntArray.get(iAHi, -1);
                if (i == -1) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= sparseIntArray.size()) {
                            iA01 = c4268Crr.A00.A01(context, iAHi);
                            break;
                        }
                        int iKeyAt = sparseIntArray.keyAt(i2);
                        if (iKeyAt > iAHi && sparseIntArray.get(iKeyAt) == 0) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    sparseIntArray.put(iAHi, iA01);
                    i = iA01;
                }
                if (i != 0) {
                    ConnectionResult connectionResult = new ConnectionResult(null, null, 1, i);
                    BV4.A1L("The service for ", C60Q.A0e(interfaceC4191CpP), " is not available: ", connectionResult.toString(), "GoogleApiManager");
                    A0B(connectionResult, null);
                    return;
                }
            }
            C4172Cob c4172Cob = new C4172Cob(interfaceC4191CpP, this.A05, c4163CoN);
            if (interfaceC4191CpP.AbJ()) {
                zact zactVar = this.A0A;
                CRy.A03(zactVar);
                InterfaceC4148Cns interfaceC4148Cns = zactVar.A01;
                if (interfaceC4148Cns != null) {
                    interfaceC4148Cns.A96();
                }
                C4173Cod c4173Cod = zactVar.A05;
                c4173Cod.A00 = BV7.A0n(zactVar);
                AbstractC4203Cpp abstractC4203Cpp = zactVar.A04;
                Context context2 = zactVar.A02;
                Handler handler = zactVar.A03;
                zactVar.A01 = abstractC4203Cpp.A00(context2, handler.getLooper(), zactVar, zactVar, c4173Cod, c4173Cod.A01);
                zactVar.A00 = c4172Cob;
                Set set = zactVar.A06;
                if (set == null || set.isEmpty()) {
                    handler.post(new RunnableC4275Cs1(zactVar));
                } else {
                    AbstractC4160CoH abstractC4160CoH = (AbstractC4160CoH) zactVar.A01;
                    abstractC4160CoH.A6s(new C4190CpA(abstractC4160CoH));
                }
            }
            try {
                interfaceC4191CpP.A6s(c4172Cob);
            } catch (SecurityException e) {
                A0B(new ConnectionResult(10), e);
            }
        } catch (IllegalStateException e2) {
            A0B(new ConnectionResult(10), e2);
        }
    }

    public final void A09() {
        CRy.A02(this.A0C.A05);
        Status status = C4163CoN.A0F;
        A01(status, this);
        C4170CoW.A00(status, this.A06, false);
        for (C4248CrK c4248CrK : (C4248CrK[]) this.A08.keySet().toArray(new C4248CrK[0])) {
            A0C(new CpT(c4248CrK, new CSE()));
        }
        A00(new ConnectionResult(4));
        if (this.A04.isConnected()) {
            C4382Cui c4382Cui = new C4382Cui(this);
            c4382Cui.A00.A0C.A05.post(new RunnableC4192CpQ(c4382Cui));
        }
    }

    public final void A0A(ConnectionResult connectionResult) {
        CRy.A02(this.A0C.A05);
        Object obj = this.A04;
        String strA0d = FGI.A0d("onSignInFailed for ", C60Q.A0e(obj), " with ", String.valueOf(connectionResult));
        AbstractC4160CoH abstractC4160CoH = (AbstractC4160CoH) obj;
        abstractC4160CoH.A0N = strA0d;
        abstractC4160CoH.A96();
        A0B(connectionResult, null);
    }

    public final void A0B(ConnectionResult connectionResult, Exception exc) {
        Status statusA00;
        InterfaceC4148Cns interfaceC4148Cns;
        C4163CoN c4163CoN = this.A0C;
        Handler handler = c4163CoN.A05;
        CRy.A02(handler);
        zact zactVar = this.A0A;
        if (zactVar != null && (interfaceC4148Cns = zactVar.A01) != null) {
            interfaceC4148Cns.A96();
        }
        CRy.A02(handler);
        this.A01 = null;
        c4163CoN.A07.A01.clear();
        A00(connectionResult);
        if ((this.A04 instanceof C4129CnV) && connectionResult.A01 != 24) {
            c4163CoN.A02 = true;
            handler.sendMessageDelayed(handler.obtainMessage(19), 300000L);
        }
        int i = connectionResult.A01;
        if (i == 4) {
            statusA00 = C4163CoN.A0G;
        } else {
            Queue queue = this.A09;
            if (queue.isEmpty()) {
                this.A01 = connectionResult;
                return;
            }
            if (exc != null) {
                CRy.A02(handler);
                A02(null, exc, false);
                return;
            }
            boolean z = c4163CoN.A0D;
            C4247CrJ c4247CrJ = this.A05;
            if (z) {
                A02(C4163CoN.A00(connectionResult, c4247CrJ), null, true);
                if (queue.isEmpty()) {
                    return;
                }
                synchronized (C4163CoN.A0H) {
                }
                if (c4163CoN.A07(connectionResult, this.A03)) {
                    return;
                }
                if (i == 18) {
                    this.A02 = true;
                }
                if (this.A02) {
                    handler.sendMessageDelayed(Message.obtain(handler, 9, c4247CrJ), 5000L);
                    return;
                }
            }
            statusA00 = C4163CoN.A00(connectionResult, c4247CrJ);
        }
        A01(statusA00, this);
    }

    public final void A0C(AbstractC4176Cok abstractC4176Cok) {
        CRy.A02(this.A0C.A05);
        if (this.A04.isConnected()) {
            if (A07(abstractC4176Cok)) {
                A05(this);
                return;
            } else {
                this.A09.add(abstractC4176Cok);
                return;
            }
        }
        this.A09.add(abstractC4176Cok);
        ConnectionResult connectionResult = this.A01;
        if (connectionResult == null || connectionResult.A01 == 0 || connectionResult.A02 == null) {
            A08();
        } else {
            A0B(connectionResult, null);
        }
    }

    @Override // X.InterfaceC4392Cuv
    public final void ASM() {
        C4163CoN c4163CoN = this.A0C;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = c4163CoN.A05;
        if (looperMyLooper == handler.getLooper()) {
            A04(this);
        } else {
            handler.post(new RunnableC4360Cu4(this));
        }
    }

    @Override // X.InterfaceC4392Cuv
    public final void ASO(int i) {
        C4163CoN c4163CoN = this.A0C;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = c4163CoN.A05;
        if (looperMyLooper == handler.getLooper()) {
            A06(this, i);
        } else {
            handler.post(new RunnableC4361Cu5(this, i));
        }
    }
}
