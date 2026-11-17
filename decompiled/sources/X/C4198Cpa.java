package X;

import android.app.PendingIntent;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.location.zza;
import com.google.android.gms.internal.location.zzdg;
import com.google.android.gms.internal.location.zzdj;
import com.google.android.gms.internal.location.zzv;
import com.google.android.gms.location.GeofencingRequest;

/* renamed from: X.Cpa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C4198Cpa implements InterfaceC4375CuV {
    public final /* synthetic */ PendingIntent A00;
    public final /* synthetic */ GeofencingRequest A01;

    @Override // X.InterfaceC4375CuV
    public final /* synthetic */ void accept(Object obj, Object obj2) {
        zza zzaVar;
        Parcel parcelA00;
        int i;
        CSE cse = (CSE) obj2;
        C4196CpV c4196CpV = (C4196CpV) obj;
        GeofencingRequest geofencingRequest = this.A01;
        PendingIntent pendingIntent = this.A00;
        boolean zA02 = C4196CpV.A02(AbstractC4281CsC.A0D, c4196CpV);
        IInterface iInterface = (zzv) c4196CpV.A03();
        if (zA02) {
            zzdj zzdjVar = new zzdj(cse, null);
            zzaVar = (zza) iInterface;
            parcelA00 = zza.A00(geofencingRequest, zzaVar);
            Cpe.A01(parcelA00, pendingIntent);
            parcelA00.writeStrongBinder(zzdjVar.asBinder());
            i = 97;
        } else {
            zzdg zzdgVar = new zzdg(cse);
            zzaVar = (zza) iInterface;
            parcelA00 = zza.A00(geofencingRequest, zzaVar);
            Cpe.A01(parcelA00, pendingIntent);
            parcelA00.writeStrongBinder(zzdgVar.asBinder());
            i = 57;
        }
        zzaVar.A02(parcelA00, i);
    }

    public /* synthetic */ C4198Cpa(PendingIntent pendingIntent, GeofencingRequest geofencingRequest) {
        this.A01 = geofencingRequest;
        this.A00 = pendingIntent;
    }
}
