package X;

import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.internal.location.zza;
import com.google.android.gms.internal.location.zzdd;
import com.google.android.gms.internal.location.zzdg;
import com.google.android.gms.internal.location.zzdj;
import com.google.android.gms.internal.location.zzdn;
import com.google.android.gms.internal.location.zzdv;
import com.google.android.gms.internal.location.zzee;
import com.google.android.gms.internal.location.zzeg;
import com.google.android.gms.internal.location.zzei;
import com.google.android.gms.internal.location.zzem;
import com.google.android.gms.internal.location.zzu;
import com.google.android.gms.internal.location.zzv;
import com.google.android.gms.location.LocationRequest;

/* renamed from: X.CpV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4196CpV extends AbstractC4162CoM {
    public final DQZ A00;
    public final DQZ A01;
    public final DQZ A02;
    public final DQZ A03;

    public C4196CpV(Context context, Looper looper, InterfaceC4392Cuv interfaceC4392Cuv, InterfaceC4393Cuw interfaceC4393Cuw, C4173Cod c4173Cod) {
        super(context, looper, interfaceC4392Cuv, interfaceC4393Cuw, c4173Cod, 23);
        this.A00 = new DQZ(0);
        this.A01 = new DQZ(0);
        this.A02 = new DQZ(0);
        this.A03 = new DQZ(0);
    }

    public static final boolean A02(Feature feature, C4196CpV c4196CpV) {
        zzk zzkVar = c4196CpV.A0L;
        Feature[] featureArr = zzkVar == null ? null : zzkVar.A03;
        if (featureArr == null) {
            return false;
        }
        for (Feature feature2 : featureArr) {
            if (feature.A00.equals(feature2.A00)) {
                return feature2.A00() >= feature.A00();
            }
        }
        return false;
    }

    public final void A07(C4248CrK c4248CrK, CSE cse, boolean z) {
        zzu zzuVar;
        Parcel parcelA00;
        int i;
        DQZ dqz = this.A01;
        synchronized (dqz) {
            zzdv zzdvVar = (zzdv) dqz.remove(c4248CrK);
            if (zzdvVar == null) {
                cse.A02(Boolean.FALSE);
            } else {
                C4200Cpj c4200CpjAjE = zzdvVar.A00.AjE();
                c4200CpjAjE.A02 = null;
                c4200CpjAjE.A01 = null;
                if (z) {
                    if (A02(AbstractC4281CsC.A09, this)) {
                        zzv zzvVar = (zzv) A03();
                        int iIdentityHashCode = System.identityHashCode(zzdvVar);
                        zzee zzeeVar = new zzee(null, null, zzdvVar, C60P.A1O("ILocationCallback@", BV4.A0p(BV7.A03(iIdentityHashCode) + 18), iIdentityHashCode), 2);
                        zzdj zzdjVar = new zzdj(cse, Boolean.TRUE);
                        zzuVar = (zzu) zzvVar;
                        parcelA00 = zza.A00(zzeeVar, zzuVar);
                        parcelA00.writeStrongBinder(zzdjVar.asBinder());
                        i = 89;
                    } else {
                        zzuVar = (zzu) ((zzv) A03());
                        parcelA00 = zza.A00(new zzei(null, null, zzdvVar, new zzdn(cse, Boolean.TRUE), null, null, 2), zzuVar);
                        i = 59;
                    }
                    zzuVar.A02(parcelA00, i);
                } else {
                    cse.A02(Boolean.TRUE);
                }
            }
        }
    }

    public final void A09(zzem zzemVar, CSE cse) {
        zza zzaVar;
        Parcel parcelA00;
        int i;
        boolean zA02 = A02(AbstractC4281CsC.A0D, this);
        IInterface iInterface = (zzv) A03();
        if (zA02) {
            zzdj zzdjVar = new zzdj(cse, null);
            zzaVar = (zza) iInterface;
            parcelA00 = zza.A00(zzemVar, zzaVar);
            parcelA00.writeStrongBinder(zzdjVar.asBinder());
            i = 98;
        } else {
            zzdg zzdgVar = new zzdg(cse);
            zzaVar = (zza) iInterface;
            parcelA00 = zza.A00(zzemVar, zzaVar);
            parcelA00.writeStrongBinder(zzdgVar.asBinder());
            i = 74;
        }
        zzaVar.A02(parcelA00, i);
    }

    public final void A08(InterfaceC4362Cu6 interfaceC4362Cu6, LocationRequest locationRequest, CSE cse) {
        zzdv zzdvVar;
        C4200Cpj c4200CpjAjE = interfaceC4362Cu6.AjE();
        C4248CrK c4248CrK = c4200CpjAjE.A01;
        c4248CrK.getClass();
        boolean zA02 = A02(AbstractC4281CsC.A09, this);
        DQZ dqz = this.A01;
        synchronized (dqz) {
            zzdv zzdvVar2 = (zzdv) dqz.get(c4248CrK);
            if (zzdvVar2 == null || zA02) {
                zzdvVar = new zzdv(interfaceC4362Cu6);
                dqz.put(c4248CrK, zzdvVar);
                if (zA02) {
                    zzv zzvVar = (zzv) A03();
                    String strA0S = FGI.A0S(c4248CrK.A01, "@", System.identityHashCode(c4248CrK.A00));
                    if (zzdvVar2 == null) {
                        zzdvVar2 = null;
                    }
                    zzee zzeeVar = new zzee(null, zzdvVar2, zzdvVar, strA0S, 2);
                    zzdj zzdjVar = new zzdj(cse, null);
                    zzu zzuVar = (zzu) zzvVar;
                    Parcel parcelA00 = zza.A00(zzeeVar, zzuVar);
                    Cpe.A01(parcelA00, locationRequest);
                    parcelA00.writeStrongBinder(zzdjVar.asBinder());
                    zzuVar.A02(parcelA00, 88);
                }
            } else {
                zzdvVar2.A00.AjU(c4200CpjAjE);
                zzdvVar = zzdvVar2;
            }
            zzv zzvVar2 = (zzv) A03();
            zzeg zzegVar = new zzeg(locationRequest, null, LinkEncryptedPairingKt.LINK_COUNTER_MAX, false, false, false, false);
            zzdv zzdvVar3 = zzdvVar;
            zzu zzuVar2 = (zzu) zzvVar2;
            zzuVar2.A02(zza.A00(new zzei(null, null, zzdvVar3, new zzdd(zzdvVar, cse), zzegVar, FGI.A0S(c4248CrK.A01, "@", System.identityHashCode(c4248CrK.A00)), 1), zzuVar2), 59);
        }
    }

    @Override // X.AbstractC4160CoH, X.InterfaceC4191CpP
    public final int AHi() {
        return 11717000;
    }
}
