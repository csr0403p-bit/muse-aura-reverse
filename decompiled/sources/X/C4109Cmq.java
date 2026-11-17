package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.WorkSource;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.location.zza;
import com.google.android.gms.internal.location.zzdk;
import com.google.android.gms.internal.location.zzee;
import com.google.android.gms.internal.location.zzv;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.LocationRequest;

/* renamed from: X.Cmq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4109Cmq extends AbstractC4178Com implements InterfaceC3519CRu {
    public static final C4378CuY A00;
    public static final C4240CrC A01;

    /* JADX WARN: Incorrect types in method signature: (ILX/CRn;)LX/CSA<Landroid/location/Location;>; */
    @Override // X.InterfaceC3519CRu
    public final CSC AET(final C3513CRn c3513CRn, int i) {
        final CurrentLocationRequest currentLocationRequest = new CurrentLocationRequest(new WorkSource(null), null, 0, i, 0, 10000L, LinkEncryptedPairingKt.LINK_COUNTER_MAX, false);
        if (c3513CRn != null) {
            CRy.A08(!c3513CRn.A00.A0B(), "cancellationToken may not be already canceled");
        }
        C4231Cqf c4231CqfA00 = C4232Cqg.A00();
        c4231CqfA00.A01 = new InterfaceC4375CuV() { // from class: X.CpU
            @Override // X.InterfaceC4375CuV
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                boolean z;
                final ICancelToken zzxVar;
                CSK csk;
                final ICancelToken zzxVar2;
                final CSE cse = (CSE) obj2;
                final C4196CpV c4196CpV = (C4196CpV) obj;
                CurrentLocationRequest currentLocationRequest2 = currentLocationRequest;
                C3513CRn c3513CRn2 = c3513CRn;
                if (C4196CpV.A02(AbstractC4281CsC.A09, c4196CpV)) {
                    IInterface iInterface = (zzv) c4196CpV.A03();
                    zzee zzeeVar = new zzee(null, null, new zzdk(cse), null, 4);
                    zza zzaVar = (zza) iInterface;
                    Parcel parcelA00 = zza.A00(currentLocationRequest2, zzaVar);
                    Cpe.A01(parcelA00, zzeeVar);
                    Parcel parcelA01 = zzaVar.A01(parcelA00, 92);
                    IBinder strongBinder = parcelA01.readStrongBinder();
                    if (strongBinder == null) {
                        zzxVar2 = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
                        zzxVar2 = iInterfaceQueryLocalInterface instanceof ICancelToken ? (ICancelToken) iInterfaceQueryLocalInterface : new zzx("com.google.android.gms.common.internal.ICancelToken", strongBinder);
                    }
                    parcelA01.recycle();
                    if (c3513CRn2 == null) {
                        return;
                    } else {
                        csk = new CSK() { // from class: X.CuA
                            @Override // X.CSK
                            public final /* synthetic */ void AS6() {
                                try {
                                    zzxVar2.cancel();
                                } catch (RemoteException unused) {
                                }
                            }
                        };
                    }
                } else {
                    if (!C4196CpV.A02(AbstractC4281CsC.A04, c4196CpV)) {
                        C4200Cpj c4200Cpj = new C4200Cpj(new C4201Cpn(c4196CpV, cse), CNx.A01);
                        final C4248CrK c4248CrK = c4200Cpj.A01;
                        c4248CrK.getClass();
                        C4277Cs7 c4277Cs7 = new C4277Cs7(c4200Cpj, cse);
                        CSE cse2 = new CSE();
                        int i2 = currentLocationRequest2.A01;
                        int i3 = i2;
                        if (i2 == 100 || i2 == 102 || i2 == 104) {
                            z = true;
                        } else if (i2 == 105) {
                            i3 = 105;
                            z = true;
                        } else {
                            z = false;
                        }
                        Object[] objArrA1Y = BV5.A1Y(i3);
                        if (!z) {
                            throw BV5.A0T("priority %d must be a Priority.PRIORITY_* constant", objArrA1Y);
                        }
                        new Object[1][0] = 0;
                        new Object[1][0] = 0;
                        WorkSource workSource = currentLocationRequest2.A05;
                        c4196CpV.A08(c4277Cs7, new LocationRequest(new WorkSource(workSource), null, 0.0f, i2, Integer.MAX_VALUE, 0, 0, 0L, i2 != 105 ? Math.min(0L, 0L) : 0L, Math.max(0L, 0L), LinkEncryptedPairingKt.LINK_COUNTER_MAX, LinkEncryptedPairingKt.LINK_COUNTER_MAX, 10000L, true, false), cse2);
                        cse2.A00.A05(new CEF() { // from class: X.CLM
                            @Override // X.CEF
                            public final /* synthetic */ void onComplete(CSA csa) {
                                if (csa.A0C()) {
                                    return;
                                }
                                CSE cse3 = cse;
                                Exception excA07 = csa.A07();
                                excA07.getClass();
                                cse3.A01(excA07);
                            }
                        });
                        if (c3513CRn2 != null) {
                            c3513CRn2.A00.A06(new CSH(new CSK() { // from class: X.Crx
                                @Override // X.CSK
                                public final /* synthetic */ void AS6() {
                                    try {
                                        c4196CpV.A07(c4248CrK, new CSE(), true);
                                    } catch (RemoteException unused) {
                                    }
                                }
                            }), AbstractC3097ByB.A00);
                            return;
                        }
                        return;
                    }
                    IInterface iInterface2 = (zzv) c4196CpV.A03();
                    zzdk zzdkVar = new zzdk(cse);
                    zza zzaVar2 = (zza) iInterface2;
                    Parcel parcelA002 = zza.A00(currentLocationRequest2, zzaVar2);
                    parcelA002.writeStrongBinder(zzdkVar.asBinder());
                    Parcel parcelA012 = zzaVar2.A01(parcelA002, 87);
                    IBinder strongBinder2 = parcelA012.readStrongBinder();
                    if (strongBinder2 == null) {
                        zzxVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
                        zzxVar = iInterfaceQueryLocalInterface2 instanceof ICancelToken ? (ICancelToken) iInterfaceQueryLocalInterface2 : new zzx("com.google.android.gms.common.internal.ICancelToken", strongBinder2);
                    }
                    parcelA012.recycle();
                    if (c3513CRn2 == null) {
                        return;
                    } else {
                        csk = new CSK() { // from class: X.Cu9
                            @Override // X.CSK
                            public final /* synthetic */ void AS6() {
                                try {
                                    zzxVar.cancel();
                                } catch (RemoteException unused) {
                                }
                            }
                        };
                    }
                }
                c3513CRn2.A00.A06(new CSH(csk), AbstractC3097ByB.A00);
            }
        };
        CSC cscA01 = AbstractC4178Com.A01(this, c4231CqfA00, 2415, 0);
        if (c3513CRn == null) {
            return cscA01;
        }
        final CSE cse = new CSE(c3513CRn);
        cscA01.A04(new CSY() { // from class: X.CS9
            @Override // X.CSY
            public final /* synthetic */ Object then(CSA csa) {
                CSE cse2 = cse;
                if (csa.A0C()) {
                    cse2.A00.A0H(csa.A08());
                    return null;
                }
                Exception excA07 = csa.A07();
                excA07.getClass();
                cse2.A01(excA07);
                return null;
            }
        }, AbstractC3097ByB.A00);
        return cse.A00;
    }

    static {
        C4378CuY c4378CuY = new C4378CuY();
        A00 = c4378CuY;
        A01 = new C4240CrC(new C4143Cnm(), c4378CuY, "LocationServices.API");
    }
}
