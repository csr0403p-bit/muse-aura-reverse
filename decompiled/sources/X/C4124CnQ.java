package X;

import android.os.Parcel;
import com.google.android.gms.internal.wearable.zza;
import com.google.android.gms.internal.wearable.zzb;
import com.google.android.gms.wearable.internal.zzir;

/* renamed from: X.CnQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C4124CnQ implements InterfaceC4375CuV {
    public final /* synthetic */ C4179Cop A00;
    public final /* synthetic */ String A01;

    @Override // X.InterfaceC4375CuV
    public final void accept(Object obj, Object obj2) {
        String str = this.A01;
        C4125CnR c4125CnR = new C4125CnR((CSE) obj2);
        zza zzaVar = (zza) ((AbstractC4160CoH) obj).A03();
        Parcel parcelA00 = zzb.A00(c4125CnR, zzaVar, new zzir());
        parcelA00.writeString(str);
        zzaVar.A00(parcelA00, 63);
    }

    public /* synthetic */ C4124CnQ(C4179Cop c4179Cop, String str) {
        this.A00 = c4179Cop;
        this.A01 = str;
    }
}
